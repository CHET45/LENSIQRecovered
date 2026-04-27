package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class pyf extends myf {

    /* JADX INFO: renamed from: a */
    public final long f72517a;

    /* JADX INFO: renamed from: b */
    public final boolean f72518b;

    /* JADX INFO: renamed from: c */
    public final boolean f72519c;

    /* JADX INFO: renamed from: d */
    public final boolean f72520d;

    /* JADX INFO: renamed from: e */
    public final boolean f72521e;

    /* JADX INFO: renamed from: f */
    public final long f72522f;

    /* JADX INFO: renamed from: g */
    public final long f72523g;

    /* JADX INFO: renamed from: h */
    public final List<C11188b> f72524h;

    /* JADX INFO: renamed from: i */
    public final boolean f72525i;

    /* JADX INFO: renamed from: j */
    public final long f72526j;

    /* JADX INFO: renamed from: k */
    public final int f72527k;

    /* JADX INFO: renamed from: l */
    public final int f72528l;

    /* JADX INFO: renamed from: m */
    public final int f72529m;

    /* JADX INFO: renamed from: pyf$b */
    public static final class C11188b {

        /* JADX INFO: renamed from: a */
        public final int f72530a;

        /* JADX INFO: renamed from: b */
        public final long f72531b;

        /* JADX INFO: renamed from: c */
        public final long f72532c;

        private C11188b(int i, long j, long j2) {
            this.f72530a = i;
            this.f72531b = j;
            this.f72532c = j2;
        }
    }

    private pyf(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C11188b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f72517a = j;
        this.f72518b = z;
        this.f72519c = z2;
        this.f72520d = z3;
        this.f72521e = z4;
        this.f72522f = j2;
        this.f72523g = j3;
        this.f72524h = Collections.unmodifiableList(list);
        this.f72525i = z5;
        this.f72526j = j4;
        this.f72527k = i;
        this.f72528l = i2;
        this.f72529m = i3;
    }

    /* JADX INFO: renamed from: a */
    public static pyf m19850a(jhc jhcVar, long j, h2h h2hVar) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int unsignedShort;
        int unsignedByte;
        int unsignedByte2;
        boolean z4;
        boolean z5;
        long unsignedInt;
        long unsignedInt2 = jhcVar.readUnsignedInt();
        boolean z6 = (jhcVar.readUnsignedByte() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z6) {
            list = listEmptyList;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            unsignedShort = 0;
            unsignedByte = 0;
            unsignedByte2 = 0;
            z4 = false;
        } else {
            int unsignedByte3 = jhcVar.readUnsignedByte();
            boolean z7 = (unsignedByte3 & 128) != 0;
            boolean z8 = (unsignedByte3 & 64) != 0;
            boolean z9 = (unsignedByte3 & 32) != 0;
            boolean z10 = (unsignedByte3 & 16) != 0;
            long jM22309b = (!z8 || z10) ? -9223372036854775807L : t0h.m22309b(jhcVar, j);
            if (!z8) {
                int unsignedByte4 = jhcVar.readUnsignedByte();
                ArrayList arrayList = new ArrayList(unsignedByte4);
                for (int i = 0; i < unsignedByte4; i++) {
                    int unsignedByte5 = jhcVar.readUnsignedByte();
                    long jM22309b2 = !z10 ? t0h.m22309b(jhcVar, j) : -9223372036854775807L;
                    arrayList.add(new C11188b(unsignedByte5, jM22309b2, h2hVar.adjustTsTimestamp(jM22309b2)));
                }
                listEmptyList = arrayList;
            }
            if (z9) {
                long unsignedByte6 = jhcVar.readUnsignedByte();
                boolean z11 = (128 & unsignedByte6) != 0;
                unsignedInt = ((((unsignedByte6 & 1) << 32) | jhcVar.readUnsignedInt()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                unsignedInt = -9223372036854775807L;
            }
            unsignedShort = jhcVar.readUnsignedShort();
            z4 = z8;
            unsignedByte = jhcVar.readUnsignedByte();
            unsignedByte2 = jhcVar.readUnsignedByte();
            list = listEmptyList;
            long j4 = jM22309b;
            z3 = z5;
            j3 = unsignedInt;
            z2 = z10;
            z = z7;
            j2 = j4;
        }
        return new pyf(unsignedInt2, z6, z, z4, z2, j2, h2hVar.adjustTsTimestamp(j2), list, z3, j3, unsignedShort, unsignedByte, unsignedByte2);
    }

    @Override // p000.myf
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f72522f + ", programSplicePlaybackPositionUs= " + this.f72523g + " }";
    }
}
