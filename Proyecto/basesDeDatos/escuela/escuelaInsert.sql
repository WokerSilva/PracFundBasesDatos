-- Insertar datos en la tabla Ubicacion para el Reino Unido
INSERT INTO Ubicacion (ubicacionID, Localidad, Pais)
VALUES
  ('LORU', 'Londres', 'Reino Unido'),
  ('HODE', 'Hogsmeade', 'Reino Unido'),
  ('MASC', 'Manchester', 'Reino Unido'),
  ('BIRU', 'Birmingham', 'Reino Unido'),
  ('BRIU', 'Bristol', 'Reino Unido'),
  ('OXFU', 'Oxford', 'Reino Unido'),
  ('CAMU', 'Cambridge', 'Reino Unido'),
  ('YORU', 'York', 'Reino Unido'),
  ('EDIU', 'Edimburgo', 'Reino Unido'),
  ('GLAU', 'Glasgow', 'Reino Unido'),
  ('BELU', 'Belfast', 'Reino Unido'),
  ('DUBU', 'Dublín', 'Reino Unido'),
  ('SOUU', 'Southampton', 'Reino Unido'),
  ('LEEY', 'Leeds', 'Reino Unido'),
  ('LIVU', 'Liverpool', 'Reino Unido'),
  ('NOTU', 'Nottingham', 'Reino Unido'),
  ('NEWC', 'Newcastle', 'Reino Unido'),
  ('LEIU', 'Leicester', 'Reino Unido'),
  ('ABEU', 'Aberdeen', 'Reino Unido'),
  ('CARU', 'Cardiff', 'Reino Unido'),
  ('BANG', 'Bangor', 'Reino Unido'),
  ('EXEU', 'Exeter', 'Reino Unido'),
  ('NORU', 'Norwich', 'Reino Unido'),
  ('PLYM', 'Plymouth', 'Reino Unido'),
  ('SHEU', 'Sheffield', 'Reino Unido'),
  ('STAU', 'St Albans', 'Reino Unido'),
  ('SWAU', 'Swansea', 'Reino Unido'),
  ('WINC', 'Winchester', 'Reino Unido'),
  ('YEOU', 'Yeovil', 'Reino Unido'),
  ('WINY', 'Windsor', 'Reino Unido'),
  ('GLYY', 'Glyndyfrdwy', 'Reino Unido'),
  ('HARY', 'Harrogate', 'Reino Unido'),
  ('POPY', 'Popham', 'Reino Unido'),
  ('CARY', 'Carlisle', 'Reino Unido'),
  ('HERE', 'Hereford', 'Reino Unido'),
  ('DURH', 'Durham', 'Reino Unido'),
  ('ELYU', 'Ely', 'Reino Unido'),
  ('INVE', 'Inverness', 'Reino Unido'),
  ('LERC', 'Lerwick', 'Reino Unido'),
  ('ORKU', 'Orkney', 'Reino Unido'),
  ('ABEE', 'Aberystwyth', 'Reino Unido'),
  ('PERT', 'Perth', 'Reino Unido'),
  ('DUNB', 'Dunblane', 'Reino Unido'),
  ('STIR', 'Stirling', 'Reino Unido'),
  ('TRUR', 'Truro', 'Reino Unido'),
  ('ARMO', 'Armagh', 'Reino Unido'),
  ('STAF', 'St Albans', 'Reino Unido'),
  ('CHEU', 'Chelmsford', 'Reino Unido'),
  ('PETA', 'Peterborough', 'Reino Unido'),
  ('EDIU', 'Edimburgo', 'Escocia'),
  ('GLAU', 'Glasgow', 'Escocia'),
  ('ABEU', 'Aberdeen', 'Escocia'),
  ('DUND', 'Dundee', 'Escocia'),
  ('INVE', 'Inverness', 'Escocia'),
  ('PERT', 'Perth', 'Escocia'),
  ('STIR', 'Stirling', 'Escocia'),
  ('DUMF', 'Dumfries', 'Escocia'),
  ('KIRK', 'Kirkwall', 'Escocia'),
  ('WICK', 'Wick', 'Escocia'),
  ('FORT', 'Fort William', 'Escocia'),
  ('ELGI', 'Elgin', 'Escocia'),
  ('OBAN', 'Oban', 'Escocia'),
  ('LERC', 'Lerwick', 'Escocia'),
  ('INVE', 'Inverurie', 'Escocia'),
  ('FIFE', 'Fife', 'Escocia'),
  ('MONT', 'Montrose', 'Escocia'),
  ('THUR', 'Thurso', 'Escocia'),
  ('HUNT', 'Huntly', 'Escocia'),
  ('ROTH', 'Rothesay', 'Escocia'),
  ('CARD', 'Cardiff', 'Gales'),
  ('SWAN', 'Swansea', 'Gales'),
  ('BANG', 'Bangor', 'Gales'),
  ('NEWP', 'Newport', 'Gales'),
  ('WREX', 'Wrexham', 'Gales'),
  ('ABER', 'Aberystwyth', 'Gales'),
  ('BRET', 'Brecon', 'Gales'),
  ('CAER', 'Caernarfon', 'Gales'),
  ('CHEP', 'Chepstow', 'Gales'),
  ('CONW', 'Conwy', 'Gales'),
  ('DENB', 'Denbigh', 'Gales'),
  ('DOLE', 'Dolgellau', 'Gales'),
  ('FLIN', 'Flint', 'Gales'),
  ('HAYO', 'Hay-on-Wye', 'Gales'),
  ('LLAN', 'Llanelli', 'Gales'),
  ('NEAT', 'Neath', 'Gales'),
  ('POWT', 'Powys', 'Gales'),
  ('RHYL', 'Rhyl', 'Gales'),
  ('TALY', 'Talybont', 'Gales'),
  ('WELL', 'Wellington', 'Gales'),  
  ('SYDA', 'Sídney', 'Australia'),
  ('MELB', 'Melbourne', 'Australia'),
  ('BRIS', 'Brisbane', 'Australia'),
  ('PERT', 'Perth', 'Australia'),
  ('ADEL', 'Adelaida', 'Australia'),
  ('NYNY', 'Nueva York', 'Estados Unidos'),
  ('LAXC', 'Los Ángeles', 'Estados Unidos'),
  ('CHIC', 'Chicago', 'Estados Unidos'),
  ('HOUS', 'Houston', 'Estados Unidos'),
  ('MIAF', 'Miami', 'Estados Unidos'),
  ('MEXC', 'Ciudad de México', 'México');


