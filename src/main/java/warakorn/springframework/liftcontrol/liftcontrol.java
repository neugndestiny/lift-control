package warakorn.springframework.liftcontrol;

public class liftcontrol {
    private int weight;
    private String floor;
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

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String moveDirection(String current, String target) {
        if (current.equals("G") && target.equals("TOP")) {
            return "up";
        } else if (current.equals("G") && target.equals("G+1")) {
            return "up";
        } else if (current.equals("G") && target.equals("TOP-1")) {
            return "up";
        } else if (current.equals("G+1") && target.equals("G")) {
            return "down";
        } else if (current.equals("G+1") && target.equals("TOP")) {
            return "up";
        } else if (current.equals("G+1") && target.equals("TOP-1")) {
            return "up";
        } else if (current.equals("TOP") && target.equals("G")) {
            return "down";
        } else if (current.equals("TOP") && target.equals("G+1")) {
            return "down";
        } else if (current.equals("TOP") && target.equals("TOP-1")) {
            return "down";
        } else {
            return null;
        }
    }
}
