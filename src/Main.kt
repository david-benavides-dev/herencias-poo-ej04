import notifications.*

fun main() {
    // *
    val notificaciones: List<Notificable> = listOf(
        CorreoElectronico("personaje@hotmail.com","Please i will ofer you 20% of the total sum of USD4.2M for your assistance. please i wish to transfer the fund urgently without delay into your account."),
        MensajeTexto("991435467","Estimado cliente, su paquete no se ha podido entregar el 11/10 porque no se han pagado las  tasas de aduana (€ 1). Siga las instrucciones: http://estafiña.com"),
        NotificacionPush("Instagram","Hello! free pics here")
    )

    for(noti in notificaciones) {
        noti.enviarNotificacion()
    }


}