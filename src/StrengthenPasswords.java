public class StrengthenPasswords {
    static String[] strengthenPasswords(String[] passwords) {

        String[] solution = new String[passwords.length];
        int counter = 0;
        for (String sub : passwords) {

            sub = sub.replaceAll("S", "5").replaceAll("s", "5");


            if (sub.length() > 0 && sub.length() % 2 == 0) {
                char[] charArray = sub.toCharArray();
                char firstChar = charArray[0];
                char lastChar = charArray[sub.length() - 1];
                if (Character.isUpperCase(firstChar)) {
                    firstChar = Character.toLowerCase(firstChar);
                } else if (Character.isLowerCase(firstChar)) {
                    firstChar = Character.toUpperCase(firstChar);
                }

                if (Character.isUpperCase(lastChar)) {
                    lastChar = Character.toLowerCase(lastChar);
                } else if (Character.isLowerCase(lastChar)) {
                    lastChar = Character.toUpperCase(lastChar);
                }
                charArray[0] = lastChar;
                charArray[charArray.length - 1] = firstChar;
                sub = String.valueOf(charArray);
            }

            if (sub.length() > 1
                    && sub.length() % 2 == 1
                    && Character.isDigit(sub.charAt(sub.length() / 2))) {
                sub = sub.substring(0, sub.length() / 2) + Integer.toString(2 * (sub.charAt(sub.length() / 2) - '0')) +
                        sub.substring((sub.length() / 2) + 1);
            }

            String str1 = "nextcapital";
            if (sub.toLowerCase().contains(str1) ) {
                String str2 = sub;
                int idx = str2.toLowerCase().indexOf(str1);
                String str3 = str2.substring(0, idx);
                String str4 = new StringBuilder(str2.substring(idx, idx + 4)).reverse().toString();
                String str5 = str2.substring(str3.length() + 4, str2.length());
                sub = str3 + str4 + str5;
            }

            solution[counter] = sub;
            counter++;
        }

        return solution;
    }


}
