package personreport.composition;


import personreport.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGeneratorComposition {
    private final PersonReportProvider personReportProvider;

    public ReportGeneratorComposition(PersonReportProvider personReportProvider) {
        this.personReportProvider = personReportProvider;
    }

    public void generateReport(String file, int min, int max) throws IOException {
        List<Person> persons = personReportProvider.readPersons();
        writeReport(persons, file, min, max);
    }

    private void writeReport(List<Person> persons, String file, int minAge, int maxAge) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            persons.stream()
                    .filter(person -> person.getAge() >= minAge)
                    .filter(person -> person.getAge() <= maxAge)
                    .map(person -> person.getFirstName() + " " + person.getAge())
                    .forEach(line -> writeLine(bufferedWriter, line));
        }
    }

    private void writeLine(BufferedWriter bufferedWriter, String line) {

        try {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
