package implementations;

import interfaces.ICallback;

import java.util.Optional;
import java.util.Scanner;

/**
 * Created by Adam Piech on 2016-10-23.
 */
public class Callback implements ICallback {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public Optional<String> getResult(Boolean result) {
        System.out.println("Czy chcesz storzyć nową sciezke (T/N)?");
        if (scanner.nextLine().equalsIgnoreCase("T")) {
            System.out.print("Podaj nowa sciezke:");
            return Optional.of(scanner.nextLine());
        }
        return Optional.empty();
    }

}
