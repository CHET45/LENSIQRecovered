package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public interface roe {

    /* JADX INFO: renamed from: Y0 */
    public static final int f78874Y0 = 50;

    /* JADX INFO: renamed from: Z0 */
    public static final int f78875Z0 = 200;

    void cancel(@efb String workSpecId);

    boolean hasLimitedSchedulingSlots();

    void schedule(@efb oqi... workSpecs);
}
