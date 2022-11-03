//Part 1 example 1

function gratuity(billAmountArg){
    return (billAmount*0.2);
}
function totalWithGrat(amountArg){
    return (gratuity(amountArg)+ amountArg);

}


//client-side
let billAmount = 666;
console.log("your total including gratuity is: "+ totalWithGrat(billAmount)); // totalWithGrat(billAmount);
