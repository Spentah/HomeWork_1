package model;

public class Kotik {
    private static int count = 0;
    private String name;
    private int prettiness;
    private String meow;
    private int weight;
    private int satiety = 3;

    public Kotik(String name, int prettiness, String meow, int weight) {
        this.name = name;
        this.prettiness = prettiness;
        this.meow = meow;
        this.weight = weight;
        count++;
    }

    public Kotik(){
        count++;
    }

    public String getName() {
        return name;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getMeow() {
        return meow;
    }

    public int getWeight() {
        return weight;
    }

    public static int getCount() {
        return count;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setKotik(String name, int prettiness, int weight, String meow) {
        this.name = name;
        this.prettiness = prettiness;
        this.meow = meow;
        this.weight = weight;

    }

    public void eat(int someSatiety){
        satiety += someSatiety;
    }

    public void eat(int someSatiety, String foodName){
        satiety += someSatiety;

    }

    public void eat(){
        eat(2,"meat");
    }
    public boolean sleep(){
        if (satiety==0){
            System.out.println("Котик не хочет ложиться спать голодным, сперва его нужно покормить");
            return false;
        } else {
            satiety--;
            System.out.println("Котик поспал");
            return true;
        }
    }

    public boolean play(){
        if (satiety==0){
            System.out.println("Котик слишком голоден для игр. Его нужно покормить");
            return false;
        } else {
            satiety--;
            System.out.println("Котик поиграл");
            return true;
        }
    }

    public boolean chaseMouse(){
        if (satiety==0){
            System.out.println("У котика нет сил для охоты. Нужно покормить его");
            return false;
        } else {
            satiety--;
            System.out.println("Котик поймал мышку");
            return true;
        }
    }

    public boolean justRunAround(){
        if (satiety==0){
            System.out.println("Котик хочет просто побегать вокруг, но он голодный");
            return false;
        } else {
            satiety--;
            System.out.println("Котик просто носился кругами. Странный кот");
            return true;
        }
    }

    public boolean doSomething(){
        if (satiety==0){
            System.out.println("Кот хочет погулять на улице, но он слишком голоден");
            return false;
        } else {
            satiety--;
            System.out.println("Котик гулял на улице");
            return true;
        }
    }

    public void liveAnotherDay(){
        for (int i = 0; i < 24; i++){
            switch ((int) (Math.random() * 5 + 1)) {
                case 1 :
                    if (!doSomething()){
                        eat();
                    }
                    break;
                case 2 :
                    if (!sleep()) {
                        eat();
                    }
                    break;
                case 3 :
                    if (!play()){
                        eat();
                    }
                    break;
                case 4 :
                    if (!chaseMouse()) {
                        eat();
                    }
                    break;
                case 5 :
                    if (!justRunAround()) {
                        eat();
                    }
                    break;
            }
        }
    }



}
