package org.birthday;
import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try{
            File file = new File("/home/" + args[0] + "/.birthday_autism.conf");
            Scanner scan_file = new Scanner(file);
            String bd = scan_file.nextLine();
            String today = new SimpleDateFormat("MM-dd").format(new Date());
            if(today.equals(bd)) {
                System.out.println("⣿⣿⣿⣿⣿⣿⡿⠟⣛⣫⣭⣭⣭⣭⣭⣝⣛⡛⠿⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⡿⣋⣵⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣍⠻⣿⣿⣿\n" +
                        "⣿⣿⢏⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡘⣿⣿\n" +
                        "⣿⢇⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡸⣿\n" +
                        "⣿⢸⣿⣿⣿⡿⢉⣤⠀⠈⢻⣿⣿⣿⠏⠀⣤⡀⠈⢻⣿⣿⣿⡇⣿\n" +
                        "⣿⢸⣿⣿⣿⡇⠈⠉⠀⠀⢸⣿⣿⣿⡄⠀⠉⠀⠀⠀⣿⣿⣿⡇⣿\n" +
                        "⣿⢸⣿⣿⣿⣷⣤⣄⣀⣠⣾⣿⣿⣿⣷⣤⣄⣀⣤⣾⣿⣿⣿⡇⣿\n" +
                        "⣿⣆⠻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣰⣿\n" +
                        "⣿⣿⣷⣝⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠥⢾⣿⣿\n" +
                        "⣿⣿⣿⣿⣷⣦⣭⡝⢛⣛⣛⣛⣛⣛⣩⣭⣭⣴⣶⣶⣿⣿⣶⣶⡙\n" +
                        "⣿⣿⣿⣿⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇\n" +
                        "⣿⣿⣿⣿⣿⣿⣿⡇⢿⣿⣿⣿⣿⠛⣿⣿⣿⡿⠿⠿⠿⣿⣿⣿⡇\n" +
                        "⣿⣿⣿⣿⣿⣿⣿⣷⢸⣿⣿⣿⡟⠀⣿⣿⣿⡇⣿⣿⠀⣿⣿⣿⠇\n" +
                        "⣿⣿⣿⣿⣿⣿⣿⣿⡎⣿⣿⣿⡇⣧⢹⣿⣿⡇⠿⢏⣴⠹⣿⠟⣸\n" +
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣌⣛⣛⣃⣿⣧⣛⣋⣼⣿⣿⣿⣷⣶⣾⣿\n" +
                        "С ДНЮХОЙ ЙООООООУ ЙОООООУ ЙОООУ");
            }
        }catch(java.io.FileNotFoundException e){
            System.out.println("НЕЕЕЕЕЕТ, ТЫ ЧЕГО НАДЕЛАЛ ТЫ УДАЛИЛ ФАЙЛЫ ИЛИ УСТАНОВИЛ НЕ ТАК И ТЕПЕРЬ У ТЕБЯ");
            System.out.println(e);
        }
    }
}