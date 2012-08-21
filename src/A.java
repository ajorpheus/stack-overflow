import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.junit.Test;

public class A {

	@Test
	public void test() {
		InputStream stream = A.class.getResourceAsStream("/SomeTextFile.txt");
        System.out.println(stream != null);
        stream = Test.class.getClassLoader()
            .getResourceAsStream("SomeTextFile.txt");
        System.out.println(stream != null);
	}

	@Test
	public void testAudioInputStream() throws UnsupportedAudioFileException, IOException {
		 // Probably some try catch over the next statement to log the error if `result.wav` is not found.
        InputStream stream = A.class.getResourceAsStream("/result.wav");
        System.out.println(stream != null);
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(stream);
        System.out.println(audioInputStream != null);
	}

}
