CREATE DATABASE ers;

\c ers;

CREATE TABLE  users
(
    users_id     SERIAL      PRIMARY KEY ,
    users_name   VARCHAR(20) NOT NULL UNIQUE,
    password     VARCHAR(20) NOT NULL,
    first_name   VARCHAR(20) NOT NULL,
    last_name    VARCHAR(20) NOT NULL,
    email        VARCHAR(20) NOT NULL UNIQUE,
    users_role_id  INTEGER NOT NULL REFERENCES  user_roles
);

CREATE TABLE user_roles
(
    role_id SERIAL PRIMARY KEY ,
    roles   VARCHAR(20) NOT NULL
);


CREATE TABLE request_status
(
    status_id SERIAL PRIMARY KEY ,
    status    VARCHAR(20) NOT NULL
);


CREATE TABLE reimbursement
(
    reimbursement_id            SERIAL PRIMARY KEY ,
    reimbursement_amount        NUMERIC(5 , 3) NOT NULL,
    reimbursement_submit_time   TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
    reimbursement_resolved_time TIMESTAMP,
    reimbursement_description   VARCHAR(100),
    reimbursement_applicant_id  INTEGER NOT NULL REFERENCES users,
    reimbursement_status_id     INTEGER DEFAULT 2 NOT NULL REFERENCES request_status

);


INSERT INTO users (first_name, last_name, email, users_name, password, users_role_id )
values('a', 'b', 'abu@gmail.com', 'a', '1111', 1), ('c', 'd', 'cd@gmail.com', 'c', '2222', 2);