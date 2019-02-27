package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//createTableColis();
		createTableNatureColis();
		ajoutNatureColis("chirurgical", 12365, 910.0, 122.3, 154.6);
	
	
	}
	
	
	
	public static void ajoutNatureColis(String nature_colis, int numero_colis, double volume, double cote, double poids) throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO naturecolis(nature_colis, numero_colis, volume, cote, poids) VALUES('"+nature_colis+"','"+numero_colis+"','"+volume+"','"+cote+"','"+poids+"')");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Inserted completed.");
		}
	}
	
	public static void createTableNatureColis() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS naturecolis(id int NOT NULL AUTO_INCREMENT, nature_colis varchar(255), numero_colis int, volume double, cote double, poids double, PRIMARY KEY(id))");
			create.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function complete.");};
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ajoutColis(String designation, String precision2, double valeur_HT) throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO colis(designation, precision2, valeur_HT) VALUES('"+designation+"','"+precision2+"','"+valeur_HT+"')");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Inserted completed.");
		}
	}
	
	public static void createTableColis() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS colis(id int NOT NULL AUTO_INCREMENT, designation varchar(255), precision2 varchar(255), valeur_HT double, PRIMARY KEY(id))");
			create.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function complete.");};
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ajoutPatient(String nom, String prenom, String diagnostic, int idmission) throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO patients(nom, prenom, diagnostic, idmission) VALUES('"+nom+"','"+prenom+"','"+diagnostic+"','"+idmission+"')");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Inserted completed.");
		}
	}
	
	public static void createTablePatients() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS patients(id int NOT NULL AUTO_INCREMENT, nom varchar(255), prenom varchar(255), diagnostic varchar(255), idmission int, PRIMARY KEY(id))");
			create.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function complete.");};
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ajoutMateriel(String nom, int quantite, int reference) throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO materiel(nom, quantite, reference) VALUES('"+nom+"','"+quantite+"','"+reference+"')");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Inserted completed.");
		}
	}
	
	public static void createTableMateriel() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS materiel(id int NOT NULL AUTO_INCREMENT, nom varchar(255), quantite int, reference int, PRIMARY KEY(id))");
			create.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function complete.");};
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ajoutCompartiment(int numero, double taille, int idavion, int temperature) throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO compartiments(numero, taille, idavion, temperature) VALUES('"+numero+"','"+taille+"','"+idavion+"','"+temperature+"')");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Inserted completed.");
		}
	}
	
	public static void createTableCompartiments() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS compartiments(id int NOT NULL AUTO_INCREMENT, numero int, taille double, idavion int, temperature int, PRIMARY KEY(id))");
			create.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function complete.");};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ajoutAvion(String nom, double chargement_max, double taille_porte, double volume_utilisable, double place_chargement, double exigence_piste, double vitesse_croisiere, double carburant_necessaire, boolean permission_pays, int idmission) throws Exception{
		try {
			int permission = (permission_pays == true) ? 1 : 0;
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO avions(nom, chargement_max, taille_porte, volume_utilisable, place_chargement, exigence_piste, vitesse_croisiere, carburant_necessaire, permission_pays, idmission) VALUES('"+nom+"','"+chargement_max+"','"+taille_porte+"','"+volume_utilisable+"','"+place_chargement+"','"+exigence_piste+"','"+vitesse_croisiere+"','"+carburant_necessaire+"','"+permission+"','"+idmission+"')");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Inserted completed.");
		}
	}
	
	public static void createTableAvions() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS avions(id int NOT NULL AUTO_INCREMENT, nom varchar(255), chargement_max double, taille_porte double, volume_utilisable double, place_chargement double, exigence_piste double, vitesse_croisiere double, carburant_necessaire double, permission_pays int,  idmission int, PRIMARY KEY(id))");
			create.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function complete.");};
	}
	
	
	
	
	
	public static void ajoutMission(String nom, String type, int idgroupepersonnel) throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO missions(nom, type, idgroupepersonnel) VALUES('"+nom+"','"+type+"','"+idgroupepersonnel+"')");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Inserted completed.");
		}
	}
	
	public static void createTableMissions() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS missions(id int NOT NULL AUTO_INCREMENT, nom varchar(255), type varchar(255), idgroupepersonnel int, PRIMARY KEY(id))");
			create.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function complete.");};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ajoutRespo(String nom, String prenom, int idmission) throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO respos(nom, prenom, idmission) VALUES('"+nom+"','"+prenom+"','"+idmission+"')");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Inserted completed.");
		}
	}
	
	public static void createTableRespos() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS respos(id int NOT NULL AUTO_INCREMENT, nom varchar(255), prenom varchar(255), idmission int, PRIMARY KEY(id))");
			create.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function complete.");};
	}
	
	
	
	
	
	
	
	public static void ajoutMedicament(String nom, String type, String DLU) throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO medicaments(nom, type, DLU) VALUES('"+nom+"','"+type+"','"+DLU+"')");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Inserted completed.");
		}
	}
	
	public static void createTableMedicaments() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS medicaments(id int NOT NULL AUTO_INCREMENT, nom varchar(255), type varchar(255), DLU varchar(255), PRIMARY KEY(id))");
			create.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function complete.");};
	}
	
	
	
	
	
	
	public static void ajoutPersonnel(String nom, String prenom, String type) throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO personnel(nom, prenom, type) VALUES('"+nom+"','"+prenom+"','"+type+"')");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Inserted completed.");
		}
	}
	
	public static void createTablePersonnel() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS personnel(id int NOT NULL AUTO_INCREMENT, nom varchar(255), prenom varchar(255), type varchar(255), PRIMARY KEY(id))");
			create.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function complete.");};
	}
	
	
	
	
	
	
	
	
	public static void post() throws Exception{
		final String var1 = "Huan";
		final String var2 = "Lé";
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO personnel(first, last) VALUES('"+var1+"','"+var2+"')");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Inserted completed.");
		}
	}
	
	
	public static void createTable() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS personnel(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id))");
			create.executeUpdate();
			
			
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function complete.");};
	}
	
	
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/escrim?serverTimezone=UTC";
			String username = "root";
			String password = "";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;
			
		} catch(Exception e) {System.out.println(e);}
		
		return null;
	}

}
