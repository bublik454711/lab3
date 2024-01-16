import java.util.Scanner;

public class Client {
    private PersData persData;
    private int compLess;
    private int totalLess;

    public Client() {
        persData = new PersData();
        compLess = 0;
        totalLess = 0;
    }

    public Client(PersData persData, int compLess, int totalLess) {
        this.persData = persData;
        this.compLess = compLess;
        this.totalLess = totalLess;
    }

    public PersData getPersData() {
        return persData;
    }

    public int getCompLess() {
        return compLess;
    }

    public int getTotalLess() {
        return totalLess;
    }

    public void setTotalLess(int totalLess) {
        this.totalLess = totalLess;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t���� ������ �������");
        persData.input();
        System.out.print("������� ���-�� ���������� �������: ");
        compLess = scanner.nextInt();
        System.out.print("������� ���-�� ���� �������: ");
        totalLess = scanner.nextInt();
        if (checkArguments(persData, compLess, totalLess)) {
            this.persData = persData;
            this.compLess = compLess;
            this.totalLess = totalLess;
        } else {
            throw new IllegalArgumentException("������������ ������ ������!");
        }
    }

    public void print() {
        System.out.println("\t���������� � �������");
        System.out.println("���: " + persData.getFio() + "\t���-�� ���������� ������: " + compLess + "\t����� ������: " + totalLess + "\n");
    }

    private boolean checkArguments(PersData persData, int compLess, int totalLess) {
        return compLess > 0 && totalLess > 0;
    }

}