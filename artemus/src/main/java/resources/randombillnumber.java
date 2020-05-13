package resources;

import java.util.Random;

public class randombillnumber {

	public String generateRandomToken() {
        String token = "";
        String SALTCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rand = new Random();
        while (salt.length() < 4 ) { // length of the random string.
            int index = (int) (rand.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        token = salt.toString();
        return token;
    }
}