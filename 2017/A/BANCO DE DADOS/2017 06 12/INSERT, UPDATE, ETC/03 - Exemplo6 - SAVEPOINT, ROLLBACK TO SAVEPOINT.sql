BEGIN;

	INSERT INTO departments (id, name)
	VALUES (103, 'Purchasing');

	INSERT INTO departments
	VALUES (104, 'Finance', NULL, '2015-12-31');

	INSERT INTO departments
	VALUES (105, 'Commercial', NULL, CURRENT_DATE);

	INSERT INTO departments
	VALUES (106, 'Technology', NULL, TO_DATE ('31-Dec-2014', 'DD-Mon-YYYY'));

	SAVEPOINT sp1;

	UPDATE departments
	SET location = 'West';

	UPDATE departments
	SET id = 107
	WHERE id = 103;

	ROLLBACK TO SAVEPOINT sp1;
	
	RELEASE SAVEPOINT sp1;
	
COMMIT;

SELECT *
FROM departments;