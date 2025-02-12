package notifications

class NotificacionPush(var nombreApp: String, override val mensaje: String) : Notificable {
    override fun enviarNotificacion() {
        println("Notificación de $nombreApp: $mensaje")
    }
}