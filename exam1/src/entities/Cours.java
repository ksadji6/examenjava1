package entities;
import java.time.LocalDate;
import java.time.LocalTime;

public class Cours {
    private int idCours;
    private LocalDate date;
    private LocalTime heureDb;
    private LocalTime heureFin;
    Professeur professeur;
    Module module;
    public Cours() {
    }
    public int getIdCours() {
        return idCours;
    }
    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalTime getHeureDb() {
        return heureDb;
    }
    public void setHeureDb(LocalTime heureDb) {
        this.heureDb = heureDb;
    }
    public LocalTime getHeureFin() {
        return heureFin;
    }
    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }
    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    public Module getModule() {
        return module;
    }
    public void setModule(Module module) {
        this.module = module;
    }
    
    
}
