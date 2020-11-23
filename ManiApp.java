public class ManiApp {
    /*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */

//это супер класс, в который входят два подкласса Cat, Dog

    static class Animal {
        // здесь задаем одинаковые типы данных для всех животных, индивидуальные навыки(типы данных) задаются в классе для конкретного животного

        public String name;
        public int run;

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
        }

        public void animalInfo() {
            System.out.println();

        }
    }

    //CAT
//это подкласс Cat, супер класса Animal с наследованием extends
    static class Cat extends Animal {

        protected boolean swim;
        int jump;

//konstruktor Cat

        public Cat(String name, int run, boolean swim, int jump) {
            this.name = name;
            this.run = run;
            this.swim = swim;
            this.jump = jump;
        }

        //выводим информацию в консоль
        public void catInfo() {
            System.out.println("CatName: " + name + " RunLimit: " + run+ " meters" + " Swim:" + swim + " Jump: " +jump+ " meters");
        }
    }

    //DOG
//это подкласс Dog супер класса Animal с наследованием extends
    static class Dog extends Animal {

        public double jump;
        public int swim;

        //konstruktor Dog

        public Dog(String name, int run, int swim, double jump ) {
            this.name = name;
            this.run = run;
            this.swim = swim;
            this.jump = jump;
        }
        public void dogInfo() {
            System.out.println("DogName: " + name  + " RunLimit: " + run+ " meters" + " Swim:" + swim + " Jump: " +jump+ " meters");
        }
    }

    public static class Main {
        public static void main(String[] args) {

            Animal animal = new Animal("CatsCategory");
            Cat cat = new Cat("Барсик", 200, false, 2);
            animal.animalInfo();
            cat.animalInfo();
            cat.catInfo();

            Animal danimal = new Animal("Dogs");
            Dog dog = new Dog("Шарик", 500, 10, 0.5);
            danimal.animalInfo();
            dog.animalInfo();
            dog.dogInfo();

        }
    }
}
