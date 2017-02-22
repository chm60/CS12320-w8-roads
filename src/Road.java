import javax.xml.transform.Source;
import java.util.Set;

/**
 * @author Chris Machala
 * @email Chm60@aber.ac.uk
 * @version 1.1
 */

public class Road {

    private String name;
    private RoadType roadType;
    private Settlement sourceSettlement;
    private Settlement destinationSettlement;


    /**
     * Constructor for objects of class Road
     *
     * @param nm   becomes initial Road Name
     * @param classifier   becomes initial Road type
     * @param source   becomes initial source settlement
     * @param destination   becomes initial destination settlement
     *
     */
    public Road(String nm, RoadType classifier, Settlement source, Settlement destination ) {

        name = nm;
        roadType = classifier;

        sourceSettlement = source;
        destinationSettlement = destination;

        source.add(this);
        destination.add(this);

    }




    // GET and SET methods below for all instance variables

    public String getName() {
        return name;
    }

    public RoadType getRoadType() {
        return roadType;
    }

    public Settlement getSourceSettlement() {
        return sourceSettlement;
    }

    public Settlement getDestinationSettlement() {
        return destinationSettlement;
    }

    public String toString() {
        return "Road [nm=" + name + " classifier=" + roadType + " source =" + sourceSettlement.getName() + " destination =" + destinationSettlement.getName() + "}";
    }

    public void setSourceSettlement(Settlement sourceSettlement) {
        this.sourceSettlement = sourceSettlement;
    }

    public void setDestinationSettlement(Settlement destinationSettlement) {
        this.destinationSettlement = destinationSettlement;
    }
}


