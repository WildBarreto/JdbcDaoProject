package dao;

import model.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    Seller deletebyId(Integer id);
    Seller findById(Integer id);
    List<Seller> finfAll();
}
