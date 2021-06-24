class TV{
	
	
	public static void television(){
		System.out.println("Television is an entertainment medium");
	}
	
	public static String television(String video){
		video = "Television displays video";
		//System.out.println(video);
		return video;
		
	}
		
	public static void main(String a[]){
		
		television();
		television("video");
		System.out.println("The " +TV.television("video")+ " and has audio");
	}
}