-- Obtener una lista de todos los alumnos que están en la casa Gryffindor.
SELECT Nombre, Apellido
      FROM ALUMNOS
      WHERE Casa = 'Slytherin';

-- Obtener una lista de todos los cursos que son impartidos por un maestro específico.
SELECT nombreCurso
      FROM CURSOS
      WHERE maestroID = 'GGO01';

-- Obtener una lista de todos los maestros que viven en una ubicación específica.
SELECT Nombre, Apellido
      FROM MAESTROS
      WHERE ubicacionID = 'NEWC';