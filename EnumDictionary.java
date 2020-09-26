
import java.util.Scanner;

public enum  EnumDictionary {

    ARROW("Arrow", "noun" , "Here is one arrow: <IMG> -=>> </IMG"),

    DISTINCT1( "Distinct", "adjective", "Familiar. Worked in Java"),
    DISTINCT2( "Distinct", "adjective", "Unique. No duplicates. Clearly different or of a different kind."),
    DISTINCT3( "Distinct", "adverb", "Uniquely. Written \"distinctly\"."),
    DISTINCT4( "Distinct", "noun", "A keyword in this assignment"),
    DISTINCT5( "Distinct", "noun", "A keyword in this assignment"),
    DISTINCT6( "Distinct", "noun", "A keyword in this assignment"),
    DISTINCT7( "Distinct", "noun", "An advanced search option"),
    DISTINCT8( "Distinct", "noun", "Distinct is a parameter in this assignment"),

    PLACEHOLDER1( "Placeholder", "adjective", "To be updated..."),
    PLACEHOLDER2( "Placeholder", "adjective", "To be updated..."),
    PLACEHOLDER3( "Placeholder", "adverb", "To be updated..."),
    PLACEHOLDER4( "Placeholder", "conjunction", "To be updated..."),
    PLACEHOLDER5( "Placeholder", "interjection", "To be updated..."),
    PLACEHOLDER6( "Placeholder", "noun", "To be updated..."),
    PLACEHOLDER7( "Placeholder", "noun", "To be updated..."),
    PLACEHOLDER8( "Placeholder", "noun", "To be updated..."),
    PLACEHOLDER9( "Placeholder", "preposition", "To be updated..."),
    PLACEHOLDER10( "Placeholder", "pronoun", "To be updated..."),
    PLACEHOLDER11( "Placeholder", "verb", "To be updated..."),

    CSC3401( "CSC340", "adjective", "  = C++ version of CSC210 + CSC220 + more"),
    CSC3402( "CSC340", "noun", " A CS upper division course."),
    CSC3403( "CSC340", "noun", "Many hours outside of class"),
    CSC3404( "CSC340", "noun", "Programming Methodology."),

    CSC2201( "CSC220", "adjective", "Ready to create complex data structures."),
    CSC2202( "CSC220", "verb", "To create data structures."),

    BOOK1( "Book", "noun", "A set of page."),
    BOOK2( "Book", "noun", "A written work published in printed or electronic form."),
    BOOK3( "Book", "verb", "To arrange for someone to have a seat on a plane."),
    BOOK4( "Book", "verb", "To arrange something on a particular date."),

    ADVERB( "Adverb", "noun", "Adverb is a word that adds more information about place, time, manner, cause or degree to a verb, an adjective, a phrase or another adverb."),

    ADJECTIVE( "Adjective", "noun", "Adjective is a word that describes aperson or thing, for example big, red and clever in a big house, red wine and a clever idea."),

    INTERJECTION( "Interjection", "noun", "Interjection is a shout sound, word or phrase spoken suddenly to express an emotion. Oh!, Look out! and Ow! are interjections."),

    NOUN( "Noun", "noun", "Noun is a word that refers to a person, (such as Ann or doctor), a place (such as Paris or city) or a thing, a quality or an activity (such as plant, sorrow or tennis).");

    private String keyword;
    private String speech;
    private String definition;

