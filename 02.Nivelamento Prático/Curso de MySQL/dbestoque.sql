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
alter table tbusuario rename column NoCPF to NuCPF;CoSetor

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

select * from tbusuario;

-- CRIAÇÃO DAS CHAVES ESTRANGEIRAS
-- Adicionar uma restrição através de constraint entre tbusuario com tbrequisicao
-- Criando chave estrangeira na tbrequisao nas colunas do CoUsuario e CoSetor
ALTER TABLE tbrequisicao ADD CONSTRAINT fk_tbusuariotbrequisicao FOREIGN KEY (CoUsuario) REFERENCES tbusuario(CoUsuario);
ALTER TABLE tbrequisicao ADD CONSTRAINT fk_tbsetortbrequisicao FOREIGN KEY(CoSetor) REFERENCES	tbsetor(CoSetor);
ALTER TABLE tbprodutorequisicao ADD CONSTRAINT fk_tbprodutorequisicaotbrequisicao FOREIGN KEY(CoRequisicao) REFERENCES tbrequisicao(CoRequisicao);
ALTER TABLE tbprodutorequisicao ADD CONSTRAINT fk_tbprodutorequisicaotbproduto FOREIGN KEY(CoProduto) REFERENCES tbproduto(CoProduto);

-- Como alterar as estrutura das tabelas
use dbestoque;
ALTER TABLE tbproduto ADD estoque DATE;
ALTER TABLE tbproduto RENAME COLUMN estoque to Estoque; -- primeira forma de alteração
alter table tbproduto change estoque QtEstoque date; -- segunda forma de alteração
ALTER TABLE tbproduto change QtEstoque QtEstoque int; -- alterando o tipo
ALTER TABLE tbproduto drop QtEstoque; -- Excluir o campo QtEstoque
DROP TABLE tbproduto; -- Apagar a tabela

