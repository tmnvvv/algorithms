
class CatsMain {

    public static void main(String[] args)  throws CloneNotSupportedException  {

        // Создаю пять кошек
        System.out.println(" ");

        Cat catMitski = new Cat("Mitski", 4500);
        Cat catMeimei = new Cat("Meimei", 5000);
        Cat catHaru = new Cat("Haru", 1000);
        Cat catChihiro = new Cat("Chihiro", 5800);
        Cat catTomoko = new Cat("Tomoko", 6500);

        System.out.printf(
                "✧ Вес созданных кошек:\n"+"\nMitski %.2f kg"+
                        "\nMeimei %.2f kg"+"\nHaru %.2f kg"+
                        "\nChihiro %.2f kg"+"\nMitski %.2f kg",
                catMitski.weight, catMeimei.weight,
                catHaru.weight, catChihiro.weight, catTomoko.weight
        );


        // Кормлю двух кошек
        System.out.println(" ");

        catTomoko.feedCat(30);
        System.out.printf("\n%s's weight is now %.2fg\n", catTomoko.name, catTomoko.weight);

        catMitski.feedCat(40);
        System.out.printf("\n%s's weight is now %.2fg", catMitski.name, catMitski.weight);


        // Перекрамливаю кошку
        System.out.println(" ");
        catTomoko.feedCat(10000);
        catTomoko.feedCat(10000);


        // Замяукиваю кошку
        System.out.println(" ");
        catHaru.meow(8);


        // Подсчёт съеденного
        System.out.println(" ");
        catTomoko.countFood();
        catMitski.countFood();


        // Новая кошка и метод pee()
        System.out.println(" ");

        Cat catIkki = new Cat("Ikki", 4300);
        catIkki.feedCat(150);

        System.out.println(" ");

        catIkki.pee();
        catIkki.pee();
        catIkki.pee();

        catIkki.countFood();


        // Счётчик кошек
        System.out.print("\n\nКоличество кошек: ");
        Cat.getCount();


        // Окрашивание кошек
        System.out.println("\n✧ Окрашивание кошек: ");

        catChihiro.setCatColor("ginger");
        catMitski.setCatColor("mixed");
        catTomoko.setCatColor("gray");

        System.out.print("\nChihiro's color: ");
        System.out.println(catChihiro.getCatColor());

        System.out.print("Mitski's color: ");
        System.out.println(catMitski.getCatColor());

        // <!> ситуация с присвоением значения не из списка
        System.out.print("Tomoko's color: ");
        System.out.println(catTomoko.getCatColor());


        // Спавн детеныша кошки
        System.out.println(" ");
        getKitten();

        System.out.print("Количество кошек: ");
        Cat.getCount();


        // Deep Clo(w)ning
        System.out.println(" ");
        System.out.println("✧ Deep Cloning:");

        Cat labCat = catMitski.clone();

        System.out.println("\n"+catMitski);
        System.out.println(labCat);

        labCat.name = "Fuyutsuki";

        System.out.println("\n"+catMitski);
        System.out.println(labCat);

        System.out.println(" ");

    }

    private static Cat getKitten() {
        System.out.println("*spawning a kitten*");
        return new Cat("a kitten", 1100);
    }
}

class Cat implements Cloneable {

    String name; // (*w*=)
    private CatColor color;

    double weight;
    boolean isDead;

    private final double MIN_WEIGHT = 1000;
    private final double MAX_WEIGHT = 9900;

    private final int EYES = 2; // idk why that's const, but whatever..

    double catfoodCounter = 0;
    static int count;


    // Constructors

    public Cat(Cat cat) {
        name = new String(cat.name);
        double catfoodCounter = 0;

    }

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
        count++;
    }

    @ Override
    public String toString() {

        if (isDead == true) {
            return String.format("%s was a cat of a(n) %s color, weighted: %.2f",
                    name, this.getCatColor(), weight);
        } else {
            return String.format("%s is a cat of a(n) %s color, weights: %.2f",
                    name, this.getCatColor(), weight);
        }
    }


    // Cloning

    @ Override
    public Cat clone() throws CloneNotSupportedException {
        return (Cat) super.clone();
    }


    // Colors

    public void setCatColor(String catColor) {

        switch (catColor) {
            case "black":
                color = CatColor.BLACK;
                break;
            case "white":
                color = CatColor.WHITE;
                break;
            case "brown":
                color = CatColor.BROWN;
                break;
            case "ginger":
                color = CatColor.GINGER;
                break;
            case "cream":
                color = CatColor.CREAM;
                break;
            case "mixed":
                color = CatColor.MIXED;
                break;
            default:
                color = CatColor.NONE;
        }
    }

    public String getCatColor() {

        String strColor = "";

        switch (color) {
            case BLACK:
                strColor = "black";
                break;
            case WHITE:
                strColor = "white";
                break;
            case BROWN:
                strColor = "brown";
                break;
            case GINGER:
                strColor = "ginger";
                break;
            case CREAM:
                strColor = "cream";
                break;
            case MIXED:
                strColor = "mixed";
                break;
            case NONE:
                strColor = "unrecognized";
                break;
            default:
                strColor = null;

        }
        return strColor;
    }
    
    
    // Actions

    public void feedCat(double amount) {

        if (isDead == true) {
            System.out.printf("\n%s is dead and unable to eat (t-t=)",name);
            return;
        }

        System.out.printf("\n%s is eating [...]", name);

        catfoodCounter += amount;
        weight += amount;

        updateStatus();
    }

    public void meow(int times) {

        for (int i = 0; i < times; i++) {

            if (isDead == true) {
                System.out.printf("\n%s is dead and unable to meow (t-t=)",name);
                return;
            }

            System.out.printf("\n%s: meow (owo=)*'", name);

            weight -= 100;
            updateStatus();
        }
    }

    public void pee() {

        if (isDead == true) {
            System.out.printf("\n%s is dead and unable to pee (t-t=)",name);
            return;
        }

        System.out.printf("\n%s is peeing [...] \n*psssssssssssss* ('w'=)\n", name);

        weight -= 200;
        updateStatus();
    }

    public void countFood() {
        System.out.printf("\n%s consumed %.2fg of catfood", name, catfoodCounter);
    }
    
    
    // Informational

    public static void getCount() {
        System.out.println(count);
    }

    private void updateStatus() {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            isDead = true;
            count--;
        }
    }

    private String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else {
            return "Exists";
        }
    }

    public enum CatColor {
        BLACK,
        WHITE,
        BROWN,
        GINGER,
        CREAM,
        MIXED,
        NONE
    }
}
