UPDATE departments
SET location = 'West';

UPDATE departments
SET id = 104
WHERE id = 103;

COMMIT;

SELECT *
FROM departments;