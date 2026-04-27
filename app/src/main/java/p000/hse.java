package p000;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class hse {

    /* JADX INFO: renamed from: i */
    public static final hse f44736i = new C6998b().build();

    /* JADX INFO: renamed from: a */
    public final dy7<Integer> f44737a;

    /* JADX INFO: renamed from: b */
    @hib
    @y46(from = 0.0d, m25645to = 1.0d)
    public final Double f44738b;

    /* JADX INFO: renamed from: c */
    @hib
    @y46(from = 0.0d, m25645to = 1.0d)
    public final Double f44739c;

    /* JADX INFO: renamed from: d */
    public final boolean f44740d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public final boolean f44741e;

    /* JADX INFO: renamed from: f */
    public final boolean f44742f;

    /* JADX INFO: renamed from: g */
    public final boolean f44743g;

    /* JADX INFO: renamed from: h */
    public final boolean f44744h;

    /* JADX INFO: renamed from: hse$b */
    public static final class C6998b {

        /* JADX INFO: renamed from: a */
        public dy7<Integer> f44745a;

        /* JADX INFO: renamed from: b */
        @hib
        public Double f44746b;

        /* JADX INFO: renamed from: c */
        @hib
        public Double f44747c;

        /* JADX INFO: renamed from: d */
        public boolean f44748d;

        /* JADX INFO: renamed from: e */
        public boolean f44749e;

        /* JADX INFO: renamed from: f */
        public boolean f44750f;

        /* JADX INFO: renamed from: g */
        public boolean f44751g;

        public hse build() {
            return new hse(this);
        }

        @op1
        public C6998b setAllowSkippingMediaCodecFlush(boolean z) {
            this.f44749e = z;
            return this;
        }

        @op1
        public C6998b setDisabledTrackTypes(Set<Integer> set) {
            this.f44745a = dy7.copyOf((Collection) set);
            return this;
        }

        @op1
        public C6998b setFractionalSeekTolerance(@hib @y46(from = 0.0d, m25645to = 1.0d) Double d, @hib @y46(from = 0.0d, m25645to = 1.0d) Double d2) {
            boolean z = false;
            v80.checkArgument((d == null) == (d2 == null));
            v80.checkArgument(d == null || (d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d));
            if (d2 == null || (d2.doubleValue() >= 0.0d && d2.doubleValue() <= 1.0d)) {
                z = true;
            }
            v80.checkArgument(z);
            this.f44746b = d;
            this.f44747c = d2;
            return this;
        }

        @op1
        @Deprecated
        public C6998b setIsMediaCodecFlushEnabled(boolean z) {
            this.f44749e = !z;
            return this;
        }

        @op1
        public C6998b setShouldEnableDynamicScheduling(boolean z) {
            this.f44750f = z;
            return this;
        }

        @op1
        public C6998b setShouldIncreaseCodecOperatingRate(boolean z) {
            this.f44748d = z;
            return this;
        }

        @op1
        public C6998b setUseDecodeOnlyFlag(boolean z) {
            this.f44751g = z;
            return this;
        }

        public C6998b() {
            this.f44745a = dy7.m9577of(1, 5);
            this.f44748d = true;
            this.f44749e = true;
            this.f44750f = true;
            this.f44751g = true;
        }

        private C6998b(hse hseVar) {
            this.f44745a = hseVar.f44737a;
            this.f44746b = hseVar.f44738b;
            this.f44747c = hseVar.f44739c;
            this.f44748d = hseVar.f44740d;
            this.f44749e = hseVar.f44742f;
            this.f44750f = hseVar.f44743g;
            this.f44751g = hseVar.f44744h;
        }
    }

    public C6998b buildUpon() {
        return new C6998b();
    }

    public boolean equals(@hib Object obj) {
        if (!(obj instanceof hse)) {
            return false;
        }
        hse hseVar = (hse) obj;
        return this.f44737a.equals(hseVar.f44737a) && this.f44742f == hseVar.f44742f && Objects.equals(this.f44738b, hseVar.f44738b) && Objects.equals(this.f44739c, hseVar.f44739c) && this.f44740d == hseVar.f44740d && this.f44743g == hseVar.f44743g && this.f44744h == hseVar.f44744h;
    }

    public int hashCode() {
        return Objects.hash(this.f44737a, this.f44738b, this.f44739c, Boolean.valueOf(this.f44740d), Boolean.valueOf(this.f44742f), Boolean.valueOf(this.f44743g), Boolean.valueOf(this.f44744h));
    }

    private hse(C6998b c6998b) {
        this.f44737a = c6998b.f44745a;
        this.f44738b = c6998b.f44746b;
        this.f44739c = c6998b.f44747c;
        this.f44740d = c6998b.f44748d;
        this.f44741e = !c6998b.f44749e;
        this.f44742f = c6998b.f44749e;
        this.f44743g = c6998b.f44750f;
        this.f44744h = c6998b.f44751g;
    }
}
