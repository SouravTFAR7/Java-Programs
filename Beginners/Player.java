import java.util.Scanner;
class Player{
Scanner scn = new Scanner(System.in);
int number;

public int guess(){
	System.out.println("ENTER YOUR Guess:");
 number = scn.nextInt();
 return number;
}}