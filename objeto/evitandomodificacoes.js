//object.prevent extensions
const produto= Object.preventExtensions({
    nome:"qualquer",preco:1.99,tag:"promocao"
})
console.log("Extensivel:",Object.isExtensible(produto))
produto.nome="Borracha"
produto.descricao="borracha escolar branca"
delete produto.tag
console.log(produto)
//object.seal
const pessoa={nome:"juliana",idade:35}
Object.seal(pessoa)
console.log("selado",Object.seal(pessoa))