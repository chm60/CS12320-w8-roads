/**
 * @author Chris Machala
 * @email Chm60@aber.ac.uk
 * @version 1.1
 */

public class Application {

    public static void main(String[] args) {

        Settlement aberystwyth = new Settlement("Aberystwyth", SettlementType.T);
        aberystwyth.setPopulation(20000);


        Settlement bowStreet = new Settlement("Bow Street", SettlementType.V);
        bowStreet.setPopulation(2000);

        Settlement borth = new Settlement("Borth",SettlementType.V);
        borth.setPopulation(1500);

        Settlement llanbadarn = new Settlement("Llanbadarn",SettlementType.V);
        llanbadarn.setPopulation(3000);

        Settlement penparcau = new Settlement("Penparcau", SettlementType.V);
        penparcau.setPopulation(3100);


        Road A44 = new Road("A44", RoadType.A,aberystwyth,llanbadarn);
        A44.setSourceSettlement(aberystwyth);
        A44.setDestinationSettlement(llanbadarn);


        Road A4871 = new Road("A487", RoadType.A,aberystwyth,bowStreet);
        A4871.setSourceSettlement(aberystwyth);
        A4871.setDestinationSettlement(bowStreet);

        Road A4872 = new Road("A487", RoadType.A,aberystwyth,bowStreet);
        A4872.setSourceSettlement(aberystwyth);
        A4872.setDestinationSettlement(penparcau);


        Road HoelYBont = new Road("Hoel-Y-Bont", RoadType.U,llanbadarn,penparcau);
        HoelYBont.setSourceSettlement(llanbadarn);
        HoelYBont.setDestinationSettlement(penparcau);


        Road B4353 = new Road("B4353", RoadType.B,bowStreet,borth);
        B4353.setSourceSettlement(bowStreet);
        B4353.setDestinationSettlement(borth);

        System.out.println(aberystwyth.toString());
        System.out.println(A44.toString());




    }


}
