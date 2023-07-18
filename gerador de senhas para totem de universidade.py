from queue import Queue

# Inicializa a fila vazia
fila_senhas = Queue()

# Gera as senhas e adiciona à fila
for i in range(1, 500):
    senha = f"AT{i:03}"
    fila_senhas.put(senha)

# Mostra as senhas geradas
print("Senhas geradas:")
while not fila_senhas.empty():
    print(fila_senhas.get())
