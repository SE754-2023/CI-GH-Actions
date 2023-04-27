package nz.ac.auckland.se754;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {



  @Test
  public void test1(){
    BankAccount b = new BankAccount();
    b.deposit(100);
    assertEquals(100,b.getBalance());
  }

  @Test
  public void test2(){
    BankAccount b = new BankAccount();
    b.deposit(100);
    assertEquals(50,b.getBalance());
  }
}