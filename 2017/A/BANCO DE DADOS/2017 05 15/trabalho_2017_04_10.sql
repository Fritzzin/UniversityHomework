CREATE TABLE estados(
	id INT,
	nome VARCHAR(60) NOT NULL,
	sigla CHAR(2) NOT NULL,
	CONSTRAINT pk_estados_id PRIMARY KEY (id));
    
    
CREATE TABLE cidades(
	id INT,
	nome VARCHAR(100) NOT NULL,
	cep CHAR(9),
	estados_id INT NOT NULL,
	CONSTRAINT pk_cidades_id PRIMARY KEY (id),
	CONSTRAINT fk_estados_id FOREIGN KEY (estados_id) REFERENCES estados (id));
    
    
CREATE TABLE bairros(
	id INT,
	nome VARCHAR(100) NOT NULL,
	cidades_id INT NOT NULL,
	CONSTRAINT pk_bairros_id PRIMARY KEY (id),
	CONSTRAINT fk_cidades_id FOREIGN KEY (cidades_id) REFERENCES cidades (id));
    
    
CREATE TABLE endereços(
	id INT,
	logradouro VARCHAR(100) NOT NULL,
	numero VARCHAR(20) NOT NULL,
	complemento VARCHAR(20),
	cep CHAR(9),
	bairros_id INT NOT NULL,
	CONSTRAINT pk_endereços_id PRIMARY KEY (id),
	CONSTRAINT fk_bairros_id FOREIGN KEY (bairros_id) REFERENCES bairros (id));
    
    
CREATE TABLE funcoes(
	id INT,
	nome VARCHAR(60) NOT NULL,
	descricao TEXT,
	CONSTRAINT pk_funcoes_id PRIMARY KEY (id));
    
    
CREATE TABLE telefones(
	id INT,
	numero VARCHAR(14) NOT NULL,
	descricao TEXT,
	CONSTRAINT pk_telefones_id PRIMARY KEY (id));
    
    
CREATE TABLE funcionarios(
	id INT,
	nome VARCHAR(45) NOT NULL,
	sobrenome VARCHAR(200) NOT NULL,
	data_nascimento DATE NOT NULL,
	email VARCHAR(100) NOT NULL,
	RG VARCHAR(20) NOT NULL,
	CPF CHAR(19) NOT NULL,
	carteira_trabalho VARCHAR(20) NOT NULL,
	data_admissao DATE NOT NULL,
	data_demissao DATE,
	salario DECIMAL(10,2) NOT NULL,
	funcoes_id INT NOT NULL,
	endereços_id INT NOT NULL,
	endereços_natal_id INT NOT NULL,
	telefones_id INT NOT NULL,
	gerente_id INT,
	CONSTRAINT pk_funcionarios_id PRIMARY KEY (id),
	CONSTRAINT fk_funcoes_id FOREIGN KEY (funcoes_id) REFERENCES funcoes (id),
	CONSTRAINT fk_endereços_id FOREIGN KEY (endereços_id) REFERENCES endereços (id),
	CONSTRAINT fk_telefones_id FOREIGN KEY (telefones_id) REFERENCES telefones (id),
	CONSTRAINT fk_gerente_id FOREIGN KEY (gerente_id) REFERENCES funcionarios (id));
    
ALTER TABLE funcionarios ADD CONSTRAINT fk_endereços_natal_id FOREIGN KEY (endereços_natal_id) REFERENCES endereços (id);


CREATE TABLE tipo_conta(
	id INT,
	nome VARCHAR(60) NOT NULL,
	CONSTRAINT pk_tipo_conta_id PRIMARY KEY (id));


CREATE TABLE contas (
	id INT,
	metodo_pagamento VARCHAR(20) NOT NULL,
	valor DECIMAL(10,2) NOT NULL,
	data_vencimento DATE NOT NULL,
	date_pagamento DATE NOT NULL,
	funcionarios_id INT NOT NULL,
	tipo_conta_id INT NOT NULL,
	CONSTRAINT pk_contas_id PRIMARY KEY (id),
	CONSTRAINT fk_funcionarios_id FOREIGN KEY (funcionarios_id) REFERENCES funcionarios (id),
	CONSTRAINT fk_tipo_conta_id FOREIGN KEY (tipo_conta_id) REFERENCES tipo_conta (id));
    
    
