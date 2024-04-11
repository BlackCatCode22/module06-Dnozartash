public class Hyena extends Animal {

    int blackSpots;

    public Hyena(String name, int age, String id, String birthday, String habitat, String weight, String color,
                 String gender, int blackSpots
    ) {
        super(name, "Hyena", age, gender, id, color, birthday, habitat, weight);
        this.blackSpots = blackSpots;
    }

    public int getBlackSpots() {

        return blackSpots;
    }

    public void setBlackSpots(int blackSpots) {
        this.blackSpots = blackSpots;
    }

}