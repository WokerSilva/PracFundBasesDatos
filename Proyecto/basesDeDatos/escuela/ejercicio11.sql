-- Una vista que muestre todos los alumnos junto con la información de su ubicación.
CREATE VIEW AlumnosUbicacion AS
      SELECT ALUMNOS.Nombre, ALUMNOS.Apellido, UBICACION.Localidad, UBICACION.Pais
      FROM ALUMNOS
      JOIN UBICACION ON ALUMNOS.ubicacionID = UBICACION.ubicacionID;

-- Una vista que muestre todos los cursos junto con el nombre del maestro que los imparte.
CREATE VIEW CursosMaestros AS
    SELECT CURSOS.nombreCurso, MAESTROS.Nombre, MAESTROS.Apellido
    FROM CURSOS
    JOIN MAESTROS ON CURSOS.maestroID = MAESTROS.maestroID;

-- Una vista que muestre todas las asignaturas junto con el nombre del curso al que pertenecen.
CREATE VIEW AsignaturasCursos AS
    SELECT ASIGNATURAS.nombreAsignatura, CURSOS.nombreCurso
    FROM ASIGNATURAS
    JOIN CURSOS ON ASIGNATURAS.cursoID = CURSOS.cursoID;    