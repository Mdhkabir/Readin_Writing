package ReadingPropretyFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingTextFile {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\Filewriting\\MyTestFile.txt");
		FileWriter fw = new	FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("first line");
		writer.newLine();
		writer.write("Bangladesh");
		writer.newLine();
		writer.write("himlykabir");
		
		

	}

}
 