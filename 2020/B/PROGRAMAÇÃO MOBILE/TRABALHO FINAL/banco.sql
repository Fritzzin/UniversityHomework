CREATE TABLE livro
(
    id SERIAL NOT NULL PRIMARY KEY, 
    nome TEXT NOT NULL, 
    autor TEXT NOT NULL 
);

CREATE TABLE usuario
(
    id SERIAL NOT NULL PRIMARY KEY,
    login TEXT NOT NULL,
    senha TEXT NOT NULL
);

CREATE TABLE localizacao 
( 
    id SERIAL NOT NULL PRIMARY KEY, 
    latitude NUMERIC, 
    longitude NUMERIC 
); 

CREATE TABLE biblioteca 
( 
    id SERIAL NOT NULL PRIMARY KEY, 
    nome TEXT NOT NULL, 
    localizacao_id INT NOT NULL, 
 
    CONSTRAINT fk_localizacao_id 
        FOREIGN KEY (localizacao_id) 
        REFERENCES localizacao(id) 
); 

CREATE TABLE loja 
( 
    id SERIAL NOT NULL PRIMARY KEY, 
    nome TEXT NOT NULL, 
    localizacao_id INT NOT NULL, 
  
    CONSTRAINT fk_localizacao_id 
        FOREIGN KEY (localizacao_id) 
        REFERENCES localizacao(id) 
); 
 
CREATE TABLE livro_biblioteca 
(     
    id SERIAL NOT NULL PRIMARY KEY,  
    livro_id INT NOT NULL,  
    biblioteca_id INT NOT NULL,  
    disponivel BOOLEAN NOT NULL,

    CONSTRAINT fk_livro_id
        FOREIGN KEY (livro_id)
        REFERENCES livro(id),

    CONSTRAINT fk_biblioteca_id
        FOREIGN KEY (biblioteca_id)
        REFERENCES biblioteca(id)
); 

CREATE TABLE livro_loja
(     
    id SERIAL NOT NULL PRIMARY KEY,  
    livro_id INT NOT NULL,  
    loja_id INT NOT NULL,  
    valor DECIMAL(10,2) NOT NULL,

    CONSTRAINT fk_livro_id
        FOREIGN KEY (livro_id)
        REFERENCES livro(id),

    CONSTRAINT fk_loja_id
        FOREIGN KEY (loja_id)
        REFERENCES loja(id)
); 

insert into livro values (default, 'Dom casmurro', 'Machado De Assis');
insert into livro values (default, 'O alienista', 'Machado De Assis');
insert into livro values (default, 'Quincas borba', 'Machado De Assis');
insert into livro values (default, 'A mao e a luva', 'Machado De Assis');
insert into livro values (default, 'O espelho', 'Machado De Assis');
insert into livro values (default, 'A cartomante', 'Machado De Assis');

insert into livro values (default, 'Capitães da areia', 'Jorge Amado');
insert into livro values (default, 'Jubiabá', 'Jorge Amado');
insert into livro values (default, 'Cacau', 'Jorge Amado');
insert into livro values (default, 'Suor', 'Jorge Amado');

insert into localizacao values (default, 2, 2);
insert into localizacao values (default, 1, 1);

insert into loja values (default, 'Livraria ABC', 1);
insert into biblioteca values (default, 'Biblioteca DEF', 2);

insert into livro_loja values ( default, 1, 1, 10);
insert into livro_loja values ( default, 2, 1, 14);
insert into livro_loja values ( default, 3, 1, 12);
insert into livro_loja values ( default, 10, 1, 17);

insert into livro_biblioteca values ( default, 5, 1, true);
insert into livro_biblioteca values ( default, 7, 1, true);
insert into livro_biblioteca values ( default, 6, 1, true);
insert into livro_biblioteca values ( default, 4, 1, true);
insert into livro_biblioteca values ( default, 8, 1, true);
