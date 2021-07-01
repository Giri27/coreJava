import java.util.Scanner;

class VishnuUtil{
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the birth date");
		String born = sc.nextLine();
		
		System.out.println("known for which movie");
		String knownFor = sc.nextLine();
		
		System.out.println("Enter the actor id");
		int actorId = sc.nextInt();
		
		System.out.println("Is actor still alive?");
		boolean isAlive = sc.nextBoolean();
		
		Vishnu vish = new Vishnu();
		vish.actorId = actorId;
		vish.isAlive = isAlive;
		vish.born = born;
		vish.knownFor = knownFor;
		vish.entertain();
		System.out.println(vish.actorId +", "+ vish.born +", "+ vish.isAlive +", "+vish.knownFor);
		
	}

}