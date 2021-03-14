package personreport;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class FilePersonReportGenerator extends PersonReportGenerator {
    private final String file;

    public FilePersonReportGenerator(String file) {
        this.file = file;
    }

    @Override
    protected List<Person> readPersons() {
        try {
            return Files.lines(Path.of(file))
                    .map(this::readPerson)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }

    private Person readPerson(String line) {
        String[] tokens = line.split(",");
        return new Person(tokens[0],
                tokens[1],
                Integer.parseInt(tokens[2])
        );
    }
}
