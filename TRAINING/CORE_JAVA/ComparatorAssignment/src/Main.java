import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<AccountComparator> account = new ArrayList();
        account.add(new AccountComparator(123456789,"Saving","Darshan","Malad",250000));
        account.add(new AccountComparator(656589895,"Current","Chaudhari","Chandavali",500000));
        account.add(new AccountComparator(400005556,"Saving","Ropali","Ghatkopar",200000));
        account.add(new AccountComparator(989897223,"Current","Tarte","Thane",520000));
        account.add(new AccountComparator(255548798,"Saving","Darsh","Aurangabad",600000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice to sort!!!");
        String userinput  = scanner.next();

        switch (userinput)
        {
            case "1" :
                Collections.sort(account, new accountNoComparator());
                System.out.println("Sorting by Account Number...");
                Iterator itr=account.iterator();
                while(itr.hasNext()){
                    AccountComparator acc=(AccountComparator)itr.next();
                    System.out.println(acc.getAccountNo() + " " + acc.getAccountType() + " " +acc.getCurrentBalance() + " " + acc.getBranchName()+ " "  + acc.getAccountHolderName());
                }
                break ;

            case "2" :
                Collections.sort(account, new accountTypeComparator());
                System.out.println("Sorting by Account Type...");
                itr=account.iterator();
                while(itr.hasNext()){
                    AccountComparator acc=(AccountComparator)itr.next();
                    System.out.println(acc.getAccountNo() + " " + acc.getAccountType() + " " +acc.getCurrentBalance() + " " + acc.getBranchName()+ " "  + acc.getAccountHolderName());
                }
                break ;

            case "3" :
                Collections.sort(account, new accountHolderNameComparator());
                System.out.println("Sorting by Account Holder Name...");
                itr=account.iterator();
                while(itr.hasNext()){
                    AccountComparator acc=(AccountComparator)itr.next();
                    System.out.println(acc.getAccountHolderName() + " " + acc.getAccountType() + " " +acc.getCurrentBalance() + " " + acc.getBranchName()+ " "  + acc.getAccountNo());
                }
                break ;

            case "4" :
                Collections.sort(account, new branchNameComparator());
                System.out.println("Sorting by Branch Name ...");
                itr=account.iterator();
                while(itr.hasNext()){
                    AccountComparator acc=(AccountComparator)itr.next();
                    System.out.println(acc.getCurrentBalance() + " " + acc.getAccountNo() + " " + acc.getAccountType() + " " + acc.getBranchName()+ " "  + acc.getAccountHolderName());
                }
                break ;

            case "5" :
                Collections.sort(account, new currentBalanceComparator());
                System.out.println("Sorting by Current Balance...");
                itr=account.iterator();
                while(itr.hasNext()){
                    AccountComparator acc=(AccountComparator)itr.next();
                    System.out.println(acc.getCurrentBalance() +" " +acc.getAccountNo() + " " + acc.getAccountType() + " " +acc.getBranchName() + " "  + acc.getAccountHolderName());
                }
                break ;



        }


    }
}
