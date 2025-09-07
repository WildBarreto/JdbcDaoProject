package application;


import dao.DaoFactory;
import dao.SellerDao;
import model.Department;
import model.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");


        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerdao = DaoFactory.createSellerDao();
        System.out.println(seller);

        System.out.println(obj);
    }

}
