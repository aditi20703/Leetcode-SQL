class Solution {
    public int findComplement(int num) {
        String binaryString =Integer.toBinaryString(num);
        StringBuilder complementString = new StringBuilder();
        for (int i = 0 ;i < binaryString.length();i++ ){
            int temp = binaryString.charAt(i) - '0';
            temp = temp ^1 ;
             complementString.append(temp);

        }
        return Integer.parseInt(complementString.toString(),2);
    }
}