from minhasFuncoes import *
saudar()
saudar_aluno("Emerson")
print("O dobro de {} é {}".format(4, calcula_dobro(4)))
print(calcula_dobro_triplo(3))
print("")

#Outra forma melhorar o sáida da calcula_dobro_triplo
dobro,triplo =calcula_dobro_triplo(3)
print("O dobro de {} é {} e o triplo é {}".format(3, dobro, triplo))