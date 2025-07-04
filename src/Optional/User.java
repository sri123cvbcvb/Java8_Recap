package Optional;

public class User {

    private String name;
    private String profilePic;

    public User() {
    }

    public User(String name, String profilePic) {
        this.name = name;
        this.profilePic = profilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", profilePic='" + profilePic + '\'' +
                '}';
    }
}
