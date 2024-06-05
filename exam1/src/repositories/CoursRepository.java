package repositories;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Client;

import entities.Cours;
import entities.Professeur;
import entities.Module;

public class CoursRepository extends Database {
    private final  String SQL_SELECT_ALL="SELECT * FROM cours;" ;
    //private final  String SQL_SELECT_BY_TEL="Select * from client where tel_client like ? " ;
    private final  String SQL_INSERT="INSERT INTO cours (id_cours,date_cours,heure_db,heure_fin,id_prof,id_module)  VALUES (?,?,?,?,?,?)";
    public void insert(Cours cours){
        try {
          openConnexion();
          initPreparedStatement(SQL_INSERT);
          statement.setDate(2, Date.valueOf(cours.getDate()));
          statement.setTime(3, Time.valueOf(cours.getHeureDb()));
          statement.setTime(4, Time.valueOf(cours.getHeureFin()));
          statement.setInt(4, cours.getModule().getIdModule());
          statement.setInt(5, cours.getProfesseur().getIdProf());
          executeUpdate();
        } 
         catch (SQLException e) {
            
          System.out.println("Erreur de Connexion a la BD");
        }
        }
        public List<Cours> selectAllCours(){
    List<Cours> courss=new ArrayList<>();
     try {
       openConnexion();
       initPreparedStatement(SQL_SELECT_ALL);
       ResultSet rs= executeSelect();
       while (rs.next()) {

           Professeur professeur=new Professeur();
           professeur.setIdProf(rs.getInt("id_prof"));
           professeur.setNomProf(rs.getString("nom_prof"));
           professeur.setTel(rs.getString("tel"));

           Module module=new Module();
           module.setIdModule(rs.getInt("id_module"));
           module.setNomModule(rs.getString("nom_module"));
           Cours co=new Cours();
           co.setIdCours(rs.getInt("id_cours"));
           co.setDate(rs.getDate("date_cours").toLocalDate());
           co.setHeureDb(rs.getTime("heure_db").toLocalTime());
           co.setHeureFin(rs.getTime("heure_fin").toLocalTime());
           co.setProfesseur(professeur);
           co.setModule(module);
           courss.add(co);
       }
       statement.close();
       rs.close();
       conn.close();
  } 
  catch (SQLException e) {
    System.out.println("Erreur de Connexion a la BD");
  }
  return  courss;
 }
    
}
