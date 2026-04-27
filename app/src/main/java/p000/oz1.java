package p000;

import java.io.IOException;
import java.util.Arrays;
import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class oz1 {

    /* JADX INFO: renamed from: m */
    public static final int f69240m = 512;

    /* JADX INFO: renamed from: n */
    public static final int f69241n = 1667497984;

    /* JADX INFO: renamed from: o */
    public static final int f69242o = 1650720768;

    /* JADX INFO: renamed from: p */
    public static final int f69243p = 1651965952;

    /* JADX INFO: renamed from: a */
    public final r6h f69244a;

    /* JADX INFO: renamed from: b */
    public final int f69245b;

    /* JADX INFO: renamed from: c */
    public final int f69246c;

    /* JADX INFO: renamed from: d */
    public final long f69247d;

    /* JADX INFO: renamed from: e */
    public final int f69248e;

    /* JADX INFO: renamed from: f */
    public int f69249f;

    /* JADX INFO: renamed from: g */
    public int f69250g;

    /* JADX INFO: renamed from: h */
    public int f69251h;

    /* JADX INFO: renamed from: i */
    public int f69252i;

    /* JADX INFO: renamed from: j */
    public int f69253j;

    /* JADX INFO: renamed from: k */
    public long[] f69254k;

    /* JADX INFO: renamed from: l */
    public int[] f69255l;

    public oz1(int i, int i2, long j, int i3, r6h r6hVar) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        u80.checkArgument(z);
        this.f69247d = j;
        this.f69248e = i3;
        this.f69244a = r6hVar;
        this.f69245b = getChunkIdFourCc(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f69246c = i2 == 2 ? getChunkIdFourCc(i, 1650720768) : -1;
        this.f69254k = new long[512];
        this.f69255l = new int[512];
    }

    private static int getChunkIdFourCc(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private long getChunkTimestampUs(int i) {
        return (this.f69247d * ((long) i)) / ((long) this.f69248e);
    }

    private kue getSeekPoint(int i) {
        return new kue(((long) this.f69255l[i]) * getFrameDurationUs(), this.f69254k[i]);
    }

    public void advanceCurrentChunk() {
        this.f69251h++;
    }

    public void appendKeyFrameToIndex(long j) {
        if (this.f69253j == this.f69255l.length) {
            long[] jArr = this.f69254k;
            this.f69254k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f69255l;
            this.f69255l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f69254k;
        int i = this.f69253j;
        jArr2[i] = j;
        this.f69255l[i] = this.f69252i;
        this.f69253j = i + 1;
    }

    public void compactIndex() {
        this.f69254k = Arrays.copyOf(this.f69254k, this.f69253j);
        this.f69255l = Arrays.copyOf(this.f69255l, this.f69253j);
    }

    public long getCurrentChunkTimestampUs() {
        return getChunkTimestampUs(this.f69251h);
    }

    public long getFrameDurationUs() {
        return getChunkTimestampUs(1);
    }

    public hue.C7023a getSeekPoints(long j) {
        int frameDurationUs = (int) (j / getFrameDurationUs());
        int iBinarySearchFloor = x0i.binarySearchFloor(this.f69255l, frameDurationUs, true, true);
        if (this.f69255l[iBinarySearchFloor] == frameDurationUs) {
            return new hue.C7023a(getSeekPoint(iBinarySearchFloor));
        }
        kue seekPoint = getSeekPoint(iBinarySearchFloor);
        int i = iBinarySearchFloor + 1;
        return i < this.f69254k.length ? new hue.C7023a(seekPoint, getSeekPoint(i)) : new hue.C7023a(seekPoint);
    }

    public boolean handlesChunkId(int i) {
        return this.f69245b == i || this.f69246c == i;
    }

    public void incrementIndexChunkCount() {
        this.f69252i++;
    }

    public boolean isAudio() {
        return (this.f69245b & 1651965952) == 1651965952;
    }

    public boolean isCurrentFrameAKeyFrame() {
        return Arrays.binarySearch(this.f69255l, this.f69251h) >= 0;
    }

    public boolean isVideo() {
        return (this.f69245b & 1667497984) == 1667497984;
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
    public boolean onChunkData(zj5 zj5Var) throws IOException {
        int i = this.f69250g;
        int iSampleData = i - this.f69244a.sampleData((ah3) zj5Var, i, false);
        this.f69250g = iSampleData;
        boolean z = iSampleData == 0;
        if (z) {
            if (this.f69249f > 0) {
                this.f69244a.sampleMetadata(getCurrentChunkTimestampUs(), isCurrentFrameAKeyFrame() ? 1 : 0, this.f69249f, 0, null);
            }
            advanceCurrentChunk();
        }
        return z;
    }

    public void onChunkStart(int i) {
        this.f69249f = i;
        this.f69250g = i;
    }

    public void seekToPosition(long j) {
        if (this.f69253j == 0) {
            this.f69251h = 0;
        } else {
            this.f69251h = this.f69255l[x0i.binarySearchFloor(this.f69254k, j, true, true)];
        }
    }
}