CREATE TABLE fornecedores (
	id INT,
	CNPJ CHAR(14) NOT NULL,
	titulares VARCHAR(200) NOT NULL,
	nome VARCHAR(200) NOT NULL,
	email VARCHAR(100) NOT NULL,
	tipo_produto VARCHAR(45) NOT NULL,
	razao_social VARCHAR(100) NOT NULL,
	inscricao_estadual CHAR(8) NOT NULL,
	endereços_id INT NOT NULL,
	telefones_id INT NOT NULL,
	CONSTRAINT pk_fornecedores_id PRIMARY KEY (id),
	CONSTRAINT fk_endereços_id FOREIGN KEY (endereços_id) REFERENCES endereços (id),
	CONSTRAINT fk_telefones_id FOREIGN KEY (telefones_id) REFERENCES telefones (id));
    
    
CREATE TABLE bebidas (
	id INT,
	nome VARCHAR(40),
	preco_uni DECIMAL(10,2) NOT NULL,
	qntd_estoque INT NOT NULL,
	descricao TEXT,
	fornecedores_id INT NOT NULL,
	CONSTRAINT pk_bebidas_id PRIMARY KEY (id),
	CONSTRAINT fk_fornecedores_id FOREIGN KEY (fornecedores_id) REFERENCES fornecedores (id));
	
	
CREATE TABLE ingredientes (
	id INT,
	nome VARCHAR(40),
	preco_uni DECIMAL(10,2) NOT NULL,
	qntd_estoque INT NOT NULL,
	descricao TEXT,
	fornecedores_id INT NOT NULL,
	CONSTRAINT pk_ingredientes_id PRIMARY KEY (id),
	CONSTRAINT fk_fornecedores_id FOREIGN KEY (fornecedores_id) REFERENCES fornecedores (id));

INSERT INTO estados VALUES
	(1,'Rio Grande do Sul','RS'),
    (2,'Santa Catarina','SC'),
	(3,'Paraná','PR'),
	(4,'São Paulo','SP'),
	(5,'Rio de Janeiro','RJ'),
	(6,'Espírito Santo','ES'),
	(7,'Bahia','BA'),
	(8,'Sergipe','SE'),
	(9,'Alagoas','AL'),
	(10,'Pernambuco','PE'),
	(11,'Paraíba','PB'),
	(12,'Rio Grande do Norte','RN'),
	(13,'Ceará','CE'),
	(14,'Piaui','PI'),
	(15,'Minas Gerais','MG');
    
    
INSERT INTO cidades(id,nome,estados_id) VALUES 
	(1,'Lajeado',1),
	(2,'Blumenau',2),
	(3,'Curitiba',3),
	(4,'São Paulo',4),
	(5,'Rio de Janeiro',5),
	(6,'Linhares',6),
	(7,'Salvador',7),
	(8,'Laranjeiras',8),
	(9,'Maceió',9),
	(10,'Olinda',10),
	(11,'Campina Grande',11),
	(12,'Natal',12),
	(13,'Fortaleza',13),
	(14,'Bom Jesus',14),
	(15,'Juíz de Fora',15);
    
    
INSERT INTO bairros VALUES
	(1,'Florestal',1),
	(2,'Centro',1),
	(3,'São Cristóvão',1),
	(4,'Moinhos',1),
	(5,'Universitário',1),
	(6,'Montanha',1),
	(7,'Casa Verde',4),
	(8,'Centro',7),
	(9,'Botafogo',5),
	(10,'Lagoa Nova',12),
	(11,'Jardim Cearense',13),
	(12,'Ouro Preto',10);
    
    
INSERT INTO endereços (id,logradouro,numero,bairros_id) VALUES
	(1,'Rua 1',1,1),
	(2,'Rua 2',2,2),
	(3,'Rua 3',3,3),
	(4,'Rua 4',4,4),
	(5,'Rua 5',5,5),
	(6,'Rua 6',6,6),
	(7,'Rua 7',7,7),
	(8,'Rua 8',8,8),
	(9,'Rua 9',9,9),
	(10,'Rua 10',10,10),
	(11,'Rua 11',11,11),
	(12,'Rua 12',12,12),
    (13,'Rua 13',13,1),
    (14,'Rua 14',14,2),
    (15,'Rua 15',15,3),
    (16,'Rua 16',16,4),
    (17,'Rua 17',17,5),
    (18,'Rua 18',18,6),
    (19,'Rua 19',19,7),
    (20,'Rua 20',20,8);
    
    
    
    
