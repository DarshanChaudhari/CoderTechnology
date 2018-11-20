import java.util.Comparator;

public class accountNoComparator implements Comparator<AccountComparator>  {

    @Override
    public int compare(AccountComparator o1, AccountComparator o2) {

        int account1Number = o1.getAccountNo();
        int account2Number = o2.getAccountNo();

        return account1Number - account2Number;
    }
}

class accountTypeComparator implements Comparator<AccountComparator>{

    @Override
    public int compare(AccountComparator o1, AccountComparator o2) {
        return o1.getAccountType().compareTo(o2.getAccountType());
    }
}

class accountHolderNameComparator implements Comparator<AccountComparator>{


    @Override
    public int compare(AccountComparator o1, AccountComparator o2) {
        return o1.getAccountHolderName().compareTo(o2.getAccountHolderName());
    }
}

class branchNameComparator implements Comparator<AccountComparator>{

    @Override
    public int compare(AccountComparator o1, AccountComparator o2) {
        return o1.getBranchName().compareTo(o2.getBranchName());
    }
}

class currentBalanceComparator implements  Comparator<AccountComparator>{

    @Override
    public int compare(AccountComparator o1, AccountComparator o2) {
     //   return o1.getCurrentBalance().compareTo(o2.getCurrentBalance());

        if(o1.getCurrentBalance()==o2.getCurrentBalance())
            return 0;
        else if (o1.getCurrentBalance() > o2.getCurrentBalance())
            return 1;
        else
            return -1;
    }
}