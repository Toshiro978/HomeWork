package Lesson7;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        SearchBox<User> searchRequestUser = new SearchBox<>();
        searchRequestUser.setData(Arrays.asList(
                new User(1, "John Doe", "johndoe@testmail.com", 30),
                new User(2, "Jane Doe", "JaneDoe@testmail.com", 43),
                new User(3, "Doe Jole", "Doejole@testmail.com", 31),
                new User(4, "Koni Labe", "Konilabe@testmail.com", 25),
                new User(5, "Test User", "Testuser@testmail.com", 27)
        ));
        searchRequestUser.setPagination(new SearchBox.Pagination(10, 0, 50));
        SearchBox<Device> SearchResponseDevice = new SearchBox<>();
        SearchResponseDevice.setData(Arrays.asList(
                new Device("A123", "Laptop", 999.99),
                new Device("B456", "Smartphone", 499.99),
                new Device("C789", "Tablet", 799.99)

        ));
        SearchResponseDevice.setPagination(new SearchBox.Pagination(10, 0, 50));
        Collections.sort(searchRequestUser.getData());


        System.out.println("Users Data:");
        for (User user : searchRequestUser.getData()) {

            System.out.println("ID: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail() + ", Age: " + user.getAge());
        }
        System.out.println("User Pagination: Offset = " + searchRequestUser.getPagination().getOffset() + ", Limit = " + searchRequestUser.getPagination().getLimit() + ", Total Count = " + searchRequestUser.getPagination().getTotal());

        System.out.println("\nDevices Data:");
        for (Device Device : SearchResponseDevice.getData()) {
            System.out.println("Device ID: " + Device.getDeviceId() + ", Name: " + Device.getDeviceName() + ", Price: " + Device.getPrice());
        }
        System.out.println("Device Pagination: Offset = " + SearchResponseDevice.getPagination().getOffset() + ", Limit = " + SearchResponseDevice.getPagination().getLimit() + ", Total Count = " + SearchResponseDevice.getPagination().getTotal());
    }
}