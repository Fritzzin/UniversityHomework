CREATE OR REPLACE FUNCTION naotrocarcountry ()
RETURNS TRIGGER
AS $$
BEGIN
IF ((NEW.id <> OLD.id) OR (NEW.id = OLD.id)) THEN
RAISE NOTICE 'Não é permitido atualizar o campo "country.id"!';
RETURN NULL;
ELSE
RETURN NEW;
END IF;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER naotrocarcountry
BEFORE UPDATE ON country
FOR EACH ROW
EXECUTE PROCEDURE naotrocarcountry ();