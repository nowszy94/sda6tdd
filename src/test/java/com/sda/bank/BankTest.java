package com.sda.bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class BankTest {

    private Bank bank;

    @Before
    public void init() {
        this.bank = new Bank("test");
    }

    @Test
    public void shouldAddNewUser() {
        //Given:
        User user = new User("Szymon", "Nowak");

        //When:
        boolean result = bank.addUser(user);

        //Then:
        Assert.assertTrue("Method returned false", result);
        Assert.assertEquals("User is not present in bank list.", 1, bank.getNumberOfUsers());
    }

    @Test
    public void shouldNotAddNullUser() {
        //Given:
        User user = null;

        //When:
        boolean result = bank.addUser(user);

        //Then:
        Assert.assertFalse("Method returned true", result);
        Assert.assertEquals("User is present in bank list.", 0, bank.getNumberOfUsers());
    }

//    @Test
//    public void shouldCreateAccountForGivenUser() {
//        //Given:
//        UserService mockUserService = Mockito.mock(UserService.class);
//        AccountService mockAccountService = Mockito.mock(AccountService.class);
//
//        Mockito.when(mockUserService.addUser(Mockito.any(User.class))).thenReturn(true);
//        Mockito.when(mockUserService.getNumberOfUsers()).thenReturn(1);
//
//        Mockito.when(mockAccountService.addAccount(Mockito.any(Account.class))).thenReturn(true);
//        Mockito.when(mockAccountService.getNumberOfAccounts()).thenReturn(1);
//
//        bank.setAccountService(mockAccountService);
//        bank.setUserService(mockUserService);
//
//        User user = new User("Szymon", "Nowak");
//        Account account = new Account(0, 0);
//
//        //When:
//        boolean userAddResult = bank.addUser(user);
//        boolean accountAddResult = bank.createAccount(0, account);
//
//        //Then:
//        Assert.assertTrue("User is not present in bank list.", userAddResult);
//        Assert.assertEquals("User is not present in bank list.", 1, bank.getNumberOfUsers());
//        Assert.assertTrue("Acount is not present in bank list.", accountAddResult);
//        Assert.assertEquals("Acount is not present in bank list.", 1, bank.getNumberOfAccounts());
//    }

}
