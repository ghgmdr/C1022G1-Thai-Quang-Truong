package Day_11_JavaCollectionFramework.bai_tap.service;

import Day_11_JavaCollectionFramework.bai_tap.model.Product1;

public interface IProductService {

    void findAll();
    // hàm add
    Product1 findById(int id);
    void  update(Product1 product);
    // ..........................
    void add(Product1 product);

    void deleteProduct(int id);
    void findProduct(String name);
    void sortProduct();

}