-- Insertar datos en la tabla Maestros
INSERT INTO Maestros (maestroID, Nombre, Apellido, Especialidad, fechaNacimiento, Genero, ubicacionID)
VALUES
  ('FFE17', 'Filius', 'Flitwick', 'Encantamientos', '1958-10-17', 'Masculino', 'BIRU'),
  ('PSH15', 'Pomona', 'Sprout', 'Herbología', '1951-05-15', 'Femenino', 'HODE'),
  ('SSP09', 'Severus', 'Snape', 'Pociones', '1960-01-09', 'Masculino', 'BIRU'),
  ('BBH04', 'Bathilda', 'Bagshot', 'Historia de la Magia', '1879-02-04', 'Femenino', 'OXFU'),
  ('QQD26', 'Quirinus', 'Quirrell', 'Defensa contra las Artes Oscuras', '1968-03-26', 'Masculino', 'CAMU'),
  ('MHV04', 'Madame', 'Hooch', 'Vuelo', '1944-01-04', 'Femenino', 'YORU'),
  ('AWE06', 'Arthur', 'Weasley', 'Estudios Muggles', '1950-02-06', 'Masculino', 'NEWC'),
  ('MMT04', 'Minerva', 'McGonagall', 'Transformaciones', '1935-10-04', 'Femenino', 'NEWC'),
  ('RHC06', 'Rubeus', 'Hagrid', 'Cuidado de Criaturas Mágicas', '1928-12-06', 'Masculino', 'HARY'),
  ('HSP28', 'Horace', 'Slughorn', 'Pociones', '1881-04-28', 'Masculino', 'CARU'),
  ('CBH16', 'Cuthbert', 'Binns', 'Historia de la Magia', '1884-06-16', 'Masculino', 'BELU'),
  ('GLD26', 'Gilderoy', 'Lockhart', 'Defensa contra las Artes Oscuras', '1964-01-26', 'Masculino', 'DUBU'),
  ('SVA24', 'Septima', 'Vector', 'Aritmancia', '1935-09-24', 'Femenino', 'SOUU'),
  ('BBR25', 'Bathsheda', 'Babbling', 'Runas Antiguas', '1945-11-25', 'Femenino', 'NOTU'),
  ('RLD10', 'Remus', 'Lupin', 'Defensa Avanzada contra las Artes Oscuras', '1960-03-10', 'Masculino', 'ABEU'),
  ('NLH30', 'Neville', 'Longbottom', 'Herbología Avanzada', '1980-07-30', 'Masculino', 'ABEU'),
  ('AWH15', 'Adalbert', 'Waffling', 'Historia de la Magia Medieval', '1938-10-15', 'Masculino', 'NORU'),
  ('AMD15', 'Alastor', 'Moody', 'Defensa Avanzada contra las Artes Oscuras', '1988-10-15', 'Masculino', 'PLYM'),
  ('STA11', 'Sybill', 'Trelawney', 'Adivinación', '1948-10-11', 'Femenino', 'MASC'),
  ('ASA21', 'Aurora', 'Sinistra', 'Astronomía Mágica', '1938-10-21', 'Femenino', 'PETA'),
  ('DUD26', 'Dolores', 'Umbridge', 'Defensa contra las Artes Oscuras Especializada', '1965-08-26', 'Femenino', 'PETA'),
  ('BBE05', 'Bathilda', 'Bagshot', 'Estudios de Artefactos Mágicos', '1958-08-05', 'Femenino', 'INVE'),
  ('GGO01', 'Gellert', 'Grindelwald', 'Ocultismo', '1883-01-01', 'Masculino', 'LIVU'),
  ('NTD24', 'Nymphadora', 'Tonks', 'Defensa Avanzada contra las Artes Oscuras Aplicada', '1973-12-24', 'Femenino', 'MASC');


