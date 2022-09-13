package Manager;

import Repository.ProductRepository;
import domein.Product;

public class ProductManager {
    protected ProductRepository manager;

    public ProductManager(ProductRepository manager) {
        this.manager = manager;
    }

    public void add(Product product){
        manager.add(product);

    }
    public Product[] findAll(){
        return manager.findAll();
    }

    // добавьте необходимые поля, конструкторы и методы

    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product: manager.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length +1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
                // "добавляем в конец" массива result продукт product
            }
        }
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
        // или в одну строку:
        // return product.getName().contains(search);
    }
}