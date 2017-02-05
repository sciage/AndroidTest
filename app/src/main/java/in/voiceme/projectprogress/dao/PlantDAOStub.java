package in.voiceme.projectprogress.dao;

import java.util.List;

import in.voiceme.projectprogress.dto.PlantDTO;

/**
 * Created by harish on 2/5/2017.
 */

public class PlantDAOStub implements IPlantDAO {

    // This class sends dummy data to the Service layer which then interacts with the activity

    @Override
    public List<PlantDTO> fetchPlants(String filter) {
        return null;
    }
}
