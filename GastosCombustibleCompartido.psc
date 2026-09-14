Algoritmo GastosCombustibleCompartido
	
	Definir DistanciaTotal, RendimientoVehiculo, PrecioCombustible, PersonasQueViajan Como Real
	Definir ValorDividido, CostoCombustible, LitrosNecesarios Como Real
	
	Escribir "Escriba la distancia de su viaje en Km"
	Leer  DistanciaTotal
	Escribir  "Escriba el rendimiento de su vehiculo en Km por litro de gasolina"
	Leer RendimientoVehiculo
	Escribir  "Escriba el precio del litro de combustible actual"
	Leer PrecioCombustible
	Escribir  "Cantidad de personas que viajan"
	Leer  PersonasQueViajan
	
	LitrosNecesarios = DistanciaTotal / RendimientoVehiculo
	
	CostoCombustible = PrecioCombustible * LitrosNecesarios
	
	ValorDividido = CostoCombustible / PersonasQueViajan
	
	Escribir "Los litros necesarios para el viaje son: ", LitrosNecesarios
	
	Escribir "El costo total del combustible es: ", CostoCombustible
	
	Escribir "El valor a pagar de cada pasajero es: ", ValorDividido
	
FinAlgoritmo
