package se.Agnes.DAO.Impl;

import se.Agnes.DAO.FriendDAO;
import se.Agnes.Exception.FriendNotFoundException;
import se.Agnes.model.Friend;

import java.util.ArrayList;
import java.util.List;

public class FriendDAOImpl implements FriendDAO {

    //create a list to store friends

    private List<Friend> friends = new ArrayList<>();

    @Override
    public void add(Friend friend) {
        friends.add(friend);

    }

    @Override
    public Friend findById(int id) {
        for (Friend friend : friends) {
            if (friend.getId() == id) {
                return friend;
            }
        }
        throw new FriendNotFoundException("Friend with ID " + id + " not found.");
    }

    @Override
    public List<Friend> findAll() {

        return new ArrayList<>(friends);
    }

    @Override
    public boolean deleteById(int id) {
        Friend found = findById(id);
        if (found != null) {
            friends.remove(found);
            return true;

        }

        throw new FriendNotFoundException("Cannot delete: Friend with ID " + id + " not found.");
    }

    @Override
    public Friend updateName(int id, String newName) {
        for (Friend friend : friends) {
            if (friend.getId() == id) {
                friend.setName(newName);
                return friend;
            }
        }
        throw new FriendNotFoundException("Friend with ID " + id + " not found.");
    }

    @Override
    public boolean existsById(int id) {
        return findById(id) != null;
    }
}
