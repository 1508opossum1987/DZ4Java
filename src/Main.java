import BankAccount.BankAccount;
import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Bird;
import MiniGame.*;
import MiniGame.Character;
import Salaries.Designer;
import Salaries.Employer;
import Salaries.Manager;
import Salaries.Programmer;
import Transports.Boat;
import Transports.Car;
import Transports.Plane;
import Transports.Transport;
import Interfaces.Fish;
import Interfaces.AmphibiousCar;
import Interfaces.Airplane;
import Interfaces.Duck;
import Interfaces.Initiable;

void main() {

    //1.
    /*BankAccount FirstAccount = new BankAccount ("Serg", 100.0);
    FirstAccount.deposit(12.0);
    FirstAccount.withdraw(135.67);
    FirstAccount.withdraw(85.15);

    BankAccount SecondAccount = new BankAccount();

    System.out.println(SecondAccount.getBalance());*/

    //2.
    /*Cat cat = new Cat ("Басик");
    Dog dog = new Dog ("Колбасик");
    Bird bird = new Bird ("Уарабей");
    Animal[] animals = {cat, dog, bird};

    for (Animal i: animals) {
        i.getSound();
    }*/

    //3.
    /*Employer[] employers = {new Programmer(), new Designer(), new Manager()};

    System.out.println("Based employers");
    for (Employer e: employers) {
        e.calculateSalary();
    }

    Employer[] upgradedEmployers = {new Programmer("Boris", 70000.00, 3500.00),
                                    new Designer("Olaf", 50000.00, 48333.11),
                                    new Manager("Abram", 28717.09, 150000.00)};

    System.out.println("Upgraded employers");
    for (Employer e: upgradedEmployers) {
        e.calculateSalary();
    }*/

    //4.
    /*Transport [] transports = {new Car("Lada", 180),
                               new Plane("Airbus", 750),
                               new Boat("River", 55)};

    for (Transport t: transports) {
        t.printInfo();
        t.start();
        t.stop();
    }*/
    //5.
    /*Initiable[] objects = {new Fish("fish"),
            new AmphibiousCar("amphibiousCar"),
            new Airplane("airplane"),
            new Duck("duck")};
    for (Initiable o : objects) {
        o.init();
    }*/

    //6.
    Character[] playerArmy = {new Knight("Рыцарь игрока"),
                              new Paladin("Паладин игрока"),
                              new Priest("Монах игрока"),
                              new Wizard("Волшебник игрока")};

    Character[] botArmy = {new Knight("Рыцарь бота"),
                           new Paladin("Паладин бота"),
                           new Priest("Монах бота"),
                           new Wizard("Волшебник бота")};

    System.out.println("Начинаем игру. Статистика: ");
    for (Character p: playerArmy){
        p.printStats();
    }

    for (Character b: botArmy){
        b.printStats();
    }
}