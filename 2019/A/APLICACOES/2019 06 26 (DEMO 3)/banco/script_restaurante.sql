---------- CREATE ----------

-------------------
-- Table cliente --
-------------------
CREATE TABLE cliente
(
    id          SERIAL         NOT NULL UNIQUE,
    nome        VARCHAR(50)    NOT NULL ,
    telefone    VARCHAR(14)    NULL     ,
    situacao    CHAR           NULL     ,
    PRIMARY KEY (id)
);


------------------
-- Table funcao --
------------------
CREATE TABLE funcao
(
    id          SERIAL      NOT NULL    UNIQUE,
    nome        VARCHAR(50) NOT NULL,
    descricao   TEXT        NULL    ,
    situacao    CHAR        NOT NULL,
    PRIMARY KEY (id)
);

----------------------
-- Table fornecedor --
----------------------
CREATE TABLE fornecedor
(
    id          SERIAL          NOT NULL    UNIQUE,
    nome        VARCHAR(100)    NOT NULL,
    cnpj        VARCHAR(18)     NULL    ,
    situacao    CHAR            NOT NULL,
    PRIMARY KEY (id)
);

-----------------------
-- Table funcionario --
-----------------------
CREATE TABLE funcionario
(
    id                  SERIAL          NOT NULL    UNIQUE,
    funcao_id           SERIAL          NOT NULL,
    nome                VARCHAR(50)     NOT NULL,
    telefone            VARCHAR(14)     NULL    ,
    data_admissao       DATE            NOT NULL,
    data_demissao       DATE            NULL    ,
    salario             DECIMAL(10,2)   NOT NULL,
    login               VARCHAR(50)     NOT NULL    UNIQUE,
    senha               VARCHAR(50)     NOT NULL,
    situacao            CHAR            NOT NULL,
    PRIMARY KEY (id)                            ,
    CONSTRAINT fk_funcionario_funcao FOREIGN KEY (funcao_id) REFERENCES funcao (id)
);

-------------------
-- Table produto --
-------------------
CREATE TABLE produto
(
    id              SERIAL          NOT NULL    UNIQUE,
    fornecedor_id   SERIAL          NOT NULL,
    nome            VARCHAR(50)     NOT NULL,
    preco_uni       DECIMAL(10,2)   NOT NULL,
    tipo_produto    VARCHAR(50)     NOT NULL,
    descricao       TEXT            NULL    ,
    situacao        CHAR            NOT NULL,
    PRIMARY KEY (id)                        ,
    CONSTRAINT fk_produto_fornecedor FOREIGN KEY(fornecedor_id) REFERENCES fornecedor (id)
);

-------------------
-- Table comanda --
-------------------
CREATE TABLE comanda
(
    id                  SERIAL          NOT NULL    UNIQUE,
    cliente_id          SERIAL          NOT NULL,
    funcionario_id      SERIAL          NOT NULL,
    metodo_pagamento	VARCHAR(50)     NOT NULL,
    valor               DECIMAL(10,2)   NOT NULL,
    data                DATE            NOT NULL,
    situacao            CHAR            NOT NULL,
    PRIMARY KEY (id)                            ,
    CONSTRAINT fk_comanda_cliente           FOREIGN KEY (cliente_id)           REFERENCES cliente           (id),
    CONSTRAINT fk_comanda_funcionario       FOREIGN KEY (funcionario_id)       REFERENCES funcionario       (id)
);

------------------------
-- Table item_comanda --
------------------------
CREATE TABLE item_comanda
(
    id          SERIAL          NOT NULL    UNIQUE,
    comanda_id  SERIAL          NOT NULL,
    produto_id  SERIAL          NOT NULL,
    qtde        REAL            NOT NULL,
    valor       DECIMAL(10,2)   NOT NULL,
    situacao    CHAR            NOT NULL,
    PRIMARY KEY (id)                    ,
    CONSTRAINT fk_item_comanda_comanda FOREIGN KEY (comanda_id) REFERENCES comanda (id),
    CONSTRAINT fk_item_comanda_produto FOREIGN KEY (produto_id) REFERENCES produto (id)
);

