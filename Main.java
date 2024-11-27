public class Main{
	public static void main (String[] args){
		System.out.println("Hola mundo");

		if(ags.length() == 0){
			System.out.println("No hay argumentos");
		}
		else
			System.out.println("Hay " + args.length() + " argumentos");
		}
		for(int i = 0; i < args.length; i++){
			System.out.println("Argumento " + i + ": " + args[i]);
		}
	}
}
