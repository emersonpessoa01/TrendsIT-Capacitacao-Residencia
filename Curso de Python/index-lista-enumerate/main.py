'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
produtos = []

while True:
    nome = input("Nome: ")
    produtos.append(nome)

    resp = input("Deseja continuar [S | N]")
    if resp.upper() == "N":
        break
# qtd_elem = len(produtos)

# for ind in range(qtd_elem):
#     print("{} --> {}".format(ind,produtos[ind]))

for indice, valor in enumerate(produtos):
    print("{} --> {}".format(indice, valor))
