
public class PhraseOMatic {
 public static void main (String[] args) {
 String[] wordListOne = {"agnostic", "opinionated",
"voice activated", "haptically driven", "extensible",
"reactive", "agent based", "functional", "AI enabled",
"strongly typed"};
 String[] wordListTwo = {"loosely coupled", "six sigma",
"asynchronous", "event driven", "pub-sub", "IoT", "cloud",
"native", "service oriented", "containerized", "serverless",
"microservices", "distributed ledger"};
 String[] wordListThree = {"framework", "library",
"DSL", "REST API", "repository", "pipeline", "service",
"mesh", "architecture", "perspective", "design",
 "orientation"};
 java.util.Random randomGenerator = new java.util.Random();
int one = wordListOne.length;
int two = wordListTwo.length;
int three = wordListThree.length;

int rand1= randomGenerator.nextInt(one);
int rand2= randomGenerator.nextInt(two);
int rand3= randomGenerator.nextInt(three);
System.out.println( " New Phrase:" + wordListOne[rand1]+" "+ wordListTwo[rand2] +" "+ wordListThree[rand3]);}}
