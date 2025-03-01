import { useEffect, useState } from "react";
import Formulario from "./components/Formulario";
import Tabela from "./components/Tabela";
import "./App.css";

function App() {
  //Objeto produto
  const produto={
    codigo:0,
    nome: "",
    marca: ""
  }
  const [btnCadastrar, setBtnCadastrar] = useState(true);
  const [produtos, setProdutos] = useState([]);

  useEffect(() => {
    // fetch("http://localhost:8081/listar")
    //   .then((response) => response.json())
    //   .then((data) => {
    //     setpProdutos(data);
    //   });
    //Usar async await
    const fetchData = async () => {
      const response = await fetch("http://localhost:8081/listar");
      const data = await response.json();
      setProdutos(data);
      console.log(data);
    };
    fetchData();
  }, []);

  return (
    <div>
      <h1>Produtos</h1>
      {/* <p>{JSON.stringify(produtos)}</p> */}
      <Formulario botao={btnCadastrar} />
      <Tabela vetor={produtos} />
    </div>
  );
}

export default App;
