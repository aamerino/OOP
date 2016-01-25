

class Fecha():
    def __init__(self, dia=1, mes=1, anno=1900):
        self.dia = dia
        assert 1 <= self.dia <= 31, self.setDia(1)
        self.mes = mes
        assert 1 <= self.mes <= 12, self.setMes(1)
        self.anno = anno
        assert 1900 <= self.anno <= 3000, self.setanno(1900)

    def setDia(self, dia):
        self.dia = dia

    def getDia(self):
        return self.dia

    def setMes(self, mes):
        self.mes = mes

    def getMes(self):
        return self.mes

    def setAnno(self, anno):
        self.anno = anno

    def getAnno(self):
        return self.anno

    def setFecha(self, dia, mes, anno):
        self.setDia(dia)
        assert 1 <= self.getDia() <= 31, self.setDia(1)
        self.setMes(mes)
        assert 1 <= self.getMes() <= 12, self.setMes(1)
        self.setAnno(anno)
        assert 1900 <= self.getAnno() <= 3000, self.setAnno(1900)

#Mal planteado cambiar todo
    def incrementarFecha(self, diasIncrementar):
        annosIncrementar = diasIncrementar // 365
        diasIncrementar = diasIncrementar % 365
        mesIncrementar = diasIncrementar // 30
        diasIncrementar = diasIncrementar % 30
        self.setAnno(self.getAnno() + annosIncrementar)
        self.setMes(self.getMes() + mesIncrementar)
        self.setDia(self.getDia() + diasIncrementar)

if __name__ == '__main__':
    FechaCorrecta = Fecha(23, 2, 2999)
    print("FechaCorrecta Ok") if FechaCorrecta.getDia() == 23 and FechaCorrecta.getMes() == 2 and FechaCorrecta.getAnno() == 2999 else print("FechaCorrecta Fail")
#Peta por asert
#    FechaIncorrecta = Fecha(32, 13, 3000)
#    print("FechaIncorrecta Ok") if FechaIncorrecta.getDia() == 1 and FechaIncorrecta.getMes() == 1 and FechaIncorrecta.getAnno() == 3000 else print("FechaIncorrecta Fail")
    FechaIncrementada = Fecha(23, 2,1999)
    FechaIncrementada.incrementarFecha(40)
    print(FechaIncrementada.getDia(), FechaIncrementada.getMes())
