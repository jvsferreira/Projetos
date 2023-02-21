import random

# lista contendo todas as cores possíveis
cores = ['AZ', 'VM', 'VD', 'AM', 'LA', 'MA', 'RX', 'RO']

vitoria = False #variavel que indica se a sequencia inicial foi adivinhada corretamente

rodada = 1 #variavel para contabilizar quantas execuções foram feitas até o programa acertar uma combinação

while not vitoria:
    print("Jogo da Senha - Rodada", rodada)
    #gera a sequencia a ser adivinhada
    sequencia = [random.choice(cores) for item in range(1,6)]

    nr_tentativa = 1
    while nr_tentativa <= 10: #tenta até 10 vezes
        print('   > Tentativa', nr_tentativa, '--', end='')
        tentativa = []
        nr_item = 1
        #gera a lista da tentativa
        for nr_item in range (1,6):
            tentativa.append(random.choice(cores))

        #gera a lista dos resultados
        vitoria = True
        resultado = [] #lista com os resultados para cada posição
        for nr_item in range(1,6):
            if sequencia[nr_item-1] != tentativa[nr_item-1]:
                vitoria = False
                resultado.append("BR")
            else:
                resultado.append("PR")

        #Imprimimos o resultado da comparação
        print(resultado)
        nr_tentativa += 1
        if vitoria:
            break

        #testa se acertou ou não
        if vitoria:
            print("Você Ganhou!!!")
            print(tentativa)
        else:
            print("Você Perdeu!!!")

        rodada += 1
