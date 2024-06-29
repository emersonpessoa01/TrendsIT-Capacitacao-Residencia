PAISES = ["Brasil","França","Holanda","Inglaterra"]
pesquisa = "França"

if pesquisa in PAISES:
    PAISES.remove(pesquisa)
print(f"País removido da lista: {pesquisa}")
print("Nova lista de países:", PAISES)