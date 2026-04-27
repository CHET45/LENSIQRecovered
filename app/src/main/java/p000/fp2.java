package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import java.util.IdentityHashMap;
import java.util.List;
import p000.kx7;
import p000.t1h;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class fp2 extends vm2<Integer> {

    /* JADX INFO: renamed from: Y */
    public static final int f37327Y = 0;

    /* JADX INFO: renamed from: L */
    public final aga f37328L;

    /* JADX INFO: renamed from: M */
    public final kx7<C5919d> f37329M;

    /* JADX INFO: renamed from: N */
    public final IdentityHashMap<nja, C5919d> f37330N;

    /* JADX INFO: renamed from: Q */
    @hib
    public Handler f37331Q;

    /* JADX INFO: renamed from: X */
    public boolean f37332X;

    /* JADX INFO: renamed from: fp2$b */
    public static final class C5917b {

        /* JADX INFO: renamed from: a */
        public final kx7.C8541a<C5919d> f37333a = kx7.builder();

        /* JADX INFO: renamed from: b */
        public int f37334b;

        /* JADX INFO: renamed from: c */
        @hib
        public aga f37335c;

        /* JADX INFO: renamed from: d */
        @hib
        public vna.InterfaceC14174a f37336d;

        @op1
        public C5917b add(aga agaVar) {
            return add(agaVar, -9223372036854775807L);
        }

        public fp2 build() {
            u80.checkArgument(this.f37334b > 0, "Must add at least one source to the concatenation.");
            if (this.f37335c == null) {
                this.f37335c = aga.fromUri(Uri.EMPTY);
            }
            return new fp2(this.f37335c, this.f37333a.build());
        }

        @op1
        public C5917b setMediaItem(aga agaVar) {
            this.f37335c = agaVar;
            return this;
        }

        @op1
        public C5917b setMediaSourceFactory(vna.InterfaceC14174a interfaceC14174a) {
            this.f37336d = (vna.InterfaceC14174a) u80.checkNotNull(interfaceC14174a);
            return this;
        }

        @op1
        public C5917b useDefaultMediaSourceFactory(Context context) {
            return setMediaSourceFactory(new ix3(context));
        }

        @op1
        public C5917b add(aga agaVar, long j) {
            u80.checkNotNull(agaVar);
            u80.checkStateNotNull(this.f37336d, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return add(this.f37336d.createMediaSource(agaVar), j);
        }

        @op1
        public C5917b add(vna vnaVar) {
            return add(vnaVar, -9223372036854775807L);
        }

        @op1
        public C5917b add(vna vnaVar, long j) {
            u80.checkNotNull(vnaVar);
            u80.checkState(((vnaVar instanceof gfd) && j == -9223372036854775807L) ? false : true, "Progressive media source must define an initial placeholder duration.");
            kx7.C8541a<C5919d> c8541a = this.f37333a;
            int i = this.f37334b;
            this.f37334b = i + 1;
            c8541a.add(new C5919d(vnaVar, i, x0i.msToUs(j)));
            return this;
        }
    }

    /* JADX INFO: renamed from: fp2$c */
    public static final class C5918c extends t1h {

        /* JADX INFO: renamed from: C */
        public final kx7<Integer> f37337C;

        /* JADX INFO: renamed from: F */
        public final kx7<Long> f37338F;

        /* JADX INFO: renamed from: H */
        public final boolean f37339H;

        /* JADX INFO: renamed from: L */
        public final boolean f37340L;

        /* JADX INFO: renamed from: M */
        public final long f37341M;

        /* JADX INFO: renamed from: N */
        public final long f37342N;

        /* JADX INFO: renamed from: Q */
        @hib
        public final Object f37343Q;

        /* JADX INFO: renamed from: f */
        public final aga f37344f;

        /* JADX INFO: renamed from: m */
        public final kx7<t1h> f37345m;

        public C5918c(aga agaVar, kx7<t1h> kx7Var, kx7<Integer> kx7Var2, kx7<Long> kx7Var3, boolean z, boolean z2, long j, long j2, @hib Object obj) {
            this.f37344f = agaVar;
            this.f37345m = kx7Var;
            this.f37337C = kx7Var2;
            this.f37338F = kx7Var3;
            this.f37339H = z;
            this.f37340L = z2;
            this.f37341M = j;
            this.f37342N = j2;
            this.f37343Q = obj;
        }

        private int getChildIndexByPeriodIndex(int i) {
            return x0i.binarySearchFloor((List<? extends Comparable<? super Integer>>) this.f37337C, Integer.valueOf(i + 1), false, false);
        }

        @Override // p000.t1h
        public final int getIndexOfPeriod(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int childIndex = fp2.getChildIndex(obj);
            int indexOfPeriod = this.f37345m.get(childIndex).getIndexOfPeriod(fp2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return this.f37337C.get(childIndex).intValue() + indexOfPeriod;
        }

        @Override // p000.t1h
        public final t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            this.f37345m.get(childIndexByPeriodIndex).getPeriod(i - this.f37337C.get(childIndexByPeriodIndex).intValue(), c12849b, z);
            c12849b.f83398c = 0;
            c12849b.f83400e = this.f37338F.get(i).longValue();
            if (z) {
                c12849b.f83397b = fp2.getPeriodUid(childIndexByPeriodIndex, u80.checkNotNull(c12849b.f83397b));
            }
            return c12849b;
        }

        @Override // p000.t1h
        public final t1h.C12849b getPeriodByUid(Object obj, t1h.C12849b c12849b) {
            int childIndex = fp2.getChildIndex(obj);
            Object childPeriodUid = fp2.getChildPeriodUid(obj);
            t1h t1hVar = this.f37345m.get(childIndex);
            int iIntValue = this.f37337C.get(childIndex).intValue() + t1hVar.getIndexOfPeriod(childPeriodUid);
            t1hVar.getPeriodByUid(childPeriodUid, c12849b);
            c12849b.f83398c = 0;
            c12849b.f83400e = this.f37338F.get(iIntValue).longValue();
            c12849b.f83397b = obj;
            return c12849b;
        }

        @Override // p000.t1h
        public int getPeriodCount() {
            return this.f37338F.size();
        }

        @Override // p000.t1h
        public final Object getUidOfPeriod(int i) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            return fp2.getPeriodUid(childIndexByPeriodIndex, this.f37345m.get(childIndexByPeriodIndex).getUidOfPeriod(i - this.f37337C.get(childIndexByPeriodIndex).intValue()));
        }

        @Override // p000.t1h
        public final t1h.C12851d getWindow(int i, t1h.C12851d c12851d, long j) {
            return c12851d.set(t1h.C12851d.f83407M1, this.f37344f, this.f37343Q, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f37339H, this.f37340L, null, this.f37342N, this.f37341M, 0, getPeriodCount() - 1, -this.f37338F.get(0).longValue());
        }

        @Override // p000.t1h
        public int getWindowCount() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: fp2$d */
    public static final class C5919d {

        /* JADX INFO: renamed from: a */
        public final rv9 f37346a;

        /* JADX INFO: renamed from: b */
        public final int f37347b;

        /* JADX INFO: renamed from: c */
        public final long f37348c;

        /* JADX INFO: renamed from: d */
        public int f37349d;

        public C5919d(vna vnaVar, int i, long j) {
            this.f37346a = new rv9(vnaVar, false);
            this.f37347b = i;
            this.f37348c = j;
        }
    }

    private void disableUnusedMediaSources() {
        for (int i = 0; i < this.f37329M.size(); i++) {
            C5919d c5919d = this.f37329M.get(i);
            if (c5919d.f37349d == 0) {
                m24065n(Integer.valueOf(c5919d.f37347b));
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
        if (message.what != 0) {
            return true;
        }
        updateTimeline();
        return true;
    }

    @hib
    private C5918c maybeCreateConcatenatedTimeline() {
        t1h.C12849b c12849b;
        kx7.C8541a c8541a;
        int i;
        t1h.C12851d c12851d = new t1h.C12851d();
        t1h.C12849b c12849b2 = new t1h.C12849b();
        kx7.C8541a c8541aBuilder = kx7.builder();
        kx7.C8541a c8541aBuilder2 = kx7.builder();
        kx7.C8541a c8541aBuilder3 = kx7.builder();
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        int i2 = 0;
        Object obj = null;
        int periodCount = 0;
        long j = 0;
        boolean z4 = false;
        long j2 = 0;
        long j3 = 0;
        boolean z5 = false;
        while (i2 < this.f37329M.size()) {
            C5919d c5919d = this.f37329M.get(i2);
            t1h timeline = c5919d.f37346a.getTimeline();
            u80.checkArgument(timeline.isEmpty() ^ z, "Can't concatenate empty child Timeline.");
            c8541aBuilder.add(timeline);
            c8541aBuilder2.add(Integer.valueOf(periodCount));
            periodCount += timeline.getPeriodCount();
            int i3 = 0;
            while (i3 < timeline.getWindowCount()) {
                timeline.getWindow(i3, c12851d);
                if (!z5) {
                    obj = c12851d.f83437d;
                    z5 = true;
                }
                if (z2 && x0i.areEqual(obj, c12851d.f83437d)) {
                    i = i2;
                    z2 = true;
                } else {
                    i = i2;
                    z2 = false;
                }
                long j4 = c12851d.f83430Q;
                if (j4 == -9223372036854775807L) {
                    j4 = c5919d.f37348c;
                    if (j4 == -9223372036854775807L) {
                        return null;
                    }
                }
                j2 += j4;
                if (c5919d.f37347b == 0 && i3 == 0) {
                    j3 = c12851d.f83429N;
                    j = -c12851d.f83433Z;
                } else {
                    u80.checkArgument(c12851d.f83433Z == 0, "Can't concatenate windows. A window has a non-zero offset in a period.");
                }
                z3 &= c12851d.f83424C || c12851d.f83428M;
                z4 |= c12851d.f83425F;
                i3++;
                i2 = i;
            }
            int i4 = i2;
            int periodCount2 = timeline.getPeriodCount();
            int i5 = 0;
            while (i5 < periodCount2) {
                c8541aBuilder3.add(Long.valueOf(j));
                timeline.getPeriod(i5, c12849b2);
                long j5 = c12849b2.f83399d;
                if (j5 == -9223372036854775807L) {
                    c12849b = c12849b2;
                    u80.checkArgument(periodCount2 == 1, "Can't concatenate multiple periods with unknown duration in one window.");
                    long j6 = c12851d.f83430Q;
                    if (j6 == -9223372036854775807L) {
                        j6 = c5919d.f37348c;
                    }
                    c8541a = c8541aBuilder;
                    j5 = j6 + c12851d.f83433Z;
                } else {
                    c12849b = c12849b2;
                    c8541a = c8541aBuilder;
                }
                j += j5;
                i5++;
                c8541aBuilder = c8541a;
                c12849b2 = c12849b;
            }
            i2 = i4 + 1;
            z = true;
        }
        return new C5918c(this.f37328L, c8541aBuilder.build(), c8541aBuilder2.build(), c8541aBuilder3.build(), z3, z4, j2, j3, z2 ? obj : null);
    }

    private void scheduleTimelineUpdate() {
        if (this.f37332X) {
            return;
        }
        ((Handler) u80.checkNotNull(this.f37331Q)).obtainMessage(0).sendToTarget();
        this.f37332X = true;
    }

    private void updateTimeline() {
        this.f37332X = false;
        C5918c c5918cMaybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (c5918cMaybeCreateConcatenatedTimeline != null) {
            m10220l(c5918cMaybeCreateConcatenatedTimeline);
        }
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int mo3298r(Integer num, int i) {
        return 0;
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, vna vnaVar, t1h t1hVar) {
        scheduleTimelineUpdate();
    }

    @Override // p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        C5919d c5919d = this.f37329M.get(getChildIndex(c14175b.f71106a));
        vna.C14175b c14175bCopyWithWindowSequenceNumber = c14175b.copyWithPeriodUid(getChildPeriodUid(c14175b.f71106a)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(c14175b.f71109d, this.f37329M.size(), c5919d.f37347b));
        m24066o(Integer.valueOf(c5919d.f37347b));
        c5919d.f37349d++;
        pv9 pv9VarCreatePeriod = c5919d.f37346a.createPeriod(c14175bCopyWithWindowSequenceNumber, interfaceC6430gn, j);
        this.f37330N.put(pv9VarCreatePeriod, c5919d);
        disableUnusedMediaSources();
        return pv9VarCreatePeriod;
    }

    @Override // p000.vna
    @hib
    public t1h getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // p000.vna
    public aga getMediaItem() {
        return this.f37328L;
    }

    @Override // p000.vm2, p000.es0
    /* JADX INFO: renamed from: h */
    public void mo3297h() {
    }

    @Override // p000.vm2, p000.es0
    /* JADX INFO: renamed from: k */
    public void mo2648k(@hib pdh pdhVar) {
        super.mo2648k(pdhVar);
        this.f37331Q = new Handler(new Handler.Callback() { // from class: cp2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f26711a.handleMessage(message);
            }
        });
        for (int i = 0; i < this.f37329M.size(); i++) {
            m24067t(Integer.valueOf(i), this.f37329M.get(i).f37346a);
        }
        scheduleTimelineUpdate();
    }

    @Override // p000.vna
    public void releasePeriod(nja njaVar) {
        ((C5919d) u80.checkNotNull(this.f37330N.remove(njaVar))).f37346a.releasePeriod(njaVar);
        r0.f37349d--;
        if (this.f37330N.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    @Override // p000.vm2, p000.es0
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.f37331Q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f37331Q = null;
        }
        this.f37332X = false;
    }

    @Override // p000.vm2
    @hib
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public vna.C14175b mo2649p(Integer num, vna.C14175b c14175b) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(c14175b.f71109d, this.f37329M.size())) {
            return null;
        }
        return c14175b.copyWithPeriodUid(getPeriodUid(num.intValue(), c14175b.f71106a)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(c14175b.f71109d, this.f37329M.size()));
    }

    private fp2(aga agaVar, kx7<C5919d> kx7Var) {
        this.f37328L = agaVar;
        this.f37329M = kx7Var;
        this.f37330N = new IdentityHashMap<>();
    }
}
