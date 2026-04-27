package p000;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p000.InterfaceC5415eo;
import p000.t1h;
import p000.tyc;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ay3 implements tyc {

    /* JADX INFO: renamed from: i */
    public static final lfg<String> f12186i = new lfg() { // from class: xx3
        @Override // p000.lfg
        public final Object get() {
            return ay3.generateDefaultSessionId();
        }
    };

    /* JADX INFO: renamed from: j */
    public static final Random f12187j = new Random();

    /* JADX INFO: renamed from: k */
    public static final int f12188k = 12;

    /* JADX INFO: renamed from: a */
    public final t1h.C12851d f12189a;

    /* JADX INFO: renamed from: b */
    public final t1h.C12849b f12190b;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, C1661a> f12191c;

    /* JADX INFO: renamed from: d */
    public final lfg<String> f12192d;

    /* JADX INFO: renamed from: e */
    public tyc.InterfaceC13289a f12193e;

    /* JADX INFO: renamed from: f */
    public t1h f12194f;

    /* JADX INFO: renamed from: g */
    @hib
    public String f12195g;

    /* JADX INFO: renamed from: h */
    public long f12196h;

    /* JADX INFO: renamed from: ay3$a */
    public final class C1661a {

        /* JADX INFO: renamed from: a */
        public final String f12197a;

        /* JADX INFO: renamed from: b */
        public int f12198b;

        /* JADX INFO: renamed from: c */
        public long f12199c;

        /* JADX INFO: renamed from: d */
        public vna.C14175b f12200d;

        /* JADX INFO: renamed from: e */
        public boolean f12201e;

        /* JADX INFO: renamed from: f */
        public boolean f12202f;

        public C1661a(String str, int i, @hib vna.C14175b c14175b) {
            this.f12197a = str;
            this.f12198b = i;
            this.f12199c = c14175b == null ? -1L : c14175b.f71109d;
            if (c14175b == null || !c14175b.isAd()) {
                return;
            }
            this.f12200d = c14175b;
        }

        private int resolveWindowIndexToNewTimeline(t1h t1hVar, t1h t1hVar2, int i) {
            if (i >= t1hVar.getWindowCount()) {
                if (i < t1hVar2.getWindowCount()) {
                    return i;
                }
                return -1;
            }
            t1hVar.getWindow(i, ay3.this.f12189a);
            for (int i2 = ay3.this.f12189a.f83431X; i2 <= ay3.this.f12189a.f83432Y; i2++) {
                int indexOfPeriod = t1hVar2.getIndexOfPeriod(t1hVar.getUidOfPeriod(i2));
                if (indexOfPeriod != -1) {
                    return t1hVar2.getPeriod(indexOfPeriod, ay3.this.f12190b).f83398c;
                }
            }
            return -1;
        }

        public boolean belongsToSession(int i, @hib vna.C14175b c14175b) {
            if (c14175b == null) {
                return i == this.f12198b;
            }
            vna.C14175b c14175b2 = this.f12200d;
            return c14175b2 == null ? !c14175b.isAd() && c14175b.f71109d == this.f12199c : c14175b.f71109d == c14175b2.f71109d && c14175b.f71107b == c14175b2.f71107b && c14175b.f71108c == c14175b2.f71108c;
        }

        public boolean isFinishedAtEventTime(InterfaceC5415eo.b bVar) {
            vna.C14175b c14175b = bVar.f33695d;
            if (c14175b == null) {
                return this.f12198b != bVar.f33694c;
            }
            long j = this.f12199c;
            if (j == -1) {
                return false;
            }
            if (c14175b.f71109d > j) {
                return true;
            }
            if (this.f12200d == null) {
                return false;
            }
            int indexOfPeriod = bVar.f33693b.getIndexOfPeriod(c14175b.f71106a);
            int indexOfPeriod2 = bVar.f33693b.getIndexOfPeriod(this.f12200d.f71106a);
            vna.C14175b c14175b2 = bVar.f33695d;
            if (c14175b2.f71109d < this.f12200d.f71109d || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!c14175b2.isAd()) {
                int i = bVar.f33695d.f71110e;
                return i == -1 || i > this.f12200d.f71107b;
            }
            vna.C14175b c14175b3 = bVar.f33695d;
            int i2 = c14175b3.f71107b;
            int i3 = c14175b3.f71108c;
            vna.C14175b c14175b4 = this.f12200d;
            int i4 = c14175b4.f71107b;
            if (i2 <= i4) {
                return i2 == i4 && i3 > c14175b4.f71108c;
            }
            return true;
        }

        public void maybeSetWindowSequenceNumber(int i, @hib vna.C14175b c14175b) {
            if (this.f12199c != -1 || i != this.f12198b || c14175b == null || c14175b.f71109d < ay3.this.getMinWindowSequenceNumber()) {
                return;
            }
            this.f12199c = c14175b.f71109d;
        }

        public boolean tryResolvingToNewTimeline(t1h t1hVar, t1h t1hVar2) {
            int iResolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(t1hVar, t1hVar2, this.f12198b);
            this.f12198b = iResolveWindowIndexToNewTimeline;
            if (iResolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            vna.C14175b c14175b = this.f12200d;
            return c14175b == null || t1hVar2.getIndexOfPeriod(c14175b.f71106a) != -1;
        }
    }

    public ay3() {
        this(f12186i);
    }

    private void clearCurrentSession(C1661a c1661a) {
        if (c1661a.f12199c != -1) {
            this.f12196h = c1661a.f12199c;
        }
        this.f12195g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        f12187j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMinWindowSequenceNumber() {
        C1661a c1661a = this.f12191c.get(this.f12195g);
        return (c1661a == null || c1661a.f12199c == -1) ? this.f12196h + 1 : c1661a.f12199c;
    }

    private C1661a getOrAddSession(int i, @hib vna.C14175b c14175b) {
        C1661a c1661a = null;
        long j = Long.MAX_VALUE;
        for (C1661a c1661a2 : this.f12191c.values()) {
            c1661a2.maybeSetWindowSequenceNumber(i, c14175b);
            if (c1661a2.belongsToSession(i, c14175b)) {
                long j2 = c1661a2.f12199c;
                if (j2 == -1 || j2 < j) {
                    c1661a = c1661a2;
                    j = j2;
                } else if (j2 == j && ((C1661a) x0i.castNonNull(c1661a)).f12200d != null && c1661a2.f12200d != null) {
                    c1661a = c1661a2;
                }
            }
        }
        if (c1661a != null) {
            return c1661a;
        }
        String str = this.f12192d.get();
        C1661a c1661a3 = new C1661a(str, i, c14175b);
        this.f12191c.put(str, c1661a3);
        return c1661a3;
    }

    @g5e({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private void updateCurrentSession(InterfaceC5415eo.b bVar) {
        if (bVar.f33693b.isEmpty()) {
            String str = this.f12195g;
            if (str != null) {
                clearCurrentSession((C1661a) u80.checkNotNull(this.f12191c.get(str)));
                return;
            }
            return;
        }
        C1661a c1661a = this.f12191c.get(this.f12195g);
        C1661a orAddSession = getOrAddSession(bVar.f33694c, bVar.f33695d);
        this.f12195g = orAddSession.f12197a;
        updateSessions(bVar);
        vna.C14175b c14175b = bVar.f33695d;
        if (c14175b == null || !c14175b.isAd()) {
            return;
        }
        if (c1661a != null && c1661a.f12199c == bVar.f33695d.f71109d && c1661a.f12200d != null && c1661a.f12200d.f71107b == bVar.f33695d.f71107b && c1661a.f12200d.f71108c == bVar.f33695d.f71108c) {
            return;
        }
        vna.C14175b c14175b2 = bVar.f33695d;
        this.f12193e.onAdPlaybackStarted(bVar, getOrAddSession(bVar.f33694c, new vna.C14175b(c14175b2.f71106a, c14175b2.f71109d)).f12197a, orAddSession.f12197a);
    }

    @Override // p000.tyc
    public synchronized boolean belongsToSession(InterfaceC5415eo.b bVar, String str) {
        C1661a c1661a = this.f12191c.get(str);
        if (c1661a == null) {
            return false;
        }
        c1661a.maybeSetWindowSequenceNumber(bVar.f33694c, bVar.f33695d);
        return c1661a.belongsToSession(bVar.f33694c, bVar.f33695d);
    }

    @Override // p000.tyc
    public synchronized void finishAllSessions(InterfaceC5415eo.b bVar) {
        tyc.InterfaceC13289a interfaceC13289a;
        try {
            String str = this.f12195g;
            if (str != null) {
                clearCurrentSession((C1661a) u80.checkNotNull(this.f12191c.get(str)));
            }
            Iterator<C1661a> it = this.f12191c.values().iterator();
            while (it.hasNext()) {
                C1661a next = it.next();
                it.remove();
                if (next.f12201e && (interfaceC13289a = this.f12193e) != null) {
                    interfaceC13289a.onSessionFinished(bVar, next.f12197a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.tyc
    @hib
    public synchronized String getActiveSessionId() {
        return this.f12195g;
    }

    @Override // p000.tyc
    public synchronized String getSessionForMediaPeriodId(t1h t1hVar, vna.C14175b c14175b) {
        return getOrAddSession(t1hVar.getPeriodByUid(c14175b.f71106a, this.f12190b).f83398c, c14175b).f12197a;
    }

    @Override // p000.tyc
    public void setListener(tyc.InterfaceC13289a interfaceC13289a) {
        this.f12193e = interfaceC13289a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[Catch: all -> 0x0044, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:10:0x0018, B:15:0x0024, B:17:0x0030, B:19:0x003a, B:25:0x0047, B:27:0x0053, B:28:0x0059, B:30:0x005e, B:32:0x0064, B:34:0x007d, B:36:0x00d8, B:38:0x00de, B:40:0x00f4, B:42:0x0100, B:44:0x0106), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    @Override // p000.tyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void updateSessions(p000.InterfaceC5415eo.b r25) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ay3.updateSessions(eo$b):void");
    }

    @Override // p000.tyc
    public synchronized void updateSessionsWithDiscontinuity(InterfaceC5415eo.b bVar, int i) {
        try {
            u80.checkNotNull(this.f12193e);
            boolean z = i == 0;
            Iterator<C1661a> it = this.f12191c.values().iterator();
            while (it.hasNext()) {
                C1661a next = it.next();
                if (next.isFinishedAtEventTime(bVar)) {
                    it.remove();
                    if (next.f12201e) {
                        boolean zEquals = next.f12197a.equals(this.f12195g);
                        boolean z2 = z && zEquals && next.f12202f;
                        if (zEquals) {
                            clearCurrentSession(next);
                        }
                        this.f12193e.onSessionFinished(bVar, next.f12197a, z2);
                    }
                }
            }
            updateCurrentSession(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.tyc
    public synchronized void updateSessionsWithTimelineChange(InterfaceC5415eo.b bVar) {
        try {
            u80.checkNotNull(this.f12193e);
            t1h t1hVar = this.f12194f;
            this.f12194f = bVar.f33693b;
            Iterator<C1661a> it = this.f12191c.values().iterator();
            while (it.hasNext()) {
                C1661a next = it.next();
                if (!next.tryResolvingToNewTimeline(t1hVar, this.f12194f) || next.isFinishedAtEventTime(bVar)) {
                    it.remove();
                    if (next.f12201e) {
                        if (next.f12197a.equals(this.f12195g)) {
                            clearCurrentSession(next);
                        }
                        this.f12193e.onSessionFinished(bVar, next.f12197a, false);
                    }
                }
            }
            updateCurrentSession(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public ay3(lfg<String> lfgVar) {
        this.f12192d = lfgVar;
        this.f12189a = new t1h.C12851d();
        this.f12190b = new t1h.C12849b();
        this.f12191c = new HashMap<>();
        this.f12194f = t1h.f83385a;
        this.f12196h = -1L;
    }
}
