package ru.mephi.java.ch09.sec08;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.Collections;
import java.util.stream.Stream;

public class CreateZip {
    private static final String RESOURCE_PATH = "src/main/resources/ch09/sec08";

    public static void main(String[] args) {
        Path dirPath = Paths.get(RESOURCE_PATH, "dir");
        Path zipPath = Paths.get(RESOURCE_PATH, "zipped.zip");

        try {
            createZip(dirPath, zipPath);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createZip(Path dirPath, Path zipPath) throws URISyntaxException, IOException {
        URI uri = new URI("jar", zipPath.toUri().toString(), null);

        try (FileSystem zipfs = FileSystems.newFileSystem(uri, Collections.singletonMap("create", "true")); Stream<Path> entries = Files.walk(dirPath)) {
            entries.forEach((currPath) -> {
                try {
                    Path targetPath = zipfs.getPath("/").resolve(dirPath.relativize(currPath).toString());
                    if (!targetPath.toString().equals("/")) {

                        if (Files.isDirectory(currPath)) {
                            Files.createDirectory(targetPath);
                        } else {
                            Files.copy(currPath, targetPath);
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
