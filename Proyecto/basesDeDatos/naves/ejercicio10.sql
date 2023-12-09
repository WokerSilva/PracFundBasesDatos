-- Obtener la lista de todas las naves y sus respectivas rutas. 
SELECT N.naveID, N.modelo, R.rutaID, R.origen, R.destino
  FROM NAVES N
  INNER JOIN RUTAS R ON N.rutaID = R.rutaID;

-- Obtener la lista de todos los choferes y las naves que están manejando. 
SELECT C.choferID, C.nombre, N.naveID, N.modelo
  FROM CHOFERES C
  INNER JOIN NAVES N ON C.naveID = N.naveID;

-- Obtener la lista de todos los pasajeros y las naves en las que están viajando.SELECT PASAJEROS.nombre, PASAJEROS.apellido, NAVES.modelo
SELECT PASAJEROS.nombre, PASAJEROS.apellido, NAVES.modelo
    FROM PASAJEROS
    INNER JOIN NAVES ON PASAJEROS.naveID = NAVES.naveID;