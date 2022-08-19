const pilotos=["vettel","alonso","raikonnen","massa"]
pilotos.pop()//retira o ultimo elemento
console.log(pilotos)
pilotos.push("verstappen")
console.log(pilotos)
pilotos.shift()//remove o primeiro
console.log(pilotos)
pilotos.unshift("hamilton")

//splice pode adicionar e remover elementos
//adicionar
pilotos.splice(2,0,"bottas","massa")
console.log(pilotos)
//remover
pilotos.splice(3,1)//massa saiu dnv
console.log(pilotos)
const algunspilotos1=pilotos.slice(2)//slice adiciona um novo array
console.log(algunspilotos1)
const algunspilotos2=pilotos.slice(1,4)
console.log(algunspilotos2)
