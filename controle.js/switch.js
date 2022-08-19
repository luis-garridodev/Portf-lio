const imprimirresultado=function(nota){
switch(Math.floor(nota)){
    case 10:
        case 9:
            console.log("quadro de honra")
            break;
            case 8: case 7:
                console.log("aprovado")
                break;
                case 5: case 4: case 3:
                    console.log("recuperacao")
                    break
                    case 2: case 1: case 0:
                        console.log("reprovado")
                        break;
                        default:
                            console.log("invalido")
                            break;
}


}
imprimirresultado(10);