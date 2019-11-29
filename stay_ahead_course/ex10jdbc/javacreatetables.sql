conn / as sysdba

alter database default tablespace users;

create user user1
identified by user1;

grant connect, resource, create view, create synonym, alter session
to user1;

conn user1/user1

CREATE TABLE department (
 department_nr       NUMBER(2)    NOT NULL,
 name                VARCHAR2(10) NOT NULL,
 location            VARCHAR2(15) NOT NULL,
 CONSTRAINT dept_pkey PRIMARY KEY (department_nr)
 USING INDEX STORAGE (INITIAL     6K
                      NEXT        6K
                      PCTINCREASE 0))
STORAGE (INITIAL     6K
         NEXT        6K
         PCTINCREASE 0);

INSERT INTO department VALUES (10,'Accounts','Birmingham');
INSERT INTO department VALUES (20,'Research','Glasgow');
INSERT INTO department VALUES (30,'Sales','Manchester');
INSERT INTO department VALUES (40,'Operations','Birmingham');


CREATE TABLE salgrade (
 grade               NUMBER(2)   NOT NULL,
 low_salary          NUMBER(6,2) NOT NULL,
 high_salary         NUMBER(6,2) NOT NULL)
STORAGE (INITIAL     6K
         NEXT        6K
         PCTINCREASE 0);

INSERT INTO salgrade VALUES (1,700,1200);
INSERT INTO salgrade VALUES (2,1201,1400);
INSERT INTO salgrade VALUES (3,1401,2000);
INSERT INTO salgrade VALUES (4,2001,3000);
INSERT INTO salgrade VALUES (5,3001,9999);


CREATE TABLE employee (
 employee_nr         NUMBER(6)    NOT NULL,
 surname             VARCHAR2(20) NOT NULL,
 initials            CHAR(6),
 sex                 CHAR         NOT NULL   CHECK (sex IN ('M','F')),
 start_date          DATE         NOT NULL,
 job                 VARCHAR2(15) NOT NULL,
 manager             NUMBER(6),
 salary              NUMBER(6,2)  NOT NULL   CHECK (salary < 9999 ),
 department_nr       NUMBER(2)    NOT NULL,
 CONSTRAINT emp_pkey PRIMARY KEY (employee_nr)
 USING INDEX STORAGE (INITIAL     6K
                      NEXT        6K
                      PCTINCREASE 0),
 CONSTRAINT emp_fkey FOREIGN KEY (department_nr) REFERENCES department (department_nr))
STORAGE (INITIAL     10K
         NEXT        10K
         PCTINCREASE 0); 

INSERT INTO employee VALUES (1000,'King','J.R.','M',SYSDATE-558,'Chairman',NULL,5000,10);
INSERT INTO employee VALUES (1036,'Blake','S.T.','M',SYSDATE-465,'Manager',1000,2850,30);
INSERT INTO employee VALUES (1023,'Clark','M.','F',SYSDATE-372,'Manager',1000,2450,10);
INSERT INTO employee VALUES (1024,'Jones','D.S.','M',SYSDATE-279,'Manager',1000,2975,20);
INSERT INTO employee VALUES (1035,'Martin','R.J.','M',SYSDATE-341,'Salesman',1036,1250,30);
INSERT INTO employee VALUES (1033,'Allen','P.G.','F',SYSDATE-465,'Salesman',1023,2000,10);
INSERT INTO employee VALUES (1007,'Turner','J.','M',SYSDATE-31,'Salesman',1036,1500,30);
INSERT INTO employee VALUES (1019,'Jameson','N.H.B.','F',SYSDATE-434,'Clerk',1036,950,30);
INSERT INTO employee VALUES (1013,'Ward','K.T.','M',SYSDATE-217,'Salesman',1024,1250,20);
INSERT INTO employee VALUES (1026,'Ford',NULL,'M',SYSDATE-527,'Analyst',1023,3000,10);
INSERT INTO employee VALUES (1029,'Smith','J.','M',SYSDATE-496,'Clerk',1036,800,30);
INSERT INTO employee VALUES (1022,'Scott','B.L.','F',SYSDATE-248,'Analyst',1024,3000,20);
INSERT INTO employee VALUES (1017,'Adams','G.D.C','F',SYSDATE,'Clerk',1023,1100,10);
INSERT INTO employee VALUES (1030,'Miller',NULL,'F',SYSDATE-155,'Clerk',1024,1300,20);


