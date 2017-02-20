/**
 * @author Chris
 * @Version 1
 */

public class Settlement {

    private String name;
    private int population;
    private SettlementType kind;
    private Road[] roads;
    private int numRoads;

    // MAX_ROADS represents the maximum number of roads that can be connected to a Settlement object.
    public static final int MAX_ROADS = 100;

    public Settlement(){

        name = "Unkown";
        population = 0;
        kind = SettlementType.H;

    }

    /**
     * Constructor for objects of class Settlement
     *
     * @param nm becomes initial Settlement Name
     * @param k becomes initial Settlement Type
     *
     */

    public Settlement(String nm, SettlementType k){

        name = nm;
        kind = k;
        roads = new Road[MAX_ROADS];

    }

    public void add(Road road){

        if (numRoads < MAX_ROADS){

            roads[numRoads] = road;
            numRoads++;

        }else{

            System.out.println("roads limit exceeded");
        }



    }

    public String toString() {
        return "The " + kind + " of " + name + " has a population of " + population + roads[1] ;

    }


    // GET and SET methods below for all instance variables

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setKind(SettlementType kind) {
        this.kind = kind;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public SettlementType getKind() {
        return kind;
    }

    public int getNumRoads() {
        return numRoads;
    }

    public void setNumRoads(int numRoads) {
        this.numRoads = numRoads;
    }

    public static int getMaxRoads() {
        return MAX_ROADS;
    }


}
