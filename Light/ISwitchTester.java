import java.util.*;
class ISwitchTester{

	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the light");
		String input = sc.next();
		
		//consumer logic or user defined logic
		ISwitch light = LightFactory.getLight(input);
		if(light != null){
			light.switchOn();
			light.switchOff();
		}
	}
}