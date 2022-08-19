//função sem retorno
function imprimirsoma(a,b)//o javascript deixa ser passado qualquer dado
{
console.log(a+b);




}
imprimirsoma(2,3);
imprimirsoma(2);//passando somente 1
imprimirsoma(2,3,5,8,10,100);//passando mais de 2
imprimirsoma();//função vazia
//função com retorno
function soma(a,b=0){
    return a+b;
}
console.log(soma(2,3));
console.log(soma(2));
