package Java17.sealedclass2;

public sealed class ParentClass permits ChildClass {
    public void add(){
        System.out.println("hi");
    }
}
