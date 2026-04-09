package Java17.sealedclass;

public sealed interface Shape permits Circle,Rectangle {
    public void draw();
    }

