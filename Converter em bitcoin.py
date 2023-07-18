controle = 1
while True:
    print("Conversão em criptomoeda: ")
    print("1-Converter Bitcoin em Reais")
    print("2-Converter Reais em Bitcoin")
    print("3-Sair")
    controle=int(input("Escolha uma opção: "))
    if (controle==3):
        break
    print("__________________________", end="\n")
    #teste das opções
    if controle == 1:
        num_01 = float(input("Digite um valor em bitcoin: "))
        num_02 = float(input("Digite a cotação atual(em reais): "))
        print("\n{0:.2f} bitcoins valem R${1:.2f}".format(num_01*num_02))
        print("______________________", end="\n")

    elif controle ==2:
        num_01 = float(input("Digite um valor em reais: "))
        num_02 = float(input("Digite a cotação atual(em reais): "))
        print('\nR${0:.2f} valem {1:.2f} bitcoins.'.format(num_01, num_01/num_02))
        print("________________________", end="\n")

print("_____________________", end='\n')
print("Fim da Conversão")
