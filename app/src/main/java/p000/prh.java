package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class prh extends RuntimeException {
    public prh(IOException iOException) {
        super(iOException);
    }

    public IOException ioException() {
        return (IOException) getCause();
    }
}
