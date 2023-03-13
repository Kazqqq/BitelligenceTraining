package serializable;

import java.io.*;

public class SerializeSheepDAO {

    public void serialize(Sheep sheep) {
        File file = new File("/Users/noah.krueger/BitelligenceTraining/untitled/src/student.ser");

        try(FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {

            objectOutputStream.writeObject(sheep);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