-----------------------
-- Table conta_pagar --
-----------------------
CREATE TABLE conta_pagar
(
    id                  SERIAL          NOT NULL    UNIQUE,
    funcionario_id      SERIAL          NOT NULL,
    valor               DECIMAL(10,2)   NOT NULL,
    data_vencimento     DATE            NOT NULL,
    data_pagamento      DATE                    ,
    tipo_conta          VARCHAR(50)     NOT NULL,
    descricao           TEXT            NULL    ,
    metodo_pagamento    VARCHAR(50)     NOT NULL,
    situacao            CHAR            NOT NULL,
    PRIMARY KEY (id)                            ,
    CONSTRAINT fk_conta_pagar_funcionario       FOREIGN KEY (funcionario_id)        REFERENCES funcionario      (id)
);



---------- INSERTS ----------

------------
-- FUNCAO --
------------
INSERT INTO funcao VALUES
(
    DEFAULT,
    'ADMINISTRADOR(A)',
    'ADMINISTRADOR(A) DO SISTEMA',
    'A'
);

INSERT INTO funcao VALUES
(
    DEFAULT,
    'COZINHEIRO(A)',
    ' ',
    'A'
);

INSERT INTO funcao VALUES
(
    DEFAULT,
    'GARÇOM',
    ' ',
    'A'
);

INSERT INTO funcao VALUES
(
    DEFAULT,
    'GERENTE',
    ' ',
    'A'
);

INSERT INTO funcao VALUES
(
    DEFAULT,
    'CHEF',
    ' ',
    'A'
);

INSERT INTO funcao VALUES
(
    DEFAULT,
    'FAXINEIRO(A)',
    ' ',
    'I'
);

-------------
-- CLIENTE --
-------------
INSERT INTO cliente VALUES
(
    DEFAULT,
    'BALCÃO',
    '(51)1111-1111',
    'A'
);

INSERT INTO cliente VALUES
(
    DEFAULT,
    'CLIENTE DOIS',
    '(51)2222-2222',
    'A'
);

INSERT INTO cliente VALUES
(
    DEFAULT,
    'CLIENTE TRÊS',
    '(51)3333-3333',
    'A'
);

INSERT INTO cliente VALUES
(
    DEFAULT,
    'CLIENTE QUATRO',
    '(51)4444-4444',
    'A'
);

INSERT INTO cliente VALUES
(
    DEFAULT,
    'CLIENTE CINCO',
    '(51)5555-5555',
    'I'
);

-----------------
-- FUNCIONARIO --
-----------------
INSERT INTO funcionario VALUES
(
    DEFAULT,
    1,
    'ADMINISTRADOR',
    '00000',
    '20190320',
    null,
    20.00,
    'ADMIN',
    '21232f297a57a5a743894a0e4a801fc3',
    'A'
);

INSERT INTO funcionario VALUES
(
    DEFAULT,
    2,
    'AUGUSTO FRITZ',
    '(51)3714-5408',
    '20190320',
    null,
    200.00,
    'AUGUSTO.FRITZ',
    '21232f297a57a5a743894a0e4a801fc3',
    'A'
);

INSERT INTO funcionario VALUES
(
    DEFAULT,
    6,
    'FUNCIONARIO TRÊS',
    '(51)3333-3333',
    '20190415',
    null,
    800.00,
    'FUNCIONARIO.TRES',
    '21232f297a57a5a743894a0e4a801fc3',
    'A'
);

INSERT INTO funcionario VALUES
(
    DEFAULT,
    6,
    'FUNCIONARIO QUATRO',
    '(51)4444-4444',
    '20190525',
    null,
    800.00,
    'FUNCIONARIO.QUATRO',
    '21232f297a57a5a743894a0e4a801fc3',
    'A'
);

INSERT INTO funcionario VALUES
(
    DEFAULT,
    6,
    'JUCA BALA',
    '(51)3333-3333',
    '20190320',
    '20190625',
    800.00,
    'JUCA.BALA',
    '21232f297a57a5a743894a0e4a801fc3',
    'I'
);

