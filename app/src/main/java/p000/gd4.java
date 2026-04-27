package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class gd4 implements Executor {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final gd4 f39384a = new gd4();

    private gd4() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(@yfb Runnable runnable) {
        runnable.run();
    }
}
