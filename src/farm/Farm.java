package farm;

public class Farm {
    private String darek;
    private int Cows;
    private int Sheeps;
    private int Horses;
    private  String ownerName;

    public  void  Som (){
    }

    public Farm(String darek, int cows, int sheeps, int horses, String ownerName) {
        this.darek = darek;
        Cows = cows;
        Sheeps = sheeps;
        Horses = horses;
        this.ownerName = ownerName;
    }

    public String getDarek() {
        return darek;
    }

    public void setDarek(String darek) {
        this.darek = darek;
    }

    public int getCows() {
        return Cows;
    }

    public void setCows(int cows) {
        Cows = cows;
    }

    public int getSheeps() {
        return Sheeps;
    }

    public void setSheeps(int sheeps) {
        Sheeps = sheeps;
    }

    public int getHorses() {
        return Horses;
    }

    public void setHorses(int horses) {
        Horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm"  +
                "darek:" + " " + darek + "\n" +
                "Cows:" + " " + Cows + "\n" +
                "Sheeps:" + " " + Sheeps + "\n" +
                "Horses:" + " " + Horses + "\n" +
                "ownerName:" + " " + ownerName ;

    }
}

