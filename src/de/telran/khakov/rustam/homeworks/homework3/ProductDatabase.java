package de.telran.khakov.rustam.homeworks.homework3;

public interface ProductDatabase {
    void save(Product product);
    Product findByTitle(String productTitle);

    public static void main(String[] args) {
        ProductDatabase database = new InMemoryDatabase();
        database.save(new Product("test"));
        database.save(new Product("test2"));
        database.save(new Product("test3"));
        database.save(new Product("test4"));
        System.out.println(database.findByTitle("test2"));
        System.out.println(database.findByTitle("test22"));

    }
}
