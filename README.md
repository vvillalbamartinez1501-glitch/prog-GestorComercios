Examen práctico — Java POO

Duración: 75 min
Tags: Java, POO, herencia, abstract, enum, ArrayList, CRUD

Enunciado

Diseña una aplicación para gestionar comercios.

Debes crear:

modelo.Comercio (abstracta)
modelo.TiendaFisica
modelo.TiendaOnline
modelo.TipoComercio (enum)
controlador.GestorComercios
1. Enum — 1 punto
   ALIMENTACION, ROPA, ELECTRONICA, SERVICIOS
2. Clase abstracta modelo.Comercio — 2 puntos

Atributos:

private final String id;
private String nombre;
private String ciudad;
private modelo.TipoComercio tipoComercio;

Requisitos:

Constructor completo
Getters
Setter (todos excepto id)
Método abstracto:
public abstract double calcularCosteOperacion();
toString() con StringBuilder
3. Clases hijas — 2 puntos
   modelo.TiendaFisica
   private int numeroEmpleados;

Coste:

Base: 1000
+200 si empleados > 5
modelo.TiendaOnline
private boolean tieneEnvioInternacional;

Coste:

Base: 500
+150 si tiene envío internacional

Ambas clases:

Implementan calcularCosteOperacion()
Sobrescriben toString()
4. Clase controlador.GestorComercios — 4 puntos

Atributo:

private ArrayList<modelo.Comercio> comercios;

Métodos:

añadirComercio(modelo.Comercio c)
buscarPorId(String id)
buscarPorNombre(String nombre) // coincidencia exacta
buscarPorTipoComercio(modelo.TipoComercio tipo)
eliminarPorId(String id)
modificarCiudad(String id, String nuevaCiudad)
imprimirTodos()
imprimirPorTipoComercio(modelo.TipoComercio tipo)
5. Buenas prácticas — 1 punto
   Encapsulación correcta
   Uso de herencia y polimorfismo
   Código claro
   StringBuilder en toString()