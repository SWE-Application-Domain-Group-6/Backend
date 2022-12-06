package JavaFilesAndServlets;
import java.util.ArrayList;

//class for creating a list of accounts
public class AccountList {

    //creating an arraylist called accountList
    public ArrayList<Accounts> accountList = new ArrayList<>();

    //method for getting an account from an accountList
    public Accounts getAccount(int index){
        Accounts a1 = accountList.get(index);
        return a1;
    }

    //adds an account to the accountlist
    public void addAccount(Accounts a1){
        accountList.add(a1);
    }
    //get the size of the accountlist (also the number of accounts)
    public int size(){
        return accountList.size();
    }
}
