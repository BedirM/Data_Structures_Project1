package NewPkg;
//scaner metodu kullanıldı
import java.util.Scanner;
// public bir anasınıf tanımladım ve 3 tane public değişken atadım ancak değer vermedim
public class AnaSinif {
    public int boy;
    public int beden;
    public String irk;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pi();
        IkinciSinif[] ikinciSinif = new IkinciSinif[10];
//döngü ile beraber kullanıcıdan verileri alıyoruz
        for (int i = 0; i < 2; i++) {
            ikinciSinif[i] = new IkinciSinif();
            System.out.println("Lütfen Adınızı Giriniz: ");
            String name = input.next();
            ikinciSinif[i].setName(name);
            System.out.println("Lütfen Soy Adınızı Giriniz: ");
            String surname = input.next();
            ikinciSinif[i].setSurname(surname);
            System.out.println("Lütfen Yaşınızı giriniz: ");
            int age = input.nextInt();
            ikinciSinif[i].setAge(age);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Ad: " + ikinciSinif[i].getName());
            System.out.println("Soy Ad:  " + ikinciSinif[i].getSurname());
            System.out.println("Yaş: " + ikinciSinif[i].getAge());
        }
    }

    AnaSinif() {
        this.boy = 0;
        this.beden = 0;
        this.irk = "None";
    }

    AnaSinif(int boy, int beden, String irk) {
        this.boy = boy;
        this.beden = beden;
        this.irk = irk;
    }

    AnaSinif(int boy, int beden) {
        this.boy = boy;
        this.beden = beden;
        this.irk = "Türk";
    }

    public static void pi() {
        System.out.println(3);
    }

    public IkinciSinif ikinciSinifDegerYazdir(IkinciSinif iks) {
        System.out.println("Name: " + iks.getName());
        System.out.println("Surname: " + iks.getSurname());
        System.out.println("Age: " + iks.getAge());
        return iks;
    }

    public IkinciSinif ikinciSinifaDegerAta(String name, String surname, int age) {
        IkinciSinif iks = new IkinciSinif();
        iks.setName(name);
        iks.setSurname(surname);
        iks.setAge(age);
        return iks;

    }


}