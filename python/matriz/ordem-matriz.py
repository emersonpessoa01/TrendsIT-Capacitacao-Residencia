import random

ordem = int(input("digite a ordem da matriz: "))

if ordem >= 2:
    while True:
        M = []
        for i in range(ordem):
            LINHA = []
            for j in range(ordem):
                num = random.randint(1, 10)
                LINHA.append(num)
            M.append(LINHA)
        break
    for i in range(ordem):
        for j in range(ordem):
            print(M[i][j], end=" ")
        print("")
else:
    print("Informe uma ordem válida.")
