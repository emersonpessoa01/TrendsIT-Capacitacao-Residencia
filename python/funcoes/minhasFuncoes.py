# Minhas Funções
valor_PI = 3.14
def saudar():
    print("Olá, seja bem-vindo!")

def saudar_aluno(nome):
    print("Olá {}, seja bem-vindo ao nosso curso de Python!".format(nome))

def calcula_dobro(numero):
    return numero * 2
def calcula_dobro_triplo(numero):
    return numero * 2, numero * 3
def calcula_area_circulo():
    raio = 3
    return valor_PI * pow(raio,2)
def calcula_comprimento_circulo():
    raio = 3
    return 2 * valor_PI * raio