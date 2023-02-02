package Vijay.Week2;

public class AddBinary {
    public String addBinary(String a, String b) {
        int len, carry = 0;
        int aLength = a.length();
        int bLength = b.length();
        StringBuilder sum = new StringBuilder();

        //len = Math.max(aLength, bLength);
        len = (aLength > bLength) ? aLength : bLength;

        for (int i = len - 1; i >= 0; i--) {
            char p = ((aLength - 1) >= 0) ? a.charAt(aLength - 1) : '0';
            char q = ((bLength - 1) >= 0) ? b.charAt(bLength - 1) : '0';

            System.out.println("p: " + p + ",  q: " + q);

            if (p == '1' && q == '1') {
                if(carry == 1) {
                    sum.insert(0, "1");
                }
                else {
                    sum.insert(0, "0");
                    carry = 1;
                }
            }
            else if ((p == '1' && q == '0') || (p == '0' && q == '1')) {
                if (carry == 1) {
                    sum.insert(0, "0");
                }
                else {
                    sum.insert(0, "1");
                }
            }
            else {
                if (carry == 1) {
                    sum.insert(0, "1");
                    carry = 0;
                }
                else {
                    sum.insert(0, "0");
                }
            }
            aLength--;
            bLength--;
        }

        if (carry == 1) {
            sum.insert(0, "1");
        }
        return sum.toString();
    }


/*      StringBuilder sba = new StringBuilder(a);
        StringBuilder sbb = new StringBuilder(b);
        StringBuilder result = new StringBuilder();
        int stringLength;
        int carry = 0;
        if (a.length() == b.length()) {
            stringLength = a.length();
        }
        else if (a.length() > b.length()) {
            stringLength = a.length();
            int diff = stringLength - b.length();
            while (diff > 0) {
                sbb.insert(0, "0");
                diff--;
            }
        }
        else {
            stringLength = b.length();
            int diff = stringLength - a.length();
            while (diff > 0) {
                sba.insert(0, "0");
                diff--;
            }
        }

        for (int i = stringLength - 1, j = stringLength - 1; i >= 0; i--, j--) {
            if (sba.charAt(i) == '1' && sbb.charAt(j) == '1') {
                if (carry == 1) {
                    result.append("1");
                    carry = 1;
                }else {
                    result.append("0");
                    carry = 1;
                }
            }
            else if ((sba.charAt(i) == '1' && sbb.charAt(j) == '0') || (sba.charAt(i) == '0' && sbb.charAt(j) == '1')) {
                if (carry == 0) {
                    result.append("1");
                }
                else {
                    result.append("0");
                    carry = 1;
                }
            }
            else {
                if (carry == 0) {
                    result.append("0");
                }
                else {
                    result.append("1");
                    carry = 0;
                }
            }
        }
        if (carry == 1) {
            result.append("1");
        }
        result.reverse();
        return result.toString();
    }
*/
}
