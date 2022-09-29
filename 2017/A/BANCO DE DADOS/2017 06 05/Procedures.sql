4.Pelo menos 1 STORED PROCEDURE que utilize ROWTYPE;

1.
CREATE OR REPLACE FUNCTION addbairros ()
RETURNS INTEGER
AS $$
DECLARE 
quant INTEGER;
bairro INTEGER;
BEGIN
quant := 21;
WHILE quant <= 1000 LOOP
bairro := CAST (RANDOM()*11+1 AS INTEGER);
INSERT INTO endereços 
(id, logradouro, numero, bairros_id) 
VALUES
(quant,'Rua ' || quant, quant, bairro);
quant := quant + 1;
END LOOP;
RETURN 0;
END;
$$ LANGUAGE plpgsql;

SELECT addbairros();


2.
CREATE OR REPLACE FUNCTION exer2 (INT)
RETURNS INTEGER
AS $$
DECLARE
salarioatual DECIMAL(10,2);
exer2cursor CURSOR FOR
SELECT *
FROM contas;
BEGIN
IF EXISTS (SELECT *
            FROM contas
            WHERE funcionarios_id = $1) THEN
salarioatual := (SELECT salario
				 FROM funcionarios
				 WHERE id = $1);
UPDATE funcionarios
SET salario = salarioatual + 200
WHERE id = $1;
RETURN 1;
ELSE
RETURN 0;
END IF;
END;
$$ LANGUAGE plpgsql;

SELECT *
FROM exer2(2);


3.
 CREATE OR REPLACE FUNCTION selectfunc (gerente INTEGER)
 RETURNS SETOF funcionarios
 AS $$
 DECLARE 
 selfunc RECORD;
 BEGIN
 FOR selfunc IN (SELECT *
				FROM funcionarios
				WHERE gerente_id = gerente) LOOP
 RETURN NEXT selfunc;
 END LOOP;
 END;
 $$ LANGUAGE plpgsql;
 
 SELECT *
 FROM selectfunc(2);


4.
CREATE OR REPLACE FUNCTION exer3 (inicio INTEGER, fim INTEGER)
RETURNS DECIMAL (10,2)
AS $$
DECLARE
exer3row contas%ROWTYPE;
resultado DECIMAL (10,2);
BEGIN
IF EXISTS (SELECT *
		   FROM contas
		   WHERE id BETWEEN inicio AND fim) THEN
SELECT * 
INTO exer3row
FROM contas
WHERE valor >= ALL (SELECT valor
					FROM contas
					WHERE id BETWEEN inicio AND fim);
resultado := exer3row.valor;
ELSE
resultado := null;
END IF;
RETURN resultado;
END;
$$ LANGUAGE plpgsql;

5.
CREATE OR REPLACE FUNCTION contasfunc (funcionario INTEGER)
RETURNS SETOF contas
AS $$
SELECT *
FROM contas
WHERE funcionarios_id = $1
$$ LANGUAGE sql;

SELECT *
FROM contasfunc (1);


6.
CREATE OR REPLACE FUNCTION exer6 (INT,INT)
RETURNS SETOF fornecedores
AS $$
DECLARE 
selectforn RECORD;
id1 ALIAS FOR $1;
id2 ALIAS FOR $2;
BEGIN
FOR selectforn IN (SELECT *
				   FROM fornecedores
				   WHERE id BETWEEN $1 AND $2 ) LOOP
RETURN NEXT selectforn;
END LOOP;
END;
$$LANGUAGE plpgsql;

SELECT id, CNPJ, tipo_produto
FROM exer6(1,4);
