package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gp2 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Handler f40690a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f40690a.post(runnable);
    }
}
