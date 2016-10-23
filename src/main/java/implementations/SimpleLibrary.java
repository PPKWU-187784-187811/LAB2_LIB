package implementations;

import interfaces.ICallback;
import interfaces.ILibrary;

import java.io.IOException;
import java.io.PrintWriter;

import static utils.Const.*;

/**
 * Created by Adam Piech on 2016-10-23.
 */
public class SimpleLibrary implements ILibrary {

    @Override
    public void saveToFile(String file, String successMessage, String failtureMessage, ICallback callback) {
        System.out.println(LOG + SIMPLE_LOG_MESSAGE);
        boolean result = false;

        do {
            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.write(TEXT_TO_SAVE);
                System.out.println(SUCCESS);
                result = true;
            } catch (IOException exception) {
                System.out.println(FAILURE);
            }
        } while (!callback.getResult(result).equals(successMessage));
    }

}
