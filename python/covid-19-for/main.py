'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
print("COVID-19")

suspeitos = 0
num_pac = int(input("Informe o número de pacientes: "))
for x in range(num_pac):
    tosse = int(input("Tosse? \n1. Sim \n2. Não \nResp.: "))
    febre = int(input("febre? \n1. Sim \n2. Não \nResp.: "))
    resp = int(input("Dificuldade de respirar? \n1. Sim \n2. Não \nResp.: "))

    if tosse == 1 and febre == 1 and resp == 1:
        suspeitos += 1

print("Suspeitos de COVID-19: {} pessoa(s)".format(suspeitos))