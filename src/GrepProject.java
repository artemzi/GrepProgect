import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GrepProject {
	
	/**
	 * 
	 * @param args
	 * @throws ArrayIndexOutOfBoundsException
	 */

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = null;
			String word = args[0];
			
			try {
				String currentLine;
				
				br = new BufferedReader(new FileReader(args[1])); //open file
	 
				while ((currentLine = br.readLine()) != null) {
					if (currentLine.indexOf(word) != -1) { //does line have word in ?
						System.out.println(currentLine); 
					}
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("need 2 arguments");
		}
	}

}
