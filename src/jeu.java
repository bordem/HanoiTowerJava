import java.util.ArrayList;

public class jeu {
	
	private int NBDISQUE=5;
	private int NBTOUR=3;
	
	private ArrayList<Disque> empilementDepart = new ArrayList();
	private ArrayList<Tour> tours = new ArrayList();
	
	
	public jeu() {
		for(int i=0;i<NBDISQUE;i++) {
			Disque d1 = new Disque(i+1);
			empilementDepart.add(d1);
		}
		for(int i=0;i<NBTOUR;i++) {
			Tour t1 = new Tour("t"+i);
			tours.add(t1);
		}
		tours.get(0).setEmpilement(empilementDepart);
	}
	
	public void affiche() {
		for(int i=0;i<tours.size();i++) {
			System.out.print(tours.get(i).getNom()+" : ");
			for(int j=0;j<tours.get(i).getEmpilement().size();j++) {
				System.out.print(tours.get(i).getEmpilement().get(j).getTaille());
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void bougeDisque(Tour t1,Tour t2) {
		if(t1.getEmpilement().size()!=0) {
			if(t2.getEmpilement().size()!=0) {
				if(t1.getEmpilement().get(0).getTaille()<t2.getEmpilement().get(0).getTaille()) {
					Disque d1 = t1.getEmpilement().get(0);
					t1.getEmpilement().remove(0);
					t2.getEmpilement().add(0, d1);
				}
			}else {
				Disque d1 = t1.getEmpilement().get(0);
				t1.getEmpilement().remove(0);
				t2.getEmpilement().add(0, d1);
			}
		}
	}
	public void deplaceAuHasard() {
		int alea1 = 0 + (int)(Math.random() * ((NBTOUR- 0) ));
		int alea2 = 0 + (int)(Math.random() * ((NBTOUR- 0) ));
		if(alea1 != alea2) {
			bougeDisque(tours.get(alea1), tours.get(alea2));
		}
	}
	public boolean resolu(){
		if(tours.get(tours.size()-1).getEmpilement().size()==NBDISQUE)
			return true;	
		return false;
	}
	public void resoudre() {
		while(resolu()==false) {
			deplaceAuHasard();
			affiche();
		}
	}
}
