package game;

import datastructures.BinarySearchTree;
import exceptions.SavegameException;

import java.io.*;

public class SavegameManager {

    public static void save(GameState state) throws SavegameException {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("save.data"))) {
            out.writeObject(state);
        } catch (IOException e) {
            throw new SavegameException("Speichern fehlgeschlagen", e);
        }
    }

    public static void load()
            throws SavegameException {

        // TODO: ObjectInputStream nutzen
        // TODO: Daten wiederherstellen
    }
}
