import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String name = "Need Name";
        String species;
        int age;
        String gender;
        String birthdate;
        String  color;
        String weight;
        String habitat;
        String id;

        //ArrayList of Animal Objects
        ArrayList<Animal> animals = new ArrayList<>();

        //Hashmap holding animal count
        HashMap<String, Integer> animalCount = new HashMap<>();

        // Open an external file, parse it line by line, and get age and species
        String filePath = "arrivingAnimals.txt";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Age is in the first element of the array named parts
                String[] parts = line.split(", ");

                // Check if the line has at least 1 part
                if (parts.length >= 1) {
                    String ageAndSpecies = parts[0];
                    String birthSeason = parts[1];
                    String animalColor = parts[2];
                    String animalWeight = parts[3];
                    String animLocationA = parts[4];
                    String animLocationB = parts[5];
                    // Get age out of 'ageAndSpecies'
                    String[] theParts = ageAndSpecies.split(" ");
                    for (int i = 0; i < theParts.length; i++) {
                    }
                    age = Integer.parseInt(theParts[0]);
                    species = theParts[4];
                    gender = theParts[3];

                    // Get birthday
                    String[] theParts2 = birthSeason.split(" ");
                    for (int i = 0; i < theParts2.length; i++) {
                    }
                    birthdate = theParts2[2];

                    // Get color
                    String[] theParts3 = animalColor.split(" ");
                    for (int i = 0; i < theParts3.length; i++) {
                    }
                    color = String.join(" ", theParts3);
                    // System.out.println("color: " + color);

                    // weight
                    String[] theParts4 = animalWeight.split(" ");
                    for (int i = 0; i < theParts4.length; i++) {
                    }
                    weight = String.join(" ", theParts4);

                    // Get Location Part 1
                    String[] theParts5 = animLocationA.split(" ");
                    for (int i = 0; i < theParts5.length; i++) {
                    }

                    // Get Location Part 2
                    String[] theParts6 = animLocationB.split(" ");
                    for (int i = 0; i < theParts6.length; i++) {
                    }

                    String habitat1 = String.join(" ", theParts5);
                    String habitat2 = String.join(" ", theParts6);
                    habitat = habitat1 + ", " + habitat2;
                    // System.out.println("Habitat: " + habitat);

                    id = "XX00";

                    // Create a new animal object.
                    Animal myAnimal = new Animal(name, age, species, gender, birthdate, color, weight, habitat, id);

                    // Add the new Animal object to the ArrayList of Animals
                    animals.add(myAnimal);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }


        ArrayList<String> hyenaNames = new ArrayList<>();
        // ArrayList of Lion names.
        ArrayList<String> lionNames = new ArrayList<>();
        // ArrayList of Tiger names.
        ArrayList<String> tigerNames = new ArrayList<>();
        // ArrayList of Bear names.

        // Open an external file, parse it line by line, and fill the name arrayLists
        String aFilePath = "/animalNames.txt";
        File aFile = new File(aFilePath);

        try (Scanner scanner = new Scanner(aFile)) {
            ArrayList<String> bearNames = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String aLine = scanner.nextLine();

                if (aLine.contains("Hyena")) {
                    // Skip the next line because it is a blank line.
                    scanner.nextLine();
                    // Now... this line will have the hyena names!
                    // Split this line on a comma and a space and save the hyena names to a String
                    // array.
                    String[] myHyenaNamesArray = scanner.nextLine().split(", ");
                    // Use the same for loop to get the array into the proper ArrayList.
                    hyenaNames.addAll(Arrays.asList(myHyenaNamesArray));
                }

                if (aLine.contains("Lion")) {
                    // Skip the next line because it is a blank line.
                    scanner.nextLine();
                    // Now... this line will have the lion names!
                    // Split this line on a comma and a space and save the hyena names to a String
                    // array.
                    String[] myLionsNamesArray = scanner.nextLine().split(", ");
                    // Use the same for loop to get the array into the proper ArrayList.
                    lionNames.addAll(Arrays.asList(myLionsNamesArray));
                }

                if (aLine.contains("Tiger")) {
                    // Skip the next line because it is a blank line.
                    scanner.nextLine();
                    // Now... this line will have the tiger names!
                    // Split this line on a comma and a space and save the hyena names to a String
                    // array.
                    String[] myTigerNamesArray = scanner.nextLine().split(", ");
                    // Use the same for loop to get the array into the proper ArrayList.
                    Collections.addAll(tigerNames, myTigerNamesArray);
                }

                if (aLine.contains("Bear")) {
                    // Skip the next line because it is a blank line.
                    scanner.nextLine();
                    // Now... this line will have the bear names!
                    // Split this line on a comma and a space and save the hyena names to a String
                    // array.
                    String[] myBearsNamesArray = scanner.nextLine().split(", ");
                    // Use the same for loop to get the array into the proper ArrayList.
                    Collections.addAll(bearNames, myBearsNamesArray);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + aFilePath);
        }


    }

    public static String genBirthDay(int animAge, String animBirthday) {
        String month = "";
        int day = 0;
        int year = 0;
        int birthYear = 0;
        String birthString = "";

        if (animBirthday.equals("spring")) {
            month = "Mar";
            day = 20;
            year = 2024;
        } else if (animBirthday.equals("fall")) {
            month = "Sep";
            day = 21;
            year = 2024;
        } else if (animBirthday.equals("winter")) {
            month = "Dec";
            day = 21;
            year = 2024;
        } else {
            return "Unknown";
        }

        birthYear = year - animAge;
        birthString = (month + " " + day + ", " + birthYear);
        return birthString;

    }

}



