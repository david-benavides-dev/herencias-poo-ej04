package notifications

sealed interface Notificable {
    val mensaje: String

    fun enviarNotificacion()
}