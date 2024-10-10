class Solution {
    public int reverse(int x) {
    int rnum=0;
    while(x !=0){
        int rem = x%10;
        x=x/10;
        if (rnum >= Integer.MAX_VALUE / 10 + rem || rnum <= Integer.MIN_VALUE / 10 + rem) return 0;

                rnum = rnum * 10 + rem;
            }
            return rnum;
        }
    }