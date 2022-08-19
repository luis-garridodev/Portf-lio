//par nome valor
const saudacao="ola";//contexto lexico
function exec(){
    const saudacao="falaaa";//contexto lexico 2
    return saudacao
}
//objetos são grupos aninhados de pares/valor
const cliente={
nome:"luis",
idade:23,
peso:87.5,
endereco:{

    logradouro:"rua que certamente não existe",
    numero:123
}







}
console.log(saudacao);
console.log(exec());
console.log(cliente);
