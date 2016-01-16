from dni_nie import *
from Hora import *


class TarjetaPrepago():
    def __init__(self, telefonoNum="", dni="", saldo=0, consumoHoras=0, consumoMinutos=0, consumoSegundos=0):
        self.numeroTelefono = telefonoNum
        self.nif = Dni(dni)
        self.saldo = saldo
        self.consumoHoras = Hora(consumoHoras, consumoMinutos, consumoSegundos)
        self.precioMensajes = 0.09

    def setNumeroTelefono(self, telefonoNum):
        self.numeroTelefono = telefonoNum

    def getNumeroTelefono(self):
        return self.numeroTelefono

    def setSaldo(self, saldo):
        self.saldo = saldo

    def getSaldo(self):
        return self.saldo

    def ingresarSaldo(self, ingreso):
        self.setSaldo(self.getSaldo() + ingreso)

    def enviarMensaje(self, mensajesEnviar):
        self.setSaldo(self.getSaldo() - (mensajesEnviar * self.precioMensajes))

    def realizarLlamada(self, segundosHablados):
        self.setSaldo(self.getSaldo() - (segundosHablados/100 + 0.15))
        segundosTotales = self.consumoHoras.getHoraASegundos() + segundosHablados
        self.consumoHoras.setHoraSegundos(segundosTotales)


if __name__ == '__main__':
    primeraTarjeta = TarjetaPrepago(123456788, "12345678A", 10000, 24, 24, 24)
    primeraTarjeta.ingresarSaldo(1000)
    if primeraTarjeta.getSaldo() == 11000:
        print("ingresarSaldo Ok")
    else:
        print("IngresarSaldo Fail")
    primeraTarjeta.enviarMensaje(15)
    if primeraTarjeta.getSaldo() == 10998.65:
        print("enviarMensaje Ok")
    else:
        print("enviarMensaje Fail")
    primeraTarjeta.realizarLlamada(30)

# Peta por el numero de decimales y el truncamiento
    if primeraTarjeta.getSaldo() == 10998.20 and primeraTarjeta.consumoHoras.getHoraASegundos == 87894:
        print("realizarLlamada Ok")
    else:
        print("realizarLlamada Fail")
