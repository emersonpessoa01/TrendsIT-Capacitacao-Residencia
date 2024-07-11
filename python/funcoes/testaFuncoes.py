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
print(calcula_IMC.__doc__)
# Como Documentar um Função Python
