class ConditionalsIfElse {
    public static void main(String[] args) {
        // Java me If-Else conditions kaise lagate hain?
        // Hum programs me conditions isliye lagate hain jab humein decision lena ho.
        // Jaise agar baarish hogi toh chata (umbrella) lenge, warna nahi.

        int age = 18;

        // ---- 1. Simple If-Else ----
        if (age >= 18) {
            // Agar condition TRUE (sahi) hai toh ye part run hoga.
            System.out.println("Aap Voting kar sakte ho. (You can Vote)");
        } else {
            // Agar condition FALSE (galat) hai toh ye part run hoga.
            System.out.println("Aap Voting nahi kar sakte. (You can't Vote)");
        }

        // ---- 2. If-Else If (Multiple Conditions) ----
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B"); // Kyuki marks 85 hain, ye print hoga
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail ya passing marks hain.");
        }

        // --- SHORT NOTES ---
        // if (condition) {
        // // Kya karna hai agar condition true ho.
        // } else {
        // // Kya karna hai agar condition false ho.
        // }
    }
}
