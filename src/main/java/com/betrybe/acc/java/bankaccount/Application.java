package com.betrybe.acc.java.bankaccount;

import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    AccountNumberFormatter formatter = new AccountNumberFormatter();
    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o numero da conta: ");

    try {
      int accountNumber = scan.nextInt();
      String formattedAccountNumber = formatter.formatAccountNumber(accountNumber);

      System.out.println("Numero da conta: " + formattedAccountNumber);
    } catch (Exception e) {
      System.out.println("O número da conta deve conter apenas números.");
    } finally {
      scan.close();
    }

  }

}
