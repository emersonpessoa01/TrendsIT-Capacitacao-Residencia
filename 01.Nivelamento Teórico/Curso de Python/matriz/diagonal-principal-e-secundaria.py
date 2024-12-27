import random

ordem = int(input("Digite a ordem da matriz: "))

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
    DP = []
    DS = []
    for i in range(ordem):
        for j in range(ordem):
            print(M[i][j], end=" ")
            if i == j:
                DP.append(M[i][j])
            elif i + j == ordem - 1:
                DS.append(M[i][j])
        print("")
    maior_DP = max(DP)
    menor_DS = min(DS)
    media = (maior_DP + menor_DS)/2
    print("Maior elemento na diagonal principal:", maior_DP)
    print("Menor elemento na diagonal secundária:", menor_DS)
    print("Média dos elementos da diagonal principal e secundária:", media)
else:
    print("Informe uma ordem válida.")
