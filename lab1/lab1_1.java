package lab1;
import java.util.Scanner;
public class lab1_1 
{public static void main(String[] args) {
    // Бодлогын өгүүлбэр:
    // Хэрэглэгчээс насны утга авч, тухайн хүнийг насанд хүрсэн эсэхийг шалга.
    // Хэрвээ нас 18 болон түүнээс дээш байвал 'Насанд хүрсэн байна' гэж хэвлэ.
    // Үгүй бол 'Насанд хүрээгүй байна' гэж хэвлэ.

    // Scanner ашиглан хэрэглэгчээс өгөгдөл авна
    Scanner scanner = new Scanner(System.in);

    // Хэрэглэгчээс нас оруулахыг асуух
    System.out.print("nasaa oruulna uu: ");
    int nas = scanner.nextInt();

    // Насны утга дээр үндэслэн насанд хүрсэн эсэхийг шалгана
    if (nas >= 18) {
        System.out.println("nasand hursen baina.");
    } else {
        System.out.println("nasand hureegui baina.");
    }

    // Scanner-ийг хаах
    scanner.close();
}
}