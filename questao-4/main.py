'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
# QUESTÃO 4.
# Crie um programa que solicite o usuário um número N ímpar, maior que 1.
# Em seguida, preencha uma lista com N números inteiros positivos.
# Selecione o elemento que está no centro da lista.
# Ao final, calcule e escreva o fatorial do elemento selecionado.

N = int(input("Digite um valor N ímpar maior que 1: "))
if N > 1 and N % 2 != 0:
    num_validos = 0
    valores = []
    while num_validos < N:
        num = int(input("Digite um número inteiro positivo: "))
        if num > 0:
            num_validos += 1
            valores.append(num)
    indice_centro = int(len(valores) / 2)
    print(valores[indice_centro])

    fat = 1
    for n in range(1, valores[indice_centro] + 1):
        fat = fat * n
    print("{}! = {}".format(valores[indice_centro], fat))
else:
    print("Você não informou um valor para N ímpar maior que  1.")
