CREATE TABLE UBICACION
(
  ubicacionID VARCHAR(50) NOT NULL,
  Localidad VARCHAR(255) NOT NULL,
  Pais CHAR(100) NOT NULL,
  PRIMARY KEY (ubicacionID)
);

CREATE TABLE MAESTROS
(
  maestroID VARCHAR(20) NOT NULL,
  Nombre VARCHAR(50) NOT NULL,
  Apellido VARCHAR(50) NOT NULL,
  Especialidad VARCHAR(50) NOT NULL,
  fechaNacimiento DATE NOT NULL CHECK (fechaNacimiento <= CURRENT_DATE),
  Genero VARCHAR(20) NOT NULL,
  ubicacionID VARCHAR(50) NOT NULL,
  PRIMARY KEY (maestroID),
  FOREIGN KEY (ubicacionID) REFERENCES UBICACION(ubicacionID)
);

CREATE TABLE CURSOS
(
  cursoID VARCHAR(20) NOT NULL,
  nombreCurso VARCHAR(50) NOT NULL,
  gradoAcademico VARCHAR(20) NOT NULL,
  maestroID VARCHAR(20) NOT NULL,
  PRIMARY KEY (cursoID),
  FOREIGN KEY (maestroID) REFERENCES MAESTROS(maestroID)
);

CREATE TABLE ASIGNATURAS
(
  asignaturaID VARCHAR(20) NOT NULL,
  nombreAsignatura VARCHAR(100) NOT NULL,
  maestroID VARCHAR(20) NOT NULL,
  cursoID VARCHAR(20) NOT NULL,
  PRIMARY KEY (asignaturaID),
  FOREIGN KEY (cursoID) REFERENCES CURSOS(cursoID)
);

CREATE TABLE ALUMNOS
(
  alumnoID VARCHAR(20) NOT NULL,
  Nombre VARCHAR(50) NOT NULL,
  Apellido VARCHAR(50) NOT NULL,
  Casa VARCHAR(20) NOT NULL CHECK (Casa IN ('Hufflepuff', 'Ravenclaw', 'Gryffindor', 'Slytherin')),
  fechaNacimiento DATE NOT NULL CHECK (fechaNacimiento <= CURRENT_DATE),
  Genero VARCHAR(20) NOT NULL,
  ubicacionID VARCHAR(50) NOT NULL,
  cursoID VARCHAR(20) NOT NULL,
  PRIMARY KEY (alumnoID),
  FOREIGN KEY (ubicacionID) REFERENCES UBICACION(ubicacionID),
  FOREIGN KEY (cursoID) REFERENCES CURSOS(cursoID)
);