package chapter6;

public class PhoneBill {
    private double baseCost, allottedMins, usedMins;
    private int id;

    // Default constructor
    public PhoneBill(){
        setId(0);
        setBaseCost(0);
        setAllottedMins(0);
        setUsedMins(0);
    }

    //Overloaded constructor using just ID
    public PhoneBill(int id){
        setId(id);
    }

    //Overloaded constructor setting all fields
    public PhoneBill(int id, double baseCost, double allottedMins, double usedMins){
        setId(id);
        setBaseCost(baseCost);
        setAllottedMins(allottedMins);
        setUsedMins(usedMins);
    }

    public double calculateOverage(){
        if(usedMins <= allottedMins){
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = usedMins - allottedMins;
        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return Math.ceil(taxRate * (getBaseCost() + calculateOverage()));
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }

    // Getters and Setters
    public double getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public double getAllottedMins(){
        return allottedMins;
    }

    public void setAllottedMins(double allottedMins){
        this.allottedMins = allottedMins;
    }

    public double getUsedMins(){
        return usedMins;
    }

    public void setUsedMins(double usedMins){
        this.usedMins = usedMins;
    }

}
