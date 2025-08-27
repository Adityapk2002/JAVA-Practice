package Buffer;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class BufferImage {
    public static void main(String[] args) throws Exception {
        // Create a blank image 200x200 (RGB type)
        BufferedImage img = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);

        // Get graphics to draw
        Graphics2D g = img.createGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 200, 200); // Fill background with blue
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 100, 100); // Draw a yellow circle
        g.dispose();

        // Save image
        File output = new File("example.png");
        ImageIO.write(img, "png", output);
        System.out.println("Image saved as example.png");
    }
}
