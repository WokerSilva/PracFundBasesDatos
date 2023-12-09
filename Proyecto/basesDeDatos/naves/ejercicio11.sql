-- Esta vista mostrará todas las naves junto con sus rutas respectivas.
CREATE VIEW Naves_Rutas AS
    SELECT NAVES.naveID, NAVES.modelo, RUTAS.origen, RUTAS.destino
    FROM NAVES
    INNER JOIN RUTAS ON NAVES.rutaID = RUTAS.rutaID;

-- Esta vista mostrará todos los choferes junto con las naves que están manejando.
CREATE VIEW Choferes_Naves AS
      SELECT CHOFERES.nombre, NAVES.modelo
      FROM CHOFERES
      INNER JOIN NAVES ON CHOFERES.naveID = NAVES.naveID;      

-- Esta vista mostrará todos los pasajeros junto con las naves en las que están viajando.
CREATE VIEW Pasajeros_Naves AS
      SELECT PASAJEROS.nombre, PASAJEROS.apellido, NAVES.modelo
      FROM PASAJEROS
      INNER JOIN NAVES ON PASAJEROS.naveID = NAVES.naveID;      