package p000;

import p000.u0h;
import p000.wc2;

/* JADX INFO: renamed from: o2 */
/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {uh5.class})
@jjf(version = "1.9")
public abstract class AbstractC10147o2 implements u0h.InterfaceC13315c {

    /* JADX INFO: renamed from: b */
    @yfb
    public final lt4 f66258b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final fx8 f66259c;

    /* JADX INFO: renamed from: o2$a */
    @dwf({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,202:1\n80#2:203\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:203\n*E\n"})
    public static final class a implements wc2 {

        /* JADX INFO: renamed from: a */
        public final long f66260a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final AbstractC10147o2 f66261b;

        /* JADX INFO: renamed from: c */
        public final long f66262c;

        public /* synthetic */ a(long j, AbstractC10147o2 abstractC10147o2, long j2, jt3 jt3Var) {
            this(j, abstractC10147o2, j2);
        }

        @Override // java.lang.Comparable
        public int compareTo(@yfb wc2 wc2Var) {
            return wc2.C14546a.compareTo(this, wc2Var);
        }

        @Override // p000.e0h
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
        public long mo27923elapsedNowUwyO8pc() {
            return bt4.m28087minusLRDsOJo(vl9.saturatingOriginsDiff(this.f66261b.adjustedRead(), this.f66260a, this.f66261b.m18271b()), this.f66262c);
        }

        @Override // p000.wc2
        public boolean equals(@gib Object obj) {
            return (obj instanceof a) && md8.areEqual(this.f66261b, ((a) obj).f66261b) && bt4.m28064equalsimpl0(mo27925minusUwyO8pc((wc2) obj), bt4.f14711b.m28150getZEROUwyO8pc());
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
            return (bt4.m28080hashCodeimpl(this.f66262c) * 37) + Long.hashCode(this.f66260a);
        }

        @Override // p000.e0h
        @yfb
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public wc2 mo27924minusLRDsOJo(long j) {
            return wc2.C14546a.m32992minusLRDsOJo(this, j);
        }

        @Override // p000.wc2
        /* JADX INFO: renamed from: minus-UwyO8pc */
        public long mo27925minusUwyO8pc(@yfb wc2 wc2Var) {
            md8.checkNotNullParameter(wc2Var, "other");
            if (wc2Var instanceof a) {
                a aVar = (a) wc2Var;
                if (md8.areEqual(this.f66261b, aVar.f66261b)) {
                    return bt4.m28088plusLRDsOJo(vl9.saturatingOriginsDiff(this.f66260a, aVar.f66260a, this.f66261b.m18271b()), bt4.m28087minusLRDsOJo(this.f66262c, aVar.f66262c));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + wc2Var);
        }

        @yfb
        public String toString() {
            return "LongTimeMark(" + this.f66260a + ot4.shortName(this.f66261b.m18271b()) + " + " + ((Object) bt4.m28099toStringimpl(this.f66262c)) + ", " + this.f66261b + ')';
        }

        private a(long j, AbstractC10147o2 abstractC10147o2, long j2) {
            md8.checkNotNullParameter(abstractC10147o2, "timeSource");
            this.f66260a = j;
            this.f66261b = abstractC10147o2;
            this.f66262c = j2;
        }

        @Override // p000.e0h
        @yfb
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public wc2 mo27926plusLRDsOJo(long j) {
            lt4 lt4VarM18271b = this.f66261b.m18271b();
            if (bt4.m28084isInfiniteimpl(j)) {
                return new a(vl9.m32774saturatingAddNuflL3o(this.f66260a, lt4VarM18271b, j), this.f66261b, bt4.f14711b.m28150getZEROUwyO8pc(), null);
            }
            long jM28102truncateToUwyO8pc$kotlin_stdlib = bt4.m28102truncateToUwyO8pc$kotlin_stdlib(j, lt4VarM18271b);
            long jM28088plusLRDsOJo = bt4.m28088plusLRDsOJo(bt4.m28087minusLRDsOJo(j, jM28102truncateToUwyO8pc$kotlin_stdlib), this.f66262c);
            long jM32774saturatingAddNuflL3o = vl9.m32774saturatingAddNuflL3o(this.f66260a, lt4VarM18271b, jM28102truncateToUwyO8pc$kotlin_stdlib);
            long jM28102truncateToUwyO8pc$kotlin_stdlib2 = bt4.m28102truncateToUwyO8pc$kotlin_stdlib(jM28088plusLRDsOJo, lt4VarM18271b);
            long jM32774saturatingAddNuflL3o2 = vl9.m32774saturatingAddNuflL3o(jM32774saturatingAddNuflL3o, lt4VarM18271b, jM28102truncateToUwyO8pc$kotlin_stdlib2);
            long jM28087minusLRDsOJo = bt4.m28087minusLRDsOJo(jM28088plusLRDsOJo, jM28102truncateToUwyO8pc$kotlin_stdlib2);
            long jM28072getInWholeNanosecondsimpl = bt4.m28072getInWholeNanosecondsimpl(jM28087minusLRDsOJo);
            if (jM32774saturatingAddNuflL3o2 != 0 && jM28072getInWholeNanosecondsimpl != 0 && (jM32774saturatingAddNuflL3o2 ^ jM28072getInWholeNanosecondsimpl) < 0) {
                long duration = ft4.toDuration(p3a.getSign(jM28072getInWholeNanosecondsimpl), lt4VarM18271b);
                jM32774saturatingAddNuflL3o2 = vl9.m32774saturatingAddNuflL3o(jM32774saturatingAddNuflL3o2, lt4VarM18271b, duration);
                jM28087minusLRDsOJo = bt4.m28087minusLRDsOJo(jM28087minusLRDsOJo, duration);
            }
            if ((1 | (jM32774saturatingAddNuflL3o2 - 1)) == Long.MAX_VALUE) {
                jM28087minusLRDsOJo = bt4.f14711b.m28150getZEROUwyO8pc();
            }
            return new a(jM32774saturatingAddNuflL3o2, this.f66261b, jM28087minusLRDsOJo, null);
        }
    }

    public AbstractC10147o2(@yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "unit");
        this.f66258b = lt4Var;
        this.f66259c = hz8.lazy(new ny6() { // from class: n2
            @Override // p000.ny6
            public final Object invoke() {
                return Long.valueOf(this.f63028a.mo18272c());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return mo18272c() - getZero();
    }

    private final long getZero() {
        return ((Number) this.f66259c.getValue()).longValue();
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final lt4 m18271b() {
        return this.f66258b;
    }

    /* JADX INFO: renamed from: c */
    public abstract long mo18272c();

    @Override // p000.u0h
    @yfb
    public wc2 markNow() {
        return new a(adjustedRead(), this, bt4.f14711b.m28150getZEROUwyO8pc(), null);
    }
}
