package TakeAwayChallengeJava;
// import java.util.ArrayList;
import java.util.HashMap;

    public class TakeAway {

        //instance variable
        HashMap<String, Integer> menu;

        // /constructor
        public TakeAway() {
            this.menu = new HashMap<String, Integer>(){{
                // Add keys and values 
                               put("Burger", 5);
                               put("Fries", 3);
                               put("Soup", 5);
                               put("Vegan Burger", 7);
                         }} ;
        }


        public static void main(String[] args) {
          // Create a HashMap object 
         
      new TakeAway().seeDishName();
          

        }

        public String seeDishName() {
        for (String i : this.menu.keySet()) {
            System.out.println("Dish: " + i);

              }
              return null;
        }

        // public String seeDishPrice() {
        //     for (int i = 0; i < menu.size(); i++) {
        //     System.out.println(menu.get(i));
        //     }



    }
    //   for (String i : menu.keySet()) {
    //     System.out.println("item" + i + " price: " + menu.get(i));
    //   }

    // hash map
    // Array<Double> menu = new ArrayList<Double>(); {{
    // put("Burger", 5.00);
    // put("Fries", 3.00);
    // put("Soup", 5.00);
    // menu.add("Vegan Burger", 7.00);

    // }}

    // public Double main seeList() {
    //     for (int i = 0; i < menu.size(); i++) {
    //     System.out.println(menu.get(i));
    //     }
    // }
