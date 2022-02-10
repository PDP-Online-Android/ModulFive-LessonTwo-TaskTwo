package dev.ogabek.java.model;

public class Chat {

    private final int profile;
    private final String fullName;
    private final int count;

    public Chat(int profile, String fullName, int count) {
        this.profile = profile;
        this.fullName = fullName;
        this.count = count;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCount() {
        return count;
    }

    public int getProfile() {
        return profile;
    }
}
