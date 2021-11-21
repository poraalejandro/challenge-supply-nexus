package main.java.exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Exercise4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Pc\\eclipse-workspace\\challenge-supply-nexus\\src\\main\\java\\exercise4\\people.txt"));

        ArrayList<Person> personRecords = new ArrayList<>();

        String currentLine = reader.readLine();

        while (currentLine != null) {
            String[] personDetail = currentLine.split(",");

            int height = Integer.parseInt(personDetail[0]);
            int weight = Integer.parseInt(personDetail[1]);

            personRecords.add(new Person(height, weight));

            currentLine = reader.readLine();
        }

        //Since the order wasn't clear on the requierements, I took the asumption that I have to order by weight, because is the first parameter being referred.
        personRecords.sort(Comparator.comparingInt(Person::getWeight).reversed());

        for (Person person : personRecords) {
            System.out.println(person.weight + "," + person.height);
        }

        reader.close();
    }
}
