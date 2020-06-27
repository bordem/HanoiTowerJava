import java.util.ArrayList;

public class Tour {
	private ArrayList<Disque> empilement;
	private String nom;
	
	public Tour(String nom,ArrayList<Disque> empilement) {
		this.empilement = empilement;
		this.nom=nom;
	}
	public Tour(String nom) {
		this.empilement = new ArrayList<Disque>();
		this.nom=nom;
	}
	public ArrayList<Disque> getEmpilement() {
		return empilement;
	}
	public void setEmpilement(ArrayList<Disque> empilement) {
		this.empilement = empilement;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	
}
