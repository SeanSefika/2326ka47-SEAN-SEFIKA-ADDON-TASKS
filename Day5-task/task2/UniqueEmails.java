package task2;

import java.util.HashSet;

public class UniqueEmails 
{
    public static void main(String[] args) 
    {
        HashSet<String> emails = new HashSet<>();

        emails.add("sefi@gmail.com");
        emails.add("steve@gmail.com");
        emails.add("fenicus@gmail.com");
        emails.add("praiselin@gmail.com"); 

        System.out.println("Unique Email Addresses:");
        for (String email : emails) 
        {
            System.out.println(email);
        }
    }
}
