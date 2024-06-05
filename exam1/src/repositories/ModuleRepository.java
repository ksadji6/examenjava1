package repositories;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entities.Module;


public class ModuleRepository extends Database {
    private final  String SQL_SELECT_ALL="SELECT * FROM module;" ;
    private final  String SQL_INSERT="INSERT INTO module (nom_module)  VALUES (?)";
    public void insert(Module module){
    try {
       openConnexion();
       initPreparedStatement(SQL_INSERT);
        statement.setString(1,module.getNomModule());
        statement.executeUpdate();
        statement.close();
        closeConnexion();
 }
catch (SQLException e) {
   System.out.println("Erreur de Connexion a la BD");
}

 }

 public List<Module> selectAllModules(){
    List<Module> modules=new ArrayList<>();
     try {
       openConnexion();
       initPreparedStatement(SQL_SELECT_ALL);
       ResultSet rs= executeSelect();
       while (rs.next()) {

           Module module=new Module();
           module.setIdModule(rs.getInt("id_module"));
           module.setNomModule(rs.getString("nom_module"));
           modules.add(module);
       }
       statement.close();
       rs.close();
       conn.close();
  } 
  catch (SQLException e) {
    System.out.println("Erreur de Connexion a la BD");
  }
  return  modules;
 }
    
}
