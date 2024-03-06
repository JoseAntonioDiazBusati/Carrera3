class Camion(
    nombre: String,
    marca: String,
    modelo: String,
    capacidadCombustible: Float,
    combustibleActual: Float,
    kilometrosActuales: Float,
    esHibrido:Boolean,
    private val peso: Float
) : Automovil(nombre, marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales, esHibrido) {

    companion object {
        private const val CONSUMO_CAMION = 16f // Consumo en litros por cada 100 km.
        private const val REDUCCION_AUTONOMIA_POR_PESO = 0.2f // Reducción en km por litro por cada 1000 kg de peso.
    }

    /**
     * Calcula y devuelve la autonomía del camión en kilómetros, considerando el impacto del peso en el consumo.
     *
     * @return La autonomía del camión en kilómetros como [Float].
     */
    override fun calcularAutonomia(): Float {
        val autonomiaBase = super.calcularAutonomia()
        val reduccionAutonomia = (peso / 1000) * REDUCCION_AUTONOMIA_POR_PESO
        return (autonomiaBase - reduccionAutonomia).redondear(2)
    }

    /**
     * Sobrescribe el método toString de la clase [Automovil] para proporcionar una representación en cadena de texto
     * específica del camión, incluyendo su peso además de los detalles heredados de Automovil.
     *
     * @return Una cadena de texto que representa al camión.
     */
    override fun toString(): String {
        return "Camion(nombre=$nombre, marca=$marca, modelo=$modelo, capacidadCombustible=$capacidadCombustible, combustibleActual=$combustibleActual, kilometrosActuales=$kilometrosActuales, peso=$peso kg)"
    }
}
