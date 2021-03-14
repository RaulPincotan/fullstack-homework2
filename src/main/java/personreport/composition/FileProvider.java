package personreport.composition;

import personreport.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class FileProvider implements PersonReportProvider {
    private final String file;

    public FileProvider(String file) {
        this.file = file;
    }


    private Person readPerson(String line) {
        String[] tokens = line.split(",");
        return new Person(tokens[0],
                tokens[1],
                Integer.parseInt(tokens[2])
        );
    }

    @Override
    public List<Person> readPersons() {
        try {
            return Files.lines(Path.of(file))
                    .map(this::readPerson)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }

}

