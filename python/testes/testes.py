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

A = [[
    [1, 2, 3],
    [4, 5, 6],
    [0, 0, 0]
]]


for i in range(2):     # percorre a 1a e a 2a linhas da matriz
    for j in range(3):  # percorre todas as colunas da matriz
        A[2][j] = A[2][j] + A[i][j]

# Ao fim do programa, a terceira linha da matriz corresponde à soma das outras duas.
