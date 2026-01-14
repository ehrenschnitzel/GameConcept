import java.util.Scanner;
import exceptions.EnemyNotFoundException;
import exceptions.SavegameException;
import exceptions.InventoryFullException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while(running) {
            printMenu();
            int choice = scanner.nextInt();

            try {
                running = handleUserChoice(choice);
            } catch (InventoryFullException e) {
                System.out.println(e.getMessage());
            } catch (EnemyNotFoundException e) {
                System.out.println("Gegner nicht gefunden.");
            } catch (SavegameException e) {
                System.out.println("Speichern/Laden fehlgeschlagen.");
            }
        }
    }

    private static boolean handleUserChoice (int choice) throws InventoryFullException, EnemyNotFoundException, SavegameException {

        switch (choice) {
            case 1:
                //TODO: Spieler erstellen
                return true;

            case 2:
                //TODO: Item hinzufügen (kann InventoryFullException werfen)
                return true;

            case 3:
                // TODO:  Gegner anzeigen (kann EnemyNotFoundException werfen)
                return true;

            case 4:
                //TODO: Spiel speichern (kann SavegameException werfen)
                return true;

            case 5:
                //TODO: Spiel laden (kann SavegameException werfen)

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

}