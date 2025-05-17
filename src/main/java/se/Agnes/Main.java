package se.Agnes;

import se.Agnes.DAO.FriendDAO;
import se.Agnes.DAO.Impl.FriendDAOImpl;
import se.Agnes.model.Friend;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Friend Management System");

        ArrayList<Friend> friends = new ArrayList<>();
        FriendDAO friendDAO = new FriendDAOImpl();

        //create friends object
        Friend friend1 = new Friend(1, "Agnes");
        Friend friend2 = new Friend(2, "Fidelis");
        Friend friend3 = new Friend(3, "Lizzy");

        //add item into the list
        friendDAO.add(friend1);
        friendDAO.add(friend2);
        friendDAO.add(friend3);
        System.out.println("Friends added successfully");

        //print all friends
        for (Friend friend : friendDAO.findAll()) {
            System.out.println(friend);
        }

        //find by id
        String updatedName = "Fuche";
        friendDAO.findById(1);
        friendDAO.updateName(2, updatedName);
        System.out.println("Updated name " + updatedName);

        //exist by id
        friendDAO.existsById(2);

        //delete a friend
        friendDAO.deleteById(3);

        //print all friends
        System.out.println("List of all Friends:");
        for (Friend friend : friendDAO.findAll()) {
            System.out.println(friend);
        }


    }
}