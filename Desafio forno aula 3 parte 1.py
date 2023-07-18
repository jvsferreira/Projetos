#Forno iniciado, procedimento geral de funcionamento

umidade = print("1º - Medir a umidade do ar interna do forno")
temperatura = print("2º - Medir a temperatura externa do forno")
clima = input("Por favor, entre com o clima atual: ")

if clima == "Inverno":
    print("Iniciar desumidificação")

else:
    print("Proceder cocção")

print("Procedimentos para a Desumidificação: ")

#DESUMIDIFICAÇÃO

print("INICIANDO DESUMIDIFICAÇÃO")

umidadeDesumidificação = input("Medir a umidade interna do forno: ")

temperaturaInterna = input("Medir a temperatura interna do forno: ")

if umidadeDesumidificação == "15°C" and temperaturaInterna >= "40%":
    print("Acionar somente exaustor")

if umidadeDesumidificação < "15°C" and temperaturaInterna >= "40%":
    print ("Acionar aquecimento do forno e exaustor de ar")

elif umidadeDesumidificação < "5%":
    print("Desativar exaustor e o aquecimento do forno, caso esteja ligado")

else:
    print("Manter o aquecimento do forno até no máximo 100°C")

print("DESUMIDIFICAÇÃO CONCLUÍDA!")


#COCÇÃO

print("INICIANDO COCÇÃO!")

umidadeInterna = input("Medir a umidade interna do forno: ")

if umidadeInterna > "15%":
    print("Acionar exaustor!")


temperaturaInterna = input("Medir a temperatura interna do forno: ")

if temperaturaInterna < "200°C":
    print("Acionar aquecimento para a temperatura de 380°C")

elif umidadeInterna <= "5%":
    print("Desligar exaustor")

elif umidadeInterna <= "5%" and temperaturaInterna == "380°C":
    print("Inserir conteúdo para cocção e quando concluir pressionar botão pronto!")

print("Manter aquecimento a 380°C por três horas!")


print("Após 3 horas a cocção estará concluída e você pode desligar o aquecimento")

