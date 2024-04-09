import java.time.LocalDate;

public class Animal {
    private String id;
    private String name;
    private LocalDate birthDate;
    private String color;
    private String gender;
    private String weight;
    private String origin;
    private String species;
    private int age;
    private String season;
    LocalDate currentDate = LocalDate.now();


    public Animal(String id, String name, LocalDate birthDate, String color, String gender,
                  String weight, String origin, String species, int age, String season) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.color = color;
        this.gender = gender;
        this.weight = weight;
        this.origin = origin;
        this.species = species;
        this.age = age;
        this.season = season;
    }

    public Animal(String name, int age, String bear, String gender, String birthday, String color, String weight, String habitat, String id) {
    }

    // Accessor and Mutator methods for all fields

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthDate;
    }

    public void setBirthday(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return id + "; " + name + "; birth date " + birthDate + "; " + color + "; " + gender + "; "
                + weight + "; " + origin+"; arrived "+currentDate;
    }
}
