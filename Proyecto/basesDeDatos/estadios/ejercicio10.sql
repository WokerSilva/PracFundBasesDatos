-- ¿Cuántos boletos se han vendido para cada partido?SELECT id_Partido, COUNT(*) as Boletos_Vendidos
FROM Boletos
    WHERE estado = 'Vendido'
    GROUP BY id_Partido;    

-- ¿Cuál es el total de transacciones realizadas por cada cliente?

SELECT id_Cliente, COUNT(*) as Total_Transacciones
    FROM Transacciones
    GROUP BY id_Cliente;

-- ¿Cuál es la capacidad total de cada estadio, sumando todas sus secciones?
SELECT id_Estadio, SUM(capacidad_Seccion) as Capacidad_Total
    FROM SeccionesEstadio
    GROUP BY id_Estadio;   