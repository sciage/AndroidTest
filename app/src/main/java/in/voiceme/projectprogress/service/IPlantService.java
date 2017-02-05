package in.voiceme.projectprogress.service;

import java.util.List;

import in.voiceme.projectprogress.dto.PlantDTO;

/**
 * Created by harish on 2/5/2017.
 */

public interface IPlantService {

    public List<PlantDTO> filterPlants(String filter);
}
