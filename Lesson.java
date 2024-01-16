import java.util.Scanner;

public class Lesson {
    private Client client;
    private Instructor instructor;
    private String date;
    private String time;
    private int paymentStatus;

    public Lesson() {
        client = new Client();
        instructor = new Instructor();
        date = "�� �������";
        time = "�� �������";
        paymentStatus = 0;
    }

    public Lesson(Client client, Instructor instructor, String date, String time, int paymentStatus) {
        this.client = client;
        this.instructor = instructor;
        this.date = date;
        this.time = time;
        this.paymentStatus = paymentStatus;
    }

    public Client getClient() {
        return client;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t���� ������ �� �����");
        client.input();
        instructor.input();
        System.out.print("������� ����: ");
        date = scanner.nextLine();
        System.out.print("������� �����: ");
        time = scanner.nextLine();
        System.out.print("������� ������ ������(1-��������, 2-�� ��������): ");
        paymentStatus = scanner.nextInt();
        if (checkArguments(client, instructor, date, time, paymentStatus)) {
            this.client = client;
            this.instructor = instructor;
            this.date = date;
            this.time = time;
            this.paymentStatus = paymentStatus;
        } else {
            throw new IllegalArgumentException("������������ ������ ������!");
        }
    }

    public void print() {
        System.out.println("\t���������� �� �����");
        System.out.println("����: " + date + "\t�����: " + time + "\t������ ������(1-��������, 2-�� ��������): " + paymentStatus + "\n");
    }

    private boolean checkArguments(Client client, Instructor instructor, String date, String time, int paymentStatus) {
        return paymentStatus > 0 && paymentStatus < 3;
    }


}
