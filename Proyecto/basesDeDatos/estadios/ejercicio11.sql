-- Una vista que muestre la cantidad de boletos vendidos para cada partido.
CREATE VIEW BoletosVendidosPorPartido AS
        SELECT id_Partido, COUNT(*) as Boletos_Vendidos
        FROM Boletos
        WHERE estado = 'Vendido'
        GROUP BY id_Partido;    

-- Una vista que muestre el total de transacciones realizadas por cada cliente.        
CREATE VIEW TotalTransaccionesPorCliente AS
        SELECT id_Cliente, COUNT(*) as Total_Transacciones
        FROM Transacciones
        GROUP BY id_Cliente;            

-- Una vista que muestre la capacidad total de cada estadio, sumando todas sus secciones.        
CREATE VIEW CapacidadTotalPorEstadio AS
        SELECT id_Estadio, SUM(capacidad_Seccion) as Capacidad_Total
        FROM SeccionesEstadio
        GROUP BY id_Estadio;            