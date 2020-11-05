public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "Бутылок";
        while (beerNum > 0) {
            switch (beerNum % 10) {
                case 1:
                    word = "бутылка";
                    break;
                case 2:
                case 3:
                case 4:
                    word = "бутылки";
                    break;
                default:
                    word = "Бутылок";
                    break;
            }
            if(beerNum>=11 && beerNum<=14)
                word = "Бутылок";

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0);
            else {
                System.out.println("Нет бутылок пива на стене");
            }
            
            }
            if (beerNum == 1) {
                word = "бутылка";
            }
        }
    }




