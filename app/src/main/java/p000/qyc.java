package p000;

import android.os.Bundle;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class qyc implements gh1 {

    /* JADX INFO: renamed from: d */
    public static final qyc f76311d = new qyc(1.0f);

    /* JADX INFO: renamed from: e */
    public static final String f76312e = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: f */
    public static final String f76313f = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: m */
    public static final gh1.InterfaceC6311a<qyc> f76314m = new gh1.InterfaceC6311a() { // from class: pyc
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return qyc.lambda$static$0(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final float f76315a;

    /* JADX INFO: renamed from: b */
    public final float f76316b;

    /* JADX INFO: renamed from: c */
    public final int f76317c;

    public qyc(@y46(from = 0.0d, fromInclusive = false) float f) {
        this(f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ qyc lambda$static$0(Bundle bundle) {
        return new qyc(bundle.getFloat(f76312e, 1.0f), bundle.getFloat(f76313f, 1.0f));
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qyc.class != obj.getClass()) {
            return false;
        }
        qyc qycVar = (qyc) obj;
        return this.f76315a == qycVar.f76315a && this.f76316b == qycVar.f76316b;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j) {
        return j * ((long) this.f76317c);
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f76315a)) * 31) + Float.floatToRawIntBits(this.f76316b);
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f76312e, this.f76315a);
        bundle.putFloat(f76313f, this.f76316b);
        return bundle;
    }

    public String toString() {
        return x0i.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f76315a), Float.valueOf(this.f76316b));
    }

    @yx1
    public qyc withSpeed(@y46(from = 0.0d, fromInclusive = false) float f) {
        return new qyc(f, this.f76316b);
    }

    public qyc(@y46(from = 0.0d, fromInclusive = false) float f, @y46(from = 0.0d, fromInclusive = false) float f2) {
        u80.checkArgument(f > 0.0f);
        u80.checkArgument(f2 > 0.0f);
        this.f76315a = f;
        this.f76316b = f2;
        this.f76317c = Math.round(f * 1000.0f);
    }
}
