import java.util.Scanner;

public class SNILS {
    private long number;
    private int pol;

    public SNILS() {
        number = pol = 0;
    }

    public SNILS(long number, int pol) {
        if (checkArguments(number, pol)) {
            this.number = number;
            this.pol = pol;
        } else {
            throw new IllegalArgumentException("������������ ������ ������!");
        }
    }

    public long getNumber() {
        return number;
    }

    public int getPol() {
        return pol;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ����� ������: ");
        number = scanner.nextLong();
        System.out.print("������� ���(1-�������, 2-�������): ");
        pol = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        if (checkArguments(number, pol)) {
            this.number = number;
            this.pol = pol;
        } else {
            throw new IllegalArgumentException("������������ ������ ������!");
        }
    }

    private boolean checkArguments(long number, int pol) {
        return number > 0 && pol > 0 && pol < 3;
    }

}
