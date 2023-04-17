import java.io.File;

public class task11 {
    public static void main(String[] args) {
        File folder = new File("c:/FilesForLab3");
        String[] fileNames = folder.list((dir, name) -> name.toLowerCase().endsWith(".java"));
        for(String name:fileNames) {
            System.out.println(name);
        }
    }
}