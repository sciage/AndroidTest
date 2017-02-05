package in.voiceme.projectprogress.dao;

import java.util.List;

import in.voiceme.projectprogress.dto.PlantDTO;

/**
 * Created by harish on 2/5/2017.
 */

public interface IPlantDAO {

    public List<PlantDTO> fetchPlants(String filter);
}
