# daily-task
public class multipleTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int mult = i * j;
                System.out.print(j + "*" + i + "=" + mult + "       ");
            }
            System.out.println(" ");
        }
    }
}
