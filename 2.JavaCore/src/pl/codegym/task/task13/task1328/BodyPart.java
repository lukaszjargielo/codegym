package pl.codegym.task.task13.task1328;

public final class BodyPart {
    final static BodyPart LEG = new BodyPart("noga");
    final static BodyPart HEAD = new BodyPart("głowa");
    final static BodyPart ARM = new BodyPart("ręka");
    final static BodyPart CHEST = new BodyPart("klatka");

    private String bodyPart;

    private BodyPart(String bodyPart) {

        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {

        return this.bodyPart;
    }
}
