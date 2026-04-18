package src.LLd.Medium.ParkingLot;

public class Floor {
    private String id;
    private String name;
    private int length;
    private int width;
    private Spots[][] diagram;

    public Floor(String id, String name, int length, int width){
        this.id=id;
        this.name=name;
        this.diagram=new Spots[length][width];
    }
    public void displayTheFloor(){
        for(int i=0;i<length;i++){
            for(int j=0;j<width;j++){
                System.out.print(diagram[i][j] +" ");
            }
            System.out.println();
        }
    }
}
