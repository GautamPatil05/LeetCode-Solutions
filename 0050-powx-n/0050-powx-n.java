class Solution {
    public double myPow(double x, int n) {
        
        if(x == 0) return 0;
        if(n == 0) return 1.0;
        if(x == 1) return 1.0;
        if(x == -1 && n%2 == 0) return 1.0;
        if(x == -1 && n%2 != 0) return -1.0;

        long binaryForm = n;
        double ans = 1;

        if(n < 0) {

            x = 1/x;
            binaryForm = -binaryForm;
        }
        while(binaryForm > 0) {

            if(binaryForm % 2 == 1) {
                ans *= x;
            }

            x = x * x;
            binaryForm /= 2;
        }

        return ans;
    }
}