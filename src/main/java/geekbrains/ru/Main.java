package geekbrains.ru;

public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {new Cat("Васька", 50), new Cat("Черныш", 50), new Cat("Снежок", 25), new Cat("Кузя", 5), new Cat("Пушок", 1)};
// здесь вводим наполнение миски и программа автоматический определит какой из котов сможет наесться а какой нет.
        Plate plate = new Plate( 80);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
