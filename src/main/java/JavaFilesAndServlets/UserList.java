package JavaFilesAndServlets;

import java.util.ArrayList;
//list of user objects
public class UserList {
    //array list of user objects
    public ArrayList<User> userList = new ArrayList<>();

    //gets specified user from list
    public User getUser(int index){
        User u1 = userList.get(index);
        return u1;
    }
    //adds user to the list
    public void addUser(User u1){
        userList.add(u1);
    }
    //gets the size of the list
    public int size(){
        return userList.size();
    }
    //prints details of all items in the list
    public void display(){
        for(int i = 0; i < userList.size(); i++){
            userList.get(i).display();
        }
    }

}
