import java.util.Date;
public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays",100));
        machine.addProduct(new Product("Mars",70));
        machine.addProduct(new Product("Twix",70.99));
        machine.addProduct(new Product("Аленка",90));
        machine.addProduct(new Product("Колокольчик", 85));
        machine.addProduct(new Perishable("Молоко Буренка",85, new Date()));
        machine.addProduct(new Perishable("Молоко коровка", 85,new Date()));
        machine.addProduct(new Perishable("Молоко Василек",87,new Date()));
        machine.addProduct(new Bread("Хлеб серый",30));

        System.out.println(machine);
        System.out.println("__________________");
        System.out.println(machine.findProduct("Молоко"));
        System.out.println(machine.findProduct("Аленка"));
        System.out.println(machine.findProduct("Пиво"));
        System.out.println("__________________________________");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("__________________________________");
        System.out.println(machine);
    }
}
