/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht17;

/**
 *
 * @author antti
 */
public class StringThing {
   public static void main(String[] args) {
      String fly = "fly", weight = "weight";
      String fly2 = "fly", weight2 = "weight";
      System.out.println(fly == fly2);       // fly and fly2 refer to the same String instance
      System.out.println(weight == weight2); // weight and weight2 also refer to
                                             // the same String instance
      String distinctString = fly + weight;
      System.out.println(distinctString == "flyweight"); // flyweight and "flyweight" do not
                                                         // refer to the same instance
      String flyweight = (fly + weight).intern();
      System.out.println(flyweight == "flyweight"); // The intern() method returns a flyweight
   }
}
