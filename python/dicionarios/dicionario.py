contato = {
    "@camilaqueiroz": "Camila Queiroz",
    "@paollaoliveira": "Paolla Oliveira",
    "@sheronmenezes":"Sheron Menezes"
}
print("Exemplo de Dicionário:", contato["@paollaoliveira"])

# Como acessar um elemento de um dicionário usando get
print("Exemplo de Get:", contato.get("@paollaoliveira"))

# Como incluir e alterar elementos de um dicionário
contato.update({"@paollaoliveira": "Linda"})
contato.update({"@bruna_ionica": "Bruna Marquezine"})

print("Novo Contato com update:", contato)

# Como iterar sobre um dicionário
for i in contato:
    print("Chave:", i)
    print("Valor:", contato[i])
    print("")

# Como iterar sobre os valores de um dicionário
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
print("")

# Como localizar elementos em um dicionário 
insta = input("Digite um instagram: ")
if insta in contato:
    print("Este instagram inserido é de {}".format(contato.get(insta)))
else:
    print("Este instagram não está cadastrado.")
print("")

# Como contar o número de elementos de um dicionário
print("Antes de incluir Marquezine: {}".format(len(contato)))
contato.update({
    "@marquezine": "Marquezine"
})
print("")

print("Depois de incluir Marquezine: {}".format(len(contato)))
print("")
# Como acessar Chaves, Valores e Itens em um Dicionário
for insta in contato.keys():
    print("Chave Instagram:", insta)

# Como acessar os valores
for atriz in contato.values():
    print("Nome da atriz:", atriz)
print("")
# Como acessar Itens: Chave e valor respectivamente
for insta, atriz in contato.items():
    print("o instagram de {} é {}".format(atriz,insta))
print("")
# Como ordenar os elementos de um Dicionário
for insta,nome in sorted(contato.items()):
    print("Nome ordenado:", nome, "Instagram:", insta)
print("")