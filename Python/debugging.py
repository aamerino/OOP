import math
import random
import decimal

epsilon = 10e-10


def raizcuadrada(x):
    assert x >= 0, "Numero Negativo"

    b = x
    fin = False

    if b == 0:
        return b
    else:
        fin = False
        while not fin:
            if (b - x/b) < epsilon:
                #assert x - b*b < epsilon, "Error"
                return b
            else:
                b = (1/2)*(x/b + b)


def test():

    print("Introduce x")
    x = input('x = ')
    # raw_input devuelve un string

    print(raizcuadrada(decimal(x)))

# ###################CASOS TEST#########################

print('---------------------------NUMEROS ENTEROS------------------')
i = 0
while i < 1000:

    numeroRandom = random.randint(0, 1000)
    print(numeroRandom)
    if not (raizcuadrada(numeroRandom) - math.sqrt(numeroRandom) < epsilon):
        print("Raiz cuadrada ", numeroRandom, " -> FAIL")
    i += 1


print('---------------------------NUMEROS FLOAT------------------')
i = 0
while i < 1000:
    numeroRandom = random.uniform(0, 1000)
    print(numeroRandom)
    if not (raizcuadrada(numeroRandom) - math.sqrt(numeroRandom) < epsilon):
        print("Raiz cuadrada ", numeroRandom, " -> FAIL")
    i += 1
