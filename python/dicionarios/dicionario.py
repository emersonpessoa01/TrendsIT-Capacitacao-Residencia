contato = {
    "@camilaqueiroz": "Camila Queiroz",
    "@paollaoliveira": "Paolla Oliveira"
}
print("Exemplo de Dicionário:", contato["@paollaoliveira"])
print("Exemplo de Get:", contato.get("@paollaoliveira"))



instagram = [
    "@camilaqueiroz",
    "@paollaoliveira"
]
nomes = [
    "Camila Queiroz",
    "Paolla Oliveira"
]


indice = instagram.index("@paollaoliveira")
print("Exemplo de Lista:", nomes[indice])
