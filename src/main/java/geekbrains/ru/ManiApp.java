
        /*
        1. Расширить задачу про котов и тарелки с едой
        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается съесть 15-20)
        3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось поесть (хватило еды), сытость = true
        4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
        5. Создать массив котов и тарелку с едой, попросить всех котов поесть из этой тарелки и потом вывести информацию о сытости котов в консоль
        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
        */

package geekbrains.ru;

import static java.lang.System.*;

    class Plate {

        public int food;
        public Plate(int food) {
            this.food = food;
        }


        boolean decreaseFood(int n) {
            int diff = food - n;
            if (diff < 0) return false;

            food -= n;
            return true;
        }
        void addFood(int food) {
            this.food += food;
        }

        void info() {
            out.println("plate: " + food);
        }
    }
    class Cat {
        private String name;
        private int appetite;
        private boolean hungry;

        Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.hungry = true;
        }

        void info() {
            String isHungry = !hungry ? "сыт" : "голоден";
            out.println(name + ": " + isHungry);
        }

        void eat(Plate plate) {
            if (hungry && plate.decreaseFood(appetite))
                hungry = false;
        }
    }



