package Day_11.bai_tap.service;

import Day_11.bai_tap.model.Product;

public interface IProductService {

    void findAll();
    // hàm add
    Product findById( int id);
    void  update(Product product);
    // ..........................
    void add(Product product);

    void deleteProduct(int id);
    void findProduct(String name);
    void sortProduct();

}
