package one.digital.innovation.basecamp;

public class Mensagem {
    public static void msg(int hour) {
        switch (hour) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                msgDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                msgTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                msgNoite();
                break;
            default:
                System.out.println("Hora inválida.");
                break;

        }

    }

    public static void msgDia() {
        System.out.println("Bom dia!");
    }

    public static void msgTarde() {
        System.out.println("Boa tarde!");
    }

    public static void msgNoite() {
        System.out.println("Boa noite!");
    }


}