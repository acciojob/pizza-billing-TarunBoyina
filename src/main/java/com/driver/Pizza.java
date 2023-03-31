package com.driver;

public class Pizza {


    //  private Boolean isVeg;
    public String bill;
    public int paperBag;
    public int cheesePrice;
    public int basePrice;
    public int totalprice;
    public int toppingPrice;
    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerator;

  boolean isBasePrice;

    public Pizza(Boolean isVeg) {
        if (isVeg) {
            basePrice = 300;
            toppingPrice = 70;
        } else {
            basePrice = 400;
            toppingPrice = 120;
        }
        paperBag = 20;
        cheesePrice = 80;
        isCheeseAdded = false;
        isPaperBagAdded = false;
        isToppingAdded = false;
        bill = "Base Price Of The Pizza: " + basePrice + "\n";
    }

    public int getPrice() {
        return totalprice;
    }

    public void addBasePrice() {
        if(isBasePrice == false){
            totalprice =totalprice+basePrice;
            isBasePrice = true;
        }
    }
    public void addExtraCheese() {
        if (isCheeseAdded == false) {
            totalprice = totalprice + cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (isToppingAdded == false) {
           totalprice = totalprice + toppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (isPaperBagAdded == false) {
            totalprice = totalprice + paperBag;
            isPaperBagAdded = true;
        }
    }

    public String getBill() {
        if (isBillGenerator == false) {


            if (isCheeseAdded == true) {
                bill = bill + "Extra Cheese Price: " + cheesePrice + "\n";
            }
            if (isToppingAdded == true) {
                bill = bill + "Extra Toppings Added: " + toppingPrice + "\n";
            }
            if (isPaperBagAdded == true) {
                bill = bill + "Paperbag Added: " + paperBag + "\n";
            }
totalprice =totalprice+basePrice;
            bill = bill + "Total Price: " + totalprice+ "\n";


            isBillGenerator = true;

        }
            return bill;
        }

    }
