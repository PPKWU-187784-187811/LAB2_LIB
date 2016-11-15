package interfaces;

/**
 * Created by Adam Piech on 2016-10-23.
 */
public interface ILibrary {

    void saveToFile(String file, String success, String failure, ICallback callback, IExitCallback exitCallback);
}
