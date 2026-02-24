package Polimorphism;

class PropertyTax {
    public double calculateTax(double areaSqFt){
        return areaSqFt * 10; // Assuming tax is 10 per square foot
    }

    public double calculateTax(int PropertyValue){
        return PropertyValue * 2; // Assuming tax is 2% of the property value
    }

    public double calculateTax(double areaSqFt, double PropertyValue){
        return areaSqFt * PropertyValue; // Combining both tax calculations
    }
}

public class Overloading {
    public static void main(String[] args) {
        PropertyTax tax = new PropertyTax();
        System.out.println("Property Tax by area: " + tax.calculateTax(700.8)); 
        System.out.println("Property Tax by value: " + tax.calculateTax(700)); 
        System.out.println("Property Tax by area and value: " + tax.calculateTax(700, 400)); 
    }
}