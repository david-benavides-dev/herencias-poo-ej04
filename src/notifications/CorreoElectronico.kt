package notifications

class CorreoElectronico(var correo: String, override val mensaje: String): Notificable {
    override fun enviarNotificacion() {
        println("Correo enviado a $correo: $mensaje")
    }
}