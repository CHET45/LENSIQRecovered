package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use the methods in Futures (like immediateFuture) or SettableFuture")
@qx4
public interface ja9<V> extends Future<V> {
    void addListener(Runnable listener, Executor executor);
}
