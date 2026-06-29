package Phase1_DS.x1_Linear.String;

public class Builder {
    public static void main(String args[]){
        // ----- CREATE / DECLARE -----
        StringBuilder sb = new StringBuilder("batman");
        System.out.println(sb); // Output: batman

        // ----- READ -----
        // char at an index
        System.out.println(sb.charAt(0)); // Output: b

        // ----- UPDATE -----
        // set char at index 0 (Fixed the double parenthesis typo here)
        sb.setCharAt(0, 'p');
        System.out.println(sb); // Output: patman

        // insert a char at index 0
        sb.insert(0, 's');
        System.out.println(sb); // Output: spatman

        // ----- DELETE -----
        // delete at a range (removes index 2, up to but excluding index 3)
        sb.delete(2, 3);
        System.out.println(sb); // Output: sptman

        // ----- UPDATE (APPEND) -----
        // adding elements at the very end
        sb.append("1");
        sb.append("2");
        sb.append("3");
        System.out.println(sb); // Output: sptman123

        // ----- CONVERSION (THE MISSING PIECE) -----
        // Converting the mutable buffer back to an immutable String contract
        String finalResult = sb.toString();
        System.out.println("Final String object: " + finalResult); // Output: sptman123
    }
}

// Solved LeetCode #1108 (Defanging an IP Address) & #1662 (Check If Two String Arrays are Equivalent)
