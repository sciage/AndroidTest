package in.voiceme.projectprogress.service;

import java.util.List;

import in.voiceme.projectprogress.dao.IPlantDAO;
import in.voiceme.projectprogress.dao.PlantJsonDao;
import in.voiceme.projectprogress.dto.PlantDTO;

/**
 * Created by harish on 2/5/2017.
 */

public class PlantService implements IPlantService {

    IPlantDAO plantDAO;

    // Add Inject Dependencies here. It allows to extend our application in future
    public PlantService(){
        plantDAO = new PlantJsonDao();
    }

    @Override
    public List<PlantDTO> filterPlants(String filter) {
        return plantDAO.fetchPlants(filter);
    }
}
