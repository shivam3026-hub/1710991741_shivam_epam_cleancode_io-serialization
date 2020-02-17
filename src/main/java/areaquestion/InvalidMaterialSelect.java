package areaquestion;

public class InvalidMaterialSelect extends Exception {

    public InvalidMaterialSelect(){
        super("please select the valid material.We have provided you with the list in the beginning");
    }
}
