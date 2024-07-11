from minhasFuncoes import *
saudar()
saudar_aluno("Emerson")
print("O dobro de {} é {}".format(4, calcula_dobro(4)))
print(calcula_dobro_triplo(3))
print("")

# Outra forma melhorar o sáida da calcula_dobro_triplo
dobro, triplo = calcula_dobro_triplo(3)
print("O dobro de {} é {} e o triplo é {}".format(3, dobro, triplo))
print("")
# Calcula Área do Círculo
print("A área do círculo com raio de {} é {}".format(3, calcula_area_circulo()))
print("")
# Calcula Comprimento do Círculo
print("O comprimento do círculo com raio de {} é {}".format(
    3, calcula_comprimento_circulo()))
print("")

# Calcula Menor, Maior e Media de uma lista
lista = [7, 2, 3, 4]
menor, maior, media = retorna_menor_maior_media(lista)
print("Menor valor: {}, Maior valor: {}, Média: {}".format(menor, maior, media))
print("")

# Ordem dos argumentos de uma função
varX = 5
varY = 7
dobroX, dobroY = calcula_dobroX_trploY(varX, varY)

print("O dobro de {} é {} e o triplo de {} é {}".format(varX, dobroX, varY, dobroY))
print("")

# Como usar funções com parâmetros default
print(calcula_IMC(84, 1.84))
# Como Documentar um Função Python
print(calcula_IMC.__doc__)
print("")
"""Função calcula_distancia"""
xA = float(input("Digite o valor da coordenada X do ponto A: "))

yA = float(input("Digite o valor da coordenada Y do ponto A: "))

xB = float(input("Digite o valor da coordenada X do ponto B: "))

yB = float(input("Digite o valor da coordenada Y do ponto B: "))

dAB = calcula_distancia(xA, yA, xB, yB)

print("A distância entre os pontos A e B é {:.2f}.".format(dAB))
