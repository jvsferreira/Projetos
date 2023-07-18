larguraGaragem = float(input("Entre com a largura da garagem em metros: "))

profundidadeGaragem = float(input("Entre com a profundidade da garagem em metros: "))

areaGaragem = larguraGaragem * profundidadeGaragem

larguraTerreno = float(input("Entre com a largura do terreno em metros: "))

profundidadeTerreno = float(input("Entre com a profundidade do terreno em metros: "))

areaTerreno = larguraTerreno * profundidadeTerreno

Percentual = ((areaGaragem) / (areaTerreno)) * 100

localizacaoTerreno = input("Localização do terreno: ")

print ("Imóvel localização na zona: ", localizacaoTerreno)

print ("Percentual de ocupação: ", Percentual)

if localizacaoTerreno=="Caxias do Sul" and Percentual<=25:
    print("projeto atende norma de zoneamento do plano diretor")

elif localizacaoTerreno=="Ana Rech" or localizacaoTerreno=="Garibaldi" and Percentual<=30:
    print("Projeto atende norma de zoneamento do plano diretor")

elif localizacaoTerreno=="Farroupilha" and Percentual<=40:
    print("projeto atende norma de zoneamento do plano diretor")

else:
    print("REVISAR MEDIDAS! Projeto NÃO atende norma de zoneamento do plano diretor")
