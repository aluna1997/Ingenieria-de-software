CREATE TABLE usuario (
	idusuario serial NOT NULL,
	nombre text NOT NULL,
	correo text NOT NULL,
	contrasenia text NOT NULL,
	fechanacimiento date,
	PRIMARY KEY(idusuario)
);

CREATE TABLE marcador (
	idmarcador serial NOT NULL,
	descripcion text NOT NULL,
	longitud double precision NOT NULL,
	latutu double precision NOT NULL,
	idusuario int NOT NULL,
	PRIMARY KEY(idmarcador),
	CONSTRAINT fk_idusuario FOREIGN KEY (idusuario) REFERENCES usuario(idusuario)
);


INSERT INTO usuario(nombre,correo,contrasenia,fechanacimiento) VALUES ('Felipe','flv12@gamil.com','12e34','1993-03-16');
INSERT INTO marcador(descripcion,longitud,latutu,idusuario) VALUES ('Primer marcador','12.4456','24.3445',1);