INSERT INTO CURSOS (cursoID, nombreCurso, gradoAcademico, maestroID)
VALUES
  ('A1IM', 'Iniciación Mágica', 'Primer Año', 'MMT04'),
  ('A2DM', 'Desarrollo Mágico', 'Segundo Año', 'FFE17'),
  ('A3MA', 'Magia Avanzada', 'Tercer Año', 'RLD10'),
  ('A4EM', 'Especialización Mágica', 'Cuarto Año', 'SVA24'),
  ('A5MM', 'Maestría Mágica', 'Quinto Año', 'ASA21'),
  ('A6SA', 'Sabiduría Arcana', 'Sexto Año', 'GGO01');

  -- Insertar datos en la tabla Asignaturas con asignaturaID personalizado
INSERT INTO Asignaturas (asignaturaID, nombreAsignatura, maestroID, cursoID)
VALUES
  ('EFL1', 'Encantamientos Básicos', 'FFE17', 'A1IM'),
  ('HE1', 'Herbología Elemental', 'PSH15', 'A1IM'),
  ('PP1', 'Pociones para Principiantes', 'SSP09', 'A1IM'),
  ('HMA1', 'Historia de la Magia Antigua', 'BBH04', 'A1IM'),
  ('DBAO1', 'Defensa Básica contra las Artes Oscuras', 'QQD26', 'A1IM'),
  ('VIE1', 'Vuelo Inicial en Escoba', 'MHV04', 'A1IM'),
  ('EMI1', 'Estudios Muggles Introductorios', 'AWE06', 'A1IM'),  
  ('TI1', 'Transformaciones Intermedias', 'MMT04', 'A2DM'),
  ('CCM1', 'Cuidado de Criaturas Mágicas', 'RHC06', 'A2DM'),
  ('PA1', 'Pociones Avanzadas', 'HSP28', 'A2DM'),
  ('HMCO1', 'Historia de la Magia Contemporánea', 'CBH16', 'A2DM'),
  ('DIACAO1', 'Defensa Intermedia contra las Artes Oscuras', 'GLD26', 'A2DM'),
  ('AE1', 'Aritmancia Elemental', 'SVA24', 'A2DM'),
  ('RA1', 'Runas Antiguas', 'BBR25', 'A2DM'),
  ('EAA1', 'Encantamientos Avanzados', 'A3MA', 'A3MA'),
  ('HA1', 'Herbología Avanzada', 'NLH30', 'A3MA'),
  ('PM1', 'Pociones Maestras', 'HSP28', 'A3MA'),
  ('HMM1', 'Historia de la Magia Medieval', 'AWH15', 'A3MA'),
  ('DAAACAO1', 'Defensa Avanzada contra las Artes Oscuras', 'AMD15', 'A3MA'),
  ('AE1', 'Adivinación Elemental', 'STA11', 'A3MA'),
  ('AM1', 'Astronomía Mágica', 'ASA21', 'A3MA'),
  ('TA1', 'Transformaciones Avanzadas', 'A4EM', 'A4EM'),
  ('CCME1', 'Cuidado de Criaturas Mágicas Exóticas', 'RHC06', 'A4EM'),
  ('PMA1', 'Pociones Maestras Avanzadas', 'HSP28', 'A4EM'),
  ('HMMO1', 'Historia de la Magia Moderna', 'CBH16', 'A4EM'),
  ('DCAOES1', 'Defensa contra las Artes Oscuras Especializada', 'DUD26', 'A4EM'),
  ('EAM1', 'Estudios de Artefactos Mágicos', 'BBE05', 'A4EM'),
  ('O1', 'Ocultismo', 'GGO01', 'A4EM'),
  ('ES1', 'Encantamientos Supremos', 'FFE17', 'A5MM'),
  ('HA1', 'Herbología Aplicada', 'NLH30', 'A5MM'),
  ('PMM1', 'Pociones Maestras Maestría', 'HSP28', 'A5MM'),
  ('HMCACAA1', 'Historia de la Magia Contemporánea Avanzada', 'BBH04', 'A5MM'),
  ('DAAACAA1', 'Defensa Avanzada contra las Artes Oscuras Aplicada', 'NTD24', 'A5MM'),
  ('AAA1', 'Aritmancia Avanzada', 'SVA24', 'A5MM'),
  ('EDLM1', 'Estudio de las Maldiciones', 'SSP09', 'A5MM'),
  ('SAA1', 'Sabiduría Arcana', 'MMT04', 'A6SA'),
  ('CCML1', 'Cuidado de Criaturas Mágicas Legendarias', 'RHC06', 'A6SA'),
  ('PMS1', 'Pociones Maestras Supremas', 'HSP28', 'A6SA'),
  ('HMP1', 'Historia de la Magia Postmoderna', 'CBH16', 'A6SA'),
  ('DMA1', 'Defensa Maestra contra las Artes Oscuras', 'AMD15', 'A6SA'),
  ('AA1', 'Adivinación Avanzada', 'STA11', 'A6SA'),
  ('AA1', 'Astronomía Avanzada', 'ASA21', 'A6SA');