INSERT INTO funcoes VALUES
	(1,'Chef'),
	(2,'Cozinheiro'),
	(3,'Auxiliar de Cozinha'),
	(4,'Caixa'),
	(5,'Gerente'),
	(6,'Garçom'),
	(7,'Faxineiro'),
	(8,'Saladeiro'),
	(9,'Churrasqueiro'),
	(10,'Recepcionista');
    
    
INSERT INTO telefones VALUES
	(1, '051 1111-1111'),
	(2, '051 2222-2222'),
	(3, '051 3333-3333'),
	(4, '051 4444-4444'),
	(5, '051 5555-5555'),
	(6, '051 6666-6666'),
	(7, '051 7777-7777'),
	(8, '051 8888-8888'),
	(9, '051 9999-9999'),
	(10, '051 1010-1010'),
	(11, '051 1111-1111'),
	(12, '051 1212-1212'),
	(13, '051 1313-1313'),
	(14, '051 1414-1414'),
	(15, '051 1515-1515'),
	(16, '051 1616-1616'),
	(17, '051 1717-1717'),
	(18, '051 1818-1818'),
	(19, '051 1919-1919'),
	(20, '051 2020-2020');
    
    
INSERT INTO fornecedores VALUES
	(1,'11111111111111','João','F1','f1@email.com','bebidas','Fornecedor 1','11111111',1,1),
	(2,'22222222222222','Maria','F2','f2@email.com','ingredientes','Fornecedor 2','22222222',2,2),
	(3,'33333333333333','Paulo','F3','f3@email.com','bebidas','Fornecedor 3','33333333',3,3),
	(4,'44444444444444','Ana','F4','f4@email.com','ingredientes','Fornecedor 4','44444444',4,4),
	(5,'55555555555555','Leandro','F5','f5@email.com','bebidas','Fornecedor 5','55555555',5,5),
	(6,'66666666666666','Salete','F6','f6@email.com','ingredientes','Fornecedor 6','66666666',6,6),
	(7,'77777777777777','Pedro','F7','f7@email.com','bebidas','Fornecedor 7','77777777',7,7),
	(8,'88888888888888','Vitória','F8','f8@email.com','ingredientes','Fornecedor 8','88888888',8,8),
	(9,'99999999999999','Thomas','F9','f9@email.com','bebidas','Fornecedor 9','99999999',9,9),
    (10,'10101010101010','Milena','F10','f10@email.com','ingredientes','Fornecedor 10','10101010',10,10);
    
    
INSERT INTO bebidas (id,nome,preco_uni,qntd_estoque,fornecedores_id) VALUES
	(1, 'Coca Cola (lata)', 3.50 , 50, 1),
	(2, 'Pepsi (late)', 3.50, 60, 3),
	(3, 'Suco Laranja', 2.50, 35, 5),
	(4, 'Suco Uva', 2.50, 38, 7),
	(5, 'Agua (600ml)', 2.50, 54, 9);
	
    
INSERT INTO ingredientes (id,nome,preco_uni,qntd_estoque,fornecedores_id) VALUES
	(1, 'Carne rês', 25, 50, 2),
	(2, 'Carne frago', 20, 60, 4),
	(3, 'Tomate', 1.50, 80, 6),
	(4, 'Cebola', 1.50, 80, 8),
	(5, 'Alface', 3, 20, 10);
    
    
INSERT INTO funcionarios (id, nome, sobrenome, data_nascimento, email, RG, CPF, carteira_trabalho, data_admissao, salario, funcoes_id, endereços_id, endereços_natal_id, telefones_id) VALUES
	(1, 'Augusto', 'Fritz', '19980115', 'a.fritz@email.com', '1111111111', '111.111.111-11','1111111111','20160620','4000.00',1,15,15,11),   
    (2, 'Maria', 'Santos', '19920620','m.santos@email.com','2222222222', '222.222.222-22','2222222222','20170226','2500.00',5,13,8,12);
    
    
INSERT INTO funcionarios (id, nome, sobrenome, data_nascimento, email, RG, CPF, carteira_trabalho, data_admissao, salario, funcoes_id, endereços_id, endereços_natal_id, telefones_id,gerente_id) VALUES	
	(3, 'João', 'Filho', '19940824', 'jp.filho@email.com','3333333333', '333.333.333-33','3333333333','20160924','2000.00',6,14,9,13,2),
	(4, 'Veronica', 'Silva', '19950414', 've.silva@email.com', '4444444444', '444.444.444-44', '4444444444', '20170129','1500.00',7,15,11,14,2),
	(5, 'Vitório', 'Silva', '19950414', 'vi.silva@email.com', '5555555555', '555.555.555-55', '5555555555', '20170129','1800.00',4,15,11,15,2),
	(6, 'Milena', 'Montanha', '19900728', 'm.montanha@email.com', '6666666666', '666.666.666-66', '6666666666', '20161205','1600.00',10,16,16,16,2),
	(7, 'Pedro', 'Sampaio', '19890326', 'p.sampaio@email.com', '7777777777', '777.777.777-77','7777777777','20160620','3000.00',9,17,8,17,1);
    
    
