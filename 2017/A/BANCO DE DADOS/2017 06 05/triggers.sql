1.
  CREATE OR REPLACE FUNCTION escolhergerente()
  RETURNS TRIGGER
  AS $$
  DECLARE
  gerente INTEGER;
  BEGIN
  gerente := CAST (RANDOM()*1+1 AS INTEGER);
  IF (NEW.gerente_id IS NULL) THEN
  NEW.gerente_id = gerente;
  RETURN NEW;
  ELSE
  RETURN NULL;
  END IF;
  END;
  $$ LANGUAGE plpgsql;


  CREATE TRIGGER escolhergerente
  BEFORE INSERT ON funcionarios
  FOR EACH ROW
  EXECUTE PROCEDURE escolhergerente();
  
  
  INSERT INTO funcionarios (id,funcoes_id,endereços_id,endereços_natal_id,telefones_id,nome,sobrenome,data_nascimento,email,RG,CPF,carteira_trabalho,data_admissao,salario)
  VALUES
  (17,7,1,1,1,'teste','teste','19980115','teste@email.com','1','1','1','20170602',500)


2.
  CREATE OR REPLACE FUNCTION mudarestado()
  RETURNS TRIGGER
  AS $$
  BEGIN
  IF (NEW.id <> OLD.id) THEN
  RAISE NOTICE 'Não é possível trocar o id dos estados!';
  RETURN NULL;
  ELSE
  RETURN NEW;
  END IF;
  END;
  $$ LANGUAGE plpgsql;


  CREATE TRIGGER mudarestado
  BEFORE UPDATE ON estados
  FOR EACH ROW
  EXECUTE PROCEDURE mudarestado();
  
  UPDATE estados
  SET id = 8
  WHERE id = 5;

  
3.
  CREATE OR REPLACE FUNCTION checkGerente()
  RETURNS TRIGGER
  AS $$
  BEGIN
  IF OLD.gerente_id IS NULL THEN
  RAISE NOTICE 'Não é possível deletar o gerente';
  RETURN NULL;
  ELSE
  RETURN NEW;
  END IF;
  END;
  $$ LANGUAGE plpgsql;


  CREATE TRIGGER checkGerente
  BEFORE DELETE ON funcionarios
  FOR EACH ROW
  EXECUTE PROCEDURE checkGerente();


  DELETE FROM funcionarios
  WHERE id = 1;


4.
  CREATE OR REPLACE FUNCTION funcgerente()
  RETURNS TRIGGER
  AS $$
  BEGIN
  IF (NEW.gerente_id IS NOT NULL) AND ((NEW.funcoes_id = 1) OR (NEW.funcoes_id = 5)) THEN
  RAISE NOTICE 'O funcionario não pode receber a função de um gerente!';
  RETURN NULL;
  ELSE
  RETURN NEW;
  END IF;
  END;
  $$ LANGUAGE plpgsql;

  CREATE TRIGGER funcgerente
  BEFORE INSERT OR UPDATE ON funcionarios
  FOR EACH ROW
  EXECUTE PROCEDURE funcgerente();
  
  UPDATE funcionarios
  SET funcoes_id = 1
  WHERE id=18;

  INSERT INTO funcionarios (id,funcoes_id,endereços_id,endereços_natal_id,telefones_id,nome,sobrenome,data_nascimento,email,RG,CPF,carteira_trabalho,data_admissao,salario)
  VALUES
  (19,1,1,1,1,'teste2','teste2','19980115','teste2@email.com','1','1','1','20170602',500);