CREATE TABLE customer (
 customer_nr         NUMBER(6)    NOT NULL,
 surname             VARCHAR2(20) NOT NULL,
 initials            CHAR(6)      NOT NULL,
 street              VARCHAR2(25),
 town                VARCHAR2(25),
 county              VARCHAR2(15),
 post_code           CHAR(8),
 telephone           VARCHAR2(15),
 credit_limit        NUMBER(6,2),
 CONSTRAINT cus_pkey PRIMARY KEY (customer_nr)
 USING INDEX STORAGE (INITIAL     6K
                      NEXT        6K
                      PCTINCREASE 0))
STORAGE (INITIAL     10K
         NEXT        10K
         PCTINCREASE 0); 

INSERT INTO customer VALUES (1317,'Williams','R.','15, London Road','Manchester',NULL,'M13 6TR','0161 254 1094',1000);
INSERT INTO customer VALUES (1087,'Knight','M.B.','23, Highbury Street','London',NULL,'NW12 7FC','0181 905 6127',500);
INSERT INTO customer VALUES (1019,'Jameson','N.H.B.','12-14, Turner Road','Dudley','W.Midlands','B13 4DE','0161 912 3305',1250);
INSERT INTO customer VALUES (1543,'McDonald','S.W.','102, Feltham Court','Croydon','Surrey','CR8 7GH','01314 267209',1500);
INSERT INTO customer VALUES (1822,'Jones','W.J.','16, Alloa Crescent','Birmingham',NULL,'B5 6HH','0121 234 8123',1000);
INSERT INTO customer VALUES (1036,'Blake','S.T.','67, Victoria Place','London',NULL,'SW4 9TR','0171 210 3156',750);
INSERT INTO customer VALUES (1443,'Smith','T.','22, Gresham Court','Wivenhoe','Essex','CO15 7VD','01206 872090',750);
INSERT INTO customer VALUES (1980,'Green','L.M.','45, Leeds Road','London',NULL,'W6 9HG','0171 710 1027',1250);
INSERT INTO customer VALUES (1674,'Jones','W.J.','90, Carter Street','Manchester',NULL,'M15 8FD','0161 205 2206',1500);
INSERT INTO customer VALUES (1223,'Brown','K.','5, Windmill Place','Truro','Cornwall','TR4 2VX','01857 511089',500);


CREATE TABLE supplier (
 supplier_nr         NUMBER(6)    NOT NULL,
 name                VARCHAR2(30) NOT NULL, 
 street              VARCHAR2(25),
 town                VARCHAR2(25),
 county              VARCHAR2(15),
 post_code           CHAR(8),
 telephone           VARCHAR2(15),
 CONSTRAINT supp_pkey PRIMARY KEY (supplier_nr)
 USING INDEX STORAGE (INITIAL     6K
                      NEXT        6K
                      PCTINCREASE 0))
STORAGE (INITIAL     10K
         NEXT        10K
         PCTINCREASE 0);

INSERT INTO supplier VALUES (1034,'Ace Software Ltd.','24, Dudley Road','Birmingham',NULL,'B10 4JK','0121 356 7885');
INSERT INTO supplier VALUES (1060,'Computer City Ltd.','9, Highfield Court','London',NULL,'N19 2RD','0181 556 2045');
INSERT INTO supplier VALUES (1005,'The Hardware Shop','23-25, High Street','Colchester','Essex','CO7 5LM','01206 308985');
INSERT INTO supplier VALUES (1196,'London Computers Ltd.','143, Merchants Road','London',NULL,'W4 7GH',NULL);
INSERT INTO supplier VALUES (1078,'PC Universe Ltd.','27, Coventry Road','Bristol','Avon','BR2 6HS','01222 108873');
INSERT INTO supplier VALUES (1045,'K. Brown','CompuHouse, High Street','Brighton','Sussex','BT5 9UK','01239 235666');


CREATE TABLE product (
 product_code         VARCHAR2(10)     NOT NULL,
 description          VARCHAR2(30) NOT NULL, 
 supplier_nr          NUMBER(6)    NOT NULL,
 cost_price           NUMBER(6,2),
 sales_price          NUMBER(6,2),
 instock              NUMBER(5),
 CONSTRAINT prod_pkey PRIMARY KEY (product_code)
 USING INDEX STORAGE (INITIAL     6K
                      NEXT        6K
                      PCTINCREASE 0),
 CONSTRAINT prod_fkey FOREIGN KEY (supplier_nr) REFERENCES supplier (supplier_nr))
