nome=input("digite o nome: ")
nome.lower()
idade=int(input("digite a idade: "))
sexo=input("digite o sexo: ")
validacao=print("feminino")
if(idade<=25 and sexo!=validacao):
    print("ACEITA")
else:
    print("NÃO ACEITA")