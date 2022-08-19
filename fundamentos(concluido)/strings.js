const pgweb="renato8";
console.log(pgweb.charAt(4));//indica a letra que fica na quarta posição
console.log(pgweb.charAt(10));//mostra uma posição inexistente,logo com retorno 0
console.log(pgweb.charCodeAt(6));//retorna o numero em tabela ascii
console.log(pgweb.indexOf(8));//procura o indice associado 
console.log(pgweb.substring(1));//irá imprimir do "e" pra frente
console.log(pgweb.substring(1,4));//imprime da posição 1 a 4
console.log(pgweb.concat(pgweb).concat("!"));//adiciona uma exclamação a string
console.log(pgweb.replace(/\w/g ,"e"));//substitui as letras por e


