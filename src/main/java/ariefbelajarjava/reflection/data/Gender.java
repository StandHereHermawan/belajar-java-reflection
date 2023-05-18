package ariefbelajarjava.reflection.data;

public enum Gender {

    MALE("Male"),
    FEMALE("Female"),
    NOT_MENTION("Not Mention"),
    ATTACK_HELICOPTER("Attack Helicopter");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;

    }
}
