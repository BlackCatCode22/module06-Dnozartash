public class Bear extends Animal {

    int multipleCubs;

    public Bear(String name, int age, String id, String birthday, String habitat, String weight, String color,
                String gender, int multipleCubs) {
        super(name, "Bear", age, gender, color, birthday, habitat, weight, id);
        this.multipleCubs = multipleCubs;

    }

    public int getMultipleCubs()
    {
        return multipleCubs;
    }

    public void setMultipleCubs(int multipleCubs) {
        this.multipleCubs = multipleCubs;
    }

}