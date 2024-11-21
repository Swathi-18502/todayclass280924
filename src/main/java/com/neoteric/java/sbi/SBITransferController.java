package com.neoteric.java.sbi;

public class SBITransferController {

    private SBITransferService sbTransferService = new SBITransferService();

    public void initiateTransfer(String fromAccount, String toAccount, double amount) {
        try {
            sbTransferService.transferFunds(fromAccount, toAccount, amount);
        } catch (InsufficientFundsException e) {
            System.err.println("Error: " + e.getMessage());
            // Handle insufficient funds
        } catch (InvalidAccountException e) {
            System.err.println("Error: " + e.getMessage());
            // Handle invalid account
        } catch (Exception e) {
            System.err.println("A system error occurred: " + e.getMessage());
            // Handle any other unexpected errors
        }
    }
}

