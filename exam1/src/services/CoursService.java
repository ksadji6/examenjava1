package services;

import entities.Cours;
import repositories.CoursRepository;

public class CoursService {
    CoursRepository coursRepository= new CoursRepository();
    public void ajouterCours(Cours cours){
        coursRepository.insert(cours);
    }
    
}
