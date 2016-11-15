package implementations;

import interfaces.ICallback;
import interfaces.IExitCallback;

import java.util.Optional;
import java.util.Scanner;

import static utils.Const.POSITIVE;
import static utils.Const.QUESTION;
import static utils.Const.REPLY;

/**
 * Created by Adam Piech on 2016-10-23.
 */
public class Callback implements ICallback {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public Optional<String> getResult(Boolean result, IExitCallback exitCallback) {
        if (exitCallback.getResult(QUESTION)) {
            System.out.print(REPLY);
            return Optional.of(scanner.nextLine());
        }
        return Optional.empty();
    }

}
