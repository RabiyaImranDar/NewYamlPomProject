package testUser;

import org.junit.jupiter.api.Test;
import user.User;

import static org.junit.Assert.assertEquals;

public class TestUser {
// skriva enhets klass
@Test
    public void testUser(){
   // skapa ett objekt av klassen User
    User myUser = new User("username", "password"); // röd först user men vi ska autogenerera
    // genom att hovra på den, more actions: skapa user klass under project java, project user
    // sen skriv två parametrar "username" och "password"
    // hovra på dem och skapa med more actions, skapa constructor
    // det ska inte vara en definiering d.v.s. String a, String b<-- fel

String myUsername = myUser.getUsername();
assertEquals("username", myUsername);
}
    @Test
    public void testPassword(){
        // skapa ett objekt av klassen User
        User myUser = new User("username", "password"); // röd först user men vi ska autogenerera
        // genom att hovra på den, more actions: skapa user klass under project java, project user
        // sen skriv två parametrar "username" och "password"
        // hovra på dem och skapa med more actions, skapa constructor
        // det ska inte vara en definiering d.v.s. String a, String b<-- fel

        String myPassword = myUser.getPassword();
        assertEquals("password", myPassword);
    }
    @Test // ändring med ny branch iställetför main branch
    public void setPassword(){
        // skapa ett objekt av klassen User
        User myUser = new User("username", "newpassword"); // röd först user men vi ska autogenerera
        // genom att hovra på den, more actions: skapa user klass under project java, project user
        // sen skriv två parametrar "username" och "password"
        // hovra på dem och skapa med more actions, skapa constructor
        // det ska inte vara en definiering d.v.s. String a, String b<-- fel

        String newPassword = myUser.setPassword();
        assertEquals("newpassword", newPassword);
    }

}
