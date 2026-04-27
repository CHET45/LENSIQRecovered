package p000;

import java.io.IOException;
import java.util.Arrays;
import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
public final class pz1 {

    /* JADX INFO: renamed from: o */
    public static final int f72541o = 512;

    /* JADX INFO: renamed from: p */
    public static final int f72542p = 1667497984;

    /* JADX INFO: renamed from: q */
    public static final int f72543q = 1650720768;

    /* JADX INFO: renamed from: r */
    public static final int f72544r = 1651965952;

    /* JADX INFO: renamed from: a */
    public final an0 f72545a;

    /* JADX INFO: renamed from: b */
    public final q6h f72546b;

    /* JADX INFO: renamed from: c */
    public final int f72547c;

    /* JADX INFO: renamed from: d */
    public final int f72548d;

    /* JADX INFO: renamed from: e */
    public final long f72549e;

    /* JADX INFO: renamed from: f */
    public int f72550f;

    /* JADX INFO: renamed from: g */
    public int f72551g;

    /* JADX INFO: renamed from: h */
    public int f72552h;

    /* JADX INFO: renamed from: i */
    public int f72553i;

    /* JADX INFO: renamed from: j */
    public int f72554j;

    /* JADX INFO: renamed from: k */
    public int f72555k;

    /* JADX INFO: renamed from: l */
    public long f72556l;

    /* JADX INFO: renamed from: m */
    public long[] f72557m;

    /* JADX INFO: renamed from: n */
    public int[] f72558n;

    public pz1(int i, an0 an0Var, q6h q6hVar) {
        this.f72545a = an0Var;
        int trackType = an0Var.getTrackType();
        boolean z = true;
        if (trackType != 1 && trackType != 2) {
            z = false;
        }
        v80.checkArgument(z);
        this.f72547c = getChunkIdFourCc(i, trackType == 2 ? 1667497984 : 1651965952);
        this.f72549e = an0Var.getDurationUs();
        this.f72546b = q6hVar;
        this.f72548d = trackType == 2 ? getChunkIdFourCc(i, 1650720768) : -1;
        this.f72556l = -1L;
        this.f72557m = new long[512];
        this.f72558n = new int[512];
        this.f72550f = an0Var.f2137e;
    }

    private static int getChunkIdFourCc(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private long getChunkTimestampUs(int i) {
        return (this.f72549e * ((long) i)) / ((long) this.f72550f);
    }

    private lue getSeekPoint(int i) {
        return new lue(((long) this.f72558n[i]) * getFrameDurationUs(), this.f72557m[i]);
    }

    public void advanceCurrentChunk() {
        this.f72553i++;
    }

    public void appendIndexChunk(long j, boolean z) {
        if (this.f72556l == -1) {
            this.f72556l = j;
        }
        if (z) {
            if (this.f72555k == this.f72558n.length) {
                long[] jArr = this.f72557m;
                this.f72557m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f72558n;
                this.f72558n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f72557m;
            int i = this.f72555k;
            jArr2[i] = j;
            this.f72558n[i] = this.f72554j;
            this.f72555k = i + 1;
        }
        this.f72554j++;
    }

    public void commitIndex() {
        int i;
        this.f72557m = Arrays.copyOf(this.f72557m, this.f72555k);
        this.f72558n = Arrays.copyOf(this.f72558n, this.f72555k);
        if (!isAudio() || this.f72545a.f2139g == 0 || (i = this.f72555k) <= 0) {
            return;
        }
        this.f72550f = i;
    }

    public long getCurrentChunkTimestampUs() {
        return getChunkTimestampUs(this.f72553i);
    }

    public long getFrameDurationUs() {
        return getChunkTimestampUs(1);
    }

    public gue.C6548a getSeekPoints(long j) {
        if (this.f72555k == 0) {
            return new gue.C6548a(new lue(0L, this.f72556l));
        }
        int frameDurationUs = (int) (j / getFrameDurationUs());
        int iBinarySearchFloor = t0i.binarySearchFloor(this.f72558n, frameDurationUs, true, true);
        if (this.f72558n[iBinarySearchFloor] == frameDurationUs) {
            return new gue.C6548a(getSeekPoint(iBinarySearchFloor));
        }
        lue seekPoint = getSeekPoint(iBinarySearchFloor);
        int i = iBinarySearchFloor + 1;
        return i < this.f72557m.length ? new gue.C6548a(seekPoint, getSeekPoint(i)) : new gue.C6548a(seekPoint);
    }

    public boolean handlesChunkId(int i) {
        return this.f72547c == i || this.f72548d == i;
    }

    public boolean isAudio() {
        return (this.f72547c & 1651965952) == 1651965952;
    }

    public boolean isCurrentFrameAKeyFrame() {
        return Arrays.binarySearch(this.f72558n, this.f72553i) >= 0;
    }

    public boolean isVideo() {
        return (this.f72547c & 1667497984) == 1667497984;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean onChunkData(ak5 ak5Var) throws IOException {
        int i = this.f72552h;
        int iSampleData = i - this.f72546b.sampleData((bh3) ak5Var, i, false);
        this.f72552h = iSampleData;
        boolean z = iSampleData == 0;
        if (z) {
            if (this.f72551g > 0) {
                this.f72546b.sampleMetadata(getCurrentChunkTimestampUs(), isCurrentFrameAKeyFrame() ? 1 : 0, this.f72551g, 0, null);
            }
            advanceCurrentChunk();
        }
        return z;
    }

    public void onChunkStart(int i) {
        this.f72551g = i;
        this.f72552h = i;
    }

    public void seekToPosition(long j) {
        if (this.f72555k == 0) {
            this.f72553i = 0;
        } else {
            this.f72553i = this.f72558n[t0i.binarySearchFloor(this.f72557m, j, true, true)];
        }
    }
}
