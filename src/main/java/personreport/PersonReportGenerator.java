package personreport;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class PersonReportGenerator {


    public void generatePersonsReport(String outputFile, int minAge, int maxAge) throws IOException {
        List<Person> persons = readPersons();
        writeReport(persons, outputFile, minAge, maxAge);
    }

    private void writeReport(List<Person> persons, String outputFile, int minAge, int maxAge) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            persons.stream()
                    .filter(person -> person.getAge() >= minAge)
                    .filter(person -> person.getAge() <= maxAge)
                    .map(person -> person.getFirstName() + " " + person.getAge())
                    .forEach(line -> writeLine(writer, line));

        }
    }

    private void writeLine(BufferedWriter writer, String line) {
        try {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract List<Person> readPersons();
}
