package p000;

import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
public final class vhi implements gue {

    /* JADX INFO: renamed from: d */
    public final rhi f91226d;

    /* JADX INFO: renamed from: e */
    public final int f91227e;

    /* JADX INFO: renamed from: f */
    public final long f91228f;

    /* JADX INFO: renamed from: g */
    public final long f91229g;

    /* JADX INFO: renamed from: h */
    public final long f91230h;

    public vhi(rhi rhiVar, int i, long j, long j2) {
        this.f91226d = rhiVar;
        this.f91227e = i;
        this.f91228f = j;
        long j3 = (j2 - j) / ((long) rhiVar.f78353e);
        this.f91229g = j3;
        this.f91230h = blockIndexToTimeUs(j3);
    }

    private long blockIndexToTimeUs(long j) {
        return t0i.scaleLargeTimestamp(j * ((long) this.f91227e), 1000000L, this.f91226d.f78351c);
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f91230h;
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        long jConstrainValue = t0i.constrainValue((((long) this.f91226d.f78351c) * j) / (((long) this.f91227e) * 1000000), 0L, this.f91229g - 1);
        long j2 = this.f91228f + (((long) this.f91226d.f78353e) * jConstrainValue);
        long jBlockIndexToTimeUs = blockIndexToTimeUs(jConstrainValue);
        lue lueVar = new lue(jBlockIndexToTimeUs, j2);
        if (jBlockIndexToTimeUs >= j || jConstrainValue == this.f91229g - 1) {
            return new gue.C6548a(lueVar);
        }
        long j3 = jConstrainValue + 1;
        return new gue.C6548a(lueVar, new lue(blockIndexToTimeUs(j3), this.f91228f + (((long) this.f91226d.f78353e) * j3)));
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return true;
    }
}
