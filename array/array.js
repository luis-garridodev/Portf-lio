console.log(typeof Array,typeof new Array,typeof []);
let aprovados= new Array("bia","carlos","ana");
console.log(aprovados)
aprovados=["bia","carlos","ana"]
console.log(aprovados[0])
console.log(aprovados[1])
console.log(aprovados[2])
console.log(aprovados[3])
aprovados[3]="paulo"
aprovados.push="aila"
console.log(aprovados.length)
aprovados[9]="julio"
console.log(aprovados.length)
console.log(aprovados[8]===undefined);
console.log(aprovados)
aprovados.sort()
console.log(aprovados)
delete aprovados[1]
console.log(aprovados[1])
console.log(aprovados[2])
aprovados=["ana","carlos","lacerda"]
aprovados.splice(1,2,"elemento1","elemento2")
console.log(aprovados)


