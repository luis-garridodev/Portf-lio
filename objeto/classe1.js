class lancamento{
    constructor(nome="generico",valor=0){
        this.nome=nome
        this.valor=valor

    }
}
class ciclofinanceiro{
    constructor(mes,ano){
        this.mes=mes
        this.ano=ano
        this.lancamentos=[]
    }
    addlancamentos(...lancamentos){
lancamentos.forEach(l=>this.lancamentos.push(l))

    }
    sumario(){
        let valorconsolidado=0
        this.lancamentos.forEach(l=>{valorconsolidado+=l.valor
    })
    return valorconsolidado
}
}
const salario=new lancamento("salario",45000)
const contadeluz= new lancamento("luz",-220)
const contas=new ciclofinanceiro(6,2018)
contas.addlancamentos(salario,contadeluz)
console.log(contas.sumario())
