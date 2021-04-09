CREATE TABLE Motorvogn (
   personnr VARCHAR(11) NOT NULL ,
   navn VARCHAR(30) NOT NULL,
   adresse VARCHAR(50) NOT NULL,
   kjennetegn VARCHAR(10) NOT NULL,
   merke VARCHAR(10) NOT NULL,
   type VARCHAR(10) NOT NULL,
   PRIMARY KEY (personnr)
);

CREATE TABLE Biler (
   merke VARCHAR(10) NOT NULL,
   type VARCHAR(10) NOT NULL
);