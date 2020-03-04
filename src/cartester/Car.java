/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;
import javax.swing.*;
/**
 *
 * @author aamir7110
 */
public class Car {
    
    private String carMake, carModel, carColor;
    private double carPrice,carYear,carDistance;
    
    
    //constructors
    public Car(){
    
        String make,model,color,year;
        
        make = JOptionPane.showInputDialog("Enter Car Make");
        if(make.equals("")|| make.equals(" ")){
            
            carMake = "Honda";
        }else{
        carMake = make;
    }
        
        model = JOptionPane.showInputDialog("Enter Car Model");
        if(model.equals("")|| model.equals(" ")){
            
            carModel = "Civic";
        }else{
        carModel = model;
    }
        color = JOptionPane.showInputDialog("Enter Car color");
        if(color.equals("")|| color.equals(" ")){
            
            carColor = "Red";
        }else{
        carColor = color;
    }
        year = JOptionPane.showInputDialog("Enter Car Year");
        if(year.equals("")|| year.equals(" ")){
            
            carYear = 2010;
        }else{
        carYear = Double.parseDouble(year);
    }
    }
    public Car(String cMake, String cModel, String cColor, Double cPrice, Double cYear, Double cDistance){
        
            String make,model,color,year,price,distance;
        
        make = JOptionPane.showInputDialog("Enter Car 2 Make");
        if(make.equals("")|| make.equals(" ")){
            
            carMake = "Honda";
        }else{
        carMake = make;
    }
        
        model = JOptionPane.showInputDialog("Enter Car 2 Model");
        if(model.equals("")|| model.equals(" ")){
            
            carModel = "Civic";
        }else{
        carModel = model;
    }
        color = JOptionPane.showInputDialog("Enter Car 2 color");
        if(color.equals("")|| color.equals(" ")){
            
            carColor = "Red";
        }else{
        carColor = color;
    }
        year = JOptionPane.showInputDialog("Enter Car 2 Year");
        if(year.equals("")|| year.equals(" ")){
            
            carYear = 2010;
        }else{
        carYear = Double.parseDouble(year);
    }
        price = JOptionPane.showInputDialog("Enter Car 2 Price");
        if(price.equals("")||price.equals(" ")){
            carPrice = 5423.64;
            
        }else{
            carPrice = Double.parseDouble(price);
        }
        distance = JOptionPane.showInputDialog("Enter Distance Travelled In Car 2");
        if(distance.equals("")||distance.equals(" ")){
            carDistance = 523423.64;
            
        }else{
            carDistance = Double.parseDouble(distance);
        }
        
    }
    public Car(String cMake, String cModel, Double cPrice){
    
        String make, model, price;
        
        make = JOptionPane.showInputDialog("Enter Car 3 Make");
        if(make.equals("")|| make.equals(" ")){
            
            carMake = "Honda";
        }else{
        carMake = make;
    }
        
        model = JOptionPane.showInputDialog("Enter Car 3 Model");
        if(model.equals("")|| model.equals(" ")){
            
            carModel = "Civic";
        }else{
        carModel = model;
    }
        price = JOptionPane.showInputDialog("Enter Car 3 Price");
        if(price.equals("")||price.equals(" ")){
            carPrice = 5423.64;
            
        }else{
            carPrice = Double.parseDouble(price);
        }
    }
    public String toString() {
    String output = "Make: " + carMake + "\n";
    output += "Model: " + carModel + "\n";
    output += "Color: " + carColor + "\n";
    output += "Price: " + carPrice + "\n";
    output += "Year: " + carYear +"\n";
    output += "Distance: "+ carDistance+ "\n";
    //output string is complete, return it
    return output;
  }
}
