INSERT INTO team(team_id,team_name,team_description) VALUES ('t1999','team 1','micro services and database');
INSERT INTO team(team_id,team_name,team_description) VALUES ('t2999','team 2','support and testing');

INSERT INTO product(product_id,product_name,product_description) VALUES ('p1999','product 1','database');
INSERT INTO product(product_id,product_name,product_description) VALUES ('p2999','product 2','front end');

INSERT INTO employee(employee_id,team_id,first_name,last_name,address,email,contact_number,age) VALUES ('emp01','t1999','emp01_fName','emp01_lName','emp01_address','emp01@email.com',1234567890,25);
INSERT INTO employee(employee_id,team_id,first_name,last_name,address,email,contact_number,age) VALUES ('emp02','t1999','emp02_fName','emp02_lName','emp02_address','emp02@email.com',1234567891,28);
INSERT INTO employee(employee_id,team_id,first_name,last_name,address,email,contact_number,age) VALUES ('emp03','t2999','emp03_fName','emp03_lName','emp03_address','emp03@email.com',1234567892,25);
