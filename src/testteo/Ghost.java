/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testteo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author miiky
 */
public class Ghost {
    public Ghost(int x, int y, Graphics g, int look) {
        
        // Cuerpo?
        int[] sevx = {x, x, x+30, x+50, x+70, x+100, x+100};
        int[] sevy = {y+50, y+100, y+75, y+100, y+75, y+100, y+50};
        g.fillArc(x, y, 100, 100, 0, 180);
        g.fillPolygon(sevx, sevy, 7);
        
        // Ojos
        g.setColor(Color.WHITE);
        switch (look) {
            case 1 -> {
                g.fillOval(x+10, y+20, 25, 25);
                g.fillOval(x+45, y+20, 25, 25);
                g.setColor(Color.BLUE);
                g.fillOval(x+12, y+25, 15, 15);
                g.fillOval(x+47, y+25, 15, 15);
            }
            case 2 -> {
                g.fillOval(x+65, y+20, 25, 25);
                g.fillOval(x+30, y+20, 25, 25);
                g.setColor(Color.BLUE);
                g.fillOval(x+73, y+25, 15, 15);
                g.fillOval(x+38, y+25, 15, 15);
            }
            case 3 -> {
                g.fillOval(x+55, y+15, 25, 25);
                g.fillOval(x+20, y+15, 25, 25);
                g.setColor(Color.BLUE);
                g.fillOval(x+60, y+17, 15, 15);
                g.fillOval(x+25, y+17, 15, 15);
            }
            case 4 -> {
                g.fillOval(x+55, y+35, 25, 25);
                g.fillOval(x+20, y+35, 25, 25);
                g.setColor(Color.BLUE);
                g.fillOval(x+60, y+43, 15, 15);
                g.fillOval(x+25, y+43, 15, 15);
            }
            default -> System.out.println("No puedes hacer eso -_-");
        }
    }
}