import java.io.*;

public class CapitalizeFirstLetter extends FilterInputStream {
	byte lastByte = 0x00;

	public CapitalizeFirstLetter(InputStream in) {
		// xxx your code
		super(in);
	}
 
	private boolean isFirstLetterOfWord ( int c, byte lastByte ) {
		return Character.isAlphabetic (c) && !Character.isAlphabetic (lastByte);
	}

	public int read() throws IOException {
		// xxx your code
		int result = super.read();
		if (result == -1) {
			return result;
		}
		if (isFirstLetterOfWord (result, lastByte)) {
			result = Character.toUpperCase(result);
		}
		lastByte = (byte) result;
		return result;
	}
		
	public int read(byte[] b, int offset, int len) throws IOException {
		// xxx your code
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {
            if (isFirstLetterOfWord(b[i], lastByte)) {
                b[i] = (byte) Character.toUpperCase(b[i]);
            }
            lastByte = b[i];
        }
		return result;
	}
}
