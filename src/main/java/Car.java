/**
 * A class that stores a cars make, model, year and price
 * @author Radin Ajorlou
 * @version 1.0.0
 */

public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Takes in the make, model, year and price of a car
     * @param make String - make of the car
     * @param model String - model of the car
     * @param year int - year of the car 
     * @param price double - price of the car
     */
    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Gets the make of the car
     * @return String - the make of the car
     */
    public String getMake(){
        return make;
    }

    /**
     * Get the model of the car
     * @return String - the model of the car
     */
    public String getModel(){
        return model;
    }

    /**
     * Get the year of the car
     * @return int - the year of the car
     */
    public int getYear(){
        return year;
    }

    /**
     * Get the price of the car
     * @return int - the priice of the car
     */
    public double getPrice(){
        return price;
    }

    /**
     * Changes the stored make of the car
     * @param make String - replaces the currently stored make
     */
    public void setMake(String make){
        this.make = make;
    }

    /**
     * Changes the stored model of the car
     * @param model String - replaces the currently stored model
     */
    public void setModel(String model){
        this.model = model;
    }

    /**
     * Changes the stored year of the car
     * @param year int - replaces the currently stored year
     */
    public void setYear(int year){
        this.year = year;
    }

    /**
     * Changes the stored price of the car
     * @param price int - replaces the currently stored price
     */
    public void setPrice(double price){
        this.price = price;
    }
}
