package org.launchcode.java.demos.java4python.restaurant;

// Create a MenuItem class with data fields for various qualities of the class
public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private String newness;


    // Getters/Setters addition

    private Double getPrice() {
        return price;
    }

    private void setPrice(Double aPrice) {
        price = aPrice;
    }

    private String getDescription() {
        return description;
    }

    private void setDescription(String aDescription){
        description = aDescription;
    }

    private String getCategory(){
        return category;
    }

    private void setCategory(String aCategory){
        category = aCategory;
    }

    private String newness(){
        return newness;
    }

    private void setNewness(String aNewness){
        newness = aNewness;
    }

}
