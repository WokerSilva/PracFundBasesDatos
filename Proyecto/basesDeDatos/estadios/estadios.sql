CREATE TABLE Clientes -- LISTOLISTOLISTOLISTOLISTOLISTO
(
  id_Cliente VARCHAR PRIMARY KEY,
  nombre_Cliente VARCHAR NOT NULL,
  direccion_Cliente VARCHAR NOT NULL,
  telefono_Cliente VARCHAR NOT NULL,
  email_Cliente VARCHAR NOT NULL,
  tarjetaCredito VARCHAR NOT NULL CHECK (LENGTH(tarjetaCredito) = 16)
);

CREATE TABLE Estadios -- LISTOLISTOLISTOLISTOLISTOLISTO
(
  id_Estadio INT PRIMARY KEY,
  nombre_Estadio VARCHAR NOT NULL,
  capacidad INT CHECK (capacidad > 0),
  ubicacion VARCHAR NOT NULL CHECK (ubicacion <> '')
);

CREATE TABLE SeccionesEstadio -- LISTOLISTOLISTOLISTOLISTOLISTO
(
  id_Seccion VARCHAR PRIMARY KEY,
  id_Estadio INT NOT NULL,
  nombre_Seccion VARCHAR NOT NULL,
  capacidad_Seccion INT CHECK (capacidad_Seccion > 0),
  num_asiento VARCHAR NOT NULL,
  FOREIGN KEY (id_Estadio) REFERENCES Estadios(id_Estadio) ON DELETE CASCADE
);

CREATE TABLE Equipos -- LISTOLISTOLISTOLISTOLISTOLISTO
(
  id_Equipo VARCHAR PRIMARY KEY,
  nombre_Equipo VARCHAR NOT NULL,
  pais VARCHAR NOT NULL CHECK (pais <> ''),
  entrenador VARCHAR NOT NULL,
  color_uniforme VARCHAR NOT NULL,
  jugador_Estrella VARCHAR NOT NULL
);

CREATE TABLE Partidos -- LISTOLISTOLISTOLISTOLISTOLISTO
(
  id_Partido VARCHAR PRIMARY KEY,
  fecha_hora TIMESTAMP NOT NULL CHECK (fecha_hora > CURRENT_TIMESTAMP),
  id_Estadio INT NOT NULL CHECK (id_Estadio IN (1, 2, 3, 4)),
  nombre_Arbitro VARCHAR NOT NULL,
  FOREIGN KEY (id_Estadio) REFERENCES Estadios(id_Estadio) ON DELETE CASCADE
);

CREATE TABLE Boletos -- LISTOLISTOLISTOLISTOLISTOLISTO
(
  num_boleto INT PRIMARY KEY,
  id_Partido VARCHAR NOT NULL,
  id_equipoLocal VARCHAR NOT NULL,
  id_equipoVisita VARCHAR NOT NULL,
  estado VARCHAR NOT NULL CHECK (estado IN ('Vendido', 'Disponible')),  
  precio INT NOT NULL CHECK (precio > 0),
  nombre_Seccion VARCHAR NOT NULL,
  FOREIGN KEY (id_Partido) REFERENCES Partidos(id_Partido) ON DELETE CASCADE,
  FOREIGN KEY (id_equipoLocal) REFERENCES Equipos(id_Equipo) ON DELETE SET NULL,
  FOREIGN KEY (id_equipoVisita) REFERENCES Equipos(id_Equipo) ON DELETE SET NULL
);


CREATE TABLE Transacciones
(
  num_Transaccion INT PRIMARY KEY,
  fecha_transaccion TIMESTAMP NOT NULL,
  id_Cliente VARCHAR NOT NULL,
  id_Boleto INT NOT NULL,
  cantidad_Boletos INT NOT NULL,
  total_Transaccion INT NOT NULL CHECK (total_Transaccion = (SELECT precio FROM Boletos WHERE num_boleto = id_Boleto) * cantidad_Boletos),
  FOREIGN KEY (id_Cliente) REFERENCES Clientes(id_Cliente) ON DELETE CASCADE,
  FOREIGN KEY (id_Boleto) REFERENCES Boletos(num_boleto) ON DELETE CASCADE
);