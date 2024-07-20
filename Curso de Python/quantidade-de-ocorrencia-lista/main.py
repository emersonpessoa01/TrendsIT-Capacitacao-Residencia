'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
idade_alunos = []

idade_alunos.append(17)
idade_alunos.append(23)
idade_alunos.append(19)
idade_alunos.append(22)
idade_alunos.append(19)

# lista
for i in idade_alunos:
    print([i])

# Inserir elemento na lista pelo índice
idade_alunos.insert(2, 15)

# tamanho da lista
print("quantidade de valores na lista: {}".format(len(idade_alunos)))

# quantidade de repetição de números
print(idade_alunos.count(19))

# menor valor
print(min(idade_alunos))

# maior valor
print(max(idade_alunos))

# soma das valores da lista
print(sum(idade_alunos))

# mediada lista
print((sum(idade_alunos)/len(idade_alunos)))

# remover último elemento
idade_alunos.pop()
print(idade_alunos)

# remover elemento na posição 1
idade_alunos.pop(1)
print(idade_alunos)

# esvaziar a lista
idade_alunos.clear()
print(idade_alunos)

# apagar elemento da lista pelo valor
idade_alunos.append(17)
idade_alunos.append(23)
idade_alunos.append(19)
idade_alunos.append(22)
idade_alunos.append(19)
idade_alunos.remove(23)
print(idade_alunos)

# apagar elemento da lista pelo for
idade_alunos.append(17)
idade_alunos.append(23)
idade_alunos.append(19)
idade_alunos.append(22)
idade_alunos.append(19)
idade_alunos.remove(23)

for number in idade_alunos:
    if number == 17:
        idade_alunos.remove(number)
print(idade_alunos)
