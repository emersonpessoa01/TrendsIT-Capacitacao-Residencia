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
for i in contato:
    print("Chave:", i)
    print("Valor:", contato[i])
    print("")

indice = instagram.index("@paollaoliveira")
print("Exemplo de Lista:", nomes[indice])
