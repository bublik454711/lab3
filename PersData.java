import java.util.Scanner;

public class PersData {
    private Docs docs;
    private int age;
    private String fio;

    public PersData() {
        docs = new Docs();
        age = 0;
        fio = "�� �������";
    }

    public PersData(Docs docs, int age, String fio) {
        this.docs = docs;
        this.age = age;
        this.fio = fio;
    }

    public Docs getDocs() {
        return docs;
    }

    public int getAge() {
        return age;
    }

    public String getFio() {
        return fio;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t���� ������������ ������");
        docs.input();
        System.out.print("������� �������: ");
        age = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.print("������� ���: ");
        fio = scanner.nextLine();
        if (checkArguments(docs, age, fio)) {
            this.docs = docs;
            this.age = age;
            this.fio = fio;
        } else {
            throw new IllegalArgumentException("������������ ������ ������!");
        }
    }

    private boolean checkArguments(Docs docs, int age, String fio) {
        return age > 0;
    }


}
