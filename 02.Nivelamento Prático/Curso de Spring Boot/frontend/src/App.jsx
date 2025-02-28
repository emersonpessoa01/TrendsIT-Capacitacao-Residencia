import { useState } from "react";
import Formulario from "./components/Formulario";
import Tabela from "./components/Tabela";
import "./App.css";

function App() {
  const [btnCadastrar, setbtnCadastrar] = useState(true);
  
  return (
    <div>
      <h1>Produtos</h1>
      <Formulario botao={btnCadastrar} />
      <Tabela />
    </div>
  );
}

export default App;
