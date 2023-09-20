import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Lektion 7 September
        Scanner sc = new Scanner(System.in);
        int tal = 3;        // talet 3, kan räkna med den
        String tal2 = "3";   // är tecknet 3, kan inte räkna med

        System.out.println("Skriv in ett tal");
        int answer1 = sc.nextInt();                         // bufferten måste rensas pga entertecknet efter 3an, löses genom att alltid lägga till en nextLine efter man använt en nextInt
        sc.nextLine();

        System.out.println("Skriv ditt namn");
        String name = sc.nextLine();                // denna kommer ta entertecknet som nestLine

        System.out.println("tal: " + answer1);
        System.out.println("namn: " + name);










// Lektion 11 September
        // göra en funktion som kollar om något är ett palindrom
        // skapa Scanner
        Scanner sc = new Scanner(System.in);

        // 1.  läs in från användaren
        System.out.println("Skriv in ett ord eller mening:");
        String input = sc.nextLine();           // sc.nextLine();   såhär ser en funktion ut, parenteser etc.


        // 2. räkna ut  (funktionen)
        boolean answer = isPalindromAlt(input);

        // 3. presentera resultatet
        System.out.println("Är det ett palindrom? " + answer);
    }
    // denna vecka får alla funktioner vara static, nästa vecka inte
    static boolean isPalindrom(String text){
        StringBuilder builder = new StringBuilder();

        builder.append(text);
        String reversedText = builder.reverse().toString();
        boolean isEqual = text.equals(reversedText);    // när man jämför strängar inte == utan .equals används  //behöver inte denna egewntligen utan kan skriva return direkt
        return isEqual;                  // "answer" är utanför måsvingarna så har ingenting med answer tidigare att göra

        // övning gör detta genom for loop istället
    }

    //d a v i d
//0 1 2 3 4
    static boolean isPalindromAlt(String text) {
        int lastPos = text.length() - 1;

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != text.charAt(lastPos - i)){    // ett annat sätt att skriva utan "int lastPos = text.length() - 1;"
                return false;

            }

        }

        return true;


    }

}
