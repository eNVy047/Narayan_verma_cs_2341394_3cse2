class LoopBasics {
    public static void main(String[] args) {
        // Java me Loops kya hote hain?
        // Jab humein koi same kaam baar-baar karna hota hai, toh hum loops use karte
        // hain.
        // For example: 1 se 10 tak numbers print karne ke liye.

        // ---- 1. FOR LOOP ----
        // For loop tab use hota hai jab humein pata ho kitni baar repeat karna hai.
        System.out.println("--- For Loop ---");
        for (int i = 1; i <= 5; i++) {
            // (Start ; Condition ; Step)
            // Start: 'int i = 1' (Loop 1 se chalu hoga)
            // Condition: 'i <= 5' (Jab tak i 5 tak hai tab tak chalega)
            // Step: 'i++' (Har baar i ko 1 se badhao)
            System.out.println("For Loop Count: " + i);
        }

        // ---- 2. WHILE LOOP ----
        // While loop tab use hota hai jab pehle condition check karni ho aur jab tak
        // condition true ho chalate rehna ho.
        System.out.println("--- While Loop ---");
        int j = 1;
        while (j <= 3) {
            // Jab tak j 3 ya usse chota hai
            System.out.println("While Loop Count: " + j);
            j++; // 'j++' likhna zaroori hai, warna infinite (kabhi na rukne wala) loop ban
                 // jayega.
        }

        // ---- 3. DO-WHILE LOOP ----
        // Do-while loop kam se kam ek baar zaroor chalta hai, chahe condition galat kyu
        // na ho!
        System.out.println("--- Do-While Loop ---");
        int k = 10;
        do {
            System.out.println("Do-While Loop Count: " + k); // Yeh 10 print hoga ek baar
            k++;
        } while (k <= 5); // Phir condition false ho jayegi

        // --- SHORT NOTES ---
        // For Loop: for (int i = 0; i < n; i++) {}
        // While Loop: while (condition) {}
        // Do-While Loop: do {} while (condition);
    }
}
