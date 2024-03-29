import java.util.Scanner;

public class Instructor {
    private Auto auto;
    private PersData persData;
    private int driveExp;

    public Instructor() {
        auto = new Auto();
        persData = new PersData();
        driveExp = 0;
    }

    public Instructor(Auto auto, PersData persData, int driveExp) {
        this.auto = auto;
        this.persData = persData;
        this.driveExp = driveExp;
    }

    public Auto getAuto() {
        return auto;
    }

    public PersData getPersData() {
        return persData;
    }

    public int getDriveExp() {
        return driveExp;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t���� ������ �����������");
        auto.input();
        persData.input();
        System.out.print("������� ���� ��������: ");
        driveExp = scanner.nextInt();
        if (checkArguments(auto, persData, driveExp)) {
            this.auto = auto;
            this.persData = persData;
            this.driveExp = driveExp;
        } else {
            throw new IllegalArgumentException("������������ ������ ������!");
        }
    }

    private boolean checkArguments(Auto auto, PersData persData, int driveExp) {
        return driveExp > 0;
    }

}
