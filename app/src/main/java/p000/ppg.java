package p000;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {uh5.class})
@jjf(version = "1.9")
@dwf({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,202:1\n80#2:203\n80#2:204\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n176#1:203\n183#1:204\n*E\n"})
public final class ppg extends AbstractC10147o2 {

    /* JADX INFO: renamed from: d */
    public long f71620d;

    public ppg() {
        super(lt4.f58681b);
        markNow();
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m31834overflowLRDsOJo(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f71620d + ot4.shortName(m18271b()) + " is advanced by " + ((Object) bt4.m28099toStringimpl(j)) + a18.f100c);
    }

    @Override // p000.AbstractC10147o2
    /* JADX INFO: renamed from: c */
    public long mo18272c() {
        return this.f71620d;
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m31835plusAssignLRDsOJo(long j) {
        long jM28098toLongimpl = bt4.m28098toLongimpl(j, m18271b());
        if (((jM28098toLongimpl - 1) | 1) != Long.MAX_VALUE) {
            long j2 = this.f71620d;
            long j3 = j2 + jM28098toLongimpl;
            if ((jM28098toLongimpl ^ j2) >= 0 && (j2 ^ j3) < 0) {
                m31834overflowLRDsOJo(j);
            }
            this.f71620d = j3;
            return;
        }
        long jM28062divUwyO8pc = bt4.m28062divUwyO8pc(j, 2);
        if ((1 | (bt4.m28098toLongimpl(jM28062divUwyO8pc, m18271b()) - 1)) == Long.MAX_VALUE) {
            m31834overflowLRDsOJo(j);
            return;
        }
        long j4 = this.f71620d;
        try {
            m31835plusAssignLRDsOJo(jM28062divUwyO8pc);
            m31835plusAssignLRDsOJo(bt4.m28087minusLRDsOJo(j, jM28062divUwyO8pc));
        } catch (IllegalStateException e) {
            this.f71620d = j4;
            throw e;
        }
    }
}
