import random

cores = ['AZ', 'VM', 'VD', 'AM', 'LA', 'MA', 'RX', 'RO']

vitoria = False 

rodada = 1 

while not vitoria:
    print("Jogo da Senha - Rodada", rodada)
    sequencia = [random.choice(cores) for item in range(1,6)]

    nr_tentativa = 1
    while nr_tentativa <= 10:
        print('   > Tentativa', nr_tentativa, '--', end='')
        tentativa = []
        nr_item = 1
        for nr_item in range (1,6):
            tentativa.append(random.choice(cores))

        vitoria = True
        resultado = []
        for nr_item in range(1,6):
            if sequencia[nr_item-1] != tentativa[nr_item-1]:
                vitoria = False
                resultado.append("BR")
            else:
                resultado.append("PR")

        print(resultado)
        nr_tentativa += 1
        if vitoria:
            break

        if vitoria:
            print("Você Ganhou!!!")
            print(tentativa)
        else:
            print("Você Perdeu!!!")

        rodada += 1
