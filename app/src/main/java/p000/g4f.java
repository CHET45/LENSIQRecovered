package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Create an AbstractIdleService")
@jd7
@yg8
@qx4
public interface g4f {

    /* JADX INFO: renamed from: g4f$a */
    public static abstract class AbstractC6129a {
        public void failed(EnumC6130b from, Throwable failure) {
        }

        public void running() {
        }

        public void starting() {
        }

        public void stopping(EnumC6130b from) {
        }

        public void terminated(EnumC6130b from) {
        }
    }

    /* JADX INFO: renamed from: g4f$b */
    public enum EnumC6130b {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }

    void addListener(AbstractC6129a listener, Executor executor);

    void awaitRunning();

    void awaitRunning(long timeout, TimeUnit unit) throws TimeoutException;

    void awaitTerminated();

    void awaitTerminated(long timeout, TimeUnit unit) throws TimeoutException;

    Throwable failureCause();

    boolean isRunning();

    @op1
    g4f startAsync();

    EnumC6130b state();

    @op1
    g4f stopAsync();
}
