//cadeia de prototipos(prototype chain)
Object.prototype.attr0="0"
const avo={attr1:"A"}
const pai={__proto__:avo,attr2:"8",attr3:"3"}
const filho={__proto__:pai,attr3:"C"}
console.log(filho.attr0,filho.attr1,filho.attr2,filho.attr3)
const carro={
    velAtual:0,
    velMax:200,
    acelerarmais(delta){
        if(this.velAtual+delta<=this.velMax){
            this.velAtual+=delta
        }
        else{
            this.velAtual=this.velMax
        }
    },status(){
        return `${this.modelo}: ${super.status()}`
    }

}
Object.setPrototypeOf(ferrari,carro)
Object.setPrototypeOf(volvo,carro)
console.log(ferrari)
console.log(volvo)
volvo.acelerarmais(100)
console.log(volvo.status())