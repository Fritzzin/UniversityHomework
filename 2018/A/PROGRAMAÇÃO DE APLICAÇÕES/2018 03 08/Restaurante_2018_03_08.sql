CREATE TABLE metodo_pagamento(
	id SERIAL NOT NULL,
	nome VARCHAR(50) NOT NULL,
	desc TEXT,
	PRIMARY KEY (id));

CREATE TABLE tipo_conta (
	id SERIAL NOT NULL,
	nome VARCHAR(50) NOT NULL,
	desc TEXT,
	PRIMARY KEY (id));

CREATE TABLE funcao (
	id SERIAL NOT NULL,
	nome VARCHAR(50) NOT NULL,
	desc TEXT,
	PRIMARY KEY (id));

CREATE TABLE tipo_produto (
	id SERIAL NOT NULL,
	nome VARCHAR(50) NOT NULL,
	desc TEXT,
	PRIMARY KEY (id));

CREATE TABLE cliente (
	id SERIAL NOT NULL,
	nome VARCHAR(50) NOT NULL,
	sobrenome VARCHAR(200) NOT NULL,
	telefone VARCHAR(14),
	PRIMARY KEY (id));

CREATE TABLE fornecedor (
	id SERIAL NOT NULL,
	cnpj CHAR(14) NOT NULL,
	titulares VARCHAR(200) NOT NULL,
	nome VARCHAR(200) NOT NULL,
	email VARCHAR(100) NOT NULL,
	endereco TEXT NOT NULL,
	telefone VARCHAR(14),
	razao_social VARCHAR(100) NOT NULL,
	inscricao_estadual CHAR(8) NOT NULL.
	PRIMARY KEY (id));

CREATE TABLE produto (
	id SERIAL NOT NULL,
	nome VARCHAR(50) NOT NULL,
	preco_uni DECIMAL(10,2) NOT NULL,
	qntd_estoque DOUBLE NOT NULL,
	desc TEXT,
	PRIMARY KEY (id),
	CONSTRAINT fk_produto_tipo_produto FOREIGN KEY (tipo_produto_id) REFERENCES tipo_produto (id));

CREATE TABLE itens_compra (
	id SERIAL NOT NULL,
	qtde DOUBLE,
	valor DECIMAL(10,2),
	PRIMARY KEY (id),
	CONSTRAINT fk_itens_compra_fornecedor FOREIGN KEY (fornecedor_id) REFERENCES fornecedor (id),
	CONSTRAINT fk_itens_compra_produto FOREIGN KEY (produto_id) REFERENCES produto (id));

CREATE TABLE funcionario (
	id SERIAL NOT NULL,
	nome VARCHAR(50) NOT NULL,
	sobrenome VARCHAR(200) NOT NULL,
	data_nascimento DATE NOT NULL,
	email VARCHAR(100),
	telefone VARCHAR(14),
	rg VARCHAR(20) NOT NULL,
	cpf CHAR(19) NOT NULL,
	endereco TEXT NOT NULL,
	carteira_trabalho VARCHAR(20) NOT NULL,
	data_admissao DATETIME NOT NULL,
	data_demissao DATETIME,
	salario DECIMAL(10,2) NOT NULL,
	login VARCHAR(20) NOT NULL,
	senha VARCHAR(20) NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT fk_funcionar_funcao FOREIGN KEY (funcao_id) REFERENCES funcao (id));

CREATE TABLE conta_pagar (
	id SERIAL NOT NULL,
	valor_cobrado DECIMAL(10,2) NOT NULL,
	valor_pago DECIMAL(10,2),
	data_vencimento DATETIME NOT NULL,
	data_pagamento DATETIME,
	situacao CHAR(1) NOT NULL,
	desc TEXT,
	PRIMARY KEY (id),
	CONSTRAINT fk_conta_pagar_funcionario FOREIGN KEY (funcionar_id) REFERENCES funcionario (id),
	CONSTRAINT fk_conta_pagar_tipo_conta FOREIGN KEY (tipo_conta_id) REFERENCES tipo_conta (id),
	CONSTRAINT fk_conta_pagar_metodo_pagamento FOREIGN KEY (metodo_pagamento_id) REFERENCES metodo_pagamento (id));

CREATE TABLE comanda (
	id SERIAL NOT NULL,
	valor_cobrado DECIMAL(10,2) NOT NULL,
	valor_pago DECIMAL(10,2),
	data_emissao DATETIME NOT NULL,
	data_pagamento DATETIME,
	situacao CHAR(1) NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT fk_comanda_funcionario FOREIGN KEY (funcionario_id) REFERENCES funcionario (id),
	CONSTRAINT fk_comanda_cliente FOREIGN KEY (cliente_id) REFERENCES cliente (id));

CREATE TABLE itens_comanda (
	id SERIAL NOT NULL,
	qtde DOUBLE,
	valor DECIMAL(10,2),
	PRIMARY KEY (id),
	CONSTRAINT fk_itens_comanda_comanda) FOREIGN KEY (comanda_id) REFERENCES comanda (id),
	CONSTRAINT fk_itens_comanda_produto) FOREIGN KEY (produto_id) REFERENCES produto (id));

