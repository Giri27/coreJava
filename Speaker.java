class Speaker{
	
	static String brandName = "Boat";
	static String color = "Black";
	static int minVolumeLevel = 3;
	static int currentVolume = 0;
	static int maxVolumeLevel = 6;
	static boolean isConnected;
	
	public static void onOrOff(){
		
		System.out.println("Inside Speaker");
		if(isConnected == false){
				
			isConnected = true;
			System.out.println("Speaker is turned on..");
		}
		else if(isConnected == true){
			
			isConnected = false;
		}
		
	}
	
	public static int increaseVolume(){
		
		if(isConnected == true){
			if(currentVolume < maxVolumeLevel){
				currentVolume = currentVolume+1;
				System.out.println("The current volume :" +currentVolume);
			}
			else{
				System.out.println("Maximum volume reached..");
			}
		}else{
			System.out.println("Speaker is turned off..");
		}
		return currentVolume;
	}
	
	public static int decreaseVolume(){
		
		if(isConnected == true){
			if(currentVolume > minVolumeLevel){
				currentVolume = currentVolume - 1;
				System.out.println("The current volume :" +currentVolume);
			}
			else{
				System.out.println("Minimum level reached..");
			}
		}else{
			System.out.println("Speaker is turned off..");
		}
		return currentVolume;
		
	}
		
	public static void main(String a[]){
		
		onOrOff();
		int vol = increaseVolume();
		System.out.println(vol);
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		decreaseVolume();
		int volume = decreaseVolume();
		System.out.println(volume);
		decreaseVolume();
		decreaseVolume();
				
	}

}