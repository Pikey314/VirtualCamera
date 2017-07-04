/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualcamera;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

/**
 *
 * @author maciej.pikulicki
 */
public class Cube {
    private double[] vectorX3D;
    private double[] vectorY3D;
    private double[] vectorZ3D;
    private int[] vectorX2D;
    private int[] vectorY2D;
    private int[] vectorZ2D;
    double d;
    double zoom;
    double resetzoom;
   
    
    
    
    
    public Cube(double x, double y, double z, double width, double height, double depth){
        this.d = 355;
        this.zoom = this.d;
        this.resetzoom = this.d;
        this.vectorX3D = new double[8];
        this.vectorY3D = new double[8];
        this.vectorZ3D = new double[8];
        this.vectorX2D = new int[8];
        this.vectorY2D = new int[8];
        this.vectorZ2D = new int[8];
        this.vectorX3D[0] = x;
        this.vectorY3D[0] = y;       
        this.vectorZ3D[0] = z; 
        this.vectorX3D[1] = x;
        this.vectorY3D[1] = y+height;       
        this.vectorZ3D[1] = z;  
        this.vectorX3D[2] = x+width;
        this.vectorY3D[2] = y+height;       
        this.vectorZ3D[2] = z;  
        this.vectorX3D[3] = x+width;
        this.vectorY3D[3] = y;       
        this.vectorZ3D[3] = z; 
        //
        this.vectorX3D[4] = x+width;
        this.vectorY3D[4] = y;       
        this.vectorZ3D[4] = z+depth;  
        this.vectorX3D[5] = x;
        this.vectorY3D[5] = y;       
        this.vectorZ3D[5] = z+depth;
        this.vectorX3D[6] = x;
        this.vectorY3D[6] = y+height;       
        this.vectorZ3D[6] = z+depth;  
        this.vectorX3D[7] = x+width;
        this.vectorY3D[7] = y+height;       
        this.vectorZ3D[7] = z+depth;  
        
    }
    
    
    
    public void convertTo2D(){
        double zView[] = new double[8];
        for (int i = 0; i<=7; i++){
            if (this.vectorZ3D[i] <= 0.00001){
                zView[i] = 0.00001;
            } else {
            zView[i]=this.vectorZ3D[i];
            }
            
        }
        
        for (int i = 0; i<=7; i++){
      
            this.vectorX2D[i] = (int) ((this.vectorX3D[i] * this.d) / (zView[i]));
            this.vectorY2D[i] = (int) ((this.vectorY3D[i] * this.d) / (zView[i]));
            //this.vectorZ2D[i] = d;
            
            
           
        }  
        //for (int i = 0; i<=7; i++){
        System.out.println("*********************");
        for (int i = 0; i<=7; i++)
         System.out.println(i + "[ X:" + this.vectorX3D[i] + " Y:" + this.vectorY3D[i] + " Z:" + this.vectorZ3D[i] + " ]");
        System.out.println();
        System.out.println("2D");
        for (int i = 0; i<=7; i++)
        System.out.println(i + "[ X:" + this.vectorX2D[i] + " Y:" + this.vectorY2D[i] + " ]");
        System.out.println("*********************");
    
    }
    
    public void zoomMinus () {
        /*
    this.zoom = this.zoom + 10;
    for (int i = 0; i<=7; i++){
            if (this.vectorZ3D[i] == 0){
            this.vectorX2D[i] = (int) this.vectorX3D[i];
            this.vectorY2D[i] = (int) this.vectorY3D[i];  
            } else {
            this.vectorX2D[i] = (int) (this.vectorX3D[i] * this.zoom / (this.vectorZ3D[i]));
            this.vectorY2D[i] = (int) (this.vectorY3D[i] * this.zoom / (this.vectorZ3D[i]));
            //this.vectorZ2D[i] = d;
            }
        } 
     */
        this.d = this.d + 10;
        convertTo2D();
    }
    
        public void zoomPlus () {
    /*
    this.zoom = this.zoom - 10;
    for (int i = 0; i<=7; i++){
            if (this.vectorZ3D[i] == 0){
            this.vectorX2D[i] = (int) this.vectorX3D[i];
            this.vectorY2D[i] = (int) this.vectorY3D[i];  
            } else {
            this.vectorX2D[i] = (int) (this.vectorX3D[i] * this.zoom / (this.vectorZ3D[i]));
            this.vectorY2D[i] = (int) (this.vectorY3D[i] * this.zoom / (this.vectorZ3D[i]));
            //this.vectorZ2D[i] = d;
            }
        }  
    */
    this.d = this.d - 10;
    convertTo2D();
    }
    
    public void goRight() {
        for (int i = 0; i<=7; i++)
        this.vectorX3D[i] = this.vectorX3D[i] + 1;
        convertTo2D();
    }
    
     public void goLeft() {
        for (int i = 0; i<=7; i++)
        this.vectorX3D[i] = this.vectorX3D[i] - 1;
        convertTo2D();
    }
    
    public void goUp() {
        for (int i = 0; i<=7; i++)
        this.vectorY3D[i] = this.vectorY3D[i] - 1;
        convertTo2D();
    }
    
    public void goDown() {
        for (int i = 0; i<=7; i++)
        this.vectorY3D[i] = this.vectorY3D[i] + 1;
        convertTo2D();
    }
    
    public void goBack() {
        for (int i = 0; i<=7; i++){
        this.vectorZ3D[i] = this.vectorZ3D[i] - 1;
        //if(this.vectorZ3D[i] == 0)
        //    this.vectorZ3D[i] = 1;
        }
        convertTo2D();
    }
    
    public void goForward() {
        for (int i = 0; i<=7; i++){
        this.vectorZ3D[i] = this.vectorZ3D[i] + 1;
        //if(this.vectorZ3D[i] == 0)
        //    this.vectorZ3D[i] -= 1;
        }
        convertTo2D();
    }
    
    public void rotYRight() {
        
       double fi = Math.PI/18;
       double tempX3D;
       double tempZ3D;
        for (int i = 0; i<=7; i++){
        tempX3D = (this.vectorX3D[i]*Math.cos(fi))+(this.vectorZ3D[i]*Math.sin(fi));
        tempZ3D = (this.vectorX3D[i]*Math.sin(fi)*(-1))+(this.vectorZ3D[i]*Math.cos(fi));
        this.vectorX3D[i] = tempX3D;
        this.vectorZ3D[i] = tempZ3D;
        }
        convertTo2D(); 
       
       /*
       goRight();
       goRight();
       goRight();
       goRight();
       goRight();
       goRight();
       goRight();
       goRight();
       goRight();
       goForward();
       goForward();
       */
    }
    
    public void rotYLeft() {
        
       double fi = (Math.PI*2) - Math.PI/18;
       double tempX3D;
       double tempZ3D;
        for (int i = 0; i<=7; i++){
        tempX3D = (this.vectorX3D[i]*cos(fi)+this.vectorZ3D[i]*sin(fi));
        tempZ3D = (this.vectorX3D[i]*sin(fi)*(-1)+this.vectorZ3D[i]*cos(fi));
        this.vectorX3D[i] = tempX3D;
        this.vectorZ3D[i] = tempZ3D;
        }
        convertTo2D(); 
        
       /*
       goLeft();
       goLeft();
       goLeft();
       goLeft();
       goLeft();
       goLeft();
       goLeft();
       goLeft();
       goLeft();
       goForward();
       goForward();
       */
    }
    
    public void rotZLeft() {
     double tempX3D;
     double tempY3D;
     double fi = Math.PI/18;
        for (int i = 0; i<=7; i++){
         tempX3D = (this.vectorX3D[i]*cos(fi)-this.vectorY3D[i]*sin(fi));
         tempY3D = (this.vectorX3D[i]*sin(fi)+this.vectorY3D[i]*cos(fi));
        this.vectorX3D[i] = tempX3D;
        this.vectorY3D[i] = tempY3D;
        }
     convertTo2D();
    }
    
    public void rotZRight() {
     double tempX3D;
     double tempY3D;
     double fi = (Math.PI*2) - Math.PI/18;
       for (int i = 0; i<=7; i++){
        tempX3D = (this.vectorX3D[i]*cos(fi)-this.vectorY3D[i]*sin(fi));
        tempY3D = (this.vectorX3D[i]*sin(fi)+this.vectorY3D[i]*cos(fi));
        this.vectorX3D[i] = tempX3D;
        this.vectorY3D[i] = tempY3D;
       }
     convertTo2D();
    }
    
    public void rotXUp() {
     double tempY3D;
     double tempZ3D;   
     double fi = Math.PI/18;
        for (int i = 0; i<=7; i++){
         tempY3D = (this.vectorY3D[i]*cos(fi)-this.vectorZ3D[i]*sin(fi));
         tempZ3D = (this.vectorY3D[i]*sin(fi)+this.vectorZ3D[i]*cos(fi));
        this.vectorZ3D[i] = tempZ3D;
        this.vectorY3D[i] = tempY3D;
        }
     convertTo2D();
     /*
     goUp();
     goUp();
     goUp();
     goUp();
     goUp();
     goUp();
     goForward();
     */
    }
    
    public void rotXDown() {
     double tempY3D;
     double tempZ3D;   
     double fi = (Math.PI*2) - Math.PI/18;
        for (int i = 0; i<=7; i++){
         tempY3D = (this.vectorY3D[i]*cos(fi)-this.vectorZ3D[i]*sin(fi));
         tempZ3D = (this.vectorY3D[i]*sin(fi)+this.vectorZ3D[i]*cos(fi));
       this.vectorZ3D[i] = tempZ3D;
       this.vectorY3D[i] = tempY3D;
      }
     convertTo2D();
     /*
     goDown();
     goDown();
     goDown();
     goDown();
     goDown();
     goDown();
     goForward();
     */
    }
    
    
    public double[] getVectorX3D(){
        return vectorX3D;
    }
    public double[] getVectorY3D(){
        return vectorY3D;
    }
    public double[] getVectorZ3D(){
        return vectorZ3D;
    }
    public int[] getVectorX2D(){
        return vectorX2D;
    }
    public int[] getVectorY2D(){
        return vectorY2D;
    }
}


 /*
  6 ___________5
  /|          /|
1/_|________4/ |
|  |        |  |
|  |7_______|__|8
| /         | /
|/__________|/
2          3

    
    
*/