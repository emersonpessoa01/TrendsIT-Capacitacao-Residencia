
# Analise o código abaixo:
ALUNOS = {
    21: ["Ana", 1.7],
    14: ["Carlos", 1.82],
    37: ["Priscila", 1.63],
    91: ["Maria Eduarda", 1.68],
    46: ["Henrique", 1.57],
}
# Captura a chave e valor do dicionário
DADOS = ALUNOS.get(46)
print(DADOS[1])


# Analise o código abaixo:
ALUNOS = {
    21: ["Ana", 1.7],
    14: ["Carlos", 1.82],
    37: ["Priscila", 1.63],
    91: ["Maria Eduarda", 1.68],
    46: ["Henrique", 1.57],
}
print("-"*20)

for dados in ALUNOS.values():
    print(dados)
