import java.util.Scanner;
import exceptions.EnemyNotFoundException;
import exceptions.SavegameException;
import exceptions.InventoryFullException;
import game.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        EnemyTree enemyTree = new EnemyTree();
        seedEnemies(enemyTree);
        Player player = null;
        Inventory inventory = new Inventory();
        GameState state = new GameState(player, inventory, enemyTree);

        while(running) {
            printMenu();
            int choice = scanner.nextInt();

            try {
                running = handleUserChoice(choice, state);
            } catch (InventoryFullException e) {
                System.out.println(e.getMessage());
            } catch (EnemyNotFoundException e) {
                System.out.println("Gegner nicht gefunden.");
            } catch (SavegameException e) {
                System.out.println("Speichern/Laden fehlgeschlagen.");
            }
        }
    }

    private static boolean handleUserChoice (int choice, GameState state) throws InventoryFullException, EnemyNotFoundException, SavegameException {

        switch (choice) {
            case 1:
                //TODO: Spieler erstellen
                System.out.println("Herzlichen Glückwunsch. Du erstellst einen Charakter! Wähle einen Namen:");
                Player player = new Player();
                state.setPlayer(player);
                return true;

            case 2:
                //TODO: Item hinzufügen (kann InventoryFullException werfen)
                return true;

            case 3:
                // TODO:  Gegner anzeigen (kann EnemyNotFoundException werfen)
                state.getEnemyTree().printEnemies();
                return true;

            case 4:
                //TODO: Spiel speichern (kann SavegameException werfen)
                SavegameManager.save(state);
                return true;

            case 5:
                //TODO: Spiel laden (kann SavegameException werfen)
                return true;

            case 0:
                return false; //beendet das Spiel

            default:
                System.out.println("Ungültige Eingabe!");
                return true;
        }

    }

    private static void printMenu() {
        System.out.println("1. Spieler erstellen");
        System.out.println("2. Item hinzufügen");
        System.out.println("3. Gegner anzeigen");
        System.out.println("4. Spiel speichern");
        System.out.println("5. Spiel laden");
        System.out.println("0. Spiel schließen");
    }

    public static void seedEnemies(EnemyTree enemyTree) {

        Enemy a = new Enemy();
        a.setLevel(10);
        Enemy b = new Enemy();
        b.setLevel(10);
        Enemy c = new Enemy();
        c.setLevel(5);

        enemyTree.addEnemy(a);
        enemyTree.addEnemy(b);
        enemyTree.addEnemy(c);

    }

}