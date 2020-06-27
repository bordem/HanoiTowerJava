public class main {
	public static void main (String[] args){
		jeu j = new jeu();
		long lStartTime = System.currentTimeMillis();

		j.resoudre();

        long lEndTime = System.currentTimeMillis();

        System.out.println("Temps: " + (lEndTime-lStartTime));
		
	}
}
