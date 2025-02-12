package notifications

class MensajeTexto(var telefono: String, override val mensaje: String) : Notificable {
    override fun enviarNotificacion() {
        println("SMS mandado a $telefono: $mensaje")
    }
}