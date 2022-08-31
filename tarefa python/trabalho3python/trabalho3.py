Python 3.10.4 (tags/v3.10.4:9d38120, Mar 23 2022, 23:13:41) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
#questao1
listadepessoas=["mãe","tio","namorada"]
print("lista de pessoas próximas: ",listadepessoas)
lista de pessoas próximas:  ['mãe', 'tio', 'namorada']
#questão2
feiradafruta=["maçã","melão","melancia"]
docinhos=["beijinho","brigadeiro","chocolatedecolher"]
feijoada=["feijão","sazon","calabresa"]
import itertools
tudo=list(itertools.chain(feiradafruta,docinhos,feijoada))
print(tudo)
['maçã', 'melão', 'melancia', 'beijinho', 'brigadeiro', 'chocolatedecolher', 'feijão', 'sazon', 'calabresa']
print(tudo[4])
brigadeiro
docinhos.append(3)
docinhos
['beijinho', 'brigadeiro', 'chocolatedecolher', 3]
docinhos.remove(3)
docinhos
['beijinho', 'brigadeiro', 'chocolatedecolher']
docinhos.append("brigadeiroextra")
docinhos
['beijinho', 'brigadeiro', 'chocolatedecolher', 'brigadeiroextra']
tudo.append("refrigerante","redbull","monster")
Traceback (most recent call last):
  File "<pyshell#17>", line 1, in <module>
    tudo.append("refrigerante","redbull","monster")
TypeError: list.append() takes exactly one argument (3 given)
tudo.append("refrigerante")
tudo.append("redbull")
tudo.append("monster")
tudo
['maçã', 'melão', 'melancia', 'beijinho', 'brigadeiro', 'chocolatedecolher', 'feijão', 'sazon', 'calabresa', 'refrigerante', 'redbull', 'monster']
tudo.clear()
tudo
[]
#questão4
listadecompras=["sorvete","sorvetemorango","sabão","esponja"]
