public enum CarType {
    CABRIO("Wybrałeś Carbio"), SEDAN("Wybrałęś sedana"), WAGON("Wybrałeś kombi");
    private String description;

    public String getDescription() {
        return description;
    }

    CarType(String description) {
        this.description = description;
    }
}
