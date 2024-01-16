import java.util.Scanner;

public class ID {
    private int seria;
    private int number;

    public ID() {
        number = seria = 0;
    }

    public ID(int seria, int number) {
        if (checkArguments(number, seria)) {
            this.number = number;
            this.seria = seria;
        } else {
            throw new IllegalArgumentException("������������ ������ ������!");
        }
    }

    public int getNumber() {
        return number;
    }

    public int getSeria() {
        return seria;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        seria = scanner.nextInt();
        System.out.print("������� ����� ��������: ");
        number = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        if (checkArguments(seria, number)) {
            this.number = number;
            this.seria = seria;
        } else {
            throw new IllegalArgumentException("������������ ������ ������!");
        }
    }

    private boolean checkArguments(int seria, int number) {
        return number > 0 && seria > 0;
    }

}
