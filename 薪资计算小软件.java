import java.util.Scanner;

public class 薪资计算小软件 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("年薪计算小软件");
        while(true) {
            System.out.println("请输入月薪：");
            int monthSalary = scanner.nextInt();
            System.out.println("请输入一年多少个月薪资：");
            int months = scanner.nextInt();
            int yearSalary = monthSalary*months;

            System.out.println("您的年薪："+yearSalary);

            System.out.println("请输入命令66[继续],88[结束程序]");
            int commandNum = scanner.nextInt();
            if(66==commandNum){
                System.out.println("再次计算您的薪资");
                continue;
            }
            if(88==commandNum){
                System.out.println("感谢您的使用！");
                break;

            }



        }
    }
}
