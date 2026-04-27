package p000;

import p000.v13;

/* JADX INFO: loaded from: classes7.dex */
public final class w13 {
    @xn8(name = "isSchedulerWorker")
    public static final boolean isSchedulerWorker(@yfb Thread thread) {
        return thread instanceof v13.C13813c;
    }

    @xn8(name = "mayNotBlock")
    public static final boolean mayNotBlock(@yfb Thread thread) {
        return (thread instanceof v13.C13813c) && ((v13.C13813c) thread).f89679c == v13.EnumC13814d.f89684a;
    }
}