INSERT INTO funcionarios VALUES
	(8, 'Marina', 'Santana', '19951010', 'm.santana@email.com', '8888888888', '888.888.888-88','8888888888','20160620','20160820','2900.00',8,18,7,18,1),
	(9, 'Gustavo', 'Cadeira', '19931107', 'g.cadeira@email.com', '9999999999', '999.999.999-99','9999999999','20160615','20170220','2500.00',3,19,5,19,1),
	(10, 'Carol', 'Medeiros', '19920421', 'c.medeiros@email.com', '1010101010', '101.010.101-01','1010101010','20160729','20161205','2950.00',2,20,20,20,1);
    
    
INSERT INTO tipo_conta VALUES
	(1,'Água'),
	(2,'Energia'),
	(3,'Aluguel'),
	(4,'Telefone'),
	(5,'Multa'),
	(6,'Reparos');    
	
    
INSERT INTO contas VALUES
	(1, 'Cartão', '800.00', '20170420','20170417', 3, 2),
	(2, 'Cartão', '1500.00', '20170422','20170417', 4, 3),
	(3, 'Cartão', '100.00', '20170419','20170413', 5, 4),
	(4, 'Dinheiro', '150.00', '20170510','20170502', 6, 5),
	(5, 'Dinheiro', '400.00', '20170428','20170424', 2, 6),
	(6, 'Cartão', '600.00', '20170415', '20170406', 2, 1),
	(7, 'Dinheiro', '1500.00', '20170322', '20170315', 1, 3),
	(8, 'Dinheiro', '300.00', '20170310', '20170309', 1, 5),
	(9, 'Cartão', '1000.00', '20170320','20170315',4,2),
	(10,'Dinheiro','120.00', '20170319','20170312',5,4);
	
SELECT nome , gerente_id, salario, CAST ((salario * 1.10) AS DECIMAL (10,2)) AS "novo_salario"
FROM funcionarios
WHERE gerente_id = 1
UNION
SELECT nome , gerente_id, salario, CAST ((salario * 1.15) AS DECIMAL (10,2)) AS "novo_salario"
FROM funcionarios
WHERE gerente_id = 2
ORDER BY nome;

SELECT nome ||' '|| sobrenome AS "Nome Completo", data_admissao
FROM funcionarios
WHERE data_admissao BETWEEN '20160101' AND '20161231'
ORDER BY data_admissao;

SELECT contas.id, funcionarios.nome ||' '|| funcionarios.sobrenome AS "Nome_Completo"
FROM contas 
INNER JOIN funcionarios ON contas.funcionarios_id = funcionarios.id
ORDER BY id;

SELECT funcionarios.nome ||' '|| funcionarios.sobrenome AS "Nome_Completo", contas.id
FROM funcionarios
LEFT JOIN contas ON funcionarios.id=contas.funcionarios_id;

SELECT id, nome, razao_social, tipo_produto
FROM fornecedores
WHERE tipo_produto IN ('bebidas');

SELECT id, nome||' '|| sobrenome, endereços_id, endereços_natal_id
FROM funcionarios
WHERE endereços_id != endereços_natal_id;

SELECT nome
FROM funcionarios
WHERE nome LIKE 'A%' OR nome LIKE 'V%';

SELECT cidades.nome, bairros.nome
FROM bairros
RIGHT JOIN cidades ON cidades.id = bairros.cidades_id
ORDER BY cidades.id;

SELECT f.id, f.nome, f.tipo_produto, b.nome
FROM fornecedores f, bebidas b
WHERE b.fornecedores_id = f.id
UNION
SELECT f.id, f.nome, f.tipo_produto, i.nome
FROM fornecedores f, ingredientes i
WHERE i.fornecedores_id = f.id
ORDER BY id;

SELECT f.nome, e.logradouro, e.numero, b.nome, c.nome, es.sigla
FROM funcionarios f, endereços e, bairros b, cidades c, estados es
WHERE f.endereços_id = e.id AND b.id = e.bairros_id AND c.id = b.cidades_id AND es.id = c.estados_id;
