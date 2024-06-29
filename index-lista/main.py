'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''

# indices --> 0        1           2          3       4
nadadoras = ["Luiza", "Alexandra", "Victoria", "Karol", "Beatriz"]
tempo = [17.3,    15,          13,       19,     16]

# Em qual index na lista tempo está o menor e o maior tempo
indice_melhor_tempo = tempo.index(min(tempo))
indice_pior_tempo = tempo.index(max(tempo))

print("Melhor nadadora é {}".format(nadadoras[indice_melhor_tempo]))
print("Pior nadadora é {}".format(nadadoras[indice_pior_tempo]))
