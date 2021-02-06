package exercises.technology.main;

public abstract class AbstractEntity {

    private int id;
    private static int nextId = 1;

    public AbstractEntity() {
        this.id = nextId;
        nextId++;
    }
    // Methods
    public int getId() { return this.id; } //note: about ids are unique ideniftiers = getters are fine but setters are not ideal because you dont want to create a set id in your classes


}
