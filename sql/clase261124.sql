INSERT INTO color VALUES ('NEG', 'Negro'), ('BLA', 'Balnco'), ('AZU', 'Azul');

INSERT INTO camiseta VALUES ('C1', 'Basica', 'M', 12.50, 'NEG');
INSERT INTO camiseta VALUES ('C2', 'Deportiva', 'XL', 45.99, 'AZU');
INSERT INTO camiseta VALUES ('C3', 'Estampada', 'XXXL', 22.50, 'BLA');

USE tienda_camisetas;

CREATE TABLE color (
    codColor VARCHAR(3) PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL
);

CREATE TABLE camiseta (
    codCamiseta VARCHAR(5) PRIMARY KEY,
    modelo VARCHAR(40) NOT NULL,
    talla VARCHAR(5) NOT NULL,
    precio DECIMAL(5,2) NOT NULL,
    codColor VARCHAR(3) NOT NULL,
    CONSTRAINT chk_talla
        CHECK (talla IN ('S', 'M', 'L', 'XL', 'XXL', 'XXXL', 'XXXXL')),
    CONSTRAINT chk_precio
        CHECK (precio BETWEEN 5 AND 100),
    FOREIGN KEY (codColor) REFERENCES color(codColor)
 )