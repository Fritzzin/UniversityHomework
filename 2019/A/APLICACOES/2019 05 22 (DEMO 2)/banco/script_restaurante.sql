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
    nome            VARCHAR(50)     NOT NULL,
    preco_uni       DECIMAL(10,2)   NOT NULL,
    tipo_produto    VARCHAR(50)     NOT NULL,
    descricao       TEXT            NULL    ,
    situacao        CHAR            NOT NULL,
    PRIMARY KEY (id)
);

---------------------------
-- Table item_fornecedor --
---------------------------
CREATE TABLE item_fornecedor
(
    fornecedor_id   SERIAL          NOT NULL,
    produto_id      SERIAL          NOT NULL,
    qtde            REAL            NOT NULL,
    valor           DECIMAL(10,2)   NOT NULL,
    situacao        CHAR            NOT NULL,
    CONSTRAINT fk_item_fornecedor_fornecedor    FOREIGN KEY (fornecedor_id) REFERENCES fornecedor   (id),
    CONSTRAINT fk_item_fornecedor_produto       FOREIGN KEY (produto_id)    REFERENCES produto      (id)
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
    comanda_id  SERIAL          NOT NULL,
    produto_id  SERIAL          NOT NULL,
    qtde        REAL            NOT NULL,
    valor       DECIMAL(10,2)   NOT NULL,
    situacao    CHAR            NOT NULL,
    CONSTRAINT fk_item_comanda_comanda FOREIGN KEY (comanda_id) REFERENCES comanda (id),
    CONSTRAINT fk_item_comanda_produto FOREIGN KEY (produto_id) REFERENCES produto (id)
);

-----------------------
-- Table conta_pagar --
-----------------------
CREATE TABLE conta_pagar
(
    id                  SERIAL          NOT NULL    UNIQUE,
    metodo_pagamento    VARCHAR(50)     NOT NULL,
    funcionario_id      SERIAL          NOT NULL,
    valor               DECIMAL(10,2)   NOT NULL,
    data_vencimento     DATE            NOT NULL,
    tipo_conta          VARCHAR(50)     NOT NULL,
    descricao           TEXT            NULL    ,
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
    'ADMINISTRADOR',
    'ADMINISTRADOR DO SISTEMA',
    'A'
);

INSERT INTO funcao VALUES
(
    DEFAULT,
    'COZINHEIRO',
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

-------------
-- CLIENTE --
-------------
INSERT INTO cliente VALUES
(
    DEFAULT,
    'CLIENTE UM',
    '(51)2222-2222',
    'A'
);

INSERT INTO cliente VALUES
(
    DEFAULT,
    'CLIENTE DOIS',
    '(51)2222-2222',
    'A'
);

-----------------
-- FUNCIONARIO --
-----------------
INSERT INTO funcionario VALUES
(
    1,
    1,
    'ADMINISTRADOR',
    '00000',
    '20190320',
    '20190320',
    '20.00',
    'ADMIN',
    '21232f297a57a5a743894a0e4a801fc3',
    'A'
);

INSERT INTO funcionario VALUES
(
    2,
    2,
    'AUGUSTO FRITZ',
    '(51)3714-5408',
    '20190320',
    '20190320',
    '200.00',
    'AUGUSTO.FRITZ',
    '21232f297a57a5a743894a0e4a801fc3',
    'A'
);

-------------
-- PRODUTO --
-------------
INSERT INTO produto VALUES
(
    DEFAULT,
    'BUFFET',
    10.00,
    'A',
    '',
    'A'
);

INSERT INTO produto VALUES
(
    DEFAULT,
    'PRODUTO DOIS',
    20.00,
    'B',
    '',
    'A'
);

INSERT INTO produto VALUES
(
    DEFAULT,
    'PRODUTO TRES',
    15.00,
    'A',
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
    '20190521',
    'A'
);

INSERT INTO comanda VALUES
(
    DEFAULT,
    2,
    2,
	'NÃO DEFINIDO',
    40.0,
    '20190521',
    'I'
);

------------------
-- ITEM_COMANDA --
------------------
INSERT INTO item_comanda VALUES
(
    1,
    1,
    1,
    10.0,
    'A'
);

INSERT INTO item_comanda VALUES
(
    2,
    2,
    2,
    20.0,
    'A'
);

----------------
-- FORNECEDOR --
----------------
INSERT INTO fornecedor VALUES
(
	DEFAULT,
    'FORNECEDOR UM',
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