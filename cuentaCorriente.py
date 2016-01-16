from dni_nie import *


class cuentaCorriente():
    def __init__(self, nombre="", apellidos="", direccion="", telefono="", saldo="", dni=""):
        self.nombre = nombre
        self.apellidos = apellidos
        self.direccion = direccion
        self.telefono = telefono
        self.nif = Dni(dni)
        self.saldo = saldo

    def setNombre(self, nombre):
        self.nombre = nombre

    def getNombre(self):
        return self.nombre

    def setApellidos(self, apellidos):
        self.apellidos = apellidos

    def getApellidos(self):
        return self.apellidos

    def setDireccion(self, direccion):
        self.direccion = direccion

    def getDireccion(self):
        return self.direccion

    def setTelefono(self, telefono):
        self.telefono = telefono

    def getTelefono(self):
        return self.telefono

    def setSaldo(self, saldo):
        self.saldo = saldo

    def getSaldo(self):
        return self.saldo

    def retirarDinero(self, dineroRetirar):
        self.saldo -= dineroRetirar

    def ingresarDinero(self, dineroIngresar):
        self.saldo += dineroIngresar

    def saldoNegativo(self):
        return self.saldo < 0


if __name__ == '__main__':

    cuentaPrimera = cuentaCorriente("Aitor", "Merino", "Montuiri", '12345678A', 100000)
    cuentaPrimera.retirarDinero(100000)
    if cuentaPrimera.getSaldo() == 0:
        print("Retirar Ok")
    else:
        print("Retirar Fail")
    cuentaPrimera.ingresarDinero(100000)
    if cuentaPrimera.getSaldo() == 100000:
        print("Ingresar Ok")
    else:
        print("Ingresar Fail")
    if cuentaPrimera.saldoNegativo:
        print("saldoNegativo Ok")
    else:
        print("saldoNegativo Fail")
