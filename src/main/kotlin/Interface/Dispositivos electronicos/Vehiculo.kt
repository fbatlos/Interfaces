package Interface.`Dispositivos electronicos`

interface Vehiculo {
    val motorEncendido: Boolean
    val kmHora:Int

    fun acelerar(inicio:Int): String
    fun frenar(fin:Int): String
}