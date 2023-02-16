package com.betrybe.acc.java.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    byte sizeAccountNumber = 6;
    String accountNumber = String.valueOf(literalAccountNumber);
  
    if (accountNumber.length() < sizeAccountNumber) {
      return StringUtils.leftPad(accountNumber, sizeAccountNumber, "0");
    }

    if (accountNumber.length() > sizeAccountNumber) {
      return StringUtils.right(accountNumber, sizeAccountNumber);
    }

    return accountNumber;
  }

}
