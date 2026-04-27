package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@qx4
public enum fd4 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
