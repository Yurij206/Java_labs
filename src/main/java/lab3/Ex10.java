import java.io.File;
import java.io.FileFilter;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
//        Path p = Path.of("C:\\Users\\Admin\\JAVA\\Lab3\\src");
//        System.out.println(Arrays.toString(takeAllSubdirectories1(p)));
//        System.out.println(Arrays.toString(takeAllSubdirectories2(p)));

        Scanner in = new Scanner(System.in);
        int ch;
        do{
            System.out.println("0.Выход\n1.Вывести подкаталоги с использованием ссылки на метод\n2.Вывести подкаталоги с использованием анонимного внутреннегокласса");
            if(in.hasNextInt()) {
                ch = in.nextInt();
            }else {ch = 0;}
            while (ch != 0 && ch != 1 && ch != 2) {
                System.out.println("0.Выход\n1.Вывести подкаталоги с использованием ссылки на метод\n2.Вывести подкаталоги с использованием анонимного внутреннегокласса");
                if(in.hasNextInt()) {
                    ch = in.nextInt();
                }else {ch = 0;}
            }
            if (ch == 1){
                String path;
                System.out.println("Введите путь: ");
                in.nextLine();
                path = in.nextLine();
                System.out.println(Arrays.toString(takeAllSubdirectories1(Path.of(path))));
            }
            if (ch == 2){
                String path;
                System.out.println("Введите путь: ");
                in.nextLine();
                path = in.nextLine();
                System.out.println(Arrays.toString(takeAllSubdirectories2(Path.of(path))));
            }
        }while (ch != 0);
    }


    private static File [] takeAllSubdirectories1 (Path p){
        File file = p.toFile();
        if (file.isDirectory()){
            return file.listFiles(File::isDirectory);
        }
        return null;
    }

    private static File [] takeAllSubdirectories2 (Path p){
        File file = p.toFile();
        return file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }
}
