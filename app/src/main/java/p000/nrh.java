package p000;

import java.io.PrintStream;
import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public final class nrh {

    /* JADX INFO: renamed from: nrh$a */
    @gdi
    public static final class C10031a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: b */
        public static final Logger f65414b = Logger.getLogger(C10031a.class.getName());

        /* JADX INFO: renamed from: a */
        public final Runtime f65415a;

        public C10031a(Runtime runtime) {
            this.f65415a = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread t, Throwable e) {
            try {
                try {
                    f65414b.log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", t), e);
                } catch (Error | RuntimeException e2) {
                    PrintStream printStream = System.err;
                    printStream.println(e.getMessage());
                    printStream.println(e2.getMessage());
                }
            } finally {
                this.f65415a.exit(1);
            }
        }
    }

    private nrh() {
    }

    public static Thread.UncaughtExceptionHandler systemExit() {
        return new C10031a(Runtime.getRuntime());
    }
}
