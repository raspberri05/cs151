import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		// xxx your code
		super(in);
	}
 
	public int read() throws IOException {
		// xxx your code
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}
		
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = in.read(b, offset, len);
		// xxx your code
		for (int a = offset; a < offset + result; a++) {
			b[a] = (byte) Character.toLowerCase((char) b[a]);
		}
		return result;
	}
}
