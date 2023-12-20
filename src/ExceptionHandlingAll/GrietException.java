package ExceptionHandlingAll;

import java.util.*;

public class GrietException extends InputMismatchException {
    public GrietException(String message) {
        super(message);
    }
}