package JavaFilesAndServlets;

import java.util.ArrayList;

public class AccountList {

    public ArrayList<Accounts> accountList = new ArrayList<>();

    public Accounts getAccount(int index){
        Accounts a1 = accountList.get(index);
        return a1;
    }
    public void addAccount(Accounts a1){
        accountList.add(a1);
    }
    public int size(){
        return accountList.size();
    }
}
