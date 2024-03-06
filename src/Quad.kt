/**
 * Representa un quad, que es una especialización de [Motocicleta] con una autonomía reducida a la mitad y un tipo específico.
 *
 * @property tipo El tipo de quad, que puede ser "Cuadriciclos ligeros", "Cuadriciclos no ligeros" o "Vehículos especiales".
 * @constructor Crea un quad con los parámetros especificados, heredando propiedades y funcionalidades de [Motocicleta].
 */
class Quad(
    nombre: String,
    marca: String,
    modelo: String,
    capacidadCombustible: Float,
    combustibleActual: Float,
    kilometrosActuales: Float,
    cilindrada:Int,
    private val tipo: String
) : Motocicleta(nombre, marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales, cilindrada) {

    companion object {
        private const val REDUCCION_AUTONOMIA_QUAD = 0.5f // Factor de reducción de la autonomía del quad.
    }

    /**
     * Calcula y devuelve la autonomía del quad en kilómetros, reduciendo a la mitad la autonomía base de una motocicleta.
     *
     * @return La autonomía del quad en kilómetros como [Float].
     */
    override fun calcularAutonomia(): Float {
        return (super.calcularAutonomia() * REDUCCION_AUTONOMIA_QUAD).redondear(2)
    }

    /**
     * Sobrescribe el método toString de la clase [Motocicleta] para proporcionar una representación en cadena de texto
     * específica del quad, incluyendo su tipo además de los detalles heredados de Motocicleta.
     *
     * @return Una cadena de texto que representa al quad.
     */
    override fun toString(): String {
        return "Quad(nombre=$nombre, marca=$marca, modelo=$modelo, capacidadCombustible=$capacidadCombustible, combustibleActual=$combustibleActual, kilometrosActuales=$kilometrosActuales, tipo='$tipo')"
    }
}