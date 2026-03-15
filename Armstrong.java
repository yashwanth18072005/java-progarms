package TestLeafTest;

public class Armstrong {
	public boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        int number = 564;

        if (obj.isArmstrong(number)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}


