class GuessGame{
Player p1;
Player p2;
Player p3;
public void startGame(){
	p1 = new Player();
    p2 = new Player();
    p3 = new Player();
boolean p1isRight=false;
boolean p2isRight=false;
boolean p3isRight=false;
int gp1 = 0;
int gp2 = 0;
int gp3 = 0;
while(true){
p1.guess();
p2.guess();
p3.guess();
           gp1 = p1.number;
		   System.out.println("Player one guessed " + gp1);

		   gp2 = p2.number;
		   System.out.println("Player two guessed " + gp2);

		   gp3 = p3.number;
		   System.out.println("Player three guessed " + gp3);
    int target = (int) (Math.random() *10);
if(gp1==target){
	p1isRight = true;
}
if(gp2==target){
    p2isRight = true;
}
if(gp3==target){
    p3isRight = true;
}
if (p1isRight || p2isRight || p3isRight) {
 System.out.println("We have a winner!");
 System.out.println("Player one got it right? " + p1isRight);
 System.out.println("Player two got it right? " + p2isRight);
 System.out.println("Player three got it right? " + p3isRight);
 System.out.println("Game is over.");
 break;
 } 
 else {
System.out.println("Players will have to try again.");}}}
 } 
