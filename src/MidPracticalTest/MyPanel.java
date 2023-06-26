/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidPracticalTest;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

import javax.swing.*;

/**
 *
 * @author Hnana
 */
public class MyPanel extends JPanel {

    public MyPanel() {

        setSize(5000, 5000);

        repaint();

        this.setPreferredSize(new Dimension(5000, 5000));
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g1 = (Graphics2D) g;
        // Background color
        g1.setColor(Color.CYAN);
        g1.fillRect(0, 0, this.getWidth(), this.getHeight());
        g1.setColor(Color.green);
        g1.fillRect(0, 580, this.getWidth(), this.getHeight());
        // Call Methods that contains codes for drawing shapes
        sky(g1);
        prson(g1);
        sun(g1);
        house(g1);
        boll(g1);
        DivideWindow(g1);
        flower(g1);
    }

    // method to Divide the window
    public void DivideWindow(Graphics2D g1) {
        // Divide the window
        g1.setColor(Color.pink);
        g1.fillRect(0, this.getHeight() - 79, this.getWidth(), this.getHeight());
        g1.setColor(Color.black);
        g1.drawLine(0, this.getHeight() - 80, this.getWidth(), this.getHeight() - 80);
        g1.drawLine(0, this.getHeight() - 81, this.getWidth(), this.getHeight() - 81);
        g1.drawLine(0, this.getHeight() - 82, this.getWidth(), this.getHeight() - 82);
        g1.drawLine(0, this.getHeight() - 83, this.getWidth(), this.getHeight() - 83);
          // write my name
        g1.setColor(Color.blue);
        g1.setFont(new Font("Ink free", Font.TYPE1_FONT, 30));
        g1.drawString("Hanan Alrdadi", (this.getWidth() / 2), (getHeight() - 30));

    }

    // method to draw the boll
    public void boll(Graphics2D g1) {

        // draw boll
        g1.setColor(Color.white);
        g1.fillOval(670, 670, 50, 50);
        g1.setColor(Color.BLACK);
        g1.fillOval(675, 675, 10, 10);
        g1.fillOval(685, 685, 10, 10);
        BufferedImage im1 = MidpointAlgorithm(27, new int[]{255, 3, 252, 223});
        g1.drawImage(im1, 0, 0, null);
        im1 = MidpointAlgorithm(3, new int[]{255, 3, 252, 223});
        g1.drawImage(im1, 0, 0, null);

    }

// method to draw the house
    public void house(Graphics2D g1) {
        //house
        g1.setColor(Color.DARK_GRAY);
        g1.fillPolygon(new int[]{850, 1050, 1250}, new int[]{300, 200, 300}, 3);
        g1.setColor(Color.GRAY);
        g1.fillRect(850, 300, 400, 300);
        // the window
        g1.setColor(Color.darkGray);
        g1.drawRect(1100, 350, 100, 100);

        // the Door 
        g1.setColor(Color.lightGray);
        g1.fillRect(900, 400, 130, 200);

        g1.setColor(Color.black);
        g1.fillOval(930, 480, 10, 10);

    }

