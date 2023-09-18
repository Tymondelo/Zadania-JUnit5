package Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void newAccountShouldNotBeActiveAfterCreation(){
//        given+when
        Account newAccount = new Account();
//        then
        assertFalse(newAccount.isActive());
    }
    @Test
    void accountShouldBeActiveAfterActivation(){
//        given
        Account newAccount = new Account();
//        when
        newAccount.activate();
//        then
        assertTrue(newAccount.isActive());
    }
    @Test
    void newAccountShouldNotHaveNameAfterCreation(){
//        given+when
        Account newAccount = new Account();
//        then
        assertEquals(newAccount.hasNumber(), 0);
    }
    @Test
    void accountShouldHaveNameAfterInsertingIt(){
//        given
        Account newAccount = new Account();
//        when
        newAccount.giveNumber();
//        then
        assertEquals(newAccount.hasNumber(), 1);
    }
}