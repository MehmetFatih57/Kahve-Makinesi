package kahvemakinesi;

public class Methods extends Depo {
    public static void boyutSec() {
        System.out.println("Kahveniz hangi boy olsun?\n"+
                "1-Kucuk Boy\n"+
                "2-Orta Boy\n"+
                "3-Buyuk Boy");
        secim= input.next();
        switch (secim) {
            case "1":
                System.out.println("Kahveniz "+boyut.get((Integer.valueOf(secim)-1))+" boy hazirlaniyor...");
                break;
            case "2":
                System.out.println("Kahveniz "+boyut.get((Integer.valueOf(secim)-1))+" boy hazirlaniyor...");
                break;
            case "3":
                System.out.println("Kahveniz "+boyut.get((Integer.valueOf(secim)-1))+" boy hazirlaniyor...");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız!!!");
                boyutSec();
        }

    }

    private static void sekerEkle() {
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) :");
        secim=input.next();
        if (secim.toLowerCase().equals("evet")) {
            System.out.println("Kac seker olsun?");
            kacSeker=input.nextInt();
            System.out.println(kacSeker+ " adet seker ekleniyor...");
            boyutSec();
        } else if (secim.toLowerCase().equals("hayir")){
            System.out.println("Seker eklenmiyor...");
            boyutSec();
        }
    }

    private static void sutEkle() {
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
        secim=input.next();
        if (secim.toLowerCase().equals("evet")) {
            System.out.println("Sut Ekleniyor...");
        } else if (secim.toLowerCase().equals("hayir")){
            System.out.println("Sut eklenmiyor...");
        }
        sekerEkle();
    }

    public static void kahveSor() {
        System.out.println("Hangi kahveyi istersiniz?\n"+
                "1-Turk Kahvesi\n"+
                "2-Filtre Kahve\n"+
                "3-Espresso");
        secim=input.next();

        switch (secim) {
            case "1":
                hangiKahve = kahveCesidi.get((Integer.valueOf(secim)-1));
                System.out.println(hangiKahve+" hazırlaniyor...");
                sutEkle();
                break;
            case "2":
                hangiKahve = kahveCesidi.get((Integer.valueOf(secim)-1));
                System.out.println(hangiKahve+" hazırlaniyor...");
                sutEkle();
                break;
            case "3":
                hangiKahve = kahveCesidi.get((Integer.valueOf(secim)-1));
                System.out.println(hangiKahve+" hazırlaniyor...");
                sutEkle();
                break;
            default:
                System.out.println("Yanlis secim yaptiniz!!!");
                kahveSor();

        }

    }
}
