import com.rohit.app.core.model.ContactInformation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ToBeDeleted {
    public static void main(String[] args) {
        ContactInformation contactInformation = new ContactInformation();
        contactInformation.setEmailId("a@b.com");
        contactInformation.setPhoneNumber(123456789);
        System.out.println(toJsonString(contactInformation));
    }

    private static String toJsonString(ContactInformation contactInformation)
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(contactInformation, ContactInformation.class);
    }
}
