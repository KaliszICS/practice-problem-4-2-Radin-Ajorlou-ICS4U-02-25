/**
 * Is a class that stores a dogs name breed and weight 
 * @author Radin Ajorlou
 * @version 1.0.0
 */


public class Dog{

    //instance variables
    private String name;
    private String breed;
    private int weight;


    /**
     * Constructor - Stores the given name, breed and weight
     * @param name the name of the dog
     * @param breed the breed of the dog
     * @param weight the weight of the dog
     */
    public Dog(String name, String breed, int weight){
        this.name = name;
        this.breed = breed; 
        this.weight = weight;
    }

    /**
     * @return the name of the dog
     */
    public String getName(){
        return name;
    }

    /**
     * @return the breed of the dog
     */
    public String getBreed(){
        return breed;
    }

    /**
     * @return the weight of the dog
     */
    public int getWeight(){
        return weight;
    }

    /**
     * Changes the stored name of the dog
     * @param name is the string that is replacing the already stored name
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * Changes the stored breed of the dog
     * @param breed is the string that is replacing the already stored breed
     */
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    /**
     * Changes the stored weight of the dog
     * @param weight is the int that is replacing the already stored weight
     */
    public void setWeight(int weight){
        this.weight = weight;
    }


}