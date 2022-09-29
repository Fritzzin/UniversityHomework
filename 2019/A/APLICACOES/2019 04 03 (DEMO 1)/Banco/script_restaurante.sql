-- -----------------------------------------------------
-- Table cliente
-- -----------------------------------------------------
CREATE TABLE cliente
(
    id          SERIAL         NOT NULL ,
    nome        VARCHAR(50)    NOT NULL ,
    telefone    VARCHAR(14)    NULL     ,
    situacao    CHAR           NULL     ,
    PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table metodo_pagamento
-- -----------------------------------------------------
CREATE TABLE metodo_pagamento
(
    id          SERIAL      NOT NULL,
    nome        VARCHAR(50) NOT NULL,
    descricao   TEXT        NULL    ,
    situacao    CHAR        NULL    ,
    PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table tipo_conta
-- -----------------------------------------------------
CREATE TABLE tipo_conta
(
    id          SERIAL      NOT NULL,
    nome        VARCHAR(50) NOT NULL,
    descricao   TEXT        NULL    ,
    situacao    CHAR        NOT NULL,
    PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table funcao
-- -----------------------------------------------------
CREATE TABLE funcao
(
    id          SERIAL      NOT NULL,
    nome        VARCHAR(50) NOT NULL,
    descricao   TEXT        NULL    ,
    situacao    CHAR        NOT NULL,
    PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table tipo_produto
-- -----------------------------------------------------
CREATE TABLE tipo_produto
(
    id          SERIAL      NOT NULL,
    nome        VARCHAR(50) NOT NULL,
    descricao   TEXT        NULL    ,
    situacao    CHAR        NOT NULL,
    PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table fornecedor
-- -----------------------------------------------------
CREATE TABLE fornecedor
(
    id          SERIAL          NOT NULL,
    nome        VARCHAR(100)    NOT NULL,
    cnpj        VARCHAR(18)     NULL    ,
    situacao    CHAR            NOT NULL,
    PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table funcionario
-- -----------------------------------------------------
CREATE TABLE funcionario
(
    id                  SERIAL          NOT NULL,
    funcao_id           SERIAL          NOT NULL,
    nome                VARCHAR(50)     NOT NULL,
    telefone            VARCHAR(14)     NULL    ,
    data_admissao       DATE            NOT NULL,
    data_demissao       DATE            NULL    ,
    salario             DECIMAL(10,2)   NOT NULL,
    login               VARCHAR(50)     NOT NULL,
    senha               VARCHAR(50)     NOT NULL,
    situacao            CHAR            NOT NULL,
    PRIMARY KEY (id)                            ,
    CONSTRAINT fk_funcionario_funcao FOREIGN KEY (funcao_id) REFERENCES funcao (id)
);

-- -----------------------------------------------------
-- Table produto
-- -----------------------------------------------------
CREATE TABLE produto
(
    id              SERIAL          NOT NULL,
    tipo_produto_id SERIAL          NOT NULL,
    nome            VARCHAR(50)     NOT NULL,
    preco_uni       DECIMAL(10,2)   NOT NULL,
    qtde_estoque    REAL            NOT NULL,
    descricao       TEXT            NULL    ,
    situacao        CHAR            NOT NULL,
    PRIMARY KEY (id)                        ,
    CONSTRAINT fk_produto_tipo_produto FOREIGN KEY (tipo_produto_id) REFERENCES tipo_produto (id)
);

-- -----------------------------------------------------
-- Table item_fornecedor
-- -----------------------------------------------------
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


-- -----------------------------------------------------
-- Table comanda
-- -----------------------------------------------------
CREATE TABLE comanda
(
    id                  SERIAL          NOT NULL,
    cliente_id          SERIAL          NOT NULL,
    funcionario_id      SERIAL          NOT NULL,
    metodo_pagamento_id SERIAL          NOT NULL,
    valor               DECIMAL(10,2)   NOT NULL,
    data                DATE            NOT NULL,
    situacao            CHAR            NOT NULL,
    PRIMARY KEY (id)                            ,
    CONSTRAINT fk_comanda_cliente           FOREIGN KEY (cliente_id)           REFERENCES cliente           (id),
    CONSTRAINT fk_comanda_funcionario       FOREIGN KEY (funcionario_id)       REFERENCES funcionario       (id),
    CONSTRAINT fk_comanda_metodo_pagamento  FOREIGN KEY (metodo_pagamento_id)  REFERENCES metodo_pagamento  (id)
);

-- -----------------------------------------------------
-- Table item_comanda
-- -----------------------------------------------------
CREATE TABLE item_comanda
(
    comanda_id  SERIAL          NOT NULL,
    produto_id  SERIAL          NOT NULL,
    qtde        REAL          NOT NULL,
    valor       DECIMAL(10,2)   NOT NULL,
    situacao    CHAR            NOT NULL,
    CONSTRAINT fk_item_comanda_comanda FOREIGN KEY (comanda_id) REFERENCES comanda (id),
    CONSTRAINT fk_item_comanda_produto FOREIGN KEY (produto_id) REFERENCES produto (id)
);

-- -----------------------------------------------------
-- Table 
-- -----------------------------------------------------
CREATE TABLE conta_pagar
(
    id                  SERIAL          NOT NULL,
    metodo_pagamento_id SERIAL          NOT NULL,
    tipo_conta_id       SERIAL          NOT NULL,
    funcionario_id      SERIAL          NOT NULL,
    valor_cobrado       DECIMAL(10,2)   NOT NULL,
    valor_pago          DECIMAL         NULL    ,
    data_vencimento     DATE            NOT NULL,
    data_pagamento      DATE            NULL    ,
    descricao           TEXT            NULL    ,
    situacao            CHAR            NOT NULL,
    PRIMARY KEY (id)                            ,
    CONSTRAINT fk_conta_pagar_metodo_pagamento  FOREIGN KEY (metodo_pagamento_id)   REFERENCES metodo_pagamento (id),
    CONSTRAINT fk_conta_pagar_tipo_conta        FOREIGN KEY (tipo_conta_id)         REFERENCES tipo_conta       (id),
    CONSTRAINT fk_conta_pagar_funcionario       FOREIGN KEY (funcionario_id)        REFERENCES funcionario      (id)
);

INSERT INTO funcao VALUES
(
DEFAULT,                          
'ADMINISTRADOR',            
'ADMINISTRADOR DO SISTEMA', 
'A'                         
);


INSERT INTO funcionario VALUES
(
DEFAULT,                  
1,                  
'ADMINISTRADOR',   
'00000',                
'20190320',     
'20190320',         
'20.00',           
'admin',           
'21232f297a57a5a743894a0e4a801fc3',           
'A'                
);
