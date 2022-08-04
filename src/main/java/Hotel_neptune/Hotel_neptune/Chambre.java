package Hotel_neptune.Hotel_neptune;

public class Chambre {

	private int id;
	private String description;
	private String chemin_image;
	private int nbPlace;
	private String categorie;
	private int prix;
	
	public Chambre(int id, String d, int place, String c, int p, String chemin) {
		this.id = id;
		this.description = d;
		this.nbPlace = place;
		this.categorie = c;
		this.prix = p;
		this.chemin_image = chemin;
	}
	
	public String getChemin_image() {
		return chemin_image;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public int getNbPlace() {
		return nbPlace;
	}

	public String getCategorie() {
		return categorie;
	}

	public int getPrix() {
		return prix;
	}
	
}