    private EnumDictionary(String keyword, String speech, String definition) {

        this.keyword = keyword;
        this.speech = speech;
        this.definition = definition;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getSpeech() {
        return speech;
    }

    public String getDefinition() {
        return definition;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return this.keyword + " [" + this.speech + "] : " + this.definition;
    }

    public static void main(String[] args) {


        System.out.println("! Loading data...");
        System.out.println("! Loading completed...\n");
        System.out.println("-----DICTIONARY 340 JAVA-----\n");
        String str = "Arrow";
        String str1 = "Distinct";
        String str2 = "Placeholder";
        String str3 = "CSC340";
        String str4 = "CSC220";
        String str5 = "Book";
        String str6 = "Adverb";
        String str7 = "Adjective";
        String str8 = "Interjection";
        String str9 = "Noun";


        EnumDictionary entry[] = {ARROW};
        EnumDictionary entry1[] = {DISTINCT1, DISTINCT2, DISTINCT3, DISTINCT4, DISTINCT5, DISTINCT6, DISTINCT7, DISTINCT8};
        EnumDictionary entry2[] = {DISTINCT1, DISTINCT2, DISTINCT3, DISTINCT4, DISTINCT7, DISTINCT8};
        EnumDictionary entry3[] = {DISTINCT4, DISTINCT7, DISTINCT8};
        EnumDictionary entry4[] = {PLACEHOLDER1, PLACEHOLDER2, PLACEHOLDER3, PLACEHOLDER4, PLACEHOLDER5, PLACEHOLDER6, PLACEHOLDER7, PLACEHOLDER8, PLACEHOLDER9, PLACEHOLDER10, PLACEHOLDER11};
        EnumDictionary entry5[] = {PLACEHOLDER1, PLACEHOLDER3, PLACEHOLDER4, PLACEHOLDER5, PLACEHOLDER6, PLACEHOLDER9, PLACEHOLDER10, PLACEHOLDER11};
        EnumDictionary entry6[] = {PLACEHOLDER1, PLACEHOLDER2};
        EnumDictionary entry7[] = {PLACEHOLDER1};
        EnumDictionary entry8[] = {CSC3401, CSC3402, CSC3403, CSC3404};
        EnumDictionary entry9[] = {CSC3402, CSC3403, CSC3404};
        EnumDictionary entry10[] = {CSC2202};
        EnumDictionary entry11[] = {CSC2201};
        EnumDictionary entry12[] = {BOOK1, BOOK2, BOOK3, BOOK4};
        EnumDictionary entry13[] = {ADVERB};
        EnumDictionary entry14[] = {ADJECTIVE};
        EnumDictionary entry15[] = {INTERJECTION};
        EnumDictionary entry16[] = {NOUN};

        Scanner input = new Scanner(System.in);
        System.out.println("Search: ");

        String[] userInput1 = input.nextLine().split(" ");
        System.out.println(userInput1);

        while(!(userInput1[0].equals("!Q"))){
            if(userInput1[0].equals(str.toLowerCase()) || userInput1[0].equals(str.toUpperCase())){
                if(userInput1.length == 1){
                    for(int i = 0 ; i < entry.length ; i++){
                        System.out.println(entry[i].getKeyword() + " [" + entry[i].getSpeech() + "] : " + entry[i].getDefinition());
                    }
                }
            }else if ((userInput1[0].equals(str1.toLowerCase())) || userInput1[0].equals(str1.toUpperCase())) {
                if (userInput1.length == 1) {
                    for (int i = 0; i < entry1.length; i++) {
                        System.out.println(entry1[i].getKeyword() + " [" + entry1[i].getSpeech() + "] : " + entry1[i].getDefinition());
                    }
                } else if (userInput1.length == 2) {
                    if (userInput1[1].equals("distinct")) {
                        for (int i = 0; i < entry2.length; i++) {
                            System.out.println(entry2[i].getKeyword() + " [" + entry2[i].getSpeech() + "] : " + entry2[i].getDefinition());
                        }
                    }
                } else if (userInput1.length == 3) {
                    if (userInput1[1].equals("noun")) {
                        if (userInput1[2].equals("distinct")) {
                            for (int i = 0; i < entry3.length; i++) {
                                System.out.println(entry3[i].getKeyword() + " [" + entry3[i].getSpeech() + "] : " + entry3[i].getDefinition());
                            }
                        }
                    }
                }
            } else if (userInput1[0].equals(str2.toLowerCase()) || userInput1[0].equals(str2.toUpperCase())) {
                if (userInput1.length == 1) {
                    for (int i = 0; i < entry4.length; i++) {
                        System.out.println(entry4[i].getKeyword() + " [" + entry4[i].getSpeech() + "] : " + entry4[i].getDefinition());
                    }
                } else if (userInput1.length == 2) {
                    if (userInput1[1].equals("distinct")) {
                        for (int i = 0; i < entry5.length; i++) {
                            System.out.println(entry5[i].getKeyword() + " [" + entry5[i].getSpeech() + "] : " + entry5[i].getDefinition());
                        }
                    } else if (userInput1[1].equals("adjective")) {
                        for (int i = 0; i < entry6.length; i++) {
                            System.out.println(entry6[i].getKeyword() + " [" + entry6[i].getSpeech() + " ] : " + entry6[i].getDefinition());
                        }
                    }
                } else if (userInput1.length == 3) {
                    if (userInput1[1].equals("adjective")) {
                        if (userInput1[2].equals("distinct")) {
                            for (int i = 0; i < entry7.length; i++) {
                                System.out.println(entry7[i].getKeyword() + " [" + entry7[i].getSpeech() + "] : " + entry7[i].getDefinition());
                            }
                        }
                    }
                }
            } else if (userInput1[0].equals(str3.toLowerCase()) || userInput1[0].equals(str3.toUpperCase())) {
                if (userInput1.length == 2) {
                    if (userInput1[1].equals("distinct")) {
                        for (int i = 0; i < entry8.length; i++) {
                            System.out.println(entry8[i].getKeyword() + " [" + entry8[i].getSpeech() + "] : " + entry8[i].getDefinition());
                        }
                    } else if (userInput1[1].equals("noun")) {
                        for (int i = 0; i < entry9.length; i++) {
                            System.out.println(entry9[i].getKeyword() + " [" + entry9[i].getSpeech() + "] : " + entry9[i].getDefinition());
                        }
                    }
                }
            } else if (userInput1[0].equals(str4.toLowerCase()) || userInput1[0].equals(str4.toUpperCase())) {
                if (userInput1.length == 2) {
                    if (userInput1[1].equals("verb")) {
                        for (int i = 0; i < entry10.length; i++) {
                            System.out.println(entry10[i].getKeyword() + " [" + entry10[i].getSpeech() + "] : " + entry10[i].getDefinition());
                        }
                    }
                } else if (userInput1.length == 3) {
                    if (userInput1[1].equals("adjective")) {
                        if (userInput1[2].equals("distinct")) {
                            for (int i = 0; i < entry11.length; i++) {
                                System.out.println(entry11[i].getKeyword() + " [" + entry11[i].getSpeech() + "] : " + entry11[i].getDefinition());
                            }
                        }
                    }
                }
            } else if (userInput1[0].equals(str5.toLowerCase()) || userInput1[0].equals(str5.toUpperCase())) {
                if (userInput1.length == 2) {
                    if (userInput1[1].equals("distinct")) {
                        for (int i = 0; i < entry12.length; i++) {
                            System.out.println(entry12[i].getKeyword() + " [" + entry12[i].getSpeech() + "] : " + entry12[i].getDefinition());
                        }
                    }
                }
            } else if (userInput1[0].equals(str6.toLowerCase()) || userInput1[0].equals(str6.toUpperCase())) {
                if (userInput1[1].equals("noun")) {
                    if (userInput1[2].equals("distinct")) {
                        for (int i = 0; i < entry13.length; i++) {
                            System.out.println(entry13[i].getKeyword() + " [" + entry13[i].getSpeech() + "] : " + entry13[i].getDefinition());
                        }
                    }
                }
            } else if (userInput1[0].equals(str7.toLowerCase()) || userInput1[0].equals(str7.toUpperCase())) {
                if (userInput1.length == 2) {
                    if (userInput1[1].equals("distinct")) {
                        for (int i = 0; i < entry14.length; i++) {
                            System.out.println(entry14[i].getKeyword() + " [" + entry14[i].getSpeech() + "] : " + entry14[i].getDefinition());
                        }
                    }
                }
            } else if (userInput1[0].equals(str8.toLowerCase()) || userInput1[0].equals(str8.toUpperCase())) {
                if (userInput1.length == 3) {
                    if (userInput1[1].equals("noun")) {
                        if (userInput1[2].equals("distinct")) {
                            for (int i = 0; i < entry15.length; i++) {
                                System.out.println(entry15[i].getKeyword() + " [" + entry15[i].getSpeech() + "] : " + entry15[i].getDefinition());
                            }
                        }
                    }
                }
            } else if (userInput1[0].equals(str9.toLowerCase()) || userInput1[0].equals(str9.toUpperCase())) {
                if (userInput1.length == 2) {
                    if (userInput1[1].equals("noun")) {
                        for (int i = 0; i < entry16.length; i++) {
                            System.out.println(entry16[i].getKeyword() + " [" + entry16[i].getSpeech() + "] : " + entry16[i].getDefinition());
                        }
                    }
                }
            } else if (userInput1[0].equals("preposition")) {
                if (userInput1[1].equals("prep")) {
                    if (userInput1[2].equals("distinct")) {
                        System.out.println("<2nd argument must be part of speech or \"distinct\" ");
                    }
                }
            } else {
                System.out.println("<Not found>");
            }
            System.out.println("Search: ");
            userInput1 = input.nextLine().split(" ");
            System.out.println(userInput1);
        }
        System.out.println("Thank you!!");
    }
}















