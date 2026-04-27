package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import p000.kx7;
import p000.nfa;
import p000.q1h;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ep2 extends um2<Integer> {

    /* JADX INFO: renamed from: Y */
    public static final int f33767Y = 1;

    /* JADX INFO: renamed from: L */
    public final kx7<C5427d> f33768L;

    /* JADX INFO: renamed from: M */
    public final IdentityHashMap<mja, C5427d> f33769M;

    /* JADX INFO: renamed from: N */
    @hib
    public Handler f33770N;

    /* JADX INFO: renamed from: Q */
    public boolean f33771Q;

    /* JADX INFO: renamed from: X */
    @xc7("this")
    public nfa f33772X;

    /* JADX INFO: renamed from: ep2$b */
    public static final class C5425b {

        /* JADX INFO: renamed from: a */
        public final kx7.C8541a<C5427d> f33773a = kx7.builder();

        /* JADX INFO: renamed from: b */
        public int f33774b;

        /* JADX INFO: renamed from: c */
        @hib
        public nfa f33775c;

        /* JADX INFO: renamed from: d */
        @hib
        public una.InterfaceC13611a f33776d;

        @op1
        public C5425b add(nfa nfaVar) {
            return add(nfaVar, -9223372036854775807L);
        }

        public ep2 build() {
            v80.checkArgument(this.f33774b > 0, "Must add at least one source to the concatenation.");
            if (this.f33775c == null) {
                this.f33775c = nfa.fromUri(Uri.EMPTY);
            }
            return new ep2(this.f33775c, this.f33773a.build());
        }

        @op1
        public C5425b setMediaItem(nfa nfaVar) {
            this.f33775c = nfaVar;
            return this;
        }

        @op1
        public C5425b setMediaSourceFactory(una.InterfaceC13611a interfaceC13611a) {
            this.f33776d = (una.InterfaceC13611a) v80.checkNotNull(interfaceC13611a);
            return this;
        }

        @op1
        public C5425b useDefaultMediaSourceFactory(Context context) {
            return setMediaSourceFactory(new xw3(context));
        }

        @op1
        public C5425b add(nfa nfaVar, long j) {
            v80.checkNotNull(nfaVar);
            if (j == -9223372036854775807L) {
                nfa.C9852d c9852d = nfaVar.f64309f;
                if (c9852d.f64342c != Long.MIN_VALUE) {
                    j = t0i.usToMs(c9852d.f64343d - c9852d.f64341b);
                }
            }
            v80.checkStateNotNull(this.f33776d, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return add(this.f33776d.createMediaSource(nfaVar), j);
        }

        @op1
        public C5425b add(una unaVar) {
            return add(unaVar, -9223372036854775807L);
        }

        @op1
        public C5425b add(una unaVar, long j) {
            v80.checkNotNull(unaVar);
            v80.checkState(((unaVar instanceof hfd) && j == -9223372036854775807L) ? false : true, "Progressive media source must define an initial placeholder duration.");
            kx7.C8541a<C5427d> c8541a = this.f33773a;
            int i = this.f33774b;
            this.f33774b = i + 1;
            c8541a.add(new C5427d(unaVar, i, t0i.msToUs(j)));
            return this;
        }
    }

    /* JADX INFO: renamed from: ep2$c */
    public static final class C5426c extends q1h {

        /* JADX INFO: renamed from: e */
        public final nfa f33777e;

        /* JADX INFO: renamed from: f */
        public final kx7<q1h> f33778f;

        /* JADX INFO: renamed from: g */
        public final kx7<Integer> f33779g;

        /* JADX INFO: renamed from: h */
        public final kx7<Long> f33780h;

        /* JADX INFO: renamed from: i */
        public final boolean f33781i;

        /* JADX INFO: renamed from: j */
        public final boolean f33782j;

        /* JADX INFO: renamed from: k */
        public final long f33783k;

        /* JADX INFO: renamed from: l */
        public final long f33784l;

        /* JADX INFO: renamed from: m */
        @hib
        public final Object f33785m;

        public C5426c(nfa nfaVar, kx7<q1h> kx7Var, kx7<Integer> kx7Var2, kx7<Long> kx7Var3, boolean z, boolean z2, long j, long j2, @hib Object obj) {
            this.f33777e = nfaVar;
            this.f33778f = kx7Var;
            this.f33779g = kx7Var2;
            this.f33780h = kx7Var3;
            this.f33781i = z;
            this.f33782j = z2;
            this.f33783k = j;
            this.f33784l = j2;
            this.f33785m = obj;
        }

        private int getChildIndexByPeriodIndex(int i) {
            return t0i.binarySearchFloor((List<? extends Comparable<? super Integer>>) this.f33779g, Integer.valueOf(i + 1), false, false);
        }

        private long getPeriodDurationUs(q1h.C11270b c11270b, int i) {
            if (c11270b.f72947d == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return (i == this.f33780h.size() + (-1) ? this.f33783k : this.f33780h.get(i + 1).longValue()) - this.f33780h.get(i).longValue();
        }

        @Override // p000.q1h
        public int getIndexOfPeriod(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int childIndex = ep2.getChildIndex(obj);
            int indexOfPeriod = this.f33778f.get(childIndex).getIndexOfPeriod(ep2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return this.f33779g.get(childIndex).intValue() + indexOfPeriod;
        }

        @Override // p000.q1h
        public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            this.f33778f.get(childIndexByPeriodIndex).getPeriod(i - this.f33779g.get(childIndexByPeriodIndex).intValue(), c11270b, z);
            c11270b.f72946c = 0;
            c11270b.f72948e = this.f33780h.get(i).longValue();
            c11270b.f72947d = getPeriodDurationUs(c11270b, i);
            if (z) {
                c11270b.f72945b = ep2.getPeriodUid(childIndexByPeriodIndex, v80.checkNotNull(c11270b.f72945b));
            }
            return c11270b;
        }

        @Override // p000.q1h
        public q1h.C11270b getPeriodByUid(Object obj, q1h.C11270b c11270b) {
            int childIndex = ep2.getChildIndex(obj);
            Object childPeriodUid = ep2.getChildPeriodUid(obj);
            q1h q1hVar = this.f33778f.get(childIndex);
            int iIntValue = this.f33779g.get(childIndex).intValue() + q1hVar.getIndexOfPeriod(childPeriodUid);
            q1hVar.getPeriodByUid(childPeriodUid, c11270b);
            c11270b.f72946c = 0;
            c11270b.f72948e = this.f33780h.get(iIntValue).longValue();
            c11270b.f72947d = getPeriodDurationUs(c11270b, iIntValue);
            c11270b.f72945b = obj;
            return c11270b;
        }

        @Override // p000.q1h
        public int getPeriodCount() {
            return this.f33780h.size();
        }

        @Override // p000.q1h
        public Object getUidOfPeriod(int i) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            return ep2.getPeriodUid(childIndexByPeriodIndex, this.f33778f.get(childIndexByPeriodIndex).getUidOfPeriod(i - this.f33779g.get(childIndexByPeriodIndex).intValue()));
        }

        @Override // p000.q1h
        public q1h.C11272d getWindow(int i, q1h.C11272d c11272d, long j) {
            return c11272d.set(q1h.C11272d.f72961q, this.f33777e, this.f33785m, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f33781i, this.f33782j, null, this.f33784l, this.f33783k, 0, getPeriodCount() - 1, -this.f33780h.get(0).longValue());
        }

        @Override // p000.q1h
        public int getWindowCount() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: ep2$d */
    public static final class C5427d {

        /* JADX INFO: renamed from: a */
        public final qv9 f33786a;

        /* JADX INFO: renamed from: b */
        public final int f33787b;

        /* JADX INFO: renamed from: c */
        public final long f33788c;

        /* JADX INFO: renamed from: d */
        public final HashMap<Object, Long> f33789d = new HashMap<>();

        /* JADX INFO: renamed from: e */
        public int f33790e;

        public C5427d(una unaVar, int i, long j) {
            this.f33786a = new qv9(unaVar, false);
            this.f33787b = i;
            this.f33788c = j;
        }
    }

    private void disableUnusedMediaSources() {
        for (int i = 0; i < this.f33768L.size(); i++) {
            C5427d c5427d = this.f33768L.get(i);
            if (c5427d.f33790e == 0) {
                m23427p(Integer.valueOf(c5427d.f33787b));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getChildIndex(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j, int i) {
        return (int) (j % ((long) i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getChildPeriodUid(Object obj) {
        return ((Pair) obj).second;
    }

    private static long getChildWindowSequenceNumber(long j, int i, int i2) {
        return (j * ((long) i)) + ((long) i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getPeriodUid(int i, Object obj) {
        return Pair.create(Integer.valueOf(i), obj);
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j, int i) {
        return j / ((long) i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            updateTimeline();
        }
        return true;
    }

    @hib
    private C5426c maybeCreateConcatenatedTimeline() {
        int i;
        boolean z;
        boolean z2;
        Object obj;
        Object obj2;
        q1h q1hVar;
        long j;
        q1h.C11270b c11270b;
        boolean z3;
        ep2 ep2Var = this;
        q1h.C11272d c11272d = new q1h.C11272d();
        q1h.C11270b c11270b2 = new q1h.C11270b();
        kx7.C8541a c8541aBuilder = kx7.builder();
        kx7.C8541a c8541aBuilder2 = kx7.builder();
        kx7.C8541a c8541aBuilder3 = kx7.builder();
        int size = ep2Var.f33768L.size();
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        int i2 = 0;
        Object obj3 = null;
        int periodCount = 0;
        boolean z7 = false;
        boolean z8 = false;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (i2 < size) {
            C5427d c5427d = ep2Var.f33768L.get(i2);
            q1h timeline = c5427d.f33786a.getTimeline();
            v80.checkArgument(timeline.isEmpty() ^ z4, "Can't concatenate empty child Timeline.");
            c8541aBuilder.add(timeline);
            c8541aBuilder2.add(Integer.valueOf(periodCount));
            periodCount += timeline.getPeriodCount();
            int i3 = 0;
            while (i3 < timeline.getWindowCount()) {
                timeline.getWindow(i3, c11272d);
                if (!z7) {
                    obj3 = c11272d.f72974d;
                    z7 = true;
                }
                if (z5 && Objects.equals(obj3, c11272d.f72974d)) {
                    i = i2;
                    z = true;
                } else {
                    i = i2;
                    z = false;
                }
                long j5 = c11272d.f72983m;
                if (j5 == -9223372036854775807L) {
                    j5 = c5427d.f33788c;
                    if (j5 == -9223372036854775807L) {
                        return null;
                    }
                }
                j2 += j5;
                if (c5427d.f33787b == 0 && i3 == 0) {
                    z2 = z;
                    obj = obj3;
                    j3 = c11272d.f72982l;
                    j4 = -c11272d.f72986p;
                } else {
                    z2 = z;
                    obj = obj3;
                }
                z6 &= c11272d.f72978h || c11272d.f72981k;
                z8 |= c11272d.f72979i;
                int i4 = c11272d.f72984n;
                while (i4 <= c11272d.f72985o) {
                    c8541aBuilder3.add(Long.valueOf(j4));
                    timeline.getPeriod(i4, c11270b2, true);
                    int i5 = periodCount;
                    long j6 = c11270b2.f72947d;
                    if (j6 == -9223372036854775807L) {
                        v80.checkArgument(c11272d.f72984n == c11272d.f72985o, "Can't apply placeholder duration to multiple periods with unknown duration in a single window.");
                        j6 = c11272d.f72986p + j5;
                    }
                    if (i4 != c11272d.f72984n || ((c5427d.f33787b == 0 && i3 == 0) || j6 == -9223372036854775807L)) {
                        obj2 = obj;
                        q1hVar = timeline;
                        j = 0;
                    } else {
                        q1h q1hVar2 = timeline;
                        obj2 = obj;
                        j = -c11272d.f72986p;
                        j6 += j;
                        q1hVar = q1hVar2;
                    }
                    Object objCheckNotNull = v80.checkNotNull(c11270b2.f72945b);
                    q1h.C11272d c11272d2 = c11272d;
                    if (c5427d.f33790e == 0 || !c5427d.f33789d.containsKey(objCheckNotNull)) {
                        c11270b = c11270b2;
                    } else {
                        c11270b = c11270b2;
                        if (!c5427d.f33789d.get(objCheckNotNull).equals(Long.valueOf(j))) {
                            z3 = false;
                        }
                        v80.checkArgument(z3, "Can't handle windows with changing offset in first period.");
                        c5427d.f33789d.put(objCheckNotNull, Long.valueOf(j));
                        j4 += j6;
                        i4++;
                        periodCount = i5;
                        obj = obj2;
                        timeline = q1hVar;
                        c11272d = c11272d2;
                        c11270b2 = c11270b;
                    }
                    z3 = true;
                    v80.checkArgument(z3, "Can't handle windows with changing offset in first period.");
                    c5427d.f33789d.put(objCheckNotNull, Long.valueOf(j));
                    j4 += j6;
                    i4++;
                    periodCount = i5;
                    obj = obj2;
                    timeline = q1hVar;
                    c11272d = c11272d2;
                    c11270b2 = c11270b;
                }
                i3++;
                i2 = i;
                z5 = z2;
                obj3 = obj;
            }
            i2++;
            z4 = true;
            ep2Var = this;
        }
        return new C5426c(getMediaItem(), c8541aBuilder.build(), c8541aBuilder2.build(), c8541aBuilder3.build(), z6, z8, j2, j3, z5 ? obj3 : null);
    }

    private void scheduleTimelineUpdate() {
        if (this.f33771Q) {
            return;
        }
        ((Handler) v80.checkNotNull(this.f33770N)).obtainMessage(1).sendToTarget();
        this.f33771Q = true;
    }

    private void updateTimeline() {
        this.f33771Q = false;
        C5426c c5426cMaybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (c5426cMaybeCreateConcatenatedTimeline != null) {
            m11123m(c5426cMaybeCreateConcatenatedTimeline);
        }
    }

    @Override // p000.um2
    @hib
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public una.C13612b mo2509r(Integer num, una.C13612b c13612b) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(c13612b.f88606d, this.f33768L.size())) {
            return null;
        }
        return c13612b.copyWithPeriodUid(getPeriodUid(num.intValue(), c13612b.f88603a)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(c13612b.f88606d, this.f33768L.size()));
    }

    @Override // p000.um2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public long mo10177s(Integer num, long j, @hib una.C13612b c13612b) {
        Long l;
        return (j == -9223372036854775807L || c13612b == null || c13612b.isAd() || (l = this.f33768L.get(num.intValue()).f33789d.get(c13612b.f88603a)) == null) ? j : j + t0i.usToMs(l.longValue());
    }

    @Override // p000.um2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int mo2510t(Integer num, int i) {
        return 0;
    }

    @Override // p000.um2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, una unaVar, q1h q1hVar) {
        scheduleTimelineUpdate();
    }

    @Override // p000.una
    public boolean canUpdateMediaItem(nfa nfaVar) {
        return true;
    }

    @Override // p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        C5427d c5427d = this.f33768L.get(getChildIndex(c13612b.f88603a));
        una.C13612b c13612bCopyWithWindowSequenceNumber = c13612b.copyWithPeriodUid(getChildPeriodUid(c13612b.f88603a)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(c13612b.f88606d, this.f33768L.size(), c5427d.f33787b));
        m23428q(Integer.valueOf(c5427d.f33787b));
        c5427d.f33790e++;
        long jLongValue = c13612b.isAd() ? 0L : ((Long) v80.checkNotNull(c5427d.f33789d.get(c13612bCopyWithWindowSequenceNumber.f88603a))).longValue();
        l0h l0hVar = new l0h(c5427d.f33786a.createPeriod(c13612bCopyWithWindowSequenceNumber, interfaceC5892fn, j - jLongValue), jLongValue);
        this.f33769M.put(l0hVar, c5427d);
        disableUnusedMediaSources();
        return l0hVar;
    }

    @Override // p000.una
    @hib
    public q1h getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // p000.una
    public synchronized nfa getMediaItem() {
        return this.f33772X;
    }

    @Override // p000.um2, p000.fs0
    /* JADX INFO: renamed from: h */
    public void mo2507h() {
    }

    @Override // p000.um2, p000.fs0
    /* JADX INFO: renamed from: l */
    public void mo2508l(@hib qdh qdhVar) {
        super.mo2508l(qdhVar);
        this.f33770N = new Handler(new Handler.Callback() { // from class: dp2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f30311a.handleMessage(message);
            }
        });
        for (int i = 0; i < this.f33768L.size(); i++) {
            m23429v(Integer.valueOf(i), this.f33768L.get(i).f33786a);
        }
        scheduleTimelineUpdate();
    }

    @Override // p000.una
    public void releasePeriod(mja mjaVar) {
        ((C5427d) v80.checkNotNull(this.f33769M.remove(mjaVar))).f33786a.releasePeriod(((l0h) mjaVar).getWrappedMediaPeriod());
        r0.f33790e--;
        if (this.f33769M.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    @Override // p000.um2, p000.fs0
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.f33770N;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f33770N = null;
        }
        this.f33771Q = false;
    }

    @Override // p000.una
    public synchronized void updateMediaItem(nfa nfaVar) {
        this.f33772X = nfaVar;
    }

    private ep2(nfa nfaVar, kx7<C5427d> kx7Var) {
        this.f33772X = nfaVar;
        this.f33768L = kx7Var;
        this.f33769M = new IdentityHashMap<>();
    }
}
