package com.neoteric.java.sbi;


public class SBITransferService {

    public void transferFunds(String fromAccount, String toAccount, double amount) {
        try {
            // Validate accounts
            if (!isValidAccount(fromAccount) || !isValidAccount(toAccount)) {
                throw new InvalidAccountException("Invalid account specified for transfer.");
            }

            // Check balance in the 'from' account
            if (getAccountBalance(fromAccount) < amount) {
                throw new InsufficientFundsException("Insufficient funds for transfer.");
            }

            // Perform transfer (assuming debit and credit methods exist)
            debitAccount(fromAccount, amount);
            creditAccount(toAccount, amount);

            System.out.println("Transfer successful!");

        } catch (InvalidAccountException | InsufficientFundsException e) {
            System.err.println("Transfer failed: " + e.getMessage());
            throw e;  // Optional: re-throw the unchecked exception for further handling
        } catch (Exception e) {
            System.err.println("An unexpected error occurred during the transfer: " + e.getMessage());
            throw new RuntimeException("Transfer could not be completed.", e);
        }
    }

    private boolean isValidAccount(String account) {
        // Account validation logic (dummy implementation)
        return account != null && !account.isEmpty();
    }

    private double getAccountBalance(String account) {
        // Logic to get account balance (dummy implementation)
        return 1000.00;
    }

    private void debitAccount(String account, double amount) {
        // Logic to debit the account
    }

    private void creditAccount(String account, double amount) {
        // Logic to credit the account
    }
}

