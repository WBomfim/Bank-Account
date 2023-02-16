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
    byte SIZE_ACCOUNT_NUMBER = 6;
    String accountNumber = String.valueOf(literalAccountNumber);
  
    if (accountNumber.length() < SIZE_ACCOUNT_NUMBER) {
      return StringUtils.leftPad(accountNumber, SIZE_ACCOUNT_NUMBER, "0");
    }

    if (accountNumber.length() > SIZE_ACCOUNT_NUMBER) {
      return StringUtils.right(accountNumber, SIZE_ACCOUNT_NUMBER);
    }

    return accountNumber;
  }

}
