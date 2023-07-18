import pprint
pp = pprint.PrettyPrinter(indent=2, width=20)
matriz = []
num_linhas = 3
num_colunas = 3
valor_inicial = 10
incremento = 5
iteracao = 1
print('+-----------+-------+--------+-----------------------+')
print('|  Iteração | Linha | Coluna | matriz[linha, coluna] |')
print('+-----------+-------+--------+-----------------------+')
for i in range(num_linhas):
    linha = []
    for j in range(num_colunas):
        print('|     %s     |   %s   |   %s    |           %s          |' % (iteracao, i, j, valor_inicial))
        linha.append(valor_inicial)
        valor_inicial += incremento
        iteracao += 1
    matriz.append(linha)
print('+----------+-------+--------+------------------------+')
print("Imprimindo o conteudo da matriz:")
pp.pprint(matriz)
