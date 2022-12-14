public class keyGenerator {
	public static void main(String[] args) {
		char[] key = new char[12];
		byte option = -1;
		int n = -1;
		char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for (int i=0; i < 12; i++) 
		{
			option = (byte)(3*Math.random());
			switch(option) 
			{
				case 0: n = (int)(10*Math.random()); 
						key[i] = numbers[n];
						break;
			    case 1: n = (int)(25*Math.random());
						key[i] = letters[n];
						break;
				case 2: n = (int)(25*Math.random());
						key[i] = Character.toUpperCase(letters[n]);
						break;						
			}			
		} 
		System.out.println("Clave generada:\t");
		for (int i=0; i < 12; i++) 
			System.out.print(key[i]);		
	}
}