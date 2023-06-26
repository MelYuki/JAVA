package be.tftic.webmobile.intro.demo.intro;

public class demoOperateur {

    public static void main(String[] args) {

        // OPERATEURS ARITHMETIQUES
        int a = 7, b = 3;
        double result;

        result = a + b; // 10
        result = a - b; // 4
        result = a * b; // 21
        result = a / b; // 2
        // System.out.println(result);
        result = (double)(a) / b; // 2.3333333333333335
        // System.out.println(result);
        result = a % b; // 1

            // RACCOURCIS
            result = 7;

            result = result + 1;
            result += 1;
            result -= 1;
            result *= 1;
            result /= 1;
            result %= 1;

            // POST & PRE INCREMENTATION
            int incDec = 0;

            System.out.println(incDec++); // 0
            System.out.println(++incDec); // 2
            System.out.println(incDec--); // 2
            System.out.println(--incDec); // 0

            System.out.println(incDec); // 0

            // REAFFECTATION
            int A = 3;
            System.out.println(A);
            int B = A = 5;
            System.out.println(A);
            System.out.println(B);


        // OPERATIONS DE COMPARAISON
        System.out.println( a == b ); // Equivalant au triple = de js
        System.out.println( a != b );

        System.out.println( a <  b );
        System.out.println( a <= b );
        System.out.println( a >  b );
        System.out.println( a >= b );

            // PARENTHESE:
            // La StringPool
            String s1 = "salut";
            String s2 = "salut";
            String s3 = "sa" + "lut";
            String s4 = new String("salut");
            System.out.println(s1 == s2); // true
            System.out.println(s1 == s3); // true
            System.out.println(s1 == s4); // false


        // OPERATEURS LOGIQUES

            // AND - &&
            System.out.println( true && true );     // true
            System.out.println( true && false );    // false
            System.out.println( false && true );    // false
            System.out.println( false && false );   // false

            // OR - ||
            System.out.println( true && true );     // true
            System.out.println( true && false );    // false
            System.out.println( false && true );    // false
            System.out.println( false && false );   // false

            // NOT - !
            System.out.println(!true ); // false
            System.out.println(!false); // true

            // XOR - ^
            System.out.println( true ^ true );     // false
            System.out.println( true ^ false );    // true
            System.out.println( false ^ true );    // true
            System.out.println( false ^ false );   // false

            // LOI DE "De Morgan"
            boolean estBlue = true, estLigne = true;

            // Mon sac n'est pas et ligné et bleu
            System.out.println( !(estLigne && estBlue) );
            // Mon sac n'est pas ligné ou n'est pas bleu
            System.out.println( !estLigne || !estBlue );

            // Mon sac n'est pas ou ligné ou bleu
            System.out.println( !(estLigne || estBlue) );
            // Mon sac n'est pas ligné et n'est pas bleu
            System.out.println( !estLigne && !estBlue );

            // ->
            // !(a && b) <=> !a || !b
            // !(a || b) <=> !a && !b
    }
}
