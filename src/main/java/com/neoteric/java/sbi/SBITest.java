package com.neoteric.java.sbi;

public class SBITest {

        public static void main(String[] args) {
            SBITransferService transferService = new SBITransferService();

            String fromAccount = "12345";
            String toAccount = "67890";
            double amount = 300.00;

            try {
                // Attempt to transfer funds
                transferService.transferFunds(fromAccount, toAccount, amount);
            } catch (InsufficientFundsException e) {
                System.err.println("Error: Insufficient funds - " + e.getMessage());
                // Handle insufficient funds (e.g., inform the user)
            } catch (InvalidAccountException e) {
                System.err.println("Error: Invalid account - " + e.getMessage());
                // Handle invalid account error (e.g., prompt for correct account details)
            } catch (ServiceUnavailableException e) {
                System.err.println("Service Error: " + e.getMessage());
                // Handle service unavailability (e.g., inform the user or retry later)
            } catch (Exception e) {
                System.err.println("An unexpected error occurred: " + e.getMessage());
                // Handle any other unexpected errors
            }
        }
    }


