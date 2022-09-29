CREATE OR REPLACE FUNCTION naoaddpresidente ()
RETURNS TRIGGER
AS $$
BEGIN
IF (NEW.job_id = 19) THEN
RAISE NOTICE 'A empresa só pode ter um presidente!';
RETURN NULL;
ELSE
RETURN NEW;
END IF;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER naoaddpresidente
BEFORE UPDATE OR INSERT ON employee
FOR EACH ROW
EXECUTE PROCEDURE naoaddpresidente ();
