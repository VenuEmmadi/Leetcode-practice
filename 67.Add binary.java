class Solution {
     public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
      //two pointers starting from the back
        int i = a.length() - 1, j = b.length() -1, carry = 0; 
        while (i >= 0 || j >= 0) {
            int sum = carry; //if there is a carry from the last addition, add it to carry 
            if (j >= 0) sum += b.charAt(j--) - '0'; //we subtract '0' to get the int value of the char from the ascii
            if (i >= 0) sum += a.charAt(i--) - '0';
      //if sum==2 or sum==0 append 0 because cause 1+1 = (carry =1 ) and (sum =0 )
            sb.append(sum % 2); 
            carry = sum / 2; //if sum==2 we have a carry
        }
        if (carry != 0) sb.append(carry); //append the carry to the sb
        return sb.reverse().toString(); // reverse the sb Because we got answer reversely as computed.
    }
}