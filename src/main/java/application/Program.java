package application;


import dao.DaoFactory;
import dao.SellerDao;
import model.Department;
import model.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);


        System.out.println("=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }


        System.out.println("=== TEST 3: seller findAll ===");

        list = sellerDao.findAll();

        for (Seller obj : list){
            System.out.println(obj);
        }


        System.out.println("=== TEST 4: seller findAll ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());


        System.out.println("Inserted! New id = " + newSeller.getId());
        seller = sellerDao.findById(2);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("=== TEST 6: seller findAll ===");
        System.out.println("Enter id for delete test: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        sellerDao.deletebyId(id);
        System.out.println("Deleted copleted");


    }

}
