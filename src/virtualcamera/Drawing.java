/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualcamera;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author maciej.pikulicki
 */
public class Drawing extends JPanel {
    private int c1x1 = 0;
    private int c1y1 = 0;
    private int c1x2 = 0;
    private int c1y2 = 0;
    private int c1x3 = 0;
    private int c1y3 = 0;
    private int c1x4 = 0;
    private int c1y4 = 0;
    private int c1x5 = 0;
    private int c1y5 = 0;
    private int c1x6 = 0;
    private int c1y6 = 0;
    private int c1x7 = 0;
    private int c1y7 = 0;
    private int c1x8 = 0;
    private int c1y8 = 0;
    //
    private int c2x1 = 0;
    private int c2y1 = 0;
    private int c2x2 = 0;
    private int c2y2 = 0;
    private int c2x3 = 0;
    private int c2y3 = 0;
    private int c2x4 = 0;
    private int c2y4 = 0;
    private int c2x5 = 0;
    private int c2y5 = 0;
    private int c2x6 = 0;
    private int c2y6 = 0;
    private int c2x7 = 0;
    private int c2y7 = 0;
    private int c2x8 = 0;
    private int c2y8 = 0;
    //
    private int c3x1 = 0;
    private int c3y1 = 0;
    private int c3x2 = 0;
    private int c3y2 = 0;
    private int c3x3 = 0;
    private int c3y3 = 0;
    private int c3x4 = 0;
    private int c3y4 = 0;
    private int c3x5 = 0;
    private int c3y5 = 0;
    private int c3x6 = 0;
    private int c3y6 = 0;
    private int c3x7 = 0;
    private int c3y7 = 0;
    private int c3x8 = 0;
    private int c3y8 = 0;
    //
    private int c4x1 = 0;
    private int c4y1 = 0;
    private int c4x2 = 0;
    private int c4y2 = 0;
    private int c4x3 = 0;
    private int c4y3 = 0;
    private int c4x4 = 0;
    private int c4y4 = 0;
    private int c4x5 = 0;
    private int c4y5 = 0;
    private int c4x6 = 0;
    private int c4y6 = 0;
    private int c4x7 = 0;
    private int c4y7 = 0;
    private int c4x8 = 0;
    private int c4y8 = 0;
    //
    Cube cube1;
    Cube cube2;
    Cube cube3;
    Cube cube4;
           
    
    public Drawing(Cube cubeT1, Cube cubeT2, Cube cubeT3, Cube cubeT4){
            this.cube1 = cubeT1;
            this.cube2 = cubeT2;
            this.cube3 = cubeT3;
            this.cube4 = cubeT4;
            
            this.cube1.convertTo2D();
            this.cube2.convertTo2D();
            this.cube3.convertTo2D();
            this.cube4.convertTo2D();
            
                 
        }
        
