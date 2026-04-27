package p000;

import java.util.concurrent.Executor;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class jig implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(@efb Runnable command) {
        command.run();
    }
}
