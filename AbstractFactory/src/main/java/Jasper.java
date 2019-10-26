/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antti
 */
public class Jasper {
    private Hat hat;
    private Pants pants;
    private Shirt shirt;
    private Shoes shoes;

    public Hat getHat() {
        return hat;
    }

    public Pants getPants() {
        return pants;
    }

    public Shirt getShirt() {
        return shirt;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public String toString() {
        return "Olen jasper ja minulla on päälläni \n"
                + "Hattu: " + hat +"\n"
                + "Kengät: " + shoes +"\n"
                + "Paita: " + shirt +"\n"
                + "Housut " + pants +"\n";
    }
    
}
