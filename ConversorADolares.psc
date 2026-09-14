//Algoritmo InteresInversion
//	
//	Definir capital, tasa, tiempo, interesGanado Como Real
//    Escribir "Ingrese el capital a invertir:"
//    Leer capital
//    Escribir "Ingrese la tasa de interés anual (ej. 5 para 5%):"
//    Leer tasa
//    Escribir "Ingrese el tiempo de inversión en años:"
//    Leer tiempo
//    interesGanado <- (capital * tasa * tiempo) / 100
//    Escribir "El interés generado será de: ", interesGanado
//
//	
//FinAlgoritmo

Algoritmo  ConversorADolares
	
	Definir CantidadACambiar, TasaCambio, TotalEnDolares, Comision, ValorTotal, ValorConComision Como Real
	
	TasaCambio = 3096.41
	Comision = 0.02
	
	Escribir "Ingrese el valor en COP a convertir"
	LEER CantidadACambiar;
	
	TotalEnDolares = CantidadACambiar/TasaCambio;
	
	Imprimir(TotalEnDolares)
	
	ValorConComision = TotalEnDolares * Comision
	
	Imprimir(ValorConComision)
	
	Escribir  "valor a recibir es: ", TotalEnDolares - ValorConComision	
	
FinAlgoritmo
	