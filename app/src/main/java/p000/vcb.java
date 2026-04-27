package p000;

import java.util.concurrent.ThreadFactory;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class vcb extends voe {

    /* JADX INFO: renamed from: d */
    public static final String f90684d = "RxNewThreadScheduler";

    /* JADX INFO: renamed from: c */
    public final ThreadFactory f90687c;

    /* JADX INFO: renamed from: f */
    public static final String f90686f = "rx2.newthread-priority";

    /* JADX INFO: renamed from: e */
    public static final qfe f90685e = new qfe("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger(f90686f, 5).intValue())));

    public vcb() {
        this(f90685e);
    }

    @Override // p000.voe
    @bfb
    public voe.AbstractC14185c createWorker() {
        return new xcb(this.f90687c);
    }

    public vcb(ThreadFactory threadFactory) {
        this.f90687c = threadFactory;
    }
}
