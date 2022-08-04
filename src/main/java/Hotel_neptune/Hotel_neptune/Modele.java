package Hotel_neptune.Hotel_neptune;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Modele {

	private static Statement st;
	private static Connection bdd;
	private static ResultSet rs;
	private static PreparedStatement statement;
	
	public static boolean connexionBDD(String nombdd){
		try {
			bdd = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ nombdd + "?user=devk&password=Uberfit");
			st = bdd.createStatement();
			return true;
		}
		catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public static boolean connexionAdmin(String login, String mdp) {
		String rq = "SELECT count(*) FROM administrateur WHERE login = ? AND mdp = ?"; //requete préparé
		try {
			statement = bdd.prepareStatement(rq);
			statement.setString(1,login);
			statement.setString(2,mdp);
			
			rs = statement.executeQuery();
			rs.next();
			
			
			if(rs.getInt(1) == 1) {
				return true;
			}
			else {
				System.out.println("Erreur lors de la connexion");
				return false;
			}
		}
		catch (SQLException e){
			System.out.println(e);
			return false;
		}
	}
	
	public static boolean connexionClient(String email, String mdp) {
		String rq = "SELECT count(*) FROM client WHERE email = ? AND mdp = ?"; //requete préparé
		try {
			statement = bdd.prepareStatement(rq);
			statement.setString(1,email);
			statement.setString(2,mdp);
			
			rs = statement.executeQuery();
			rs.next();
			
			
			if(rs.getInt(1) == 1) {
				return true;
			}
			else {
				System.out.println("Erreur lors de la connexion");
				return false;
			}
		}
		catch (SQLException e){
			System.out.println(e);
			return false;
		}
	}
	
	public static ArrayList<Chambre> getChambres() {
		String sql = "SELECT id_chambre,descr, chemin_image, nb_place, prix, nom_categorie FROM chambre, categorie WHERE chambre.id_categorie = categorie.id_categorie;";
		ArrayList<Chambre> r = new ArrayList<Chambre>();
		
		try {
			rs = st.executeQuery(sql);
			while(rs.next()) {
				
				int i = rs.getInt("id_chambre");
				String d = rs.getString("descr");
				String c = rs.getString("chemin_image");
				int nb = rs.getInt("nb_place");
				int p = rs.getInt("prix");
				String cat = rs.getString("nom_categorie");
				
				r.add(new Chambre(i, d, nb, cat, p, c));
				
			}
			
			return r;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
}
