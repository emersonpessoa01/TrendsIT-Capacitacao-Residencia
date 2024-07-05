produtos = {}
while True:
    cod = int(input("Código: "))
    nome = input("Nome: ")
    preco = float(input("R$: "))
    qtde = int(input("Qtde: "))
    prod = []
    prod.append(nome)
    prod.append(preco)
    prod.append(qtde)
    produtos.update({
        cod: prod
    })
    resp = input("Deseja continuar [S | N]? ")
    if resp.upper() == "N" or resp == "n":
        break
total = 0
for prod in sorted(produtos.values()):
    subtotal = prod[1] * prod[2]
    print("{}: R$ {:.2f}".format(prod[0],subtotal))
    total += subtotal
print(20 * "-")
print("Total: R$ {:.2f}".format(total))
