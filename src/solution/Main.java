package solution;

public class Main {
    public static void main(String[] args) {
        Author sal = new Author();
        sal.write("It was the best of times");
        sal.readAloud();
        Author biff = new Author();
        biff.write("It was the worst of times");
        biff.readAloud();
    }
}
