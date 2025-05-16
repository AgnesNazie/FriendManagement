package se.Agnes;

import se.Agnes.model.Friend;
import se.Agnes.model.FriendManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ArrayList<Friend> friends = new ArrayList<>();
        FriendManager friendManager = new FriendManager();

        //create friends object
        Friend friend1 = new Friend(1,"Agnes");
        Friend friend2 = new Friend(2,"Fidelis");
        Friend friend3 = new Friend(3,"Lizzy");

        //add item into the list
        friendManager.add(friend1);
        friendManager.add(friend2);
        friendManager.add(friend3);

        //print all friends
        for (Friend friend : friendManager.getAllFriends()) {
            System.out.println(friend);
        }

        //find by id
        String updatedName = "Fuche" ;
        friendManager.findFriendById(1);
        friendManager.updateFriendName(2,updatedName);
        System.out.println("Updated name " + updatedName);

        //delete a friend
        friendManager.removeFriendById(3);

        //print all friends
        for (Friend friend : friendManager.getAllFriends()) {
            System.out.println(friend);
        }



    }
}