//Construct text file
//        add info to text file
//        create editor
//        create interface
//tie editor to interface
//add manipulation functions




package contacts;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class contactsApp {



    public static void main(String[] args) {
        String directory = "contactFile";
        String filename = "contactsList.txt";
        Path dataFile = Paths.get(directory, filename);
        List<String> Files.readAllLines(Path, directory, filename);
        try {
            if (Files.notExists(dataFile)) {
                Files.createFile(dataFile);
            }
        } catch (IOException e) {
            System.out.println("File with that name already exists");
            System.out.println("Unable to create file.");
        }
        try {
            List<String> contactsList = Arrays.asList("John Davis", "Named Person", "My Phone");
            Path filepath = Paths.get("contacts", "contactsList.txt");
            Files.write(filepath, contactsList);
        }catch (IOException e) {
            System.out.println("Unable to add contact.");
            System.out.println("Contact list not updated.");
        }


    }
}
