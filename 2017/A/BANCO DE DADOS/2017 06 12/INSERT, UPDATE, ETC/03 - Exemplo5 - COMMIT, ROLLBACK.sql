INSERT INTO departments (id, name)
VALUES (100, 'Purchasing');

INSERT INTO departments
VALUES (101, 'Finance', NULL, '2015-12-31');

INSERT INTO departments
VALUES (102, 'Commercial', NULL, CURRENT_DATE);

COMMIT;

INSERT INTO departments
VALUES (103, 'Technology', NULL, TO_DATE ('31-Dec-2014', 'DD-Mon-YYYY'));

ROLLBACK;

SELECT *
FROM departments;