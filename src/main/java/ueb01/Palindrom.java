package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!

		if (s.length() == 1 || s.length() == 0)
		    return true;

        CharStack cs = new CharStackImpl();
        char[] chars = s.replaceAll("\\s", "").toLowerCase().toCharArray();

        int  i = 0;

        if (chars.length % 2 == 0) {
            for (; cs.size() < chars.length / 2; i++) {
                cs.push(chars[i]);
            }
            for (; cs.size() > 0; i++) {
                if (cs.pop() == chars[i])
                    continue;

                return false;
            }
            return true;
        }

        if (chars.length % 2 == 1) {
            for (; cs.size() < chars.length / 2; i++) {
                cs.push(chars[i]);
            }

            i++;

            for (; cs.size() > 0; i++) {
                if (cs.pop() == chars[i])
                    continue;

                return false;
            }
            return true;
        }

        return true;
	}
}
