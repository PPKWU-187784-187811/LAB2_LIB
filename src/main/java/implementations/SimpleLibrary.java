package implementations;

import interfaces.ICallback;
import interfaces.ILibrary;

import static utils.Const.*;

/**
 * Created by Adam Piech on 2016-10-23.
 */
public class SimpleLibrary implements ILibrary {

    @Override
    public void saveToFile(String file, String success, String failture, ICallback callback) {
        System.out.println(LOG + SIMPLE_LOG_MESSAGE);

        
    }

}
