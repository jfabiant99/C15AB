CREATE TABLE PRODUCTO (
PRO_CODIGO CHAR (5) PRIMARY KEY,
PRO_NOMBRE VARCHAR (55),
PRO_PRECIO NUMBER (7,2),
PRO_STOCK NUMBER(4),
ALM_CODIGO NUMBER(5) NOT NULL,
SUM_CODIGO NUMBER (5) NOT NULL
);

CREATE TABLE ALMACEN (
ALM_CODIGO NUMBER (5) PRIMARY KEY,
ALM_DISTRITO VARCHAR(55),
ALM_RESPONSABLE VARCHAR(45)
);

CREATE TABLE SUMINISTRO (
SUM_CODIGO NUMBER(5) PRIMARY KEY,
SUM_EMPRESA VARCHAR(45),
SUM_RUC NUMBER (5)
);

ALTER TABLE PRODUCTO ADD CONSTRAINT ALM_CODIGO_FK FOREIGN KEY (ALM_CODIGO) REFERENCES ALMACEN (ALM_CODIGO);
ALTER TABLE PRODUCTO ADD CONSTRAINT SUM_CODIGO_FK FOREIGN KEY (SUM_CODIGO) REFERENCES SUMINISTRO (SUM_CODIGO);

CREATE SEQUENCE ALMACEN_SEQUENCE
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;

CREATE SEQUENCE SUMINISTRO_SEQUENCE
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;

INSERT INTO ALMACEN (ALM_CODIGO, ALM_DISTRITO, ALM_RESPONSABLE) VALUES (ALMACEN_SEQUENCE.NEXTVAL, 'La Victoria', 'Juan Marcos Anaya Peredo');

INSERT INTO SUMINISTRO VALUES (SUMINISTRO_SEQUENCE.NEXTVAL, 'DICAREL S.A.C.', 12345);

INSERT INTO PRODUCTO VALUES ('P001', 'SONY XPERIA 380', 750, 35, 1, 1);

SELECT ALM_CODIGO, ALM_DISTRITO, ALM_RESPONSABLE FROM ALMACEN;

SELECT SUM_CODIGO, SUM_EMPRESA, SUM_RUC FROM SUMINISTRO;

--BOLETA
SELECT P.PRO_CODIGO, P.PRO_NOMBRE, P.PRO_PRECIO, P.PRO_STOCK ,A.ALM_RESPONSABLE, A.ALM_DISTRITO,S.SUM_EMPRESA, S.SUM_RUC
FROM PRODUCTO P
JOIN ALMACEN A ON (P.ALM_CODIGO = A.ALM_CODIGO)
JOIN SUMINISTRO S ON (P.SUM_CODIGO = S.SUM_CODIGO);

--PRODUCTO:
SELECT PRO_CODIGO, PRO_NOMBRE, PRO_PRECIO, PRO_STOCK FROM PRODUCTO;






