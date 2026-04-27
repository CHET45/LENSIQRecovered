package p000;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class gm6 {

    /* JADX INFO: renamed from: a */
    public static final Logger f40186a = Logger.getLogger(gm6.class.getName());

    private gm6() {
    }

    public static void flush(Flushable flushable, boolean swallowIOException) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e) {
            if (!swallowIOException) {
                throw e;
            }
            f40186a.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e);
        }
    }

    @w01
    public static void flushQuietly(Flushable flushable) {
        try {
            flush(flushable, true);
        } catch (IOException e) {
            f40186a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e);
        }
    }
}
