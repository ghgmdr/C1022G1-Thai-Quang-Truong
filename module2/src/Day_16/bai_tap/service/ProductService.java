package Day_16.bai_tap.service;


import Day_16.bai_tap.model.Product;
import Day_16.bai_tap.repository.IProductRepository;
import Day_16.bai_tap.repository.ProductRepository;

import java.io.IOException;

public class ProductService implements IProductService {
    private final IProductRepository repository = new ProductRepository();

    @Override
    public void addProduct(Product product) throws IOException {
        repository.addProduct(product);
    }

    @Override
    public void display() throws IOException {
        repository.display();
    }

    @Override
    public void findByCode(String code)
    {
        repository.findByCode(code);
    }



}
