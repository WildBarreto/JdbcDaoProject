package application;


import dao.DaoFactory;
import dao.SellerDao;
import model.Department;
import model.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");

        Seller seller = sellerDao.findById(3);


        System.out.println(seller);

        System.out.println();
    }

}
