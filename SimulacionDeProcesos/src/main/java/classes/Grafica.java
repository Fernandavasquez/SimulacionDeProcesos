/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Graphics2D;
/**
 *
 * @author criss
 */
public class Grafica {
    private static final Font font = new Font("Arial", Font.BOLD, 14);
    private static final Font label = new Font("Arial", Font.CENTER_BASELINE, 12);
    private static Graphics2D g2d;
    private static final BasicStroke grosor = new BasicStroke(3);
    
    public static void hacerGrafica(Graphics g, int x, int y, int width, int height, String proceso, Color vcolor){
        g2d = (Graphics2D)g;
        g2d.setStroke(grosor);
        g2d.setFont(font);
        if(height>13){
         g2d.setColor(vcolor);
         g2d.fillRect(x+1, y+1, width-3, height-2);
         g2d.setColor(Color.black);
         g2d.drawString(proceso, width/2 - 2, (y+(height/2))); 
        }
        if(height>0 && height <=13){
            g2d.setColor(vcolor);
            g2d.fillRect(x+1, y+1, width-3, height-2);
            g2d.setColor(Color.black);
            g2d.drawString(proceso, width/2 - 2,  y+height-2); 
        }
        g2d.drawRect(x, y, width, height);
    }
    
    public static void recorridodoGrafica(Graphics g, int x, int y, int width, int height,String proceso, int contador, Color select){
        int auxheight= (int) (13.5*contador);
        int auxy = (y+height)-(auxheight);
        g2d = (Graphics2D)g;
        g2d.setStroke(grosor);
        g2d.setFont(font);
        if(height>13){
         g2d.setColor(Color.RED);
         g2d.fillRect(x+1, auxy+1, width-3, auxheight-2);
         g2d.setColor(Color.BLACK);
         g2d.drawString(proceso, width/2 - 2, (y+(height/2))); 
        }
        if(height>0 && height <=13){
            g2d.setColor(Color.RED);
            g2d.fillRect(x+1, auxy+1, width-3, auxheight-2);
            g2d.setColor(Color.BLACK);
            g2d.drawString(proceso, width/2 - 2,  y+height-2); 
        }
        g2d.setColor(select);
        g2d.drawRect(x, y, width, height);
    }
    
    public static void labelGrafica(Graphics g, int x, int y, int height, String base, String limite){
        g2d = (Graphics2D)g;
        g2d.clearRect(1,1,49,406);
        g2d.setFont(label);
        g2d.setColor(Color.black);
        g2d.drawString(limite, x, y);
        g2d.drawString(base, x, y+height);
    }
    
    public static void limpiarLabels(Graphics g){
        g2d = (Graphics2D)g;
        g2d.clearRect(1,1,49,406);
    }
    
    public static void eliminarGrafica(Graphics g, int x, int y, int width, int height){
        g2d = (Graphics2D)g;
        g2d.clearRect(x-1, y-2, width+2, height+4);
        g2d.setColor(Color.black);
        g2d.setStroke(grosor);
        g2d.drawRect(0, 0, 150, 407);
    }
}
