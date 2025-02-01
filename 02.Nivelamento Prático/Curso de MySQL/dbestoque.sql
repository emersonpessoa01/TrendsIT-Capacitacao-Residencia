create database dbestoque;
use dbestoque;

CREATE TABLE tbsetor (
    CoSetor INT NOT NULL AUTO_INCREMENT,
    NoSetor VARCHAR(50),
    PRIMARY KEY (CoSetor)
);

CREATE TABLE tbproduto (
    CoProduto INT NOT NULL AUTO_INCREMENT,
    noProduto VARCHAR(100),
    PRIMARY KEY (CoProduto)
);

-- Alterar nome do noProduto
alter TABLE tbproduto rename COLUMN noProduto to NoProduto;

CREATE TABLE tbusuario (
    CoUsuario INT NOT NULL AUTO_INCREMENT,
    NoUsuario VARCHAR(50) NOT NULL,
    NoCPF INT NOT NULL UNIQUE,
    PRIMARY KEY (CoUsuario)
);

-- Alterar nome do NoCPF 
alter table tbusuario rename column NoCPF to NuCPF;

CREATE TABLE tbrequisicao (
    CoRequisicao INT NOT NULL AUTO_INCREMENT,
    DaRequisicao DATE NOT NULL,
    CoUsuario INT NOT NULL,
    CoSetor INT NOT NULL,
    PRIMARY KEY (CoRequisicao)
);

CREATE TABLE tbprodutorequisicao (
    IdProdutoRequisicao INT NOT NULL AUTO_INCREMENT,
    CoRequisicao INT NOT NULL,
    CoProduto INT NOT NULL,
    Quantidade INT NOT NULL,
    PRIMARY KEY (IdProdutoRequisicao)
);