----------------
-- FORNECEDOR --
----------------
INSERT INTO fornecedor VALUES
(
	DEFAULT,
    'RESTAURANTE BISTECH',
    '79.489.655/0001-25',
    'A'
);

INSERT INTO fornecedor VALUES
(
	DEFAULT,
    'FORNECEDOR DOIS',
    '14.541.258/0001-00',
    'A'
);

INSERT INTO fornecedor VALUES
(
	DEFAULT,
    'FORNECEDOR TRES',
    '70.089.079/0001-54',
    'A'
);


INSERT INTO fornecedor VALUES
(
	DEFAULT,
    'FORNECEDOR QUATRO',
    '72.638.182/0001-31',
    'A'
);

INSERT INTO fornecedor VALUES
(
	DEFAULT,
    'FORNECEDOR CINCO',
    '03.530.099/0001-21',
    'I'
);

-------------
-- PRODUTO --
-------------
INSERT INTO produto VALUES
(
    DEFAULT,
    1,
    'Buffet',
    10.00,
    'COMIDA',
    'Buffet',
    'A'
);

INSERT INTO produto VALUES
(
    DEFAULT,
    1,
    'Coca-Cola 600ml',
    3.25,
    'BEBIDA',
    '',
    'A'
);

INSERT INTO produto VALUES
(
    DEFAULT,
    2,
    'Pepsi 600ml',
    3.00,
    'BEBIDA',
    '',
    'A'
);

INSERT INTO produto VALUES
(
    DEFAULT,
    3,
    'Água sem gás 500ml',
    2.50,
    'BEBIDA',
    '',
    'A'
);

INSERT INTO produto VALUES
(
    DEFAULT,
    4,
    'Água com gás 500ml',
    2.50,
    'BEBIDA',
    '',
    'A'
);

INSERT INTO produto VALUES
(
    DEFAULT,
    2,
    'Porção de fritas',
    8.50,
    'COMIDA',
    '',
    'A'
);

INSERT INTO produto VALUES
(
    DEFAULT,
    4,
    'Chiclete',
    0.50,
    'PRODUTO',
    '',
    'A'
);

INSERT INTO produto VALUES
(
    DEFAULT,
    4,
    'Bombom',
    1.00,
    'PRODUTO',
    '',
    'A'
);

-------------
-- COMANDA --
-------------
INSERT INTO comanda VALUES
(
    DEFAULT,
    1,
    1,
	'CRÉDITO',
    10.0,
    '20190621',
    'A'
);

INSERT INTO comanda VALUES
(
    DEFAULT,
    2,
    2,
	'EM ABERTO',
    40.0,
    '20190623',
    'I'
);

INSERT INTO comanda VALUES
(
    DEFAULT,
    2,
    2,
	'DÉBITO',
    20.0,
    '20190625',
    'A'
);

------------------
-- ITEM_COMANDA --
------------------
INSERT INTO item_comanda VALUES
(
    DEFAULT,
    1,
    1,
    1,
    10.0,
    'A'
);

INSERT INTO item_comanda VALUES
(
    DEFAULT,
    2,
    1,
    2,
    15.0,
    'A'
);

INSERT INTO item_comanda VALUES
(
    DEFAULT,
    2,
    7,
    1,
    8.50,   
    'A'
);

INSERT INTO item_comanda VALUES
(
    DEFAULT,
    2,
    8,
    3,
    0.50,
    'A'
);

INSERT INTO item_comanda VALUES
(
    DEFAULT,
    3,
    6,
    1,
    10.00,
    'A'
);

INSERT INTO item_comanda VALUES
(
    DEFAULT,
    3,
    6,
    1,
    8.50,
    'A'
);

INSERT INTO item_comanda VALUES
(
    DEFAULT,
    3,
    7,
    1,
    1.00,
    'A'
);

INSERT INTO item_comanda VALUES
(
    DEFAULT,
    3,
    8,
    1,
    0.50,
    'A'
);