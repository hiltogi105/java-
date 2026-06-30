package curriculum.d;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Player名：");
        String name = sc.nextLine();

        Player player = new Player(name);
        Daemon daemon = new Daemon("daemon_status.txt");

        Character first;
        Character second;

//        if(player.sp > daemon.sp){
//            first = player;
//            second = daemon;
//        }else if(player.sp < daemon.sp){
//            first = daemon;
//            second = player;
//        }else{
//            if(new Random().nextBoolean()){
//                first = player;
//                second = daemon;
//            }else{
//                first = daemon;
//                second = player;
//            }
//        }
        
        if (player.getSp() > daemon.getSp()) {
            first = player;
            second = daemon;

        } else if (player.getSp() < daemon.getSp()) {
            first = daemon;
            second = player;

        } else {
            if (new Random().nextBoolean()) {
                first = player;
                second = daemon;
            } else {
                first = daemon;
                second = player;
            }
        }

        try(PrintWriter pw = new PrintWriter(new FileWriter("battle_log.txt"))){

        while(player.isAlive() && daemon.isAlive()){

            first.attack(second);

            pw.println(first.name + " が攻撃！");
            pw.println(second.name + " HP:" + second.hp);

            if(!second.isAlive()){
                break;
            }

            second.attack(first);

            pw.println(second.name + " が攻撃！");
            pw.println(first.name + " HP:" + first.hp);
        }

        if(player.isAlive()){
            pw.println("Playerの勝利！");
        }else{
            pw.println("Daemonの勝利！");
        }

        }catch(IOException e) {
        	e.printStackTrace();
        }
    }
}