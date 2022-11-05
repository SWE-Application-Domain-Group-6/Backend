package JavaFilesAndServlets;

import java.util.ArrayList;

public class UserList {

    public ArrayList<User> userList = new ArrayList<>();

    public User getUser(int index){
        User u1 = userList.get(index);
        return u1;
    }
    public void addUser(User u1){
        userList.add(u1);
    }
    public int size(){
        return userList.size();
    }
    public void display(){
        for(int i = 0; i < userList.size(); i++){
            userList.get(i).display();
        }
    }

}
