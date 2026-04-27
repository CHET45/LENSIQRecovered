package p000;

import p000.da8;

/* JADX INFO: loaded from: classes7.dex */
public final class rhh {

    /* JADX INFO: renamed from: m */
    public static final C12098b f78333m = new C12098b(q0h.f72713a);

    /* JADX INFO: renamed from: a */
    public final q0h f78334a;

    /* JADX INFO: renamed from: b */
    public long f78335b;

    /* JADX INFO: renamed from: c */
    public long f78336c;

    /* JADX INFO: renamed from: d */
    public long f78337d;

    /* JADX INFO: renamed from: e */
    public long f78338e;

    /* JADX INFO: renamed from: f */
    public long f78339f;

    /* JADX INFO: renamed from: g */
    public long f78340g;

    /* JADX INFO: renamed from: h */
    public InterfaceC12099c f78341h;

    /* JADX INFO: renamed from: i */
    public long f78342i;

    /* JADX INFO: renamed from: j */
    public long f78343j;

    /* JADX INFO: renamed from: k */
    public final zk9 f78344k;

    /* JADX INFO: renamed from: l */
    public volatile long f78345l;

    /* JADX INFO: renamed from: rhh$b */
    public static final class C12098b {

        /* JADX INFO: renamed from: a */
        public final q0h f78346a;

        @gdi
        public C12098b(q0h q0hVar) {
            this.f78346a = q0hVar;
        }

        public rhh create() {
            return new rhh(this.f78346a);
        }
    }

    /* JADX INFO: renamed from: rhh$c */
    public interface InterfaceC12099c {
        C12100d read();
    }

    /* JADX INFO: renamed from: rhh$d */
    public static final class C12100d {

        /* JADX INFO: renamed from: a */
        public final long f78347a;

        /* JADX INFO: renamed from: b */
        public final long f78348b;

        public C12100d(long j, long j2) {
            this.f78348b = j;
            this.f78347a = j2;
        }
    }

    public static C12098b getDefaultFactory() {
        return f78333m;
    }

    public da8.C4698o getStats() {
        InterfaceC12099c interfaceC12099c = this.f78341h;
        long j = interfaceC12099c == null ? -1L : interfaceC12099c.read().f78348b;
        InterfaceC12099c interfaceC12099c2 = this.f78341h;
        return new da8.C4698o(this.f78335b, this.f78336c, this.f78337d, this.f78338e, this.f78339f, this.f78342i, this.f78344k.value(), this.f78340g, this.f78343j, this.f78345l, j, interfaceC12099c2 != null ? interfaceC12099c2.read().f78347a : -1L);
    }

    public void reportKeepAliveSent() {
        this.f78340g++;
    }

    public void reportLocalStreamStarted() {
        this.f78335b++;
        this.f78336c = this.f78334a.currentTimeNanos();
    }

    public void reportMessageReceived() {
        this.f78344k.add(1L);
        this.f78345l = this.f78334a.currentTimeNanos();
    }

    public void reportMessageSent(int i) {
        if (i == 0) {
            return;
        }
        this.f78342i += (long) i;
        this.f78343j = this.f78334a.currentTimeNanos();
    }

    public void reportRemoteStreamStarted() {
        this.f78335b++;
        this.f78337d = this.f78334a.currentTimeNanos();
    }

    public void reportStreamClosed(boolean z) {
        if (z) {
            this.f78338e++;
        } else {
            this.f78339f++;
        }
    }

    public void setFlowControlWindowReader(InterfaceC12099c interfaceC12099c) {
        this.f78341h = (InterfaceC12099c) v7d.checkNotNull(interfaceC12099c);
    }

    public rhh() {
        this.f78344k = al9.create();
        this.f78334a = q0h.f72713a;
    }

    private rhh(q0h q0hVar) {
        this.f78344k = al9.create();
        this.f78334a = q0hVar;
    }
}
