/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author filip_000
 */
public class ImagePanelSignUp extends JPanel{
    
    private BufferedImage image;

    public ImagePanelSignUp() {
       try {                
          image = ImageIO.read(getClass().getResource("slike/art_28.jpg"));
       } catch (IOException ex) {
            Logger.getLogger(TestBackgroundResize.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }

        public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new TestBackgroundResize();
            }
        });
    }
}
