import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik = new Kotik();
        kotik.setKotik("Мурзик",5,4,"miaow");
        Kotik kotik2 = new Kotik("Барсик",5,"meow",6);
        kotik2.liveAnotherDay();
        System.out.printf("Имя котика: %s. Вес котика: %d.\n",kotik2.getName(),kotik2.getWeight());
        System.out.println("Одинаково ли мяукают котики: " + kotik.getMeow().equals(kotik2.getMeow()));
        System.out.printf("Количество созданных котиков - %d.",Kotik.getCount());
    }
}
