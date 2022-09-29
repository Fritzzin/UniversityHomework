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
    idUsuario INT, 

    CONSTRAINT fk_idUsuario 
        FOREIGN KEY (idUsuario) 
        REFERENCES usuario(id)
);

CREATE TABLE listaParticipante (
    idPessoa INT NOT NULL, 
    idEvento INT NOT NULL, 
    compareceu BOOLEAN NOT NULL, 
    codigoValidacao TEXT NOT NULL, 

    CONSTRAINT fk_idPessoa 
        FOREIGN KEY (idPessoa) 
        REFERENCES pessoa(id), 

    CONSTRAINT fk_idEvento 
        FOREIGN KEY (idEvento) 
        REFERENCES evento(id)
);