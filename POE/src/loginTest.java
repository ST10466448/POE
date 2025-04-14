import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class loginTest {
    @Test
    void testUsernameCorrectlyFormatted() {
        String testData = "Tris_";
        String expectedMessage = " Welcome <user first name>,< user second name> its great to see you:";
        Object TestData;
        assertEquals(expectedMessage, validateUsername(testData));
    }

    public Object validateUsername(String testData) {
        return null;
    }

    @Test
    void testUsernameIncorrectlyFormatted() {
        String testData = "Tris___";
        String expectedMessage = "Username is incorrectly formatted, please ensure that your username contains an underscore and is no longer than five characters in length.";

        assertEquals(expectedMessage, validateUsername(testData));
    }

    @Test
    void testUsernameNoUnderscore() {
        String testData = "Tris";
        String expectedMessage = "Username is incorrectly formatted, please ensure that your username contains an underscore and is no longer than five characters in length.";
        assertEquals(expectedMessage, validateUsername(testData));
    }

    @Test
    void testPasswordCorrectFormat() {
        String testData = "Tris089!";
        String expectedMessage = "Password successfully captured.";
        assertEquals(expectedMessage, validatePassword(testData));


    }

    private String validatePassword(String testData) {
        return null;
    }

    @Test
    void testPasswordIncorrectFormat() {
        String testData = "Tris09!";
        String expectedMessage = "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        assertEquals(expectedMessage, validatePassword(testData));
    }

    @Test
    void testPasswordNoCapital() {
        String testData = "tris089!";
        String expectedMessage = "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        assertEquals(expectedMessage, validatePassword(testData));
    }

    @Test
    void testPasswordNoNumber() {
        String testData = "Tris!!!!";
        String expectedMessage = "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        assertEquals(expectedMessage, validatePassword(testData));
    }

    @Test
    void testPasswordNoSpecialCharacter() {
        String testData = "Tris1234";
        String expectedMessage = "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        assertEquals(expectedMessage, validatePassword(testData));
    }

    @Test
    void testCellphoneNumberCorrectFormat() {
        String testData = "+2768 682 1391 ";
        String expectedMessage = "Cellphone number successfully added";
        assertEquals(expectedMessage, validateCellphoneNumber(testData));
    }

    private String validateCellphoneNumber(String testData) {
        return null;}

    @Test
    void testCellphoneNumberIncorrectFormat(){
        String testData= "069 682 1391";
        String expectedMessage= "Cell phone number incorrectly formatted or does not contain international code";
        assertEquals(expectedMessage, validateCellphoneNumber(testData));
    }



}