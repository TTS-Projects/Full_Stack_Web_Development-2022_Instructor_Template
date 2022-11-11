//challenge 2

//define a array
let hands = ['rock','paper','scissors'];
//function to grab a random hand
function getComputerHand(){
    // wants you to hands[0], hands[1], or hands[2]
    let number = parseInt((Math.random()*10) % 3)
    return number
}
//compare function
function compare(choice1, choice2, hands){
    if(choice1 > choice2){
        console.log()
    }

    console.log(winner + " with choice " + hands[winner] + "has won!")
}


console.log(getComputerHand(hands))

let miguel = getComputerHand();// 0,1,2
let haley = getComputerHand(); //0,1,2

compare(miguel, haley, hands);




//player 1

let player = function getComputerHand(){
    let number = parseInt((Math.random()*10) % 3)
    return hands[number];
}