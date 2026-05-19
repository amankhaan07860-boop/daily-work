package Java17.recordclass;

record Alien(int id, String name) {
    public Alien {
        if (id == 0)
            throw new IllegalArgumentException("id is not available");
    }
}
