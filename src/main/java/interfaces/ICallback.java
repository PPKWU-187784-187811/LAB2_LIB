package interfaces;

import java.util.Optional;

/**
 * Created by Adam Piech on 2016-10-23.
 */
public interface ICallback {

    Optional<String> getResult(Boolean result);
}
