import java.io.FileInputStream;

public class FileInputDemo {

	public static void main(String[] args) throws Exception {
		String file = "D:/Demo/song.txt";
		FileInputStream istream = new FileInputStream(file);
		byte[] bar =new byte[istream.available()];
		istream.read(bar);
		String content = new String(bar);
		System.out.println(content);
		
//		int ch = 0;
		
//		while (true) {
//			ch = istream.read();
//			if (ch == -1)
//				break;
//			System.out.println((char)ch);
//		}
		istream.close();

	}

}
