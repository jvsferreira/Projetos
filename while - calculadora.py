# exemplo de calculadora simples
controle = 1
while True:
    print ("Mini calculadora")
    print("1-Somar dois numeros")
    print("2-subtrair dois numeros")
    print("3-Multiplicar dois numeros")
    print("4-dividir dois numeros")
    print("5-fatorial de um numero")
    print("6-potencia entre dois numeros")
    print("7-sair")
    controle = int(input("Escolha um número: "))
    if (controle == 7 ):
        break
    print("--------------------", end="\n")
    #teste das opções
    if controle ==1:
        num_01 = float(input("Digite um número: "))
        num_02 = float(input("Digite um número: "))
        print("\nA soma de", num_01, "e", num_02, "é", num_01+num_02)
        print("-------------------------------", end="\n")

    elif controle ==2:
        num_01 = float(input("Digite um numero: "))
        num_02 = float(input("Digite um numero: "))
        print("\nA subtração de", num_01, "e", num_02, "é", num_01-num_02)
        print("-------------------------------", end="\n")


    elif controle ==3:
        num_01 = float(input("Digite um numero: "))
        num_02 = float(input("Digite um numero: "))
        print("\nA multiplicação de", num_01, "e", num_02, "é", num_01*num_02)
        print("-------------------------------", end="\n")

    elif controle ==4:
        num_01 = float(input("Digite um numero: "))
        num_02 = float(input("Digite um numero: "))
        if num_02 == 0:
         print("Não é possível fazer divisão por zero!")
         print("-------------------------------", end="\n")
        else:
         print("\nA divisão de", num_01, "e", num_02, "é", num_01/num_02)
         print("-------------------------------", end="\n")

    elif controle ==5:
        num_01 = float(input("Digite um numero: "))
        fatorial = 1
        contador = num_01
        while contador >1:
            fatorial*=contador
            contador-=1
        print("\nO fatorial de", num_01, "é", fatorial)
        print("-------------------------------", end="\n")


    elif controle ==6:
        num_01 = float(input("Digite um numero: "))
        num_02 = float(input("Digite um numero: "))
        print("\n", num_01, "elevado a", num_02, "é", num_01**num_02)
        print("-------------------------------", end="\n")

print("----------------------------", end="\n")
print("Fim da Calculadora")
