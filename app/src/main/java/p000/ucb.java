package p000;

import java.util.concurrent.ThreadFactory;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class ucb extends woe {

    /* JADX INFO: renamed from: d */
    public static final String f87576d = "RxNewThreadScheduler";

    /* JADX INFO: renamed from: c */
    public final ThreadFactory f87579c;

    /* JADX INFO: renamed from: f */
    public static final String f87578f = "rx3.newthread-priority";

    /* JADX INFO: renamed from: e */
    public static final rfe f87577e = new rfe("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger(f87578f, 5).intValue())));

    public ucb() {
        this(f87577e);
    }

    @Override // p000.woe
    @cfb
    public woe.AbstractC14729c createWorker() {
        return new wcb(this.f87579c);
    }

    public ucb(ThreadFactory threadFactory) {
        this.f87579c = threadFactory;
    }
}
