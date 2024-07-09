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
