package com.wavesplatform.lang;

public class RideException extends RuntimeException {
    RideException(String cause) {
        super(cause);
    }

    RideException(Throwable cause) {
        super(cause);
    }
}
