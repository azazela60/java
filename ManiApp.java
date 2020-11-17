public class ManiApp {
    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
// Конструктор класса должен заполнять эти поля при создании объекта;
// Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
// Создать массив из 5 сотрудников
// С помощью цикла вывести информацию только о сотрудниках старше 40 лет;


    static class Person {
        private String fio;
        private String post;
        private String email;
        private String tel;
        private double salary;
        private int age;

        Person(String fio, String post, String email, String tel, double salary, int age) {
            this.fio = fio;
            this.post = post;
            this.email = email;
            this.tel = tel;
            this.salary = salary;
            if(age >= 18) {
                this.age = age;
            } else {
                System.out.println("Сотрудник должен быть старше 18 лет");
            }
        }

        int GetAge() {
            return age;
        }

        void Show() {
            System.out.println(fio + " " + post + " " +  email + " " + tel + " " + salary + " " + age);
        }
    }



    public static class Main {

        public static void main(String[] args) {
// Вначале объявляем массив объектов
            Person[] persArray = new Person[5];
            // для каждой ячейки массива задаем объект
            persArray[0] = new Person("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 70000, 39);
            persArray[1] = new Person("Петров Пётр", "Менеджер", "petrov@mailbox.com", "1892312312", 40000, 40);
            persArray[2] = new Person("Сидоров Василий", "Мастер", "sidorov@mailbox.com", "2892312312", 50000, 43);
            persArray[3] = new Person("Васечкин Фёдор", "Бригадир", "vasechkin@mailbox.com", "3892312312", 30000, 51);
            persArray[4] = new Person("Попов Владимир", "Сторож", "popov@mailbox.com", "4892312312", 15000, 64);

            for(Person item : persArray) {
                if(item.GetAge() > 40) item.Show();
            }
        }
    }
}
