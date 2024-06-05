package services;

import java.util.List;

import entities.Professeur;
import repositories.ProfesseurRepository;

public class ProfesseurService {
    ProfesseurRepository professeurRepository=new ProfesseurRepository();
    
    
    public  List<Professeur>listerProfesseurs(){
        return professeurRepository.selectAllProfesseurs();
    }
    
}
