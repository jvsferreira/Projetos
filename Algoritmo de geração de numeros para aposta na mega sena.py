import random
repetido = 0
jogos = []
dezenas = [x for x in range (1,61)]
while (len(jogos)<=6):
    jogo = []
    while (len(jogo) <=5):
        numero = random.choice(dezenas)
        if numero not in jogo:
            jogo.append(numero)
    if jogo not in jogos:
        jogos.append(jogo)
        print(jogo)
