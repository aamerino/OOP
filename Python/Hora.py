
class Hora():
    def __init__(self, hora=0, minutos=0, segundos=0):
        self.hora = hora
        assert 0 <= self.hora <= 24, self.setHoras(0)
        self.minutos = minutos
        assert 0 <= self.minutos <= 59, self.setMinutos(0)
        self.segundos = segundos
        assert 0 <= self.segundos <= 59, self.setSegundos(0)

    def setHoras(self, hora):
        self.hora = hora

    def getHoras(self):
        return self.hora

    def setMinutos(self, minutos):
        self.minutos = minutos

    def getMinutos(self):
        return self.minutos

    def setSegundos(self, segundos):
        self.segundos = segundos

    def getSegundos(self):
        return self.segundos

    def setHoraCompleta(self, hora, minutos, segundos):
        assert 0 <= self.hora <= 24, self.setHoras(0)
        assert 0 <= self.minutos <= 59, self.setMinutos(0)
        assert 0 <= self.segundos <= 59, self.setSegundos(0)
        self.setHoras(hora)
        self.setMinutos(minutos)
        self.setSegundos(segundos)

    def getHoraCompleta(self):
        return [self.getHoras(), self.getMinutos(), self.getSegundos()]

    def imprimirHora(self):
        return "{!s}:{!s}:{!s}".format(self.getHoras(), self.getMinutos(), self.getSegundos())

    def getHoraASegundos(self):
        return (self.getHoras()*60 + self.getMinutos())*60 + self.getSegundos()

    def setHoraSegundos(self, segundos):
        minutos, segundos = divmod(segundos, 60)
        hora, minutos = divmod(minutos, 60)
        self.setHoraCompleta(hora, minutos, segundos)

if __name__ == '__main__':
    HoraCorrecta = Hora(24, 59, 59)
    if str(HoraCorrecta.getHoraCompleta()) == "[24, 59, 59]":
        print("Ok")
    else:
        print("Fail")
    if str(HoraCorrecta.imprimirHora()) == "24:59:59":
        print("ImprimirHora Ok")
    else:
        print("ImprimiroraFail")
