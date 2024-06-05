import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import entities.Cours;
import entities.Professeur;
import services.ModuleService;

public class App {
    public static void main(String[] args) throws Exception {
        ModuleService moduleService= new ModuleService();
       int choix;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1-Ajouter un module");
            System.out.println("2-Lister les modules"); 
            System.out.println("3-Créer un cours"); 
            System.out.println("4-Lister tous les cours");
            System.out.println("5-Lister les cours d'un module et d'un professeur");
            System.out.println("6-Quitter");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                System.out.println("Veuillez renseigner le nom du module à ajouter!!");
                String nom=sc.nextLine();
                entities.Module module=new entities.Module();
                module.setNomModule(nom);
                moduleService.ajouterModule(module);
                    
                    break;
                case 2:
                System.out.println("Voici les différents modules");
                List<entities.Module> modules=  moduleService.listerModules();
                            for (entities.Module mo: modules) {
                                System.out.println("ID Module "+ mo.getIdModule() );
                                System.out.println("Nom Module "+ mo.getNomModule());
                                System.out.println("=================================");
                        }
                    
                    break;
                case 3:
                Cours cours=new Cours();
                System.out.println("Entrez la date du cours (AAAA-MM-JJ)");
                cours.setDate(LocalDate.parse(sc.nextLine()));
                System.out.println("Entrez l'heure de début du cours (AAAA-MM-JJ)");
                cours.setHeureDb(LocalTime.parse(sc.nextLine()));
                System.out.println("Entrez l'heure de fin du cours (AAAA-MM-JJ)");
                cours.setHeureFin(LocalTime.parse(sc.nextLine()));
                System.out.println("Veuillez choisir un module");
                modules=moduleService.listerModules();
                for(entities.Module mo : modules){
                    System.out.println("Le nom du module est: ");
                    System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
                }
            
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            
                default:
                    break;
            }
        } while (choix!=6);
    }
}
