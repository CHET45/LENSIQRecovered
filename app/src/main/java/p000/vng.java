package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class vng {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public static final String f91814a = zjg.systemProp("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b */
    @un8
    public static final long f91815b = bkg.systemProp$default("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, (Object) null);

    /* JADX INFO: renamed from: c */
    @un8
    public static final int f91816c = bkg.systemProp$default("kotlinx.coroutines.scheduler.core.pool.size", kpd.coerceAtLeast(zjg.getAVAILABLE_PROCESSORS(), 2), 1, 0, 8, (Object) null);

    /* JADX INFO: renamed from: d */
    @un8
    public static final int f91817d = bkg.systemProp$default("kotlinx.coroutines.scheduler.max.pool.size", v13.f89663b2, 0, v13.f89663b2, 4, (Object) null);

    /* JADX INFO: renamed from: e */
    @un8
    public static final long f91818e = TimeUnit.SECONDS.toNanos(bkg.systemProp$default("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, (Object) null));

    /* JADX INFO: renamed from: f */
    @un8
    @yfb
    public static jpe f91819f = j9b.f50007a;

    /* JADX INFO: renamed from: g */
    public static final boolean f91820g = false;

    /* JADX INFO: renamed from: h */
    public static final boolean f91821h = true;

    @yfb
    public static final mng asTask(@yfb Runnable runnable, long j, boolean z) {
        return new qng(runnable, j, z);
    }

    public static final boolean isBlocking(@yfb mng mngVar) {
        return mngVar.f61584b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String taskContextString(boolean z) {
        return z ? "Blocking" : "Non-blocking";
    }
}
