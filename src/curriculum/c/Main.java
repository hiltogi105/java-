package curriculum.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("グー(0)、チョキ(1)、パー(2)を入力：");

            int input = sc.nextInt();

            Player player = new Player(input);
            CPU cpu = new CPU();

            System.out.println("あなたの手：" + player.handName());
            System.out.println("CPUの手：" + cpu.handName());

            int result = (player.getHand() - cpu.getHand() + 3) % 3;

            if (result == 1) {
                System.out.println("あなたの負け！");
            } else if (result == 2) {
                System.out.println("あなたの勝ち！");
                break;
            } else {
                System.out.println("あいこ！");
            }
        }

        sc.close();
    }
}