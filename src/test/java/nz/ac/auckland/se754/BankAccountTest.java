package nz.ac.auckland.se754;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

  private BankAccount bank;

  @BeforeEach
  public void setUp(){
    bank = new BankAccount();
  }

  @Test
  public void test1(){
bank.deposit(10.00);
double balance = bank.getBalance();
assertEquals(10,balance);

  }

  @Test
  public void test2(){
    bank.deposit(100.00);
    bank.withdraw(10.00);
    double balance = bank.getBalance();
    assertEquals(90,balance);

  }

}