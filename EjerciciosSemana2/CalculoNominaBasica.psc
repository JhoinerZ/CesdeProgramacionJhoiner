Algoritmo CalculoNominaBasica
	
	Definir HorasTrabajadas, PagoXHora, SalarioBruto, SalarioNeto, MontoDescontado, Descuento Como Real
	
	Escribir "Ingresa el total de horas trabajas del empleado"
	Leer HorasTrabajadas
	Escribir "Ingresa el valor de la hora laboral (COP)"
	Leer PagoXHora
	
	SalarioBruto = HorasTrabajadas * PagoXHora
	
	Descuento = 0.08
	
	MontoDescontado = SalarioBruto * Descuento
	
	SalarioNeto = SalarioBruto - MontoDescontado
	
	Escribir "El salario bruto es: ", SalarioBruto
	Escribir "El monto a descontar es: ", MontoDescontado
	Escribir "El salario a pagar: ", SalarioNeto
	
FinAlgoritmo

//Algoritmo CalculoNomina
//    Definir horas, valorHora, descuentos, valordescontado, salarioNeto Como Real
//	
//	descuentos = 0.08
//	
//    Escribir "Ingrese horas trabajadas:"
//    Leer horas
//	
//	Escribir "Ingrese el valor por hora:"
//    Leer valorHora
//	
//    salarioBruto <- horas * valorHora   
//
//    valordescontado <- salarioBruto * descuentos
//	
//	salarioNeto <- salarioBruto - valordescontado
//	
//    Escribir "El bruto es: ", salarioBruto
//	Escribir "El valor descontado es: ", valordescontado
//	Escribir "El neto es: ", salarioNeto
//	
//FinAlgoritmo
