package gr.aueb.cf.ch8;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {

        String s = "AUEB";
        String copied = null;

        Optional<String> str = getStrCopy(s);

        if (str.isPresent()) {      //ελεγχει αν εχει κατι μεσα
            copied = str.get();
        }

        System.out.println(copied);




//        String s = null;
//        String str = getCopy(s);
//        if ( (str != null) && (str.equals("AUEB"))) {
//
//            System.out.println(str);
//        }

    }


    public static String getCopy (String s) {

        return s;
    }

    public static Optional<String> getStrCopy(String s) {

//        return Optional.ofNullable(s);

//        ή

        if (s == null) return Optional.empty();
        return Optional.of(s);
    }
}
