class AccountBalance {
    public int processTransactions(int startingBalance, String[] transactions){
        for(String transaction: transactions){
            String type = transaction.substring(0, 1);
            int amount = Integer.parseInt(transaction.substring(2));
            
            if(type.equals("C")) startingBalance += amount;
            else startingBalance -= amount;
        }
        return startingBalance;
    }
}


