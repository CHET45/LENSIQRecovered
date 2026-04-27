package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class bk3 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f13920a = "kotlinx.coroutines.debug";

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f13921b = "kotlinx.coroutines.stacktrace.recovery";

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f13922c = "auto";

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f13923d = "on";

    /* JADX INFO: renamed from: e */
    @yfb
    public static final String f13924e = "off";

    /* JADX INFO: renamed from: f */
    public static final boolean f13925f = false;

    /* JADX INFO: renamed from: g */
    public static final boolean f13926g;

    /* JADX INFO: renamed from: h */
    public static final boolean f13927h;

    /* JADX INFO: renamed from: i */
    @yfb
    public static final AtomicLong f13928i;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r0.equals(p000.bk3.f13923d) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r0 = true;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = p000.zjg.systemProp(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2f
            int r3 = r0.hashCode()
            if (r3 == 0) goto L3a
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L31
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L27
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L44
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L2f
        L27:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L2f:
            r0 = r2
            goto L64
        L31:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L42
        L3a:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L42:
            r0 = r1
            goto L64
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L64:
            p000.bk3.f13926g = r0
            if (r0 == 0) goto L71
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = p000.zjg.systemProp(r0, r1)
            if (r0 == 0) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            p000.bk3.f13927h = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            p000.bk3.f13928i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bk3.<clinit>():void");
    }

    @t28
    /* JADX INFO: renamed from: assert, reason: not valid java name */
    private static final void m28006assert(ny6<Boolean> ny6Var) {
    }

    public static final boolean getASSERTIONS_ENABLED() {
        return f13925f;
    }

    @yfb
    public static final AtomicLong getCOROUTINE_ID() {
        return f13928i;
    }

    public static final boolean getDEBUG() {
        return f13926g;
    }

    public static final boolean getRECOVER_STACK_TRACES() {
        return f13927h;
    }

    @yjd
    public static /* synthetic */ void getRECOVER_STACK_TRACES$annotations() {
    }

    public static final void resetCoroutineId() {
        f13928i.set(0L);
    }
}
