# PAISES = ["Brasil","França","Holanda","Inglaterra"]
# pesquisa = "França"

# if pesquisa in PAISES:
#     PAISES.remove(pesquisa)
# print(f"País removido da lista: {pesquisa}")
# print("Nova lista de países:", PAISES)

# ALUNOS = [
#     [21,"Ana",1.7],
#     [14,"Carlos",1.7],
#     [37,"Priscila",1.63],
#     [91,"Maria Eduarda",1.68],
#     [46,"Henrique",1.57],
# ]
# print(ALUNOS[4][2])

# A = [[
#     [1, 2, 3],
#     [4, 5, 6],
#     [0, 0, 0]
# ]]


# for i in range(2):     # percorre a 1a e a 2a linhas da matriz
#     for j in range(3):  # percorre todas as colunas da matriz
#         A[2][j] = A[2][j] + A[i][j]

# Ao fim do programa, a terceira linha da matriz corresponde à soma das outras duas.
# -=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
#Cálculo de área do triângulo
# Analise o código abaixo

def calcula_area(base, altura):
    area = (base * altura)/2
    return area

print("A área do triângulo é: {}".format(calcula_area(5, 2)))

# Será exibido o valor 10, que corresponde à área de um retângulo de base 5 e de altura 2.