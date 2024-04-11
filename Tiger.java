public class Tiger extends Animal {

    int darkStripes;

    public Tiger(String name, int age, String gender, String birthday, String color, String weight, String habitat,
                 String id, int darkStripes) {
        super(name, "Tiger", age, gender, birthday, color, weight, habitat, id);
        this.darkStripes = darkStripes;
    }

    public int getStripes() {
        return darkStripes;
    }

    public void setDarkStripes(int darkStripes) {
        this.darkStripes = darkStripes;
    }
}