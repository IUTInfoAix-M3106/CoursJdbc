import java.sql.*;// Import de l'API
public class App {
	static final String req="SELECT ID, NAME FROM ARTIST";
	public static void main(String[] args){
		Connection conn = null;
		try {
			//Connexion a la BD
			conn=DriverManager.getConnection("url","user","pwd");
			//Creation d'une instruction
			Statement stmt = conn.createStatement();
			//Execution de la requete
			ResultSet rset = stmt.executeQuery(req);
			//Traitement des resultats
			while (rset.next())
				System.out.println(rset.getString("NAME"));
			stmt.close();//Liberation des ressources
		} catch (Exception e) {
			e.printStackTrace();//Arggg!!!
		} finally {
		  //Deconnexion de la base de donnees
			if (conn != null)
				conn.close();
		}
	}
}