    // method to draw 4 flowers
    public void flower(Graphics2D g1) {
        // first flower
        g1.setColor(Color.magenta);
        g1.fillOval(80, 500, 20, 20);
        g1.fillOval(95, 485, 20, 20);
        g1.fillOval(110, 500, 20, 20);
        g1.fillOval(86, 515, 20, 20);
        g1.fillOval(103, 515, 20, 20);
        g1.setColor(Color.yellow);
        g1.fillOval(95, 503, 20, 20);
        g1.setColor(Color.GREEN);
        g1.fillRect(103, 525, 5, 70);
        // second flower
        g1.setColor(Color.blue);
        g1.fillOval(300, 500, 20, 20);
        g1.fillOval(315, 485, 20, 20);
        g1.fillOval(330, 500, 20, 20);
        g1.fillOval(306, 515, 20, 20);
        g1.fillOval(323, 515, 20, 20);
        g1.setColor(Color.yellow);
        g1.fillOval(315, 503, 20, 20);
        g1.setColor(Color.GREEN);
        g1.fillRect(323, 525, 5, 70);
        // third flower
        g1.setColor(Color.RED);
        g1.fillOval(1280, 500, 20, 20);
        g1.fillOval(1295, 485, 20, 20);
        g1.fillOval(1310, 500, 20, 20);
        g1.fillOval(1286, 515, 20, 20);
        g1.fillOval(1303, 515, 20, 20);
        g1.setColor(Color.yellow);
        g1.fillOval(1295, 503, 20, 20);
        g1.setColor(Color.GREEN);
        g1.fillRect(1303, 525, 5, 70);

        // fourth flower
        g1.setColor(Color.ORANGE);
        g1.fillOval(1685, 500, 20, 20);
        g1.fillOval(1700, 485, 20, 20);
        g1.fillOval(1715, 500, 20, 20);
        g1.fillOval(1691, 515, 20, 20);
        g1.fillOval(1710, 515, 20, 20);

        g1.setColor(Color.yellow);
        g1.fillOval(1700, 503, 20, 20);
        g1.setColor(Color.GREEN);
        g1.fillRect(1710, 525, 5, 70);
    }

// method to draw sun 
    public void sun(Graphics2D g1) {

        // draw sun 
        g1.setColor(Color.yellow);

        g1.fillOval(150, 20, 100, 100);
        g1.drawLine(198, 20, 198, 0);
        g1.drawLine(199, 20, 199, 0);
        g1.drawLine(200, 20, 200, 0);

        g1.drawLine(198, 120, 198, 175);
        g1.drawLine(199, 120, 199, 175);
        g1.drawLine(200, 120, 200, 175);

        g1.drawLine(255, 74, 360, 74);
        g1.drawLine(255, 75, 360, 75);
        g1.drawLine(255, 76, 360, 76);

        g1.drawLine(89, 74, 344, 74);
        g1.drawLine(89, 75, 344, 75);
        g1.drawLine(89, 76, 344, 76);

        g1.drawLine(243, 32, 275, 0);
        g1.drawLine(243, 33, 276, 0);
        g1.drawLine(244, 33, 277, 0);

        // draw sunglasses
        g1.setColor(Color.black);
        g1.fillArc(165, 35, 30, 30, 180, 180);
        g1.fillArc(205, 35, 30, 30, 180, 180);
        g1.drawLine(190, 50, 205, 50);
        g1.drawLine(165, 50, 159, 44);
        g1.drawLine(234, 50, 241, 43);

        // draw smile
        g1.setColor(Color.red);
        g1.drawArc(195, 75, 20, 8, 190, 200);
    }
    // method to draw the 2 prsons

    public void prson(Graphics2D g1) {
        // start code to draw the first person 
        g1.setColor(Color.white);
        g1.fillOval(555, 300, 140, 150);
        g1.setColor(Color.RED);
        g1.fillRect(570, 450, 110, 200);
        g1.setColor(Color.white);
        g1.fillRect(543, 470, 25, 70);
        g1.fillRect(683, 470, 25, 70);
        g1.fillArc(543, 535, 20, 25, 0, 360);
        g1.fillArc(685, 535, 20, 25, 0, 360);
        g1.setColor(Color.red);
        g1.drawArc(615, 420, 20, 8, 190, 200);
        g1.setColor(Color.black);
        g1.fillArc(600, 350, 30, 30, 180, 180);
        g1.fillArc(640, 350, 30, 30, 180, 180);
        g1.setColor(Color.blue);
        g1.fillRect(570, 580, 110, 150);
        g1.setColor(Color.green);
        g1.fillPolygon(new int[]{625, 598, 638}, new int[]{600, 730, 730}, 3);
        g1.setColor(Color.black);
        g1.fillOval(570, 728, 35, 30);
        g1.fillOval(642, 728, 35, 30);
        // End code to draw the first person 

        // start code to draw the second person 
        g1.setColor(Color.white);
        g1.fillOval(1380, 300, 140, 150);
        g1.setColor(Color.LIGHT_GRAY);
        g1.fillRect(1395, 450, 110, 200);
        g1.setColor(Color.white);
        g1.fillRect(1368, 470, 25, 70);
        g1.fillRect(1508, 470, 25, 70);
        g1.fillArc(1510, 535, 20, 25, 0, 360);
        g1.fillArc(1370, 535, 20, 25, 0, 360);
        g1.setColor(Color.red);
        g1.drawArc(1440, 420, 20, 8, 190, 200);
        g1.setColor(Color.black);
        g1.fillArc(1400, 350, 30, 30, 180, 180);
        g1.fillArc(1440, 350, 30, 30, 180, 180);
        g1.setColor(Color.black);
        g1.fillRect(1395, 580, 110, 150);
        g1.setColor(Color.green);
        g1.fillPolygon(new int[]{1450, 1423, 1463}, new int[]{600, 750, 750}, 3);
        g1.setColor(Color.black);
        g1.fillOval(1395, 728, 35, 30);
        g1.fillOval(1467, 728, 35, 30);
        // End code to draw the second person 

    }
    // method to draw 6 sky

