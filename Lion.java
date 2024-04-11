public class Lion extends Animal {

    String powerfulJaw;

    public Lion(String name, int age, String id, String birthday, String habitat, String weight, String color,
                String gender, String powerfulJaw) {
        super(name, "Lion", age, gender, id, color, birthday, habitat, weight);
        this.powerfulJaw = powerfulJaw;
    }

    public String getPowerful() {
        return powerfulJaw;
    }

    public void setPowerful(String powerful) {
        this.powerfulJaw = powerfulJaw;

    }

}