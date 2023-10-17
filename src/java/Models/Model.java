package Models;

public class Model {

    protected long id;

    public Model() {
    }

    public Model(long id) {
        this.id = id;
    }

    protected long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }
}
