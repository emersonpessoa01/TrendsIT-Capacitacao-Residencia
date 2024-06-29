import random

while True:
    lin = int(input("Quantidade de linhas da matriz: "))
    col = int(input("Quantidade de colunas da matriz: "))
    if lin > 0 and col > 0:
        M = []
        for i in range(lin):
            LINHA = []
            for j in range(col):
                num = random.randint(1, 15)
                LINHA.append(num)
            M.append(LINHA)
        break

for i in range(lin):
    for j in range(col):
        print(M[i][j], end="\t")
    print("")