-- Insertar 100 filas de datos en la tabla ALUMNOS
INSERT INTO ALUMNOS (alumnoID, Nombre, Apellido, Casa, fechaNacimiento, Genero, ubicacionID, cursoID)
VALUES
    ('G02', 'Olivia', 'Baker', 'Gryffindor', '1990-05-14', 'Femenino', 'LORU', 'A1IM'),
    ('G03', 'Ethan', 'Miller', 'Gryffindor', '1991-11-20', 'Masculino', 'LORU', 'A1IM'),
    ('G04', 'Emma', 'Ward', 'Gryffindor', '1992-08-03', 'Femenino', 'NOTU', 'A1IM'),
    ('G05', 'Liam', 'Cooper', 'Gryffindor', '1993-02-18', 'Masculino', 'NOTU', 'A1IM'),
    ('G06', 'Aria', 'Perez', 'Gryffindor', '1994-07-07', 'Femenino', 'NOTU', 'A1IM'),
    ('H02', 'Mason', 'Taylor', 'Hufflepuff', '1995-01-12', 'Masculino', 'HODE', 'A2DM'),
    ('H03', 'Ava', 'Hill', 'Hufflepuff', '1996-06-26', 'Femenino', 'HODE', 'A2DM'),
    ('H04', 'Jackson', 'Wright', 'Hufflepuff', '1997-03-09', 'Masculino', 'HODE', 'A2DM'),
    ('H05', 'Sophia', 'Fisher', 'Hufflepuff', '1998-09-22', 'Femenino', 'HODE', 'A2DM'),
    ('H06', 'Liam', 'Simmons', 'Hufflepuff', '1999-04-04', 'Masculino', 'HODE', 'A2DM'),
    ('R01', 'Evelyn', 'Barnes', 'Ravenclaw', '2000-10-17', 'Femenino', 'FORT', 'A3MA'),
    ('R02', 'Mason', 'Jones', 'Ravenclaw', '2001-07-30', 'Masculino', 'FORT', 'A3MA'),
    ('R04', 'Scarlett', 'Collins', 'Ravenclaw', '2002-04-14', 'Femenino', 'FORT', 'A3MA'),
    ('R05', 'Lucas', 'Ferguson', 'Ravenclaw', '2003-11-27', 'Masculino', 'FORT', 'A3MA'),
    ('R06', 'Ava', 'Ross', 'Ravenclaw', '2004-08-10', 'Femenino', 'BANG', 'A3MA'),
    ('S01', 'Oliver', 'Bennett', 'Slytherin', '2005-02-23', 'Masculino', 'OXFU', 'A4EM'),
    ('S02', 'Ella', 'Ward', 'Slytherin', '1991-09-07', 'Femenino', 'OXFU', 'A4EM'),
    ('S03', 'Logan', 'Perez', 'Slytherin', '1991-06-20', 'Masculino', 'OXFU', 'A4EM'),
    ('S04', 'Zoe', 'Taylor', 'Slytherin', '1991-01-03', 'Femenino', 'OXFU', 'A4EM'),
    ('S05', 'Aiden', 'Hill', 'Slytherin', '1991-08-16', 'Masculino', 'OXFU', 'A4EM'),
    ('G07', 'Lily', 'Martin', 'Gryffindor', '1987-03-01', 'Femenino', 'NOTU', 'A5MM'),
    ('G08', 'Noah', 'Lopez', 'Gryffindor', '1988-10-14', 'Masculino', 'NOTU', 'A5MM'),
    ('G09', 'Avery', 'Collins', 'Gryffindor', '1988-07-27', 'Femenino', 'NOTU', 'A5MM'),
    ('G10', 'Jackson', 'Anderson', 'Gryffindor', '1988-04-10', 'Masculino', 'NOTU', 'A5MM'),
    ('G11', 'Sophie', 'Garcia', 'Gryffindor', '1989-11-23', 'Femenino', 'LORU', 'A5MM'),
    ('H07', 'Eli', 'Martinez', 'Hufflepuff', '1990-09-05', 'Masculino', 'HODE', 'A6SA'),
    ('H08', 'Aria', 'Fisher', 'Hufflepuff', '1990-04-18', 'Femenino', 'HODE', 'A6SA'),
    ('H09', 'Carter', 'Turner', 'Hufflepuff', '1991-11-01', 'Masculino', 'HODE', 'A6SA'),
    ('H10', 'Luna', 'Cooper', 'Hufflepuff', '1991-06-14', 'Femenino', 'HODE', 'A6SA'),
    ('H11', 'Owen', 'Ward', 'Hufflepuff', '1991-03-27', 'Masculino', 'HODE', 'A6SA'),
    ('H12', 'Aubrey', 'Simmons', 'Hufflepuff', '1991-10-10', 'Femenino', 'HODE', 'A6SA'),
    ('H13', 'Elijah', 'Perez', 'Hufflepuff', '1991-05-23', 'Masculino', 'HODE', 'A6SA'),
    ('R07', 'Eva', 'Hill', 'Ravenclaw', '1991-02-05', 'Femenino', 'BANG', 'A1IM'),
    ('R08', 'Caleb', 'Collins', 'Ravenclaw', '1992-09-18', 'Masculino', 'BANG', 'A2DM'),
    ('R09', 'Zara', 'Jones', 'Ravenclaw', '1995-06-02', 'Femenino', 'MELB', 'A3MA'),
    ('R10', 'Levi', 'Ferguson', 'Ravenclaw', '1995-01-15', 'Masculino', 'MELB', 'A4EM'),
    ('R11', 'Mila', 'Ross', 'Ravenclaw', '1989-08-28', 'Femenino', 'MELB', 'A5MM'),
    ('S07', 'Hudson', 'Bennett', 'Slytherin', '1989-04-12', 'Masculino', 'OXFU', 'A6SA'),
    ('S08', 'Eva', 'Ward', 'Slytherin', '1998-11-25', 'Femenino', 'OXFU', 'A1IM'),
    ('S09', 'Zane', 'Perez', 'Slytherin', '1998-09-08', 'Masculino', 'OXFU', 'A2DM'),
     ('S10', 'Aria', 'Taylor', 'Slytherin', '1992-06-21', 'Femenino', 'OXFU', 'A3MA'),
    ('S11', 'Oliver', 'Hill', 'Slytherin', '1993-01-04', 'Masculino', 'OXFU', 'A4EM'),
    ('G12', 'Eva', 'Martin', 'Gryffindor', '1994-08-17', 'Femenino', 'LORU', 'A5MM'),
    ('G13', 'Mason', 'Lopez', 'Gryffindor', '1995-03-02', 'Masculino', 'LORU', 'A6SA'),
    ('G14', 'Sophia', 'Collins', 'Gryffindor', '1996-10-15', 'Femenino', 'LORU', 'A1IM'),
    ('G15', 'Jackson', 'Anderson', 'Gryffindor', '1990-07-28', 'Masculino', 'NOTU', 'A2DM'),
    ('G16', 'Olivia', 'Garcia', 'Gryffindor', '1991-05-11', 'Femenino', 'NOTU', 'A3MA'),
    ('H14', 'Noah', 'Martinez', 'Hufflepuff', '1992-01-24', 'Masculino', 'HODE', 'A4EM'),
    ('H15', 'Avery', 'Fisher', 'Hufflepuff', '1993-10-08', 'Femenino', 'HODE', 'A5MM'),
    ('H16', 'Eli', 'Turner', 'Hufflepuff', '1994-05-21', 'Masculino', 'HODE', 'A6SA'),
    ('H17', 'Lily', 'Cooper', 'Hufflepuff', '1995-03-05', 'Femenino', 'HODE', 'A1IM'),
    ('H18', 'Owen', 'Ward', 'Hufflepuff', '1996-10-18', 'Masculino', 'HODE', 'A2DM'),
    ('R12', 'Sophie', 'Hill', 'Ravenclaw', '1990-07-02', 'Femenino', 'CHEU', 'A3MA'),
    ('R13', 'Carter', 'Collins', 'Ravenclaw', '1991-04-15', 'Masculino', 'CHEU', 'A4EM'),
    ('R14', 'Zoe', 'Jones', 'Ravenclaw', '1992-11-28', 'Femenino', 'CHEU', 'A5MM'),    
    ('S18', 'Hudson', 'Bennett', 'Slytherin', '1993-09-12', 'Masculino', 'OXFU', 'A6SA'),
    ('S19', 'Eva', 'Ward', 'Slytherin', '1994-06-25', 'Femenino', 'OXFU', 'A1IM'),
    ('S20', 'Zane', 'Perez', 'Slytherin', '1995-04-08', 'Masculino', 'OXFU', 'A2DM'),
    ('S21', 'Aria', 'Taylor', 'Slytherin', '1996-01-21', 'Femenino', 'OXFU', 'A3MA'),
    ('S22', 'Oliver', 'Hill', 'Slytherin', '1990-11-03', 'Masculino', 'OXFU', 'A4EM'),
    ('G17', 'Eva', 'Martin', 'Gryffindor', '1991-08-16', 'Femenino', 'NOTU', 'A5MM'),
    ('G18', 'Mason', 'Lopez', 'Gryffindor', '1992-03-01', 'Masculino', 'EXEU', 'A6SA'),
    ('G19', 'Sophia', 'Collins', 'Gryffindor', '1993-10-14', 'Femenino', 'EXEU', 'A1IM'),
    ('G20', 'Jackson', 'Anderson', 'Gryffindor', '1994-07-27', 'Masculino', 'LORU', 'A2DM'),
    ('G21', 'Olivia', 'Garcia', 'Gryffindor', '1995-05-10', 'Femenino', 'LORU', 'A3MA'),
    ('H19', 'Noah', 'Martinez', 'Hufflepuff', '1996-01-23', 'Masculino', 'HODE', 'A4EM'),
    ('H20', 'Avery', 'Fisher', 'Hufflepuff', '1990-10-07', 'Femenino', 'HODE', 'A5MM'),
    ('H21', 'Eli', 'Turner', 'Hufflepuff', '1991-05-20', 'Masculino', 'HODE', 'A6SA'),
    ('H22', 'Lily', 'Cooper', 'Hufflepuff', '1992-03-04', 'Femenino', 'HODE', 'A1IM'),
    ('H23', 'Owen', 'Ward', 'Hufflepuff', '1993-10-17', 'Masculino', 'HODE', 'A2DM'),
    ('R15', 'Sophie', 'Hill', 'Ravenclaw', '1994-07-01', 'Femenino', 'CHEU', 'A3MA'),
    ('R16', 'Carter', 'Collins', 'Ravenclaw', '1995-04-14', 'Masculino', 'CHEU', 'A4EM'),
    ('R17', 'Zoe', 'Jones', 'Ravenclaw', '1996-11-27', 'Femenino', 'CHEU', 'A5MM'),
    ('R18', 'Levi', 'Ferguson', 'Ravenclaw', '1990-09-10', 'Masculino', 'CHEU', 'A6SA'),
    ('R19', 'Mila', 'Ross', 'Ravenclaw', '1991-04-23', 'Femenino', 'CHEU', 'A1IM'),
    ('S23', 'Hudson', 'Bennett', 'Slytherin', '1992-02-06', 'Masculino', 'OXFU', 'A2DM'),
    ('S24', 'Eva', 'Ward', 'Slytherin', '1993-11-19', 'Femenino', 'OXFU', 'A3MA'),
    ('S25', 'Zane', 'Perez', 'Slytherin', '1994-08-03', 'Masculino', 'OXFU', 'A4EM'),
    ('S26', 'Aria', 'Taylor', 'Slytherin', '1995-05-16', 'Femenino', 'OXFU', 'A5MM'),
    ('S27', 'Oliver', 'Hill', 'Slytherin', '1996-01-29', 'Masculino', 'OXFU', 'A6SA'),
    ('G22', 'Eva', 'Martin', 'Gryffindor', '1990-10-11', 'Femenino', 'LORU', 'A1IM'),
    ('G23', 'Mason', 'Lopez', 'Gryffindor', '1991-07-24', 'Masculino', 'LORU', 'A2DM'),
    ('G24', 'Sophia', 'Collins', 'Gryffindor', '1992-05-07', 'Femenino', 'NOTU', 'A3MA'),
    ('G25', 'Jackson', 'Anderson', 'Gryffindor', '1993-12-20', 'Masculino', 'NOTU', 'A4EM'),
    ('G26', 'Olivia', 'Garcia', 'Gryffindor', '1994-09-02', 'Femenino', 'EXEU', 'A5MM'),
    ('H28', 'Noah', 'Martinez', 'Hufflepuff', '1995-06-15', 'Masculino', 'HODE', 'A6SA'),
    ('H29', 'Avery', 'Fisher', 'Hufflepuff', '1996-01-28', 'Femenino', 'HODE', 'A1IM'),
    ('H30', 'Eli', 'Turner', 'Hufflepuff', '1990-11-11', 'Masculino', 'HODE', 'A2DM'),
    ('H31', 'Lily', 'Cooper', 'Hufflepuff', '1991-08-24', 'Femenino', 'HODE', 'A3MA'),
    ('H32', 'Owen', 'Ward', 'Hufflepuff', '1992-06-07', 'Masculino', 'HODE', 'A4EM'),
    ('R20', 'Sophie', 'Hill', 'Ravenclaw', '1993-03-21', 'Femenino', 'KIRK', 'A5MM'),
    ('R21', 'Carter', 'Collins', 'Ravenclaw', '1994-10-03', 'Masculino', 'KIRK', 'A6SA'),
    ('R22', 'Zoe', 'Jones', 'Ravenclaw', '1995-07-16', 'Femenino', 'KIRK', 'A1IM'),
    ('R23', 'Levi', 'Ferguson', 'Ravenclaw', '1996-04-29', 'Masculino', 'KIRK', 'A2DM'),
    ('R24', 'Mila', 'Ross', 'Ravenclaw', '1990-02-12', 'Femenino', 'KIRK', 'A3MA'),
    ('S28', 'Hudson', 'Bennett', 'Slytherin', '1991-12-15', 'Masculino', 'OXFU', 'A4EM'),
    ('S29', 'Alicia', 'Silva', 'Slytherin', '1998-09-24', 'Femenino', 'MEXC', 'A6SA'),
    ('S30', 'Zane', 'Perez', 'Slytherin', '1994-07-11', 'Masculino', 'OXFU', 'A6SA'),
    ('S31', 'Aria', 'Taylor', 'Slytherin', '1995-04-24', 'Femenino', 'OXFU', 'A1IM'),
    ('S32', 'Oliver', 'Hill', 'Slytherin', '1996-02-06', 'Masculino', 'OXFU', 'A2DM'),
    ('G27', 'Eva', 'Martin', 'Gryffindor', '1997-11-20', 'Femenino', 'EXEU', 'A3MA'),
    ('G28', 'Mason', 'Lopez', 'Gryffindor', '1998-09-03', 'Masculino', 'EXEU', 'A4EM'),
    ('G29', 'Sophia', 'Collins', 'Gryffindor', '1999-06-16', 'Femenino', 'BIRU', 'A5MM'),
    ('G30', 'Jackson', 'Anderson', 'Gryffindor', '2992-03-01', 'Masculino', 'BIRU', 'A6SA'),
    ('G31', 'Olivia', 'Garcia', 'Gryffindor', '2001-12-14', 'Femenino', 'BIRU', 'A1IM');