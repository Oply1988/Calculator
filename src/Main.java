import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        System.out.println("Введите выражение :");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = calc(str);
        System.out.println(result);

    }

    public static String calc(String str) throws Exception {
        String[] nums = str.split("[+-/*]");
        if (nums[0].length() + nums[1].length() + 1 != str.length()) {
            throw new Exception("Exception");
        }
        int num1 = Integer.parseInt(nums[0].trim());
        int num2 = Integer.parseInt(nums[1].trim());

        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new Exception("Exception");
        }
        String znak = str.substring(nums[0].length(), nums[0].length() + 1);

        int res;
        if (znak.equals("+")) {
            res = num1 + num2;
        } else if (znak.equals("-")) {
            res = num1 - num2;
        } else if (znak.equals("/")) {
            res = num1 / num2;
        } else {
            res = num1 * num2;
        }
        return Integer.toString(res);

    }
}


