import java.util.Scanner;

public class Auto {
    private String brand;
    private String model;
    private int typeTrans;
    private String gosNumber;

    public Auto() {
        brand = "�� �������";
        model = "�� �������";
        typeTrans = 0;
        gosNumber = "�� �������";
    }

    public Auto(String brand, String model, int typeTrans, String gosNumber) {
        this.brand = brand;
        this.model = model;
        this.typeTrans = typeTrans;
        this.gosNumber = gosNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getTypeTrans() {
        return typeTrans;
    }

    public String getGosNumber() {
        return gosNumber;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t���� ������ ����");
        System.out.print("������� ����� ������: ");
        brand = scanner.nextLine();
        System.out.print("������� ������ ������: ");
        model = scanner.nextLine();
        System.out.print("������� ��� �����������(1-��������, 2-�������): ");
        typeTrans = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.print("������� ���. �����: ");
        gosNumber = scanner.nextLine();
    }
}