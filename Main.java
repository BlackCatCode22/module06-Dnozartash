import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // Local variables
        String name = "Generate Name";
        String species;
        String id;
        String gender;
        String habitat;
        String birthday;
        String weight;
        String color;
        int age;


        // Animal Arraylist
        ArrayList<Animal> animals = new ArrayList<>();


        // HashMap
        HashMap<String, Integer> animalCount = new HashMap<>();


        // External Files
        String filePath = "C:\\Users\\gamer\\IdeaProjects\\Djs ZooMidterm\\src\\arrivingAnimals.txt";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file))
        {while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] parts = line.split(", ");

            if (parts.length >= 1) {
                String ageAndSpecies = parts[0];
                String birthSeason = parts[1];
                String animalColor = parts[2];
                String animalWeight = parts[3];
                String animLocationA = parts[4];
                String animLocationB = parts[5];


                String[] theParts = ageAndSpecies.split(" ");
                for (int i = 0; i < theParts.length; i++) {
                }
                age = Integer.parseInt(theParts[0]);
                species = theParts[4];
                gender = theParts[3];


                String[] theParts2 = birthSeason.split(" ");
                for (int i = 0; i < theParts2.length; i++) {
                }
                birthday = theParts2[2];


                String[] theParts3 = animalColor.split(" ");
                for (int i = 0; i < theParts3.length; i++) {
                }
                color = String.join(" ", theParts3);
                // System.out.println("color: " + color);


                String[] theParts4 = animalWeight.split(" ");
                for (int i = 0; i < theParts4.length; i++) {
                }
                weight = String.join(" ", theParts4);


                String[] theParts5 = animLocationA.split(" ");
                for (int i = 0; i < theParts5.length; i++) {
                }


                String[] theParts6 = animLocationB.split(" ");
                for (int i = 0; i < theParts6.length; i++) {
                }

                String habitat1 = String.join(" ", theParts5);
                String habitat2 = String.join(" ", theParts6);
                habitat = habitat1 + ", " + habitat2;


                id = "XX00";

                //Generate animal object.
                Animal myAnimal = new Animal(name, species, age, gender, birthday, color, weight, habitat, id);

                animals.add(myAnimal);
            }
        }
        } catch (FileNotFoundException e) {
            System.out.println("File unable to be found: " + filePath);
            e.printStackTrace();
        }

        // Hyena arraylist names
        ArrayList<String> hyenaNames = new ArrayList<>();
        // Lion arraylist names
        ArrayList<String> lionNames = new ArrayList<>();
        // Tiger arraylist names
        ArrayList<String> tigerNames = new ArrayList<>();
        // Bear arraylist names
        ArrayList<String> bearNames = new ArrayList<>();

        // External Path
        String aFilePath = "C:\\Users\\gamer\\IdeaProjects\\Djs ZooMidterm\\src\\animalNames.txt";
        File aFile = new File(aFilePath);

        try (Scanner scanner = new Scanner(aFile)) {
            while (scanner.hasNextLine()) {
                String aLine = scanner.nextLine();

                if (aLine.contains("Hyena")) {

                    scanner.nextLine();

                    String[] myHyenaNamesArray = scanner.nextLine().split(", ");

                    for (String someName : myHyenaNamesArray)
                        hyenaNames.add(someName);
                }

                if (aLine.contains("Lion")) {

                    scanner.nextLine();

                    String[] myLionsNamesArray = scanner.nextLine().split(", ");

                    for (String someName : myLionsNamesArray)
                        lionNames.add(someName);
                }

                if (aLine.contains("Tiger")) {

                    scanner.nextLine();

                    String[] myTigerNamesArray = scanner.nextLine().split(", ");

                    for (String someName : myTigerNamesArray)
                        tigerNames.add(someName);
                }

                if (aLine.contains("Bear")) {

                    scanner.nextLine();

                    String[] myBearsNamesArray = scanner.nextLine().split(", ");

                    for (String someName : myBearsNamesArray)
                        bearNames.add(someName);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File unable to be found: " + aFilePath);
            e.printStackTrace();
        }

        int hyID = 1;
        int liID = 1;
        int tiID = 1;
        int beID = 1;

        for (Animal animal : animals) {
            if (animal.species.equals("hyena")) {
                animal.setName(hyenaNames.getFirst());
                animal.setId("Hy0" + hyID);
                hyID++;

                hyenaNames.remove(0);
            }
            if (animal.species.equals("lion")) {
                animal.setName(lionNames.getFirst());
                animal.setId("Li0" + liID);
                liID++;

                lionNames.remove(0);
            }
            if (animal.species.equals("tiger")) {
                animal.setName(tigerNames.getFirst());
                animal.setId("Ti0" + tiID);
                tiID++;
                tigerNames.remove(0);
            }
            if (animal.species.equals("bear")) {
                animal.setName(bearNames.getFirst());
                animal.setId("Be0" + beID);
                beID++;
                bearNames.remove(0);
            }
            // Birthdays
            String birthCalc = genBirthDay(animal.getAge(), animal.getBirthday());
            animal.setBirthday(birthCalc);
        }

        // Reports

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\gamer\\IdeaProjects\\Djs ZooMidterm\\src\\zooPopulation.txt"));
            String animalReport;
            writer.write("Animal Report -+- \n");
            writer.write("Hyena Habitat:");
            int lineNumber = 1;

            for (Animal animal : animals) {

                if (lineNumber == 6) {
                    writer.write("\n\n Lion Habitat:");
                }
                if (lineNumber == 10) {
                    writer.write("\n\n Tiger Habitat:");
                }
                if (lineNumber == 14) {
                    writer.write("\n\n Bear Habitat:");
                }

                lineNumber++;

                animalReport = ("\n" + animal.getId() + ":" + animal.getName() + " : " + "Birthdate: "
                        + animal.getBirthday() + " : "
                        + animal.getColor() + " : " + animal.getWeight() + " : " + animal.getHabitat())
                        + " : arriving April 8, 2024";

                writer.write(animalReport);
            }
            writer.write("\n\n" + "Current Species Count: ");
            for (Animal animal : animals) {
                String animalType = animal.getSpecies();
                animalCount.put(animalType, animalCount.getOrDefault(animalType, 0) + 1);
            }
            writer.write(animalCount.toString());
            writer.write("\n" + "The total number of animals: " + Animal.numOfAnimals);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String genBirthDay(int animAge, String animBirthday) {
        String month = "";
        int day = 0;
        int year = 0;
        int birthYear = 0;
        String birthString = "";

        if (animBirthday.equals("spring")) {
            month = "Feb";
            day = 25;
            year = 2024;
        } else if (animBirthday.equals("fall")) {
            month = "Nov";
            day = 5;
            year = 2024;
        } else if (animBirthday.equals("winter")) {
            month = "Dec";
            day = 27;
            year = 2024;
        } else {
            return "Unknown";
        }

        birthYear = year - animAge;
        birthString = (month + " " + day + ", " + birthYear).toString();
        return birthString;


    }

}