    public void sky(Graphics2D g1) {
        g1.setColor(Color.white);
        // first sky
        g1.fillOval(440, 30, 50, 50);
        g1.fillOval(420, 20, 50, 50);
        g1.fillOval(460, 20, 50, 50);
        g1.fillOval(480, 20, 50, 50);
        g1.fillOval(500, 20, 50, 50);
        // second sky
        g1.fillOval(640, 30, 50, 50);
        g1.fillOval(560, 20, 50, 50);
        g1.fillOval(580, 20, 50, 50);
        g1.fillOval(600, 20, 50, 50);
        g1.fillOval(620, 20, 50, 50);

        // third sky
        g1.fillOval(800, 30, 50, 50);
        g1.fillOval(820, 20, 50, 50);
        g1.fillOval(840, 20, 50, 50);
        g1.fillOval(860, 20, 50, 50);
        g1.fillOval(880, 20, 50, 50);

        // fourth sky
        g1.fillOval(1010, 30, 50, 50);
        g1.fillOval(1030, 20, 50, 50);
        g1.fillOval(1050, 20, 50, 50);
        g1.fillOval(1070, 20, 50, 50);
        g1.fillOval(1110, 20, 50, 50);

        // Fifth sky
        g1.fillOval(1200, 30, 50, 50);
        g1.fillOval(1220, 20, 50, 50);
        g1.fillOval(1240, 20, 50, 50);
        g1.fillOval(1260, 20, 50, 50);
        g1.fillOval(1280, 20, 50, 50);

        // Sixth sky
        g1.fillOval(1400, 30, 50, 50);
        g1.fillOval(1420, 20, 50, 50);
        g1.fillOval(1440, 20, 50, 50);
        g1.fillOval(1460, 20, 50, 50);
        g1.fillOval(1480, 20, 50, 50);

    }

    // implement Mid point Algorithm
    public BufferedImage MidpointAlgorithm(int r, int[] Color) {

        BufferedImage im = new BufferedImage(6000, 6000, BufferedImage.TYPE_INT_ARGB);
        WritableRaster ra = im.getRaster();
        int c = 695;

        int p0 = 1 - r;

        int x0 = 0;

        int y0 = r;

        int pk = p0;

        int x = x0;

        int y = y0;

        ra.setPixel(c, c + y, Color);
        ra.setPixel(c, c - y, Color);
        ra.setPixel(c + x, c, Color);
        ra.setPixel(c - x, c, Color);
        while (x < y) {

            if (pk < 0) {
                pk = pk + 2 * x + 3;
            } else {
                pk = pk + 2 * (x - y) + 5;
                y--;
            }
            x++;
            ra.setPixel(x + c, c + y, Color);
            ra.setPixel(x + c, c - y, Color);
            ra.setPixel(c - x, c + y, Color);
            ra.setPixel(c - x, c - y, Color);
            ra.setPixel(c + y, x + c, Color);
            ra.setPixel(c - y, x + c, Color);
            ra.setPixel(c + y, c - x, Color);
            ra.setPixel(c - y, c - x, Color);
        }
        return im;

    }
}
