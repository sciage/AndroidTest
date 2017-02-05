package in.voiceme.projectprogress.UserInterface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;

import in.voiceme.projectprogress.R;
import in.voiceme.projectprogress.service.IPlantService;
import in.voiceme.projectprogress.service.PlantService;

public class SearchPlantsActivity extends AppCompatActivity {

    IPlantService plantService;
    private AutoCompleteTextView autoCompleteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_plants);
        plantService = new PlantService();
        autoCompleteText = (AutoCompleteTextView)findViewById(R.id.acPlantName);
    }

    public void searchPlant(View view) {
        plantService.filterPlants(autoCompleteText.getText().toString());
    }
}