        @Override
        protected void paintComponent(Graphics g) {
                
                
                super.paintComponent(g);
                
    
        //drawBackground
                g.setColor(Color.BLACK);
                g.drawRect(0, 0, 800, 800);
                g.fillRect(0, 0, 800, 800);
        //drawLine
                g.translate(400, 400);
                initPoints();
                g.setColor(Color.green);
                //draw cube1
                //int intsX[] = new int[4];
                //int intsY[] = new int [4];
                
                //intsX[0] = this.c1x1;
                //intsX[1] = this.c1x2;
                //intsX[2] = this.c1x3;
                //intsX[3] = this.c1x4;
                
                //intsY[0] = this.c1y1;
                //intsY[1] = this.c1y2;
                //intsY[2] = this.c1y3;
                //intsY[3] = this.c1y4;
                        
              // g.fillPolygon(intsX, intsY, 4);
                g.drawLine(this.c1x1, this.c1y1, this.c1x2, this.c1y2);
                g.drawLine(this.c1x1, this.c1y1, this.c1x4, this.c1y4);
                g.drawLine(this.c1x2, this.c1y2, this.c1x3, this.c1y3);
                g.drawLine(this.c1x3, this.c1y3, this.c1x4, this.c1y4);
                g.drawLine(this.c1x1, this.c1y1, this.c1x6, this.c1y6);
                g.drawLine(this.c1x2, this.c1y2, this.c1x7, this.c1y7);
                g.drawLine(this.c1x3, this.c1y3, this.c1x8, this.c1y8);
                g.drawLine(this.c1x4, this.c1y4, this.c1x5, this.c1y5);
                g.drawLine(this.c1x6, this.c1y6, this.c1x5, this.c1y5);
                g.drawLine(this.c1x6, this.c1y6, this.c1x7, this.c1y7);
                g.drawLine(this.c1x5, this.c1y5, this.c1x8, this.c1y8);
                g.drawLine(this.c1x7, this.c1y7, this.c1x8, this.c1y8);
                //draw cube2
                g.drawLine(this.c2x1, this.c2y1, this.c2x2, this.c2y2);
                g.drawLine(this.c2x1, this.c2y1, this.c2x4, this.c2y4);
                g.drawLine(this.c2x2, this.c2y2, this.c2x3, this.c2y3);
                g.drawLine(this.c2x3, this.c2y3, this.c2x4, this.c2y4);
                g.drawLine(this.c2x1, this.c2y1, this.c2x6, this.c2y6);
                g.drawLine(this.c2x2, this.c2y2, this.c2x7, this.c2y7);
                g.drawLine(this.c2x3, this.c2y3, this.c2x8, this.c2y8);
                g.drawLine(this.c2x4, this.c2y4, this.c2x5, this.c2y5);
                g.drawLine(this.c2x6, this.c2y6, this.c2x5, this.c2y5);
                g.drawLine(this.c2x6, this.c2y6, this.c2x7, this.c2y7);
                g.drawLine(this.c2x5, this.c2y5, this.c2x8, this.c2y8);
                g.drawLine(this.c2x7, this.c2y7, this.c2x8, this.c2y8);
                //draw cube3
                g.drawLine(this.c3x1, this.c3y1, this.c3x2, this.c3y2);
                g.drawLine(this.c3x1, this.c3y1, this.c3x4, this.c3y4);
                g.drawLine(this.c3x2, this.c3y2, this.c3x3, this.c3y3);
                g.drawLine(this.c3x3, this.c3y3, this.c3x4, this.c3y4);
                g.drawLine(this.c3x1, this.c3y1, this.c3x6, this.c3y6);
                g.drawLine(this.c3x2, this.c3y2, this.c3x7, this.c3y7);
                g.drawLine(this.c3x3, this.c3y3, this.c3x8, this.c3y8);
                g.drawLine(this.c3x4, this.c3y4, this.c3x5, this.c3y5);
                g.drawLine(this.c3x6, this.c3y6, this.c3x5, this.c3y5);
                g.drawLine(this.c3x6, this.c3y6, this.c3x7, this.c3y7);
                g.drawLine(this.c3x5, this.c3y5, this.c3x8, this.c3y8);
                g.drawLine(this.c3x7, this.c3y7, this.c3x8, this.c3y8);
                //draw cube4
                g.drawLine(this.c4x1, this.c4y1, this.c4x2, this.c4y2);
                g.drawLine(this.c4x1, this.c4y1, this.c4x4, this.c4y4);
                g.drawLine(this.c4x2, this.c4y2, this.c4x3, this.c4y3);
                g.drawLine(this.c4x3, this.c4y3, this.c4x4, this.c4y4);
                g.drawLine(this.c4x1, this.c4y1, this.c4x6, this.c4y6);
                g.drawLine(this.c4x2, this.c4y2, this.c4x7, this.c4y7);
                g.drawLine(this.c4x3, this.c4y3, this.c4x8, this.c4y8);
                g.drawLine(this.c4x4, this.c4y4, this.c4x5, this.c4y5);
                g.drawLine(this.c4x6, this.c4y6, this.c4x5, this.c4y5);
                g.drawLine(this.c4x6, this.c4y6, this.c4x7, this.c4y7);
                g.drawLine(this.c4x5, this.c4y5, this.c4x8, this.c4y8);
                g.drawLine(this.c4x7, this.c4y7, this.c4x8, this.c4y8);
         }
        
