package serializable;

public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Polly", 4, true);

        SerializeSheepDAO dao = new SerializeSheepDAO();

        dao.serialize(sheep);
    }
}
