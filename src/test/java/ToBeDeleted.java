import com.rohit.app.core.model.Address;
import com.rohit.app.core.model.ContactInformation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rohit.app.core.model.User;

public class ToBeDeleted {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Rohit");
        user.setLastName("Verma");
        user.setPreFix("Mr.");
        user.setAddress(createDummyAddress());
        user.setContactInformation(createDummyContactInfo());
        System.out.println(toJsonString(user, User.class));
    }

    private static ContactInformation createDummyContactInfo() {
        ContactInformation contactInformation = new ContactInformation();
        contactInformation.setEmailId("rohitgpverma@gmail.com");
        contactInformation.setPhoneNumber("4253260496");
        return contactInformation;
    }
    private static Address createDummyAddress()
    {
        Address address = new Address();
        address.setFirstLine("24214 SE 1st PL");
        address.setCity("Sammamish");
        address.setState("WA");
        address.setZipCode(98074);
        return address;
    }

    private static String toJsonString(User contactInformation, Class clz)
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(contactInformation, clz);
    }
}
