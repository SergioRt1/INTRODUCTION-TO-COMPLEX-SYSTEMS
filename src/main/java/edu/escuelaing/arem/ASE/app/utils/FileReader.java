package edu.escuelaing.arem.ASE.app.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {

    /**
     * Read a file and parse a float for each line.
     *
     * @param fileName name of the file that contains the data
     * @return
     * @throws IOException
     */
    public static List<Float> getDataFromFile(String fileName) throws IOException {
        List<Float> data = new LinkedList<>();
        final Path path = Paths.get(getBasePath(), fileName);
        Files.lines(path).forEach(line -> {
            data.add(Float.parseFloat(line));
        });

        return data;
    }

    private static String getBasePath() {
        return Paths.get(".").toAbsolutePath().toString();
    }
}
