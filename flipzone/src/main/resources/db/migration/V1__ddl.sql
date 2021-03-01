
CREATE TABLE team(
    team_id varchar(5) PRIMARY KEY,
    team_name varchar(30),
    team_description varchar(100)
    );

CREATE TABLE product(
    product_id varchar(5) PRIMARY KEY,
    product_name varchar(30),
    product_description varchar(100)
    );

CREATE TABLE employee(
    employee_id varchar(5) PRIMARY KEY,
    team_id varchar(5),
    first_name varchar(30),
    last_name varchar(30),
    address varchar(30),
    email varchar(30),
    contact_number numeric(10),
    age integer,
    CONSTRAINT fk_tid FOREIGN KEY(team_id) REFERENCES team(team_id)
     );
