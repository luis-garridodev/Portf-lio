//novo recurso do ES2015
const pessoa={
nome:"luis",
idade:23,
endereco:{
logradouro:"rua seila",
numero:2011

}

}
const {nome,idade}=pessoa;
console.log(nome,idade);
const {nome:n,idade:i}=pessoa;
const{sobrenome,bemhumorado=true}=pessoa;
const{endereco:{logradouro,numero,cep}}=pessoa
