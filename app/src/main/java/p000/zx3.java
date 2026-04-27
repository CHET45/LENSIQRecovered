package p000;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p000.InterfaceC2409co;
import p000.q1h;
import p000.syc;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class zx3 implements syc {

    /* JADX INFO: renamed from: i */
    public static final lfg<String> f106304i = new lfg() { // from class: yx3
        @Override // p000.lfg
        public final Object get() {
            return zx3.generateDefaultSessionId();
        }
    };

    /* JADX INFO: renamed from: j */
    public static final Random f106305j = new Random();

    /* JADX INFO: renamed from: k */
    public static final int f106306k = 12;

    /* JADX INFO: renamed from: a */
    public final q1h.C11272d f106307a;

    /* JADX INFO: renamed from: b */
    public final q1h.C11270b f106308b;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, C16298a> f106309c;

    /* JADX INFO: renamed from: d */
    public final lfg<String> f106310d;

    /* JADX INFO: renamed from: e */
    public syc.InterfaceC12829a f106311e;

    /* JADX INFO: renamed from: f */
    public q1h f106312f;

    /* JADX INFO: renamed from: g */
    @hib
    public String f106313g;

    /* JADX INFO: renamed from: h */
    public long f106314h;

    /* JADX INFO: renamed from: zx3$a */
    public final class C16298a {

        /* JADX INFO: renamed from: a */
        public final String f106315a;

        /* JADX INFO: renamed from: b */
        public int f106316b;

        /* JADX INFO: renamed from: c */
        public long f106317c;

        /* JADX INFO: renamed from: d */
        public una.C13612b f106318d;

        /* JADX INFO: renamed from: e */
        public boolean f106319e;

        /* JADX INFO: renamed from: f */
        public boolean f106320f;

        public C16298a(String str, int i, @hib una.C13612b c13612b) {
            this.f106315a = str;
            this.f106316b = i;
            this.f106317c = c13612b == null ? -1L : c13612b.f88606d;
            if (c13612b == null || !c13612b.isAd()) {
                return;
            }
            this.f106318d = c13612b;
        }

        private int resolveWindowIndexToNewTimeline(q1h q1hVar, q1h q1hVar2, int i) {
            if (i >= q1hVar.getWindowCount()) {
                if (i < q1hVar2.getWindowCount()) {
                    return i;
                }
                return -1;
            }
            q1hVar.getWindow(i, zx3.this.f106307a);
            for (int i2 = zx3.this.f106307a.f72984n; i2 <= zx3.this.f106307a.f72985o; i2++) {
                int indexOfPeriod = q1hVar2.getIndexOfPeriod(q1hVar.getUidOfPeriod(i2));
                if (indexOfPeriod != -1) {
                    return q1hVar2.getPeriod(indexOfPeriod, zx3.this.f106308b).f72946c;
                }
            }
            return -1;
        }

        public boolean belongsToSession(int i, @hib una.C13612b c13612b) {
            if (c13612b == null) {
                return i == this.f106316b;
            }
            una.C13612b c13612b2 = this.f106318d;
            return c13612b2 == null ? !c13612b.isAd() && c13612b.f88606d == this.f106317c : c13612b.f88606d == c13612b2.f88606d && c13612b.f88604b == c13612b2.f88604b && c13612b.f88605c == c13612b2.f88605c;
        }

        public boolean isFinishedAtEventTime(InterfaceC2409co.b bVar) {
            una.C13612b c13612b = bVar.f17205d;
            if (c13612b == null) {
                return this.f106316b != bVar.f17204c;
            }
            long j = this.f106317c;
            if (j == -1) {
                return false;
            }
            if (c13612b.f88606d > j) {
                return true;
            }
            if (this.f106318d == null) {
                return false;
            }
            int indexOfPeriod = bVar.f17203b.getIndexOfPeriod(c13612b.f88603a);
            int indexOfPeriod2 = bVar.f17203b.getIndexOfPeriod(this.f106318d.f88603a);
            una.C13612b c13612b2 = bVar.f17205d;
            if (c13612b2.f88606d < this.f106318d.f88606d || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!c13612b2.isAd()) {
                int i = bVar.f17205d.f88607e;
                return i == -1 || i > this.f106318d.f88604b;
            }
            una.C13612b c13612b3 = bVar.f17205d;
            int i2 = c13612b3.f88604b;
            int i3 = c13612b3.f88605c;
            una.C13612b c13612b4 = this.f106318d;
            int i4 = c13612b4.f88604b;
            if (i2 <= i4) {
                return i2 == i4 && i3 > c13612b4.f88605c;
            }
            return true;
        }

        public void maybeSetWindowSequenceNumber(int i, @hib una.C13612b c13612b) {
            if (this.f106317c != -1 || i != this.f106316b || c13612b == null || c13612b.f88606d < zx3.this.getMinWindowSequenceNumber()) {
                return;
            }
            this.f106317c = c13612b.f88606d;
        }

        public boolean tryResolvingToNewTimeline(q1h q1hVar, q1h q1hVar2) {
            int iResolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(q1hVar, q1hVar2, this.f106316b);
            this.f106316b = iResolveWindowIndexToNewTimeline;
            if (iResolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            una.C13612b c13612b = this.f106318d;
            return c13612b == null || q1hVar2.getIndexOfPeriod(c13612b.f88603a) != -1;
        }
    }

    public zx3() {
        this(f106304i);
    }

    private void clearCurrentSession(C16298a c16298a) {
        if (c16298a.f106317c != -1) {
            this.f106314h = c16298a.f106317c;
        }
        this.f106313g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        f106305j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMinWindowSequenceNumber() {
        C16298a c16298a = this.f106309c.get(this.f106313g);
        return (c16298a == null || c16298a.f106317c == -1) ? this.f106314h + 1 : c16298a.f106317c;
    }

    private C16298a getOrAddSession(int i, @hib una.C13612b c13612b) {
        C16298a c16298a = null;
        long j = Long.MAX_VALUE;
        for (C16298a c16298a2 : this.f106309c.values()) {
            c16298a2.maybeSetWindowSequenceNumber(i, c13612b);
            if (c16298a2.belongsToSession(i, c13612b)) {
                long j2 = c16298a2.f106317c;
                if (j2 == -1 || j2 < j) {
                    c16298a = c16298a2;
                    j = j2;
                } else if (j2 == j && ((C16298a) t0i.castNonNull(c16298a)).f106318d != null && c16298a2.f106318d != null) {
                    c16298a = c16298a2;
                }
            }
        }
        if (c16298a != null) {
            return c16298a;
        }
        String str = this.f106310d.get();
        C16298a c16298a3 = new C16298a(str, i, c13612b);
        this.f106309c.put(str, c16298a3);
        return c16298a3;
    }

    @g5e({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private void updateCurrentSession(InterfaceC2409co.b bVar) {
        if (bVar.f17203b.isEmpty()) {
            String str = this.f106313g;
            if (str != null) {
                clearCurrentSession((C16298a) v80.checkNotNull(this.f106309c.get(str)));
                return;
            }
            return;
        }
        C16298a c16298a = this.f106309c.get(this.f106313g);
        C16298a orAddSession = getOrAddSession(bVar.f17204c, bVar.f17205d);
        this.f106313g = orAddSession.f106315a;
        updateSessions(bVar);
        una.C13612b c13612b = bVar.f17205d;
        if (c13612b == null || !c13612b.isAd()) {
            return;
        }
        if (c16298a != null && c16298a.f106317c == bVar.f17205d.f88606d && c16298a.f106318d != null && c16298a.f106318d.f88604b == bVar.f17205d.f88604b && c16298a.f106318d.f88605c == bVar.f17205d.f88605c) {
            return;
        }
        una.C13612b c13612b2 = bVar.f17205d;
        this.f106311e.onAdPlaybackStarted(bVar, getOrAddSession(bVar.f17204c, new una.C13612b(c13612b2.f88603a, c13612b2.f88606d)).f106315a, orAddSession.f106315a);
    }

    @Override // p000.syc
    public synchronized boolean belongsToSession(InterfaceC2409co.b bVar, String str) {
        C16298a c16298a = this.f106309c.get(str);
        if (c16298a == null) {
            return false;
        }
        c16298a.maybeSetWindowSequenceNumber(bVar.f17204c, bVar.f17205d);
        return c16298a.belongsToSession(bVar.f17204c, bVar.f17205d);
    }

    @Override // p000.syc
    public synchronized void finishAllSessions(InterfaceC2409co.b bVar) {
        syc.InterfaceC12829a interfaceC12829a;
        try {
            String str = this.f106313g;
            if (str != null) {
                clearCurrentSession((C16298a) v80.checkNotNull(this.f106309c.get(str)));
            }
            Iterator<C16298a> it = this.f106309c.values().iterator();
            while (it.hasNext()) {
                C16298a next = it.next();
                it.remove();
                if (next.f106319e && (interfaceC12829a = this.f106311e) != null) {
                    interfaceC12829a.onSessionFinished(bVar, next.f106315a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.syc
    @hib
    public synchronized String getActiveSessionId() {
        return this.f106313g;
    }

    @Override // p000.syc
    public synchronized String getSessionForMediaPeriodId(q1h q1hVar, una.C13612b c13612b) {
        return getOrAddSession(q1hVar.getPeriodByUid(c13612b.f88603a, this.f106308b).f72946c, c13612b).f106315a;
    }

    @Override // p000.syc
    public void setListener(syc.InterfaceC12829a interfaceC12829a) {
        this.f106311e = interfaceC12829a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[Catch: all -> 0x0044, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:10:0x0018, B:15:0x0024, B:17:0x0030, B:19:0x003a, B:25:0x0047, B:27:0x0053, B:28:0x0059, B:30:0x005e, B:32:0x0064, B:34:0x007d, B:36:0x00d8, B:38:0x00de, B:40:0x00f4, B:42:0x0100, B:44:0x0106), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    @Override // p000.syc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void updateSessions(p000.InterfaceC2409co.b r25) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zx3.updateSessions(co$b):void");
    }

    @Override // p000.syc
    public synchronized void updateSessionsWithDiscontinuity(InterfaceC2409co.b bVar, int i) {
        try {
            v80.checkNotNull(this.f106311e);
            boolean z = i == 0;
            Iterator<C16298a> it = this.f106309c.values().iterator();
            while (it.hasNext()) {
                C16298a next = it.next();
                if (next.isFinishedAtEventTime(bVar)) {
                    it.remove();
                    if (next.f106319e) {
                        boolean zEquals = next.f106315a.equals(this.f106313g);
                        boolean z2 = z && zEquals && next.f106320f;
                        if (zEquals) {
                            clearCurrentSession(next);
                        }
                        this.f106311e.onSessionFinished(bVar, next.f106315a, z2);
                    }
                }
            }
            updateCurrentSession(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.syc
    public synchronized void updateSessionsWithTimelineChange(InterfaceC2409co.b bVar) {
        try {
            v80.checkNotNull(this.f106311e);
            q1h q1hVar = this.f106312f;
            this.f106312f = bVar.f17203b;
            Iterator<C16298a> it = this.f106309c.values().iterator();
            while (it.hasNext()) {
                C16298a next = it.next();
                if (!next.tryResolvingToNewTimeline(q1hVar, this.f106312f) || next.isFinishedAtEventTime(bVar)) {
                    it.remove();
                    if (next.f106319e) {
                        if (next.f106315a.equals(this.f106313g)) {
                            clearCurrentSession(next);
                        }
                        this.f106311e.onSessionFinished(bVar, next.f106315a, false);
                    }
                }
            }
            updateCurrentSession(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public zx3(lfg<String> lfgVar) {
        this.f106310d = lfgVar;
        this.f106307a = new q1h.C11272d();
        this.f106308b = new q1h.C11270b();
        this.f106309c = new HashMap<>();
        this.f106312f = q1h.f72935a;
        this.f106314h = -1L;
    }
}
