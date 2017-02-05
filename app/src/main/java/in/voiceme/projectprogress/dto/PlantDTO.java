package in.voiceme.projectprogress.dto;

/**
 * Created by harish on 2/5/2017.
 */

public class PlantDTO {

    private String name;
    private String genus;
    private String species;
    private String cultivar;
    private String common;
    private int guid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getCultivar() {
        return cultivar;
    }

    public void setCultivar(String cultivar) {
        this.cultivar = cultivar;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public int getGuid() {
        return guid;
    }

    public void setGuid(int guid) {
        this.guid = guid;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return genus + "  " + species + " " + cultivar + " " + common + " " + name;
    }
}