        public void initPoints() {
            
            this.c1x1 = this.cube1.getVectorX2D()[0];
            this.c1y1 = this.cube1.getVectorY2D()[0];
            this.c1x2 = this.cube1.getVectorX2D()[1];
            this.c1y2 = this.cube1.getVectorY2D()[1];
            this.c1x3 = this.cube1.getVectorX2D()[2];
            this.c1y3 = this.cube1.getVectorY2D()[2];
            this.c1x4 = this.cube1.getVectorX2D()[3];
            this.c1y4 = this.cube1.getVectorY2D()[3];
            this.c1x5 = this.cube1.getVectorX2D()[4];
            this.c1y5 = this.cube1.getVectorY2D()[4];
            this.c1x6 = this.cube1.getVectorX2D()[5];
            this.c1y6 = this.cube1.getVectorY2D()[5];
            this.c1x7 = this.cube1.getVectorX2D()[6];
            this.c1y7 = this.cube1.getVectorY2D()[6];
            this.c1x8 = this.cube1.getVectorX2D()[7];
            this.c1y8 = this.cube1.getVectorY2D()[7];
            //
            this.c2x1 = this.cube2.getVectorX2D()[0];
            this.c2y1 = this.cube2.getVectorY2D()[0];
            this.c2x2 = this.cube2.getVectorX2D()[1];
            this.c2y2 = this.cube2.getVectorY2D()[1];
            this.c2x3 = this.cube2.getVectorX2D()[2];
            this.c2y3 = this.cube2.getVectorY2D()[2];
            this.c2x4 = this.cube2.getVectorX2D()[3];
            this.c2y4 = this.cube2.getVectorY2D()[3];
            this.c2x5 = this.cube2.getVectorX2D()[4];
            this.c2y5 = this.cube2.getVectorY2D()[4];
            this.c2x6 = this.cube2.getVectorX2D()[5];
            this.c2y6 = this.cube2.getVectorY2D()[5];
            this.c2x7 = this.cube2.getVectorX2D()[6];
            this.c2y7 = this.cube2.getVectorY2D()[6];
            this.c2x8 = this.cube2.getVectorX2D()[7];
            this.c2y8 = this.cube2.getVectorY2D()[7];
            //
            this.c3x1 = this.cube3.getVectorX2D()[0];
            this.c3y1 = this.cube3.getVectorY2D()[0];
            this.c3x2 = this.cube3.getVectorX2D()[1];
            this.c3y2 = this.cube3.getVectorY2D()[1];
            this.c3x3 = this.cube3.getVectorX2D()[2];
            this.c3y3 = this.cube3.getVectorY2D()[2];
            this.c3x4 = this.cube3.getVectorX2D()[3];
            this.c3y4 = this.cube3.getVectorY2D()[3];
            this.c3x5 = this.cube3.getVectorX2D()[4];
            this.c3y5 = this.cube3.getVectorY2D()[4];
            this.c3x6 = this.cube3.getVectorX2D()[5];
            this.c3y6 = this.cube3.getVectorY2D()[5];
            this.c3x7 = this.cube3.getVectorX2D()[6];
            this.c3y7 = this.cube3.getVectorY2D()[6];
            this.c3x8 = this.cube3.getVectorX2D()[7];
            this.c3y8 = this.cube3.getVectorY2D()[7];
            //
            this.c4x1 = this.cube4.getVectorX2D()[0];
            this.c4y1 = this.cube4.getVectorY2D()[0];
            this.c4x2 = this.cube4.getVectorX2D()[1];
            this.c4y2 = this.cube4.getVectorY2D()[1];
            this.c4x3 = this.cube4.getVectorX2D()[2];
            this.c4y3 = this.cube4.getVectorY2D()[2];
            this.c4x4 = this.cube4.getVectorX2D()[3];
            this.c4y4 = this.cube4.getVectorY2D()[3];
            this.c4x5 = this.cube4.getVectorX2D()[4];
            this.c4y5 = this.cube4.getVectorY2D()[4];
            this.c4x6 = this.cube4.getVectorX2D()[5];
            this.c4y6 = this.cube4.getVectorY2D()[5];
            this.c4x7 = this.cube4.getVectorX2D()[6];
            this.c4y7 = this.cube4.getVectorY2D()[6];
            this.c4x8 = this.cube4.getVectorX2D()[7];
            this.c4y8 = this.cube4.getVectorY2D()[7];
        }
        
        public ArrayList<Cube> getCubes() {
            ArrayList<Cube> a = new ArrayList();
            a.add(this.cube1);
            a.add(this.cube2);
            a.add(this.cube3);
            a.add(this.cube4);
            return a;
        }
        
        public void setCubes(ArrayList<Cube> a) {
            this.cube1 = a.get(0);
            this.cube2 = a.get(1);
            this.cube3 = a.get(2);
            this.cube4 = a.get(3);
            
        }
    
}
