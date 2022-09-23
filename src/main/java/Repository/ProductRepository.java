package Repository;
import domein.Product;

public class ProductRepository {
    protected Product[] products = new Product[0];

    public void add(Product item) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = item;
        products = tmp;
    }

    public Product[] findAll() {
        return products;
    }

    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product[] removeById(int id) {
        if (findById(id) == null) {
            throw new NotFoundException("нет такого удаления:" + id);
        }
        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product item : products) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
            products = tmp;
        }
        return products;
    }
}






