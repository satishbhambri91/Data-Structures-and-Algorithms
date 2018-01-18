public class Strnthn {

    static String[] strengthenPasswords(String[] passwords) {

        int i = 0;
        String[] result = new String[passwords.length];
        for (String sS : passwords) {

            sS = sS.replaceAll("S", "5").replaceAll("s", "5");
            if (sS.length() > 1
                    && sS.length() % 2 == 1
                    && Character.isDigit(sS.charAt(sS.length() / 2))) {
                sS = sS.substring(0, sS.length() / 2) + Integer.toString(2 * (sS.charAt(sS.length() / 2) - '0')) +
                        sS.substring((sS.length() / 2) + 1);
            }

            if (sS.length() > 0 && sS.length() % 2 == 0) {
                char[] characterArr = sS.toCharArray();
                char fC = characterArr[0];
                char lC = characterArr[sS.length() - 1];
                if (Character.isLowerCase(fC)) {
                    fC = Character.toUpperCase(fC);
                } else if (Character.isUpperCase(fC)) {
                    fC = Character.toLowerCase(fC);
                }

                if (Character.isUpperCase(lC)) {
                    lC = Character.toLowerCase(lC);
                } else if (Character.isLowerCase(lC)) {
                    lC = Character.toUpperCase(lC);
                }
                characterArr[0] = lC;
                characterArr[characterArr.length - 1] = fC;
                sS = String.valueOf(characterArr);
            }

            String a = "nextcapital";
            if (sS.toLowerCase().contains(a) ) {
                String s4 = sS;
                int index = s4.toLowerCase().indexOf(a);
                String s1 = s4.substring(0, index);
                String s2 = new StringBuilder(s4.substring(index, index + 4)).reverse().toString();
                String s3 = s4.substring(s1.length() + 4, s4.length());
                sS = s1 + s2 + s3;
            }

            result[i] = sS;
            i++;
        }

        return result;
    }




}
