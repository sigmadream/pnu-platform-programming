import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("<<TODOList for CLI>>");
        System.out.println("- 'help'를 입력하시면 사용법을 확인하실 수 있습니다.");
        System.out.println("===============================================");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf(">> ");
            String command = sc.next();
            switch (command) {
                case "help":
                    System.out.println("Help");
                    break;
                default:
                    System.out.println("Help?");
            }
        }
    }
}
