package poo_ex4.Ex_44;

/*
 */
public class Geometrica {
    
    private double base;
    private double area;
    
    public Geometrica(){
        this.base=0;
    }
    
    public Geometrica(double base){
        this.base=base;
    }
    
    public double getArea(){
        return this.area;
    }
    
    void setArea(double area){
        this.area=area;
    }
    
    double getBase(){
        return this.base;
    }
    
    public void calculaArea(){
        this.area=this.base*this.base;
    }
    
    public void imprimir(){
        System.out.print("A area mede "+area+" cm2\n");
    }
    
}
