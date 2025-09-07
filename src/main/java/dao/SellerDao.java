package dao;

import model.Department;
import model.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deletebyId(Integer id);
    Seller findById(Integer id);
    List<Seller> finfAll();
}
