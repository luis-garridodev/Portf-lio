const obj1={}
console.log(obj1)
//object em JS
console.log(typeof Object,typeof new Object)
const obj2=new Object 
console.log(obj2)
//funcao factory
function criarfuncionario(nome,salariobase,faltas){
    return{
        nome,
        salariobase,
        faltas,
        getsalario(){
            return (salariobase/30)*(30-faltas)
        }
    }
}
