import javax.xml.transform.Source;
import java.util.Set;

/**
 * @author Chris
 * @Version 1
 */
public class Road {

    private String name;
    private RoadType roadType;
    private Settlement sourceSettlement;
    private Settlement destinationSettlement;


    /**
     * Constructor for objects of class Road
     *
     * @param startName   becomes initial Road Name
     * @param startRoadType   becomes initial Road type
     * @param startSourceSettlement   becomes initial source settlement
     * @param startDestinationSettlement   becomes initial destination settlement
     *
     */
    public Road(String startName, RoadType startRoadType, Settlement startSourceSettlement, Settlement startDestinationSettlement ) {

        name = startName;
        roadType = startRoadType;
        sourceSettlement = startSourceSettlement;
        destinationSettlement = startDestinationSettlement;
        sourceSettlement.add(this);
        destinationSettlement.add(this);

    }


    public String toString() {
        return "Road [name=" + name + " roadType=" + roadType + " sourceSettlement=" + sourceSettlement.getName() + " destinationSettlement=" + destinationSettlement.getName() + "}";
    }

    // GET and SET methods below for all instance variables

    public String getName() {
        return name;
    }

    public RoadType getRoadType() {
        return roadType;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRoadType(RoadType roadType) {
        this.roadType = roadType;
    }

    public Settlement getSourceSettlement() {
        return sourceSettlement;
    }

    public void setSourceSettlement(Settlement sourceSettlement) {
        this.sourceSettlement = sourceSettlement;
    }

    public Settlement getDestinationSettlement() {
        return destinationSettlement;
    }

    public void setDestinationSettlement(Settlement destinationSettlement) {
        this.destinationSettlement = destinationSettlement;
    }
}


