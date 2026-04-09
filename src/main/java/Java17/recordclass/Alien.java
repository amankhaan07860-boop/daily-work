package Java17.recordclass;

record Alien(int id, String name) {
    public Alien {
        if (id == 0)
            throw new IllegalArgumentException("id is not available");

    }
}
class Project {

public static void main(String[] args) {

    Alien a1 = new Alien(1, "Aman");
    Alien a2 = new Alien(4,"Ama");
    System.out.println(a1.name());

}
}