package se.Agnes.model;


import java.util.ArrayList;
import java.util.List;

public class FriendManager {

    //create a list to store results
    private final List<Friend> friends = new ArrayList<>();

    // create method to add friends

    public void add(Friend friend) {
        friends.add(friend);

    }
    //create method to getAllFriends()

    public List<Friend> getAllFriends() {
        return new ArrayList<>(friends);
    }

    //create method findFriendsById
    public Friend findFriendById(int id) {
        for (Friend friend : friends) {
            if (friend.getId() == id) {
                return friend;

            }
        }
        return null;
    }

    // create method to removeFriendById(int id)
    public void removeFriendById(int id) {
        Friend friend = findFriendById(id);
        if (friend != null) {
            friends.remove(friend);
        }
    }
    //create method to updateFriendName(int id, String newName)
    public void updateFriendName(int id, String newName){
        for (Friend friend : friends){
            if (friend.getId() == id){
                friend.setName(newName);
                return;
            }
        }
    }

}
