package warakorn.springframework.liftcontrol;

public class liftcontrol {
    private int weight;
    private int floor;
    private int maxWeight;
    private int maxFloor;

    public liftcontrol(int maxWeight, int maxFloor) {
        this.maxWeight = maxWeight;
        this.maxFloor = maxFloor;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
