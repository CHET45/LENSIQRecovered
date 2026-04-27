package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public interface xkc extends Executor {
    boolean isPaused();

    void pause();

    void resume();
}
