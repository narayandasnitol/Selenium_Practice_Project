package PageObjectModel.utility;

import java.io.File;
import java.util.Random;

public class ProjectData {

    String firstName, lastName, userEmailAddress, message;

    public ProjectData(String firstName, String lastName, String userEmailAddress, String message) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userEmailAddress = userEmailAddress;
        this.message = message;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    public String getMessage() {
        return message;
    }

    public static ProjectData generateRandomInfo() {
        Random random = new Random();

        String[] firstNameArr;
        firstNameArr = new String[]{"James", "John", "Robert", "Michael", "William", "David", "Richard", "Charles",
                "Joseph", "Thomas", "Mary", "Patricia", "Linda", "Barbara", "Elizabeth", "Jennifer", "Maria", "Susan",
                "Margaret", "Dorothy"};
        String[] lastNameArr;
        lastNameArr = new String[]{"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
                "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris"};
        String[] messagesArr;
        messagesArr = new String[]{
                "Thank you for reaching out to us. We will get back to you soon.",
                "Your message has been received. Our team will respond shortly.",
                "We appreciate your inquiry. Expect a response from us shortly.",
                "Our team has received your message. We will be in touch soon.",
                "Thanks for getting in touch. We'll be reaching out to you shortly."
        };

        String firstName = firstNameArr[random.nextInt(firstNameArr.length)];
        String lastName = lastNameArr[random.nextInt(lastNameArr.length)];
        String message = messagesArr[random.nextInt(messagesArr.length)];

        String userEmailAddress = (firstName).toLowerCase() + "." + (lastName).toLowerCase() + random.nextInt(200)
                + ".orangetoolz.user.test@yopmail.com";

        return new ProjectData(firstName, lastName, userEmailAddress, message);
    }
}
