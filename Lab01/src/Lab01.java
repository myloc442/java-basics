import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lab01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            Menu();

            int choose = input.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Chuong trinh da thoat !");
                    return;
                case 1:
                    HandleCase1();
                    break;

                default:
                    System.out.println("Vui long nhap lua chon hop le !");
                    break;
            }
        }
    }

    public static void Menu() {
        System.out.println("+----------+-----------------+----------+");
        System.out.println("| NGAN HANG SO - 2011402@DUONGMYLOC     |");
        System.out.println("+----------+-----------------+----------+");
        System.out.println("| 1. Nhap CCCD                          |");
        System.out.println("| 0. Thoat                              |");
        System.out.println("+----------+-----------------+----------+");
        System.out.print(">> Chuc nang: ");
    }

    public static void Menu2() {
        System.out.println("1. Kiem tra noi sinh");
        System.out.println("2. Kiem tra tuoi, gioi tinh");
        System.out.println("3. Kiem tra so ngau nhien");
        System.out.println("0. Thoat");
        System.out.print(">> Chuc nang: ");
    }

    public static void HandleCase1() {
        while (true) {
            Scanner input = new Scanner(System.in);
            // Math.floor(Math.random()*(max-min+1)+min)
            // int ran = (int) Math.floor(Math.random() * (999 - 100 + 1) + 100);
            RandomString rd = new RandomString();
            String ran = rd.randomString(6);
            System.out.println("Ma xac nhan cua ban: " + ran);

            System.out.print("Nhap ma xac thuc: ");
            String code = input.nextLine();
            if (code.equals(ran)) {
                HandleCCCD();
                break;
            }
            System.out.println("Ma xac thuc khong dung. Vui long thu lai");
        }
    }

    public static void HandleCCCD() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap CCCD: ");
            String cccd = input.nextLine();
            if (cccd.equals("No"))
                break;
            if (cccd.length() >= 12) {
                CheckCCCD(cccd);
                break;
            }
            System.out.println("So CCCD khong hop le. Vui long nhap lai hoac 'No' de thoat!");
        }
    }

    public static void CheckCCCD(String CCCD) {

        String maTinh = CCCD.substring(0, 3);
        String gioiTinh = CCCD.substring(3, 4);
        String namSinh = CCCD.substring(4, 6);
        String ngauNhien = CCCD.substring(6, 12);

        Scanner input = new Scanner(System.in);
        while (true) {
            Menu2();
            int choose = input.nextInt();

            switch (choose) {
                case 0:
                    System.out.println("Chuong trinh da thoat!");
                    return;
                case 1:
                    boolean result = ChechMaTinh(maTinh);
                    if (!result)
                        System.out.println("Khong ton tai ma tinh nay!");
                    break;
                case 2:
                    ThongTinTuoiVaGioiTinh(gioiTinh, namSinh);
                    break;
                case 3:
                    System.out.println("So ngau nhien: " + ngauNhien);
                    break;
                default:

                    break;
            }
        }
    }

    private static void ThongTinTuoiVaGioiTinh(String gioiTinh, String namSinh) {
        String theKy = "";
        int age = 0;
        int yearBirth = 0;
        int currentYear = 2022;
        switch (gioiTinh) {
            case "0":
            case "1":
                theKy = "The ky 20";
                yearBirth = 1900 + Integer.parseInt(namSinh);
                System.out.println(yearBirth);
                break;

            case "2":
            case "3":
                theKy = "The ky 21";
                yearBirth = 2000 + Integer.parseInt(namSinh);
                break;

            case "4":
            case "5":
                theKy = "The ky 22";
                yearBirth = 2100 + Integer.parseInt(namSinh);
                break;

            case "6":
            case "7":
                theKy = "The ky 23";
                yearBirth = 2200 + Integer.parseInt(namSinh);

                break;

            case "8":
            case "9":
                theKy = "The ky 24";
                yearBirth = 2300 + Integer.parseInt(namSinh);

                break;
            default:
                break;
        }
        switch (gioiTinh) {
            case "0":
            case "2":
            case "4":
            case "6":
            case "8":
                gioiTinh = "Nam";
                break;

            case "1":
            case "3":
            case "5":
            case "7":
            case "9":
                gioiTinh = "Nu";
                break;

            default:
                break;
        }

        age = currentYear - yearBirth;
        System.out.println("Gioi tinh: " + gioiTinh + " - Tuoi: " + age + " - " + theKy);
    }

    public static boolean ChechMaTinh(String maTinh) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("001", "Ha Noi");
        map.put("002", "Ha Giang");
        map.put("004", "Cao Bang");
        map.put("006", "Bac Kan");
        map.put("008", "Tuyen Quang");
        map.put("010", "Lao Cai");
        map.put("011", "Dien Bien");
        map.put("001", "H?? N???i");
        map.put("002", "H?? Giang");
        map.put("004", "Cao B???ng");
        map.put("006", "B???c K???n");
        map.put("008", "Tuy??n Quang");
        map.put("010", "L??o Cai");
        map.put("011", "??i???n Bi??n");
        map.put("012", "Lai Ch??u");
        map.put("014", "S??n La");
        map.put("015", "Y??n B??i");
        map.put("017", "H??a B??nh");
        map.put("019", "Th??i Nguy??n");
        map.put("020", "L???ng S??n");
        map.put("022", "Qu???ng Ninh");
        map.put("024", "B???c Giang");
        map.put("025", "Ph?? Th???");
        map.put("026", "V??nh Ph??c");
        map.put("027", "B???c Ninh");
        map.put("030", "H???i D????ng");
        map.put("031", "H???i Ph??ng");
        map.put("033", "H??ng Y??n");
        map.put("034", "Th??i B??nh");
        map.put("035", "H?? Nam");
        map.put("036", "Nam ?????nh");
        map.put("037", "Ninh B??nh");
        map.put("038", "Thanh H??a");
        map.put("040", "Ngh??? An");
        map.put("042", "H?? T??nh");
        map.put("044", "Qu???ng B??nh");
        map.put("045", "Qu???ng Tr???");
        map.put("046", "Th???a Thi??n Hu???");
        map.put("048", "???? N???ng");
        map.put("049", "Qu???ng Nam");
        map.put("051", "Qu???ng Ng??i");
        map.put("052", "B??nh ?????nh");
        map.put("054", "Ph?? Y??n");
        map.put("056", "Kh??nh H??a");
        map.put("058", "Ninh Thu???n");
        map.put("060", "B??nh Thu???n");
        map.put("062", "Kon Tum");
        map.put("064", "Gia Lai");
        map.put("066", "?????k L???k");
        map.put("067", "?????k N??ng");
        map.put("068", "L??m ?????ng");
        map.put("070", "B??nh Ph?????c");
        map.put("072", "T??y Ninh");
        map.put("074", "B??nh D????ng");
        map.put("075", "?????ng Nai");
        map.put("077", "B?? R???a - V??ng T??u");
        map.put("079", "H??? Ch?? Minh");
        map.put("080", "Long An");
        map.put("082", "Ti???n Giang");
        map.put("083", "B???n Tre");
        map.put("084", "Tr?? Vinh");
        map.put("086", "V??nh Long");
        map.put("087", "?????ng Th??p");
        map.put("089", "An Giang");
        map.put("091", "Ki??n Giang");
        map.put("092", "C???n Th??");
        map.put("093", "H???u Giang");
        map.put("094", "S??c Tr??ng");
        map.put("095", "B???c Li??u");
        map.put("096", "C?? Mau");

        Set<String> set = map.keySet();

        for (String key : set) {
            if (key.equals(maTinh)) {
                System.out.println("Ma" + key + " - " + map.get(key));
                return true;
            }
        }

        return false;
    }
}
