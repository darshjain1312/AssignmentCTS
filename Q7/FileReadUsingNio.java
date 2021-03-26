import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadUsingNio {

	public static void main(String[] args) {
		Path wiki_path = Paths.get("D:\\Assignment 20-03-21\\Q9\\ExecutorService.txt");
	      Charset charset = Charset.forName("ISO-8859-1");
	      try {
	         List<String> lines = Files.readAllLines(wiki_path, charset);
	         for (String line : lines) {
	            System.out.println(line);
	         }
	      } 
	      catch (IOException e) {
	         System.out.println(e);
	      }

	}

}
