package se.Agnes.DAO;

import se.Agnes.model.Friend;

import java.util.List;

public interface FriendDAO {
    void add(Friend friend); // Create

    Friend findById(int id);  // Read

    List<Friend> findAll();   // Read All

    boolean deleteById(int id); // Delete

    Friend updateName(int id, String newName); // Update

    boolean existsById(int id); // Check existence
}
