CREATE TABLE usuario (
    id SERIAL NOT NULL PRIMARY KEY, 
    login TEXT NOT NULL, 
    senha TEXT NOT NULL
);

CREATE TABLE evento (
    id SERIAL NOT NULL PRIMARY KEY, 
    nome TEXT NOT NULL, 
    data DATE NOT NULL
);

CREATE TABLE pessoa (
    id SERIAL NOT NULL PRIMARY KEY, 
    nome TEXT NOT NULL, 
    email TEXT NOT NULL, 
    cpf VARCHAR(14) NOT NULL, 
    sincronizado BOOLEAN NOT NULL,
    idUsuario INT, 

    CONSTRAINT fk_idUsuario 
        FOREIGN KEY (idUsuario) 
        REFERENCES usuario(id)
);

CREATE TABLE listaParticipante (
    idPessoa INT NOT NULL, 
    idEvento INT NOT NULL, 
    compareceu BOOLEAN NOT NULL, 
    sincronizado BOOLEAN NOT NULL,
    codigoValidacao TEXT NOT NULL,
    pathCertificado TEXT, 

    CONSTRAINT fk_idPessoa 
        FOREIGN KEY (idPessoa) 
        REFERENCES pessoa(id), 

    CONSTRAINT fk_idEvento 
        FOREIGN KEY (idEvento) 
        REFERENCES evento(id)
);


INSERT INTO usuario VALUES (DEFAULT,'Juca','9a5aab71aac4028688f5eda14f55f1f0');
INSERT INTO usuario VALUES (DEFAULT,'Augusto','8c63feed8b89ea9a6496ed92ed818ac2');
INSERT INTO usuario VALUES (DEFAULT,'Lucas','5f80f427552844b5f5a0045bcc9459cb');


INSERT INTO pessoa VALUES (DEFAULT, 'Juca Bala', 'JucaBala@email.com', '111.222.333-44', true, 1);
INSERT INTO pessoa VALUES (DEFAULT, 'Augusto Fritz', 'augusto.fritz@universo.univates.com', '033.711.300-96', true, 2);
INSERT INTO pessoa VALUES (DEFAULT, 'Lucas Assis', 'lucas.assis@universo.univates.br ', '123.456.789-00', true, 3);


INSERT INTO evento VALUES (DEFAULT, 'Aniversário Augusto', '2021-01-15');
INSERT INTO evento VALUES (DEFAULT, 'Festa de Natal', '2020-12-25');
INSERT INTO evento VALUES (DEFAULT, 'Entrega Trabalho Final', '2020-11-11');


INSERT INTO listaParticipante VALUES (1, 1, FALSE, TRUE, '6512bd43d9caa6e02c990b0a82652dca', ' ');
INSERT INTO listaParticipante VALUES (2, 1, FALSE, TRUE, '3c59dc048e8850243be8079a5c74d079', ' ');
INSERT INTO listaParticipante VALUES (3, 1, FALSE, TRUE, 'c16a5320fa475530d9583c34fd356ef5', ' ');

INSERT INTO listaParticipante VALUES (1, 2, FALSE, TRUE, 'c20ad4d76fe97759aa27a0c99bff6710', ' ');
INSERT INTO listaParticipante VALUES (3, 2, FALSE, TRUE, '6364d3f0f495b6ab9dcf8d3b5c6e0b01', ' ');

INSERT INTO listaParticipante VALUES (2, 3, FALSE, TRUE, '37693cfc748049e45d87b8c7d8b9aacd', ' ');
INSERT INTO listaParticipante VALUES (3, 3, FALSE, TRUE, '182be0c5cdcd5072bb1864cdee4d3d6e', ' ');