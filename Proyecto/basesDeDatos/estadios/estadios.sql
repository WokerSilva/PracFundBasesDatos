CREATE TABLE Clientes
(
  id_Cliente VARCHAR PRIMARY KEY,
  nombre_Cliente VARCHAR NOT NULL,
  direccion_Cliente VARCHAR NOT NULL,
  telefono_Cliente INT NOT NULL,
  email_Cliente VARCHAR NOT NULL,
  tarjetaCredito INT NOT NULL
);

CREATE TABLE Estadios
(
  id_Estadio INT PRIMARY KEY,
  nombre_Estadio VARCHAR NOT NULL,
  capacidad INT NOT NULL,
  ubicacion VARCHAR NOT NULL
);

CREATE TABLE SeccionesEstadio
(
  id_Seccion VARCHAR PRIMARY KEY,
  id_Estadio INT NOT NULL,
  nombre_Seccion VARCHAR NOT NULL,
  capacidad_Seccion INT NOT NULL,
  FOREIGN KEY (id_Estadio) REFERENCES Estadios(id_Estadio) ON DELETE SET NULL
);

CREATE TABLE Equipos
(
  id_Equipo VARCHAR PRIMARY KEY,
  nombre_Equipo VARCHAR NOT NULL,
  pais VARCHAR NOT NULL,
  entrenador VARCHAR NOT NULL,
  color_uniforme VARCHAR NOT NULL,
  jugador_Estrella VARCHAR NOT NULL
);

CREATE TABLE Partidos
(
  id_Partido VARCHAR PRIMARY KEY,
  fecha_hora DATE NOT NULL,
  id_Estadio INT NOT NULL,
  nombre_Arbitro VARCHAR NOT NULL,
  FOREIGN KEY (id_Estadio) REFERENCES Estadios(id_Estadio) ON DELETE SET NULL
);

CREATE TABLE Boletos
(
  num_boleto INT PRIMARY KEY,
  id_Partido VARCHAR NOT NULL,
  id_equipoLocal VARCHAR NOT NULL,
  id_equipoVisita VARCHAR NOT NULL,
  estado VARCHAR NOT NULL,
  asiento INT NOT NULL,
  precio INT NOT NULL,
  nombre_Seccion VARCHAR NOT NULL,
  FOREIGN KEY (id_Partido) REFERENCES Partidos(id_Partido) ON DELETE SET NULL,
  FOREIGN KEY (id_equipoLocal) REFERENCES Equipos(id_Equipo) ON DELETE SET NULL,
  FOREIGN KEY (id_equipoVisita) REFERENCES Equipos(id_Equipo) ON DELETE SET NULL
);

CREATE TABLE Transacciones
(
  num_Transaccion INT PRIMARY KEY,
  fecha_transaccion DATE NOT NULL,
  id_Cliente VARCHAR NOT NULL,
  id_Boleto INT NOT NULL,
  cantidad_Boletos INT NOT NULL,
  total_Transaccion INT NOT NULL,
  FOREIGN KEY (id_Cliente) REFERENCES Clientes(id_Cliente) ON DELETE SET NULL,
  FOREIGN KEY (id_Boleto) REFERENCES Boletos(num_boleto) ON DELETE SET NULL
);