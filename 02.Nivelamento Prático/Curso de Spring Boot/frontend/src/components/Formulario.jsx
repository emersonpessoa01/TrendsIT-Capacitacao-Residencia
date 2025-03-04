import React from "react";

const Formulario = ({ botao, eventoTeclado,cadastrar, obj }) => {
  return (
    <form>
      <input autoFocus type="text" placeholder="Nome do produto" className="form-control" value={obj.nome}onChange={eventoTeclado} name="nome" />
      <input type="text" placeholder="Marca" className="form-control" value={obj.marca} onChange={eventoTeclado} name="marca" />
      {botao ? (
        <input type="button" value="Cadastrar"onClick={cadastrar} className="btn btn-primary" />
      ) : (
        <div className="btn-group">
          <input type="button" value="Alterar" className="btn btn-warning" />
          <input type="button" value="Remover" className="btn btn-danger" />
          <input type="button" value="Cancelar" className="btn btn-secondary" />
        </div>
      )}
    </form>
  );
};

export default Formulario;
