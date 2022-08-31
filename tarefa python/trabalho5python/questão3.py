estado1=input("digite a sigla: ")
estado2=input("digite a sigla: ")
estado3=input("digite a sigla: ")
estado1.upper()
estado2.upper()
estado3.upper()
comparador=print("RJ")
comparador2=print("MG")
comparador3=print("SP")
if(estado1==comparador):
 print("carioca")
elif(estado2==comparador2):
    print("mineiro")
elif(estado3==comparador3):
    print("paulista")
else:
    print("outro estado")