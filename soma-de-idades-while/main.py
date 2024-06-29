'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
rapazes_maiores = 0
soma_idades_mocas = 0
mocas = 0
while True:
    sexo = input("Sexo [M/F]: ")
    idade = int(input("Idade: "))
    if idade < 0:
        break
    if sexo.upper() == "M":
        if idade > 18:
            rapazes_maiores += 1
    elif sexo.upper() == "F":
        soma_idades_mocas += idade
        mocas += 1
    else:
        print("opção de sexo inválida.")

media = 0
if mocas > 0:
    media = soma_idades_mocas / mocas

print("Rapazes acima de 18 anos: {}".format(rapazes_maiores))
print("Média das idades das moças: {}".format(media))
