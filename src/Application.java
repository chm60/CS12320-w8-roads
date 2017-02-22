/**
 * @author Chris Machala
 * @email Chm60@aber.ac.uk
 * @version 1.1
 */

public class Application {

    public static void main(String[] args) {

        Settlement aberystwyth = new Settlement("Aberystwyth", SettlementType.TOWN);
        aberystwyth.setPopulation(20000);


        Settlement bowStreet = new Settlement("Bow Street", SettlementType.VILLAGE);
        bowStreet.setPopulation(2000);

        Settlement borth = new Settlement("Borth",SettlementType.VILLAGE);
        borth.setPopulation(1500);

        Settlement llanbadarn = new Settlement("Llanbadarn",SettlementType.VILLAGE);
        llanbadarn.setPopulation(3000);

        Settlement penparcau = new Settlement("Penparcau", SettlementType.VILLAGE);
        penparcau.setPopulation(3100);


        Road A44 = new Road("A44", RoadType.A,aberystwyth,llanbadarn);
        Road A4871 = new Road("A487", RoadType.A,aberystwyth,bowStreet);
        Road A4872 = new Road("A487", RoadType.A,aberystwyth,bowStreet);
        Road HoelYBont = new Road("Hoel-Y-Bont", RoadType.U,llanbadarn,penparcau);
        Road B4353 = new Road("B4353", RoadType.B,bowStreet,borth);

        System.out.println(aberystwyth.toString());
        System.out.println(bowStreet.toString());
        System.out.println(borth.toString());
        System.out.println(llanbadarn.toString());
        System.out.println(penparcau.toString());

        System.out.println(A44.toString());
        System.out.println(A4871.toString());
        System.out.println(A4872.toString());
        System.out.println(HoelYBont.toString());
        System.out.println(B4353.toString());

    }


}
