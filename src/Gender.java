public class Gender {

    public String gender;

    Gender(String gender)
    {
        if (gender == "MALE")
        {
            gender = "male";
        }
        else
        {
            gender = "female";
        }

    }

    String is()
    {
        return gender;
    }

}

