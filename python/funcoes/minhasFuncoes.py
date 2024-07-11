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
    return valor_PI * pow(raio, 2)


def calcula_comprimento_circulo():
    raio = 3
    return 2 * valor_PI * raio

# Calcula Menor, Maior e Media de uma lista


def retorna_menor_maior_media(L):
    # menor = min(L)
    # maior = max(L)
    # media = sum(L) / len(L)
    # return menor, maior, media
    return min(L), max(L), sum(L) / len(L)


def calcula_dobroX_trploY(x, y):
    return x * 2, y * 3

# Como usar funções com parâmetros default
def calcula_IMC(peso, altura,nome="Prezado"):
    """Calcula o IMC de uma pessoa."""
    imc = peso / pow(altura, 2)
    print("{}: seu IMC é {:.2f}".format(nome, imc))

"""Função calcula_distancia"""

# Calcula a distância entre dois pontos
def calcula_distancia(x1, y1, x2, y2):
    # return ((x2 - x1)**2 + (y2 - y1)**2)**0.5
    from math import sqrt
    return sqrt((x2 - x1)**2 + (y2 - y1)**2)
"""Função calcula_mediana"""