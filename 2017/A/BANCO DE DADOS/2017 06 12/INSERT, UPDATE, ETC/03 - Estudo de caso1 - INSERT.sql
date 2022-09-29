--TABELA region

INSERT INTO region VALUES
	(nextval('sq_region_id'),'North America'),
	(nextval('sq_region_id'),'Central America'),
	(nextval('sq_region_id'),'South America'),
	(nextval('sq_region_id'),'Europe'),
	(nextval('sq_region_id'),'Africa'),
	(nextval('sq_region_id'),'Middle East'),
	(nextval('sq_region_id'),'Asia'),
	(nextval('sq_region_id'),'Oceania'),
	(nextval('sq_region_id'),'Antarctica'),
	(nextval('sq_region_id'),'Arctic');

--TABELA country

INSERT INTO country (name, region_id) VALUES
	('Canada',1),
	('United States',1),
	('Mexico',2),
	('Brazil',3),
	('Argentina',3),
	('Spain',4),
	('England',4),
	('South Africa',5),
	('Saudi Arabia',6),
	('China',7),
	('Japan',7),
	('Autralia',8),
	('Chile',3),
	('Afghanistan',6),
	('Italy',4),
	('Germany',4),
	('Mozambique',5),
	('Honduras',2),
	('Switzerland',4),
	('Senegal',5),
	('Uruguay',3),
	('Paraguay',3);

--TABELA location

INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua Rui Barbosa', '95940-000', 'Arroio do Meio', 'RS', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua Dr. João Carlos Machado', '95940-000', 'Arroio do Meio', 'RS', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua Visconde do Rio Branco', '95940-000', 'Arroio do Meio', 'RS', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua Tiradentes', '95900-000', 'Lajeado', 'RS', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua Duque de Caxias', '95900-000', 'Lajeado', 'RS', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua Saldanha Marinho', '95900-000', 'Lajeado', 'RS', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Avenida 1 Leste', '95890-000', 'Teutônia', 'RS', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua Major Bandeira', '95890-000', 'Teutônia', 'RS', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua Carlos Arnt', '95890-000', 'Teutônia', 'RS', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua D. Pedro II', '95890-000', 'Teutônia', 'RS', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Marginal Tietê', '01000-000', 'São Paulo', 'SP', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Abbey Road', NULL, 'London', NULL, 13);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua Menna Barreto', '95880-000', 'Estrela', 'RS', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua Fernando Pessoa', NULL, 'Franca', 'SP', 7);
INSERT INTO location VALUES (nextval('sq_location_id'), 'S Central Ave', '900524200', 'Los Angeles', 'CA', 3);
INSERT INTO location VALUES (nextval('sq_location_id'), '3888 State St, 456', '931012610', 'Santa Barbara', 'CA', 3);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Berlin', NULL, 'Theodor-Heuss-Platz', 'B', 31);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Austin', '58501', 'N. Fifth St. Bismarck', 'NK', 3);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Sydney', NULL, 'George Street', 'SW', 23);
INSERT INTO location VALUES (nextval('sq_location_id'), 'Rua Pedro Cadore', '95935-000', 'Capitão', 'RS', 7);

--TABELA department

INSERT INTO department (id, name, location_id) VALUES (nextval('sq_department_id'), 'Sales', 111);
INSERT INTO department (id, name, location_id) VALUES (nextval('sq_department_id'), 'Holder', 111);
INSERT INTO department (id, name, location_id) VALUES (nextval('sq_department_id'), 'Commercial', 111);
INSERT INTO department (id, name, location_id) VALUES (nextval('sq_department_id'), 'TI', 115);
INSERT INTO department (id, name, location_id) VALUES (nextval('sq_department_id'), 'Accounting', 114);
INSERT INTO department (id, name, location_id) VALUES (nextval('sq_department_id'), 'Financial', 111);
INSERT INTO department (id, name, location_id) VALUES (nextval('sq_department_id'), 'Purchasing', 114);
INSERT INTO department (id, name, location_id) VALUES (nextval('sq_department_id'), 'Human Resources', 115);
INSERT INTO department (id, name, location_id) VALUES (nextval('sq_department_id'), 'Engineering', 115);
INSERT INTO department (id, name, location_id) VALUES (nextval('sq_department_id'), 'Direction', 114);

--TABELA job

INSERT INTO job VALUES (nextval('sq_job_id'), 'Seller', 500.00, 5000.00);
INSERT INTO job VALUES (nextval('sq_job_id'), 'Support', 1000.00, 5000.00);
INSERT INTO job VALUES (nextval('sq_job_id'), 'Analyst', 2000.00, 8000.00);
INSERT INTO job VALUES (nextval('sq_job_id'), 'Programmer', 1000.00, 6000.00);
INSERT INTO job VALUES (nextval('sq_job_id'), 'Counter', 2000.00, 7000.00);
INSERT INTO job VALUES (nextval('sq_job_id'), 'Engineer', 5000.00, 10000.00);
INSERT INTO job VALUES (nextval('sq_job_id'), 'Administrator', 1000.00, 5000.00);
INSERT INTO job VALUES (nextval('sq_job_id'), 'Secretary', 1000.00, 5000.00);
INSERT INTO job VALUES (nextval('sq_job_id'), 'Director', 5000.00, 15000.00);
INSERT INTO job VALUES (nextval('sq_job_id'), 'President', 10000.00, 20000.00);
INSERT INTO job VALUES (nextval('sq_job_id'), 'Intern', 500.00, 1000.00);

--TABELA employee

INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Douglas', 'Müller', 'joselitomuller@company.com', 5199999901, '2001-01-31', 1, 2000.00, 5.00, NULL, 10);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Carlito', 'Silva', 'carlitodasilva@company.com', 5199999902, CURRENT_DATE, 1, 800.00, 10.00, 1, 10);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'João', 'Silva', 'joaosilva@company.com', 5199998888, '2004-08-016', 1, 800.00, 15.00, 1, 10);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Marcos', 'Santos', 'marcossantos@company.com', 5188887777, '2015-11-07', 1, 1200.00, 4.00, 1, 10);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Maria', 'Antonieta', 'mariaantonieta@company.com', 5198765432, '2001-02-15', 3, 3000.00, NULL, NULL, 20);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Paulo', 'Campos', 'paulocampos@company.com', 5198765433, '2014-03-03', 3, 2500.00, NULL, 5, 20);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Joana', 'Souza', 'joanasouza@company.com', 2155554444, '2006-03-29', 5, 5000.00, NULL, NULL, 40);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Maurício', 'Batista', 'mauriciobatista@company.com', 2144443333, '2005-05-13', 7, 3500.00, NULL, 7, 40);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Denis', 'Snider', 'denissnider@company.com', '5185987422', '2011-02-15', 9, 6584.66, NULL, NULL, 60);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'João', 'Kipper', 'joaokipper@company.com', '1191459788', '2012-12-15', 9, 4444.05, NULL, 9, 60);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Sofia', 'Horn', 'sofiahorn@company.com', '5594697811', '2012-12-15', 9, 2000.00, NULL, 9, 60);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Vanessa', 'Hunemeier', 'vanessahunemeier@company.com', '5190000000', '2011-06-01', 11, 7500.00, NULL, NULL, 90);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Lucas', 'Camargo', 'lucascamargo@company.com', '5197008899', '2010-01-01', 11, 8900.55, NULL, 12, 90);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Emilio', 'Hennemann', 'emiliohennemann@company.com', 5196650508, '2006-01-04', 13, 2800.00, NULL, NULL, 80);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Marcolino', 'Souza', 'ms@company.com', 5180135060, '2007-01-04', 13, 1840.00, NULL, 14, 80);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Lucas', 'Lima', 'll@company.com', 2198981010, '2004-01-04', 13, 1010.00, NULL, 14, 80);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'João', 'Menezes', 'joaomenezes@company.com', '5133334444', '2012-01-05', 13, 1500, NULL, 14, 80);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Valesca', 'Mattos', 'valescamattos@company.com', '5137208800', '2013-10-30', 15, 6000, NULL, NULL, 100);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Pedro', 'Rocha', 'pedrorocha@company.com', '5137209000', '2002-09-25', 17, 16500, NULL, NULL, 100);
INSERT INTO employee (id, firstname, lastname, email, phone, hire, job_id, salary, commission, manager_id, department_id) VALUES (nextval('sq_employee_id'), 'Alcemar', 'Illuminati', 'alcemarilluminati@company.com', NULL, '2000-01-02', 19, 23300, NULL, NULL, 100);

--TABELA department

UPDATE department SET manager_id = 1 WHERE id = 10;
UPDATE department SET manager_id = 5 WHERE id = 20;
UPDATE department SET manager_id = 7 WHERE id = 40;
UPDATE department SET manager_id = 9 WHERE id = 60;
UPDATE department SET manager_id = 12 WHERE id = 90;
UPDATE department SET manager_id = 14 WHERE id = 80;
UPDATE department SET manager_id = 20 WHERE id = 100;

--TABELA employee

UPDATE employee SET manager_id = 19 WHERE manager_id IS NULL;
UPDATE employee SET manager_id = 20 WHERE department_id = 100;
UPDATE employee SET manager_id = NULL WHERE job_id = 19;

--TABELA job_history

INSERT INTO jobhistory (employee_id, start, finish, job_id, department_id) VALUES (1, '2001-01-31', '2003-12-25', 21, 10);
INSERT INTO jobhistory (employee_id, start, finish, job_id, department_id) VALUES (1, '2003-12-26', '2010-01-02', 3, 10);
INSERT INTO jobhistory (employee_id, start, finish, job_id, department_id) VALUES (5, '2001-02-15', '2006-01-02', 15, 20);
INSERT INTO jobhistory (employee_id, start, finish, job_id, department_id) VALUES (7, '2006-03-29', '2008-01-02', 15, 100);
INSERT INTO jobhistory (employee_id, start, finish, job_id, department_id) VALUES (7, '2008-01-03', '2010-05-02', 7, 40);
INSERT INTO jobhistory (employee_id, start, finish, job_id, department_id) VALUES (9, '2011-02-15', '2014-09-01', 21, 60);
INSERT INTO jobhistory (employee_id, start, finish, job_id, department_id) VALUES (12, '2011-06-01', '2015-01-02', 21, 90);
INSERT INTO jobhistory (employee_id, start, finish, job_id, department_id) VALUES (14, '2006-01-04', '2008-05-05', 21, 100);
INSERT INTO jobhistory (employee_id, start, finish, job_id, department_id) VALUES (14, '2008-05-06', '2010-06-06', 3, 20);
INSERT INTO jobhistory (employee_id, start, finish, job_id, department_id) VALUES (14, '2010-06-07', '2012-11-12', 3, 80);

COMMIT;

/*
SELECT *
FROM job_history;
*/