

class MyCalculator implements AdvancedArithmetic{


    @Override
    public int divisor_sum(int n) {
        int result = n;
        for (int i = 1; i < n; i++){
            if ( n % i == 0 ){
                result += i;
            }
        }
        return result;
    }
}


