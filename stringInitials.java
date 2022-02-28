public class stringInitials {
    static void initials(String full_Name)
    {
        if (full_Name.length() == 0)
            return;
        System.out.println(full_Name.charAt(0));

        for (int i = 1; i < full_Name.length() - 1; i++) {
            if(full_Name.charAt(i) == ' ')
                System.out.println(" " + full_Name.charAt(i + 1));
        }
    }
    public static void main(String[] args) {
        String full_Name = "Yadhu Krishna P P";
        initials(full_Name);
    }

}
