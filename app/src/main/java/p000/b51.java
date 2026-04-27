package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
public class b51 extends c51 {

    /* JADX INFO: renamed from: c */
    public static final int f12698c = -1;

    /* JADX INFO: renamed from: a */
    @efb
    public final String f12699a;

    /* JADX INFO: renamed from: b */
    public final int f12700b;

    @Deprecated
    public b51() {
        this("", -1);
    }

    public static b51 adapterDisabled(String str) {
        return new b51(new r41(), str, -1);
    }

    private static String createMessage(@hib String str, int i) {
        return "Disconnected from " + pj9.commonMacMessage(str) + " with status " + i + " (" + p27.getGattCallbackStatusDescription(i) + c0b.f15434d;
    }

    @Deprecated
    public b51(Throwable th, @efb String str) {
        this(th, str, -1);
    }

    @Deprecated
    public b51(@efb String str) {
        this(str, -1);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public b51(Throwable th, @efb String str, int i) {
        super(createMessage(str, i), th);
        this.f12699a = str;
        this.f12700b = i;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public b51(@efb String str, int i) {
        super(createMessage(str, i));
        this.f12699a = str;
        this.f12700b = i;
    }
}
