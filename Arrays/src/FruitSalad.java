
public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        
        //create a new instance of fruitsalad with a fix length of 12 pieces.
        String[] fruitSalad = new String[12];
        //set a counter variable to keep track of the length
        int saladCount = 0;

        
        //use a for each loop loop to iterate through each fruit
        for (String fruitItem : fruit) {
            if (isBerry(fruitItem) && saladCount < 12) {//check condition 
                fruitSalad[saladCount] = fruitItem;//if condition is met 
                saladCount++;//add the element to the counter variable
                
            } else if (isApple(fruitItem) && countApples(fruitSalad) < 2 && saladCount < 12) {// method with his argument is used as condition part
                fruitSalad[saladCount] = fruitItem;//saladcount here is the index of fruitsalad.
                saladCount++;
                
            } else if (isOrange(fruitItem) && countOranges(fruitSalad) < 2 && saladCount < 12) {
                fruitSalad[saladCount] = fruitItem;
                saladCount++;
            }
        }

        System.out.println("Fruit Salad: ");//print out each fruit name 
        for (String fruitItem : fruitSalad) {
            if (fruitItem != null) {// if the array is NOT empty 
                System.out.println(fruitItem);
            }
        }
        System.out.println("Total Fruits: " + saladCount);
    }

    
    //function that return a boolean , take the original string as argument
    public static boolean isBerry(String fruit) {//and check if the array contain that specific fruit, in this case berries
        return fruit.equals("Gooseberry") || fruit.equals("Blueberry") ||
                fruit.equals("Strawberry") || fruit.equals("Blackberry");
    }

    
    
    public static boolean isApple(String fruit) {
        return fruit.contains("Apple");
    }
    
    

    public static boolean isOrange(String fruit) {
        return fruit.contains("Orange");
    }
    
    

    public static int countApples(String[] fruitSalad) {//check how many apples are stored in the final array and return the number
        int count = 0;
        for (String fruit : fruitSalad) {
            if (fruit != null && isApple(fruit)) {
                count++;
            }
        }
        return count;
    }
    
    
    

    public static int countOranges(String[] fruitSalad) {//check how many oranges are stored in the final array and return the number
        int count = 0;
        for (String fruit : fruitSalad) {
            if (fruit != null && isOrange(fruit)) {
                count++;
            }
        }
        return count;
    }
}
