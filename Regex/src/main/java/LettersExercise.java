public class LettersExercise {
    public static void main(String[] args) {

        System.out.println(returnOrdinal('d'));
        System.out.println(returnAlphabet(1));
        System.out.println(returnAlphabet(26));
        System.out.println(returnAlphabet(16));

        System.out.println((int) 'a');
        System.out.println(playChess("a5"));

    }

    private static int returnOrdinal(char letter)
    {
        return Letters.valueOf(Character.toString(letter).toUpperCase()).ordinal()+1;
    }

    public static String returnAlphabet(int num )
    {
        return Letters.values()[num-1].name();
    }

    private static StringBuilder playChess(String inpt)
    {
        StringBuilder s = new StringBuilder();

            char chr = inpt.charAt(0);
            int second = Integer.parseInt(Character.toString(inpt.charAt(1)));
            int first = chr - 97;
            System.out.println(chr);
            System.out.println(first);
            System.out.println(second);
            second=8-second;
            s.append(first);
            s.append(", ");
            s.append(second);

        return s;
    }
}
