CREATE TABLE employees (
	id INTEGER,
	name VARCHAR(45),
	departments_id INTEGER,
	CONSTRAINT pk_employees_id PRIMARY KEY (id)
);

CREATE TABLE departments (
	id INTEGER,
	name VARCHAR(14),
	location VARCHAR(13),
	createdate DATE DEFAULT CURRENT_DATE,
	CONSTRAINT pk_departments_id PRIMARY KEY (id)
);

ALTER TABLE employees ADD CONSTRAINT fk_departments_id FOREIGN KEY (departments_id) REFERENCES departments (id);

--DROP TABLE IF EXISTS employees CASCADE;
--DROP TABLE IF EXISTS departments CASCADE;