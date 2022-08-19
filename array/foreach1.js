const aprovados=["agatha","aldo","daniel","raquel"]
aprovados.forEach(function(nome,indice,array){
    console.log(`${indice+1})${nome}`)
    console.log(array)

})
aprovados.forEach(nome=>console.log(nome))
const exibiraprovados=aprovado=>console.log(aprovado)
aprovados.forEach(exibiraprovados)
