package areaquestion;

public class calculatecost {
    private final double costOfStandardMaterials = 1200;
    private final double costOfMediumMaterials = 1500;
    private final double costOfHighMaterials = 1800;
    private final double costOfHighMaterialsAndAutomation = 2500;

    public double getInterest(double area, String materialStandard, boolean automation) throws InvalidMaterialSelect {
        double getRespectiveCost = checkMaterial(materialStandard,automation);

        return area*getRespectiveCost;
    }

    private double checkMaterial(String materialStandard, boolean automation) throws InvalidMaterialSelect {
        if(materialStandard.toLowerCase().equals(standard_of_material.standardMaterials.toString().toLowerCase()))
            return costOfStandardMaterials;
        else if(materialStandard.toLowerCase().equals(standard_of_material.mediumStandardMaterials.toString().toLowerCase()))
            return costOfMediumMaterials;
        else {
            boolean material = materialStandard.toLowerCase().equals(standard_of_material.highStandardMaterials.toString().toLowerCase());
            if(material && !automation)
                return costOfHighMaterials;
            else if(material && automation)
                return costOfHighMaterialsAndAutomation;
        }

        throw new InvalidMaterialSelect();
    }
}
