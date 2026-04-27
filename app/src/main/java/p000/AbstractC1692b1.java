package p000;

import p000.u0h;
import p000.wc2;

/* JADX INFO: renamed from: b1 */
/* JADX INFO: loaded from: classes7.dex */
@uh5
@jjf(version = "1.3")
@q64(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
public abstract class AbstractC1692b1 implements u0h.InterfaceC13315c {

    /* JADX INFO: renamed from: b */
    @yfb
    public final lt4 f12353b;

    /* JADX INFO: renamed from: b1$a */
    public static final class a implements wc2 {

        /* JADX INFO: renamed from: a */
        public final double f12354a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final AbstractC1692b1 f12355b;

        /* JADX INFO: renamed from: c */
        public final long f12356c;

        public /* synthetic */ a(double d, AbstractC1692b1 abstractC1692b1, long j, jt3 jt3Var) {
            this(d, abstractC1692b1, j);
        }

        @Override // java.lang.Comparable
        public int compareTo(@yfb wc2 wc2Var) {
            return wc2.C14546a.compareTo(this, wc2Var);
        }

        @Override // p000.e0h
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public long mo27923elapsedNowUwyO8pc() {
            return bt4.m28087minusLRDsOJo(ft4.toDuration(this.f12355b.m2787b() - this.f12354a, this.f12355b.m2786a()), this.f12356c);
        }

        @Override // p000.wc2
        public boolean equals(@gib Object obj) {
            return (obj instanceof a) && md8.areEqual(this.f12355b, ((a) obj).f12355b) && bt4.m28064equalsimpl0(mo27925minusUwyO8pc((wc2) obj), bt4.f14711b.m28150getZEROUwyO8pc());
        }

        @Override // p000.e0h
        public boolean hasNotPassedNow() {
            return wc2.C14546a.hasNotPassedNow(this);
        }

        @Override // p000.e0h
        public boolean hasPassedNow() {
            return wc2.C14546a.hasPassedNow(this);
        }

        @Override // p000.wc2
        public int hashCode() {
            return bt4.m28080hashCodeimpl(bt4.m28088plusLRDsOJo(ft4.toDuration(this.f12354a, this.f12355b.m2786a()), this.f12356c));
        }

        @Override // p000.e0h
        @yfb
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public wc2 mo27924minusLRDsOJo(long j) {
            return wc2.C14546a.m32992minusLRDsOJo(this, j);
        }

        @Override // p000.wc2
        /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
        public long mo27925minusUwyO8pc(@yfb wc2 wc2Var) {
            md8.checkNotNullParameter(wc2Var, "other");
            if (wc2Var instanceof a) {
                a aVar = (a) wc2Var;
                if (md8.areEqual(this.f12355b, aVar.f12355b)) {
                    if (bt4.m28064equalsimpl0(this.f12356c, aVar.f12356c) && bt4.m28084isInfiniteimpl(this.f12356c)) {
                        return bt4.f14711b.m28150getZEROUwyO8pc();
                    }
                    long jM28087minusLRDsOJo = bt4.m28087minusLRDsOJo(this.f12356c, aVar.f12356c);
                    long duration = ft4.toDuration(this.f12354a - aVar.f12354a, this.f12355b.m2786a());
                    return bt4.m28064equalsimpl0(duration, bt4.m28103unaryMinusUwyO8pc(jM28087minusLRDsOJo)) ? bt4.f14711b.m28150getZEROUwyO8pc() : bt4.m28088plusLRDsOJo(duration, jM28087minusLRDsOJo);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + wc2Var);
        }

        @yfb
        public String toString() {
            return "DoubleTimeMark(" + this.f12354a + ot4.shortName(this.f12355b.m2786a()) + " + " + ((Object) bt4.m28099toStringimpl(this.f12356c)) + ", " + this.f12355b + ')';
        }

        private a(double d, AbstractC1692b1 abstractC1692b1, long j) {
            md8.checkNotNullParameter(abstractC1692b1, "timeSource");
            this.f12354a = d;
            this.f12355b = abstractC1692b1;
            this.f12356c = j;
        }

        @Override // p000.e0h
        @yfb
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public wc2 mo27926plusLRDsOJo(long j) {
            return new a(this.f12354a, this.f12355b, bt4.m28088plusLRDsOJo(this.f12356c, j), null);
        }
    }

    public AbstractC1692b1(@yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "unit");
        this.f12353b = lt4Var;
    }

    @yfb
    /* JADX INFO: renamed from: a */
    public final lt4 m2786a() {
        return this.f12353b;
    }

    /* JADX INFO: renamed from: b */
    public abstract double m2787b();

    @Override // p000.u0h
    @yfb
    public wc2 markNow() {
        return new a(m2787b(), this, bt4.f14711b.m28150getZEROUwyO8pc(), null);
    }
}
