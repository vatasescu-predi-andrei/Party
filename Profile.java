import java.util.ArrayList;
public class Profile {
    /**This class represents a profile of a person in our social network
     * A profile is kind of like any other social network profile - it has their name, date of birth, email
     * address and their interests and connects the profile to other profiles through "friendships"
     * @author Andrei Daniel Vatasescu Predi
     * @version 1.0
     * */

        private String lastName;
        private String firstName;
        private int day;
        private int month;
        private int year;
        private String emailAddress;
        private String[] interest;
        private String[] activities;
        private ArrayList<Profile> friends=new ArrayList<>();

        /**
         * Creates a user profile
         * @param lastName The user's last name.
         * @param firstName The user's first name.
         * @param day The day of the user's date of birth.
         * @param month The month of the user's date of birth.
         * @param year The year of the user's date of birth.
         * @param emailAddress The email address of the user.
         * @param interest The user's interests.
         */

        public Profile(String lastName,String firstName, int day, int month, int year, String emailAddress, String[] interest, String[] activities){
            this.lastName=lastName;
            this.firstName=firstName;
            this.day=day;
            this.month=month;
            this.year=year;
            setEmailAddress(emailAddress);
            setInterest(interest);
            setActivity(activities);
        }

    /**
     * Sets the user's interests.
     * @param interests The user's interests.
     */
         public void setInterest(String[] interests){
            interest=new String[interests.length];
            int i;
            for(i=0;i<interests.length;i++){
                this.interest[i]=interests[i];
        }
    }
    /**
     *
     * @return The user's interests
     */
    public String getInterest(){
        String allInterests="";
        for(int i=0;i<interest.length;i++){
            allInterests=allInterests+interest[i]+" ";
        }
        return allInterests;
    }
    /**
     * Sets the user's activities.
     * @param activity The user's activities
     */
    public void setActivity(String[] activity){
        activities=new String[activity.length];
        int i;
        for(i=0;i<activity.length;i++){
            this.activities[i]=activity[i];
        }
    }
    /**
     *
     * @return User`s activities
     */
    public String getActivity(){
        String allActivities="";
        for(int i=0;i<activities.length;i++){
            allActivities=allActivities+activities[i]+" ";
        }
        return allActivities;
    }
    /**
     * Sets the email address of the user.
     * @param emailAddress User`s email address
     */
    public void setEmailAddress(String emailAddress){
        this.emailAddress=emailAddress;
    }
    /**
     *
     * @return User`s email address
     */
    public String getEmailAddress(){
        return emailAddress;
    }
    /**
     *
     * @return User`s date of birth.
     */
    public String getDateOfBirth(){
        return (this.day+"/"+this.month+"/"+this.year);
    }

    /**
     *
     * @return The full name of the user.
     */
    public String getName(){
        return (firstName+" "+lastName);
    }

    /**
     * Add a profile to the user's friend list.
     * @param p The profile added to the user`s friend list
     */
    public void addFriend(Profile p){
        this.friends.add(p);
    }
    /**
     *
     * @param i The friend found in position i of the user's friend list.
     * @return The ith friend of the user.
     */
    public Profile getFriend(int i){
        return friends.get(i);
    }

    /**
     *
     * @return The number of friends of the user's friend list.
     */
    public int numOfFriends(){
        return friends.size();
    }

    /**
     *
     * @return The description of the user profile
     */
    public String toString(){
        String fullDescription="Name: ";
        fullDescription+=getName()+"\n";
        fullDescription+="Date of birth: "+getDateOfBirth()+"\n";
        fullDescription+="Email address: "+getEmailAddress()+"\n";
        fullDescription+="User's interests: "+getInterest()+"\n";
        fullDescription+="User's activities: "+getActivity()+"\n";
        fullDescription+="User's friend list: ";

        for(int i=0;i<numOfFriends();i++){
            fullDescription+=this.getFriend(i).getName()+"; ";
        }

        return fullDescription;
    }
}