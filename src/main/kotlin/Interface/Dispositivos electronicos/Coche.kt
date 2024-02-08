package Interface.`Dispositivos electronicos`

class Coche(override var motorEncendido: Boolean = false, override var kmHora: Int):Vehiculo , Encendidoapagado{
    override fun encendido(): String {
        motorEncendido = true
        return "El motor está encendido"
    }

    override fun apagado(): String {
        motorEncendido = false
        return "El motor está apagado"
    }

    override fun acelerar(inicio: Int): String {
        kmHora += 10
        return "El coche esta acelerando a $inicio km ($kmHora km/h)"
    }

    override fun frenar(fin: Int): String {
        kmHora -= 10
        return "El coche se está frenando a $fin km ($kmHora km/h)"
    }

    override fun toString(): String {
        return "El coche esta ${
            if (motorEncendido == true){"encendido"}
            else{"apagado"}
        } y va ha ${
            if (motorEncendido==false){"0 km/h"}
            else{kmHora}
        }"
    }
}