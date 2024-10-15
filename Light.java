//compute distance light travels using long variables

class Light{
	public static void main(String[] args){

		int lightspeed;
		long days;
		long seconds;
		long distance;

		//aproximate speed of light in miles per second

		lightspeed=186000;
		days=1000;
		seconds=days*24*3600;
		distance=lightspeed*seconds;

		System.out.println("In "+days);
		System.out.println("days light will travel about");
		System.out.println(distance +"miles");


	}
}