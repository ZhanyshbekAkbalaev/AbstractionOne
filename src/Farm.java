import java.util.Arrays;

public class Farm {
    private String address;
    private int[] cows;
    private int[] horses;
    private int[] sheep;
    private String ownerName;

    public Farm() {

    }

    public Farm(String address, int[] cows, int[] horses, int[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int[] getCows() {
        return cows;
    }

    public void setCows(int[] cows) {
        this.cows = cows;
    }

    public int[] getHorses() {
        return horses;
    }

    public void setHorses(int[] horses) {
        this.horses = horses;
    }

    public int[] getSheep() {
        return sheep;
    }

    public void setSheep(int[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheep=" + Arrays.toString(sheep) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
