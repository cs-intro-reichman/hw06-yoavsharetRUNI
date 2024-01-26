import java.awt.Color;

/**
 * Demonstrates the morphing operation and grey scaling featured by Runigram.java. 
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of a source image, and the number of morphing steps (an int).
 * The program will morph the source image to its grey scaled version 
 * For example, to morph the ironman into grey scaled ironman in 50 steps, use:
 * java Editor4 ironman.ppm 50
 * Note: There is no need to scale the target image to the size of the source
 * image, since Runigram.morph performs this action.
 */
public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
	}
}
