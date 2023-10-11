package de.telran.khakov.rustam.classworks.cw21;

public class BalanceTester {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100, "test_account@gmail.com");
        System.out.println(bankAccount.getBalance());
        //int i = 1 / 0;
        try {
            bankAccount.setBalance(50);
            bankAccount.setBalance(-1);
//            if (e instanceof Throwable){
//                //
//            } else if(e instanceof NegativeAccountBalanceException) {
//
//            }
        } catch (NegativeAccountBalanceException e) {
            //e.printStackTrace();
            sendErrorMessage(bankAccount, e.getBalance());
            System.exit(1);
            throw new RuntimeException(e);
        } catch (Error e) {
            // last breath
            throw e;
        } catch (RuntimeException e) {
            System.out.println("I catch RuntimeException");
        } catch (Throwable e) {
            System.out.println("I catch Throwable");
        } finally {
            System.out.println("Transaction completed");
        }
    }

    private static void sendErrorMessage(BankAccount bankAccount, int balance) {
        System.out.println("We send msg to %s with balance %s".formatted(bankAccount.getEmail(), balance));
    }
}
