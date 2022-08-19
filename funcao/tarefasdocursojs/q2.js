function ladosdeumtriangulo(l1,l2,l3){
    if(l1==l2&&l2==l3&&l3==l1){
        console.log("triangulo equilatero");
    }
    else if(l1==l2||l2==l3||l3==l1){
         console.log("triangulo isosceles");
    }
else{
    console.log("escaleno");
}

}
ladosdeumtriangulo(1,90,5);