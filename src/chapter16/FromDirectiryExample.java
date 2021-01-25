package chapter16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectiryExample {

	public static void main(String[] args)throws IOException {
		Path path = Paths.get("C:/DDoongMause/workspace/ThisIsJava/src");
		Stream<Path> stream = Files.list(path);
		stream.forEach( p -> System.out.println(p.getFileName()));
	}

}
