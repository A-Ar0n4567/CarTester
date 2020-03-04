/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author aamir7110
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car1 = new Car();
        Car car2 = new Car("Ford","Escape","Red",67543.0,2005.0, 1234567.0);
        Car car3 = new Car("Audi", "A4", 7654.98);
        
        System.out.println(car1.toString());
        System.out.println("---------------");
        
        System.out.println(car2.toString());
        System.out.println("---------------");
        
        System.out.println(car3.toString());
        System.out.println("---------------");
    }
    
}
