package lesson19.task3;

import java.io.*;

public class Horse extends Animal implements Serializable {
    private Halter halter;

    public Horse() {
        System.out.println("In constructor Horse");
    }

    public static void serialize(Horse horse) {
        try (OutputStream os = new FileOutputStream("src/io/output.txt");
             ObjectOutput out = new ObjectOutputStream(os)) {
            out.writeObject(horse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Horse deSerialize() {
        Horse horse = null;
        try (InputStream is = new FileInputStream("src/io/output.txt");
             ObjectInput oi = new ObjectInputStream(is)) {
          horse = (Horse) oi.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return horse;
    }

    public static void main(String[] args) {
        Horse horse = new Horse();
        serialize(horse);
        horse = deSerialize();
    }
}
