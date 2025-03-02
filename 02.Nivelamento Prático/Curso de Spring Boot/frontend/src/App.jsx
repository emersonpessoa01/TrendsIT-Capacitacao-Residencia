import { useEffect, useState } from "react";
import Formulario from "./components/Formulario";
import Tabela from "./components/Tabela";
import "./App.css";

function App() {
  //Objeto produto
  const produto = {
    codigo: "",
    nome: "",
    marca: "",
  };
  const [btnCadastrar, setBtnCadastrar] = useState(true); //Para mostrar ou não o botão de cadastrar
  const [produtos, setProdutos] = useState([]); //Para mostrar os produtos
  const [objProduto, setObjProduto] = useState(produto); // Para capturar os dados do formulário

  useEffect(() => {
    //Executar uma única vez queando o componente é montado
    // fetch("http://localhost:8081/listar")
    //   .then((response) => response.json())
    //   .then((data) => {
    //     setpProdutos(data);
    //   });
    //Usar async await com try/catch

    const fetchData = async () => {
      try {
        const response = await fetch("http://localhost:8081/listar");
        const data = await response.json();
        setProdutos(data);
        // console.log(data);
      } catch (error) {
        console.log("Falha ao buscar dados:", error);
      }
    };
    fetchData();
  }, []);

  // Obtendo dados do formulário
  const obterDados = (e) => {
    // console.log(`${e.target.name}: ${ e.target.value}`);
    setObjProduto({
      ...objProduto,
      [e.target.name]: e.target.value,
    });
  };

  //Função para cadastrar produto
  const cadastrar = async () => {
    const header = {
      method: "POST",
      body: JSON.stringify(objProduto),
      headers: {
        "Content-Type": "application/json",
        Accept: "application/json",
      },
    };
    try {
      const response = await fetch("http://localhost:8081/cadastrar", header);

      const data = await response.json();
      //condição para mostrar a alteração da tabela dinamicamente
      // if (data.status === "ok") {
      //   setProdutos([...produtos, data.produto]);
      // }
      //Condição para mostrar os produtos cadastrados dinamicamente
      if(data.mensagem !== undefined){
        alert(data.mensagem);
      }else{
        setProdutos([...produtos, data]);
        alert("Produto cadastrado com sucesso!");
      }
      console.log(data);
    } catch (error) {
      console.error("Erro ao cadastrar:", error);
    }
  };

  return (
    <div>
      <h1>Produtos</h1>
      {/* <p>{JSON.stringify(produtos)}</p> */} {/* Para mostar os dados do array */}
      {/* <p>{JSON.stringify(objProduto)}</p> */} {/* Para testar se está capturando os dados do formulário */}
      <Formulario botao={btnCadastrar} eventoTeclado={obterDados} cadastrar={cadastrar} />
      <Tabela vetor={produtos} />
    </div>
  );
}

export default App;
