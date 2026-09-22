Algoritmo CostoAdquisicion
	// Variables:  valor_monetario_ganancia, subtotal, IVA, precio_final,
	// nombre_producto, costo_base, porcentaje_ganancia
	Definir valor_monetario_ganancia, subtotal, valor_impuesto Como Real
	Definir IVA, precio_final, costo_base Como Real
	Definir conversion Como Real
	Definir porcentaje_ganancia Como Entero
	Definir nombre_producto Como Cadena
	IVA <- 0.19
	// Debo pedir al usuario el nombre del producto, el costo base
	// de fabricacion del producto y porcentaje de ganancia.
	Escribir 'Ingrese el nombre del producto'
	Leer nombre_producto
	Escribir 'Ingrese el costo base de fabricacion del producto'
	Leer costo_base
	Escribir 'Ingrese el porcentaje de ganancia sin % entre 0/100'
	Leer porcentaje_ganancia
	// Proceso
	conversion <- porcentaje_ganancia/100
	valor_monetario_ganancia <- costo_base*conversion
	subtotal <- costo_base+valor_monetario_ganancia
	valor_impuesto <- subtotal*IVA
	precio_final <- subtotal+valor_impuesto 
	// Salida
	Escribir ('---------------------------')
	Escribir nombre_producto, ' ----- ', costo_base
	Escribir ('---------------------------')
	Escribir 'El valor de la ganancia es: ', valor_monetario_ganancia
	Escribir ('---------------------------')
	Escribir 'El subtotal es: ', subtotal
	Escribir ('---------------------------')
	Escribir 'El iva es: ', valor_impuesto
	Escribir ('---------------------------')
	Escribir 'El total de venta es: ', precio_final
	Escribir ('---------------------------')
FinAlgoritmo
