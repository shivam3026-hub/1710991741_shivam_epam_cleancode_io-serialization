package areaquestion;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
   private static Scanner io=new Scanner(System.in);
    public static void main( String[] args )
    {

        double area;
        String material;
        boolean automated = false;

        System.out.println("Enter area : ");
        area = io.nextDouble();

        System.out.println("Choose Material : ");
        material = getMaterialType();

        if(material.toLowerCase().equals(standard_of_material.highStandardMaterials.toString().toLowerCase())){
            System.out.println("Select automation (true/false) : ");
            automated = io.nextBoolean();
        }

        calculatecost calculatecost = new calculatecost();
        try{
            System.out.println(calculatecost.getInterest(area,material,automated));
        }
        catch (InvalidMaterialSelect e){
            System.err.println(e);
        }

        io.close();
    }

    private static String getMaterialType(){
        standard_of_material[] standards = standard_of_material.values();
        for(standard_of_material s: standards){
            System.out.println("Type '" + s + "' for " + s);
        }
        System.out.println("Input : ");
        String material = io.next();

        return material;
    }
}
