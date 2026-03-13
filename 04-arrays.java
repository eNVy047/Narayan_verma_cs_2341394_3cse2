class ArraysBasics {
    public static void main(String[] args) {
        // Java me Arrays kya hote hain?
        // Jab humein ek hi type ke bahut saare data ko store karna hota hai, toh hum
        // 'Array' banate hain.
        // Jaise 50 students ke marks rakhne hain toh 50 variables banane ke bajaye 1
        // array banate hain.

        // ---- 1. Array Banane ka Tarika (Declaration & Initialization) ----
        // Type[] arrayName = new Type[size];

        int[] marks = new int[5]; // Ye ek integer array hai jo 5 values hold kar sakta hai

        // Array me values daalna (Indexes start at 0)
        marks[0] = 85; // Pehle sthan/index (0) par 85
        marks[1] = 90;
        marks[2] = 78;
        marks[3] = 92;
        marks[4] = 88; // Aakhri index size - 1 (5 - 1 = 4) par hota hai

        // Ya fir seedha values dekar banana:
        String[] friends = { "Rahul", "Aman", "Priya", "Neha" };

        // ---- 2. Array ki Values Print Karna ----
        System.out.println("Pehla dost: " + friends[0]); // Rahul print hoga

        // Array print karne ke liye Loop ka best use hota hai
        System.out.println("--- Mere sabhi dost ---");
        for (int i = 0; i < friends.length; i++) {
            // 'friends.length' se array ki size milti hai (yahan 4 hai)
            System.out.println(friends[i]);
        }

        // ---- 3. For-Each Loop (Array ke liye aasaan loop) ----
        System.out.println("--- Marks For-Each Loop se ---");
        for (int m : marks) {
            // "Har marks 'm' ke liye jo 'marks' array me hai, use print karo"
            System.out.println(m);
        }

        // --- SHORT NOTES ---
        // int[] arr = new int[3]; // Khali array banaya 3 size ka
        // int[] arr2 = {1, 2, 3}; // Values ke sath banaya
        // Index hamesha 0 se start hota hai
        // Aakhri index 'length - 1' hota hai
    }
}
