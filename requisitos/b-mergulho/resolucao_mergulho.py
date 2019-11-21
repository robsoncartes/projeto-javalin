
mr = input("Por favor entre com as quantidades de mergulhadores e regressados: ")

mr = mr.split(" ")

if len(mr) == 2:

    quem = input("Quais foram os mergulhadores que retornaram? ")

    mergulhadores = range(1, int(mr[0]) + 1)
    retornados = quem.split(" ")

    resultado = ""

    for m in mergulhadores:
        if not str(m) in retornados:
            resultado = resultado + str(m) + " "

    if resultado == "":
        resultado = "*"

    print ("Os Mergulhadores que retornaram foram :",resultado)
else:
    print ("Prencha as duas informacoes")
    
