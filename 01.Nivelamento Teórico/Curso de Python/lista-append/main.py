'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
lindas = []

while True:
    nome = input("Digite o nome de uma linda: ")
    lindas.append(nome)

    resp = input("Deseja continuar [S | N]")
    if resp.upper() == "N":
        break
for nome in lindas:
    print(nome)
