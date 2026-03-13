class VariablesAndDataTypes {
    public static void main(String[] args) {
        // Java me variables kya hote hain? (What are variables in Java?)
        // Variables simple containers hote hain jo data store karte hain.
        // Jab bhi humein memory me koi value rakhni hoti hai, hum variable banate hain.

        // 1. Primitive Data Types (Jo pehle se defined hote hain)

        // Integer (Whole numbers ke liye)
        int age = 20; // 'int' keyword hai, 'age' variable ka naam hai, 20 value hai.

        // Decimal numbers (Points wale numbers ke liye)
        double price = 99.99; // 'double' badi decimal values store karta hai
        float pi = 3.14f; // 'float' choti decimal values ke liye (hamesha last me 'f' lagana padta hai)

        // Single Character (Ek single alphabet ya symbol)
        char grade = 'A'; // 'char' hamesha single quotes me likhte hain

        // Boolean (Sirf True ya False)
        boolean isPassed = true; // Condition check karne ke kaam aata hai

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Passed? " + isPassed);

        // 2. Non-Primitive Data Types (Objects, Arrays, etc.)
        // String (Multiple characters / Text ke liye)
        String name = "Rahul"; // 'String' hamesha double quotes me likhte hain

        System.out.println("Name: " + name);

        // --- SHORT NOTES ---
        // Syntax: DataType variableName = value;
        // int -> Number ke liye
        // float/double -> Decimal ke liye
        // char -> Ek character ke liye ('A')
        // String -> Pura word/sentence ke liye ("Hello")
        // boolean -> true/false ke liye
    }
}
