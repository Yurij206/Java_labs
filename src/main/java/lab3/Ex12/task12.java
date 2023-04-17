import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
class Task12 {

    private static final String DIR = System.getProperty("java.io.tmpdir");

    public static void main(String[] args) {
        File[] files = {

        new File("c:/FilesForLab3/file2.txt"),
        new File("c:/FilesForLab3/file1.txt"),
        new File("c:/FilesForLab3/file1.java"),
        new File("c:/FilesForLab3/file2.java"),
        new File("c:/FilesForLab3/dir3"),
        new File("c:/FilesForLab3/dir1"),
        new File("c:/FilesForLab3/dir2")};
        for(File file:files) {
            System.out.println(file);
        }
        System.out.println("\nafter sort\n");
        Arrays.sort( files, Comparator.comparing(File::isFile).thenComparing(File::getPath));
        for(File file:files) {
            System.out.println(file);
        }
    }
}