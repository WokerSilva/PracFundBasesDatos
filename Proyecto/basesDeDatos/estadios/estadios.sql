CREATE TABLE Clientes
(
  id_Cliente VARCHAR(255) PRIMARY KEY,
  nombre_Cliente VARCHAR(255) NOT NULL,
  direccion_Cliente VARCHAR(255) NOT NULL,
  telefono_Cliente VARCHAR(255) NOT NULL,
  email_Cliente VARCHAR(255) NOT NULL,
  tarjetaCredito VARCHAR(16) NOT NULL CHECK (LENGTH(tarjetaCredito) = 16)
);

CREATE TABLE Estadios
(
  id_Estadio INT PRIMARY KEY,
  nombre_Estadio VARCHAR(255) NOT NULL,
  capacidad INT CHECK (capacidad > 0),
  ubicacion VARCHAR(255) NOT NULL CHECK (ubicacion <> '')
);

CREATE TABLE Equipos
(
  id_Equipo VARCHAR(255) PRIMARY KEY,
  nombre_Equipo VARCHAR(255) NOT NULL,
  pais VARCHAR(255) NOT NULL CHECK (pais <> ''),
  entrenador VARCHAR(255) NOT NULL,
  color_uniforme VARCHAR(255) NOT NULL,
  jugador_Estrella VARCHAR(255) NOT NULL
);

CREATE TABLE Partidos
(
  id_Partido VARCHAR(255) PRIMARY KEY,
  fecha_hora TIMESTAMP NOT NULL,
  id_Estadio INT NOT NULL CHECK (id_Estadio IN (1, 2, 3, 4)),
  nombre_Arbitro VARCHAR(255) NOT NULL,
  FOREIGN KEY (id_Estadio) REFERENCES Estadios(id_Estadio) ON DELETE CASCADE
);

CREATE TABLE SeccionesEstadio
(    
  id_Estadio INT NOT NULL CHECK (id_Estadio IN (1, 2, 3, 4)),
  nombre_Seccion VARCHAR(255) NOT NULL,
  capacidad_Seccion INT CHECK (capacidad_Seccion > 0),
  num_asiento VARCHAR(255) PRIMARY KEY,
  FOREIGN KEY (id_Estadio) REFERENCES Estadios(id_Estadio) ON DELETE CASCADE
);

CREATE TABLE Boletos
(
  num_boleto INT PRIMARY KEY,
  id_Partido VARCHAR(255) NOT NULL,
  id_equipoLocal VARCHAR(255),
  id_equipoVisita VARCHAR(255),
  estado VARCHAR(255) NOT NULL CHECK (estado IN ('Vendido', 'Disponible')),  
  precio INT NOT NULL CHECK (precio > 0),
  nombre_Seccion VARCHAR(255) NOT NULL,
  FOREIGN KEY (id_Partido) REFERENCES Partidos(id_Partido) ON DELETE CASCADE,
  FOREIGN KEY (id_equipoLocal) REFERENCES Equipos(id_Equipo) ON DELETE SET NULL,
  FOREIGN KEY (id_equipoVisita) REFERENCES Equipos(id_Equipo) ON DELETE SET NULL
);

CREATE TABLE Transacciones
(
  num_Transaccion INT PRIMARY KEY,
  fecha_transaccion TIMESTAMP NOT NULL,
  id_Cliente VARCHAR(255) NOT NULL,
  id_Boleto INT NOT NULL,
  cantidad_Boletos INT NOT NULL,
  total_Transaccion INT NOT NULL,
  FOREIGN KEY (id_Cliente) REFERENCES Clientes(id_Cliente) ON DELETE CASCADE,
  FOREIGN KEY (id_Boleto) REFERENCES Boletos(num_boleto) ON DELETE CASCADE
);