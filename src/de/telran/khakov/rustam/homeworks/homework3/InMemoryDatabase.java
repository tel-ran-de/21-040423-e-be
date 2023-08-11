package de.telran.khakov.rustam.homeworks.homework3;

public class InMemoryDatabase implements ProductDatabase {
    private Product[] array = new Product[10];
    int counter = 0;

    @Override
    public void save(Product product) {
        array[counter] = product;
        counter++;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : array) {
            if (product != null && product.getName().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
