package model;

public class Ice {
    
    private String name;
    private String type;
    private String[] yummy;
    private String toping;
    private int price;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the yummy
     */
    public String[] getYummy() {
        return yummy;
    }



    /**
     * @param yummy
     */
    public void setYummy(String[] yummy) {
        this.yummy = yummy;
    }
 
    public String getToping() {
        return toping;
    }

    /**
     * @param toping
     */
    public void setToping(String toping) {
        this.toping = toping;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

}


    

