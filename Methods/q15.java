//15. Create a method to check if a given number is an Armstrong number.

public static boolean isArmstrong(int x) {
    int temp, digits=0, last=0, sum=0;
    temp = x;
    while(temp > 0) {
        temp = temp / 10;
        digits++;
    }
    temp = x;
    while(temp > 0) {
        last = temp % 10;
        sum +=  (Math.pow(last, digits));
        temp = temp / 10;
    }
    if(x == sum)
        return true;
    else
        return false;
}
