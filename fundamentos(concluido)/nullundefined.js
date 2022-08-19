let valor;//não inicializada
console.log(valor);
valor=null;//ausencia de valor
console.log(valor);
const produto={}
console.log(produto.preco);
console.log(produto);
produto.preco=undefined;//evite atribur undefined
console.log(produto);
produto.preco=null;
console.log(!!produto.preco);
console.log(produto);