STORAGE (INITIAL     10K
         NEXT        10K
         PCTINCREASE 0);
 
INSERT INTO product VALUES ('MW97','MicroWare Office 97',1034,230,305,450);
INSERT INTO product VALUES ('FD35','PCK 1.44Mb Floppy Drive',1060,25,35,206);
INSERT INTO product VALUES ('TX10','TrailBLaser Printer X10',1196,440,510,124);
INSERT INTO product VALUES ('AM17','Activan 17" Monitor',1196,450,605,20);
INSERT INTO product VALUES ('HD12','1.2GB Hard Disk Drive',1005,198,204,230);
INSERT INTO product VALUES ('DS96','DataStore DBMS 96',1060,420,525,100);
INSERT INTO product VALUES ('GD2','Graphix Draw 2.0',1034,120,165,203);
INSERT INTO product VALUES ('XM21','XVision 21" Monitor',1196,512,712,26);
INSERT INTO product VALUES ('ASM2','Activan SuperMouse 2',1005,24,35,105);


CREATE TABLE orders (
 order_nr             NUMBER(6)    NOT NULL,
 product_code         VARCHAR2(10)     NOT NULL, 
 customer_nr          NUMBER(6)    NOT NULL,
 order_date           DATE, 
 quantity             NUMBER(4)    NOT NULL,
 CONSTRAINT ord_pkey PRIMARY KEY (order_nr)
 USING INDEX STORAGE (INITIAL     6K
                      NEXT        6K
                      PCTINCREASE 0),
 CONSTRAINT ord_fkey_cust FOREIGN KEY (customer_nr) REFERENCES customer (customer_nr),
 CONSTRAINT ord_fkey_prod FOREIGN KEY (product_code) REFERENCES product (product_code))
STORAGE (INITIAL     10K
         NEXT        10K
         PCTINCREASE 0);
 
INSERT INTO orders VALUES (1000,'MW97',1317,SYSDATE-570,100);
INSERT INTO orders VALUES (1001,'HD12',1674,SYSDATE-529,5);
INSERT INTO orders VALUES (1002,'DS96',1443,SYSDATE-524,150);
INSERT INTO orders VALUES (1003,'MW97',1674,SYSDATE-466,75);
INSERT INTO orders VALUES (1004,'HD12',1317,SYSDATE-442,5);
INSERT INTO orders VALUES (1005,'MW97',1543,SYSDATE-440,100);
INSERT INTO orders VALUES (1006,'TX10',1087,SYSDATE-394,25);
INSERT INTO orders VALUES (1007,'AM17',1019,SYSDATE-366,5);
INSERT INTO orders VALUES (1008,'XM21',1674,SYSDATE-334,10);
INSERT INTO orders VALUES (1009,'HD12',1223,SYSDATE-291,125);
INSERT INTO orders VALUES (1010,'GD2',1036,SYSDATE-257,100);
INSERT INTO orders VALUES (1011,'DS96',1674,SYSDATE-257,50);
INSERT INTO orders VALUES (1012,'TX10',1036,SYSDATE-224,5);
INSERT INTO orders VALUES (1013,'MW97',1223,SYSDATE-207,10);
INSERT INTO orders VALUES (1014,'HD12',1036,SYSDATE-197,100);
INSERT INTO orders VALUES (1015,'AM17',1443,SYSDATE-169,50);
INSERT INTO orders VALUES (1016,'DS96',1317,SYSDATE-162,25);
INSERT INTO orders VALUES (1017,'HD12',1543,SYSDATE-128,10);
INSERT INTO orders VALUES (1018,'GD2',1443,SYSDATE-110,5);
INSERT INTO orders VALUES (1019,'MW97',1019,SYSDATE-83,25);
INSERT INTO orders VALUES (1020,'XM21',1223,SYSDATE-63,5);
INSERT INTO orders VALUES (1021,'GD2',1087,SYSDATE-49,125);
INSERT INTO orders VALUES (1022,'DS96',1674,SYSDATE,100);
INSERT INTO orders VALUES (1023,'HD12',1443,SYSDATE,10);


CREATE TABLE prospect (
 prospect_nr         NUMBER(6)    NOT NULL,
 surname             VARCHAR2(20) NOT NULL,
 initials            CHAR(6)      NOT NULL,
 street              VARCHAR2(25),
 town                VARCHAR2(25),
 county              VARCHAR2(15),
 post_code           CHAR(8),
 telephone           VARCHAR2(15),
 credit_rating       NUMBER(2)    NOT NULL   CHECK (credit_rating between 0 and 20),
 CONSTRAINT pros_pkey PRIMARY KEY (prospect_nr)
 USING INDEX STORAGE (INITIAL     6K
                      NEXT        6K
                      PCTINCREASE 0))
STORAGE (INITIAL     10K
         NEXT        10K
         PCTINCREASE 0); 

INSERT INTO prospect VALUES (1,'Lamb','R.J.','15, London Road','Manchester',NULL,'M13 6TR','0161 254 1094',10);
INSERT INTO prospect VALUES (2,'Knight','M.B.','23, Highbury Street','London',NULL,'NW12 7FC','0181 905 6127',5);
INSERT INTO prospect VALUES (3,'Jameson','N.H.B.','12-14, Turner Road','Dudley','W.Midlands','B13 4DE','0161 912 3305',10);
INSERT INTO prospect VALUES (4,'Hendrix','J.','102, Feltham Court','Croydon','Surrey','CR8 7GH','01314 267209',15);
INSERT INTO prospect VALUES (5,'Jones','L.R.','16, Alloa Crescent','Birmingham',NULL,'B5 6HH','0121 234 8123',10);
INSERT INTO prospect VALUES (6,'Smith','M.','67, Victoria Place','London',NULL,'SW4 9TR','0171 210 3156',7);
INSERT INTO prospect VALUES (7,'Smith','T.','22, Gresham Court','Wivenhoe','Essex','CO15 7VD','01206 872090',7);
INSERT INTO prospect VALUES (8,'White','K.R.','45, Leeds Road','London',NULL,'W6 9HG','0171 710 1027',10);
INSERT INTO prospect VALUES (9,'Jones','W.J.','90, Carter Street','Manchester',NULL,'M15 8FD','0161 205 2206',15);
INSERT INTO prospect VALUES (10,'Botham','S.P.','5, Windmill Place','Truro','Cornwall','TR4 2VX','01857 511089',5);
INSERT INTO prospect VALUES (11,'Williams','R.','15, London Road','Manchester',NULL,'M13 6TR','0161 254 1094',10);
INSERT INTO prospect VALUES (12,'Watkins','D.R.L.','23, Highbury Street','London',NULL,'NW12 7FC','0181 905 6127',5);
INSERT INTO prospect VALUES (13,'Fford','H.C.C.','12-14, Turner Road','Dudley','W.Midlands','B13 4DE','0161 912 3305',10);
INSERT INTO prospect VALUES (14,'McDonald','S.W.','102, Feltham Court','Croydon','Surrey','CR8 7GH','01314 267209',15);
INSERT INTO prospect VALUES (15,'Jones','P.','16, Alloa Crescent','Birmingham',NULL,'B5 6HH','0121 234 8123',10);
INSERT INTO prospect VALUES (16,'Blake','S.T.','67, Victoria Place','London',NULL,'SW4 9TR','0171 210 3156',7);
INSERT INTO prospect VALUES (17,'Allen','B.C.','22, Gresham Court','Wivenhoe','Essex','CO15 7VD','01206 872090',7);
INSERT INTO prospect VALUES (18,'Green','L.M.','45, Leeds Road','London',NULL,'W6 9HG','0171 710 1027',12);
INSERT INTO prospect VALUES (19,'Middleton','S.','90, Carter Street','Manchester',NULL,'M15 8FD','0161 205 2206',15);
INSERT INTO prospect VALUES (20,'Brown','K.','5, Windmill Place','Truro','Cornwall','TR4 2VX','01857 511089',5);
INSERT INTO prospect VALUES (21,'Channon','M.','124, Causton Road','Ipswich','Suffolk','IP3 6FD','01420 340912',7);

create table bank
(account_nr number(4) primary key,
 name varchar2(30) not null,
 balance number(8,2),
 od_limit number(6,2),
 account_type char check (account_type in ('C','S'))
);
insert into bank values (1111,'Fred',0,0,'C');
insert into bank values (1112,'Ned',1000,500,'C');
insert into bank values (1113,'Ted',1000,0,'S');
insert into bank values (1114,'Jed',1000,0,'S');
insert into bank values (1115,'Horatio',10000,0,'S');
insert into bank values (1116,'Napoleon',400,0,'C');

COMMIT;
