public class Animal {

    String name;
    String species;
    String id;
    String gender;
    String habitat;
    String weight;
    String color;
    String birthday;
    int age;


    //Animal Class variables
    public static int numOfAnimals = 0;

    public Animal(String name, String species, int age, String id, String birthday, String habitat, String weight, String color,
                  String gender) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
        this.habitat = habitat;
        this.weight = weight;
        this.color = color;
        this.gender = gender;
        numOfAnimals++;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getSpecies() {return species;}

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getBirthday() {return birthday;}

    public String getHabitat() {
        return habitat;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}