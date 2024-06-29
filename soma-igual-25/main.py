'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
# Após a estrutura de repetição, a variável soma estará armazenando o valor 25.
soma = 0
num = 1
for x in range(5):
    soma += num
    num += 2
    print("X - {}, Número - {} e Soma - {}".format(x, num, soma))
print("Soma é: {}".format(soma))
