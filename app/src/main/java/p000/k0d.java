package p000;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k0d {

    /* JADX INFO: renamed from: b */
    public static final k0d f52345b;

    /* JADX INFO: renamed from: a */
    @hib
    public final C8157a f52346a;

    /* JADX INFO: renamed from: k0d$a */
    @c5e(31)
    public static final class C8157a {

        /* JADX INFO: renamed from: b */
        public static final C8157a f52347b = new C8157a(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a */
        public final LogSessionId f52348a;

        public C8157a(LogSessionId logSessionId) {
            this.f52348a = logSessionId;
        }
    }

    static {
        f52345b = x0i.f95978a < 31 ? new k0d() : new k0d(C8157a.f52347b);
    }

    public k0d() {
        this((C8157a) null);
        u80.checkState(x0i.f95978a < 31);
    }

    @c5e(31)
    public LogSessionId getLogSessionId() {
        return ((C8157a) u80.checkNotNull(this.f52346a)).f52348a;
    }

    @c5e(31)
    public k0d(LogSessionId logSessionId) {
        this(new C8157a(logSessionId));
    }

    private k0d(@hib C8157a c8157a) {
        this.f52346a = c8157a;
    }
}
