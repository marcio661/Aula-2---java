package alganalítico;

import java.awt.Color;
import java.awt.Graphics;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author AlunoBCC
 */
public class AlgAnalítico extends JFrame {
    public AlgAnalítico(){
    
    this.setTitle("Algoritmo Analítico");
    this.setSize(300, 300);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
    }
   
    @Override
    public void paint(Graphics g){
    
        g.setColor(Color.red);
        AlgAnalitic(g,50,50,250,250);
        g.setColor(Color.blue);
        AlgAnalitic(g,50,50,250,50);
        g.setColor(Color.green);
        AlgAnalitic(g,50,50,50,250);
        g.setColor(Color.gray);
        AlgAnalitic(g,50,50,250,150);
        g.setColor(Color.yellow);
        AlgAnalitic(g,50,50,150,250);
    }
    
    public void putPixel(Graphics g, int x, int y){
    g.drawLine(x, y, x, y);
    }

    public void AlgAnalitic(Graphics g, int xi, int yi, int xf, int yf) {
        float m, b, dy, dx;
        int x,y;
        dy=(yf-yi);
        dx=(xf - xi);
        
        m=dy/dx;
        b=yi-m*xi;
        
        for(x=xi; x<xf; x++){
        
            y=(int)(m*x+b);
        
            putPixel(g,x,y);
        }
    }
}
