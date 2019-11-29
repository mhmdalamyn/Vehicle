package projectoopinheritance;
import javax.swing.JOptionPane;
  abstract  class Vehicle {
    private static String powerSource;
    private static double numberOfWheels;
    public double price;

    public Vehicle(String powerSource,double numberOfWheels,double price){
        this.powerSource=powerSource;
        this.numberOfWheels=numberOfWheels;
        this.price=price;
    }

     public Vehicle(String powerSource,double numberOfWheels){
        this.powerSource=powerSource;
        this.numberOfWheels=numberOfWheels;
    }

   public void setPowerSource(String s){
       powerSource = JOptionPane.showInputDialog("Enter your power Source :");
       this.powerSource=powerSource;
    }

    String getPowerSource(){
      return this.powerSource;
    }

    public void setNumberOfWheels(double i){
        numberOfWheels= Double.parseDouble(JOptionPane.showInputDialog("Enter your number Of Wheels :"));
        this.numberOfWheels=numberOfWheels
                ;
    }

    double getNumberOfWheels(){
      return numberOfWheels;
    }

    public abstract void setPrice(double p);

    double getprice()
    {
      return price;
    }
    public String toString(){
    return getPowerSource()+"\n"+getNumberOfWheels()+"\n"+getprice();
    }
}