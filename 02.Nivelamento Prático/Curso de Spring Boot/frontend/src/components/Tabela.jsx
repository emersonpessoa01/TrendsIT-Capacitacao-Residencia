import React from "react";

const Tabela = ({ vetor }) => {
  return (
    <div className="table-responsive">
      <table className="table table-striped">
        <thead>
          <tr>
            <th>#</th>
            <th>Nome</th>
            <th>Marca</th>
            <th>Selecionar</th>
          </tr>
        </thead>
        <tbody>
          {vetor.map((produto, index) => (
            <tr key={index}>
              <td>{index + 1}</td>
              <td>{produto.nome}</td>
              <td>{produto.marca}</td>
              <td>
                <button className="btn btn-success">Selecionar</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Tabela;
