package implementations;

import interfaces.ICallback;
import interfaces.IExitCallback;
import interfaces.ILibrary;

import java.io.IOException;
import java.io.PrintWriter;

import static utils.Const.*;

/**
 * Created by Adam Piech on 2016-10-23.
 */
public class SimpleLibrary implements ILibrary {

    @Override
    public void saveToFile(String file, String successMessage, String failureMessage, ICallback callback, IExitCallback exitCallback) {
        System.out.println(LOG + SIMPLE_LOG_MESSAGE);
        callback
                .getResult(saveExecute(file))
                .ifPresent(newFile -> saveToFile(newFile, successMessage, failureMessage, callback, exitCallback));
    }

    private boolean saveExecute(String file) {
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.write(TEXT_TO_SAVE);
            System.out.println(SUCCESS);
            return true;
        } catch (IOException exception) {
            System.out.println(FAILURE);
        }
        return false;
    }

}
