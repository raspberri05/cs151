import java.io.*;

public class Demo {
	public static void main(String[] args) throws IOException {
		int c;
		InputStream in = null;
		try {
			in = new CapitalizeFirstLetter( 
				 new LowerCaseInputStream (
					new BufferedInputStream(
						new FileInputStream("test.txt"))));

			int n = 0 ;
			in.mark(0);
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
				++n;
			}
			System.out.println( "-----------------" );
			in.reset();
			byte[] b = new byte[n] ;
			in.read (b, 0, n ) ;
			for (int i=0; i < n; ++i  ) {
				System.out.print((char) b[i]);
			}
			System.out.println( "-----------------" );
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) { in.close(); }
		}

	}
}
