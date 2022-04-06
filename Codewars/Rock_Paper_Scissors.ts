//Rock Paper Scissors! 8kyu
//
//
export function rps(p1: string, p2: string): string{
  let playerWinner: string = "";
  if("rock" == p1){
    switch(p2){
      case "scissors": playerWinner = "Player 1 won!";
        break;
      case "paper": playerWinner = "Player 2 won!"; 
        break;
    }
  }
  if("scissors" == p1){
    switch(p2){
      case "rock": playerWinner = "Player 2 won!"; 
        break;
      case "paper": playerWinner = "Player 1 won!"; 
        break;
    }
  }
  if("paper" == p1){
    switch(p2){
      case "scissors": playerWinner = "Player 2 won!"; 
        break;
      case "rock": playerWinner = "Player 1 won!";
        break;
    }
  }
  if(p1 == p2){
    playerWinner = "Draw!"; 
  }
  
  
  console.log("P1 ",p1," P2 ",p2);
  return playerWinner;
}