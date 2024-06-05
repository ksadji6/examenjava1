package services;

import java.util.List;

import repositories.ModuleRepository;

public class ModuleService {
    ModuleRepository moduleRepository=new ModuleRepository();
    public void ajouterModule(entities.Module module){
        moduleRepository.insert(module);
    }
    
    public List<entities.Module> listerModules(){
        return moduleRepository.selectAllModules();
    }
}
