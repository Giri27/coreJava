class LightFactory{
	
	//Object creation logic
	public static ISwitch getLight(String input){
		
		if(input.equalsIgnoreCase("TubeLight")){
			TubeLightImpl tubelight = new TubeLightImpl();
			return tubelight;
			//return new TubeLightImpl();
		}else if(input.equalsIgnoreCase("CflBulb")){
			return new CflBulbImpl();
		}else{
			System.out.println("No light found");
		}
		return null;
	}
}