package p000;

import android.util.Pair;
import java.util.Map;
import p000.h27;
import p000.mv3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class mv3 implements h27.InterfaceC6686a {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC9549c f62364c = new InterfaceC9549c() { // from class: iv3
        @Override // p000.mv3.InterfaceC9549c
        public final float getGainFactorAt(long j, long j2) {
            return mv3.lambda$static$0(j, j2);
        }
    };

    /* JADX INFO: renamed from: d */
    public static final InterfaceC9549c f62365d = new InterfaceC9549c() { // from class: jv3
        @Override // p000.mv3.InterfaceC9549c
        public final float getGainFactorAt(long j, long j2) {
            return mv3.lambda$static$1(j, j2);
        }
    };

    /* JADX INFO: renamed from: e */
    public static final InterfaceC9549c f62366e = new InterfaceC9549c() { // from class: kv3
        @Override // p000.mv3.InterfaceC9549c
        public final float getGainFactorAt(long j, long j2) {
            return mv3.lambda$static$2(j, j2);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final InterfaceC9549c f62367f = new InterfaceC9549c() { // from class: lv3
        @Override // p000.mv3.InterfaceC9549c
        public final float getGainFactorAt(long j, long j2) {
            return mv3.lambda$static$3(j, j2);
        }
    };

    /* JADX INFO: renamed from: g */
    public static final float f62368g = -3.4028235E38f;

    /* JADX INFO: renamed from: a */
    public final fih<Long, lz6<Pair<Long, Integer>, Float>> f62369a;

    /* JADX INFO: renamed from: b */
    public final float f62370b;

    /* JADX INFO: renamed from: mv3$b */
    public static final class C9548b {

        /* JADX INFO: renamed from: a */
        public final fih<Long, lz6<Pair<Long, Integer>, Float>> f62371a;

        /* JADX INFO: renamed from: b */
        public final float f62372b;

        public C9548b(float f) {
            fih<Long, lz6<Pair<Long, Integer>, Float>> fihVarCreate = fih.create();
            this.f62371a = fihVarCreate;
            this.f62372b = f;
            fihVarCreate.put(bpd.all(), new lz6() { // from class: nv3
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return mv3.C9548b.lambda$new$0((Pair) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Float lambda$addFadeAt$1(long j, InterfaceC9549c interfaceC9549c, long j2, Pair pair) {
            int iIntValue = ((Integer) pair.second).intValue();
            return Float.valueOf(interfaceC9549c.getGainFactorAt(((Long) pair.first).longValue() - t0i.durationUsToSampleCount(j, iIntValue), t0i.durationUsToSampleCount(j2, iIntValue)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Float lambda$new$0(Pair pair) {
            return Float.valueOf(-3.4028235E38f);
        }

        @op1
        public C9548b addFadeAt(@h78(from = 0) final long j, @h78(from = 1) final long j2, final InterfaceC9549c interfaceC9549c) {
            v80.checkArgument(j >= 0);
            v80.checkArgument(j2 > 1);
            this.f62371a.put(bpd.closedOpen(Long.valueOf(j), Long.valueOf(j + j2)), new lz6() { // from class: ov3
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return mv3.C9548b.lambda$addFadeAt$1(j, interfaceC9549c, j2, (Pair) obj);
                }
            });
            return this;
        }

        public mv3 build() {
            return new mv3(this.f62371a, this.f62372b);
        }
    }

    /* JADX INFO: renamed from: mv3$c */
    public interface InterfaceC9549c {
        float getGainFactorAt(@h78(from = 0) long j, @h78(from = 1) long j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$0(long j, long j2) {
        return j / j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$1(long j, long j2) {
        return (j2 - j) / j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$2(long j, long j2) {
        return (float) Math.sin((j * 1.5707963267948966d) / j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$3(long j, long j2) {
        return (float) Math.cos((j * 1.5707963267948966d) / j2);
    }

    @Override // p000.h27.InterfaceC6686a
    public float getGainFactorAtSamplePosition(@h78(from = 0) long j, @h78(from = 1) int i) {
        v80.checkState(i > 0);
        v80.checkArgument(j >= 0);
        float fFloatValue = ((Float) ((lz6) v80.checkNotNull(this.f62369a.get(Long.valueOf(t0i.sampleCountToDurationUs(j, i))))).apply(Pair.create(Long.valueOf(j), Integer.valueOf(i)))).floatValue();
        return fFloatValue == -3.4028235E38f ? this.f62370b : fFloatValue;
    }

    @Override // p000.h27.InterfaceC6686a
    public long isUnityUntil(@h78(from = 0) long j, @h78(from = 1) int i) {
        v80.checkState(i > 0);
        v80.checkArgument(j >= 0);
        Map.Entry entry = (Map.Entry) v80.checkNotNull(this.f62369a.getEntry(Long.valueOf(t0i.sampleCountToDurationUs(j, i))));
        float fFloatValue = ((Float) ((lz6) entry.getValue()).apply(Pair.create(Long.valueOf(j), Integer.valueOf(i)))).floatValue();
        if (fFloatValue == 1.0f) {
            return j + 1;
        }
        if (this.f62370b != 1.0f || fFloatValue != -3.4028235E38f) {
            return -9223372036854775807L;
        }
        if (((bpd) entry.getKey()).hasUpperBound()) {
            return t0i.durationUsToSampleCount(((Long) ((bpd) entry.getKey()).upperEndpoint()).longValue(), i);
        }
        return Long.MIN_VALUE;
    }

    private mv3(fih<Long, lz6<Pair<Long, Integer>, Float>> fihVar, float f) {
        fih<Long, lz6<Pair<Long, Integer>, Float>> fihVarCreate = fih.create();
        this.f62369a = fihVarCreate;
        fihVarCreate.putAll(fihVar);
        this.f62370b = f;
    }
}
