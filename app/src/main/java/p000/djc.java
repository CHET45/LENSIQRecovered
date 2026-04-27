package p000;

import java.util.ArrayList;
import p000.bkc;
import p000.ijc;
import p000.yc8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPathHitTester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n+ 2 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,171:1\n67#2:172\n81#2:174\n22#3:173\n70#4:175\n73#4:176\n166#5,21:177\n*S KotlinDebug\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n*L\n108#1:172\n108#1:174\n108#1:173\n130#1:175\n133#1:176\n139#1:177,21\n*E\n"})
public final class djc {

    /* JADX INFO: renamed from: a */
    @yfb
    public vic f29797a = ejc.f33206a;

    /* JADX INFO: renamed from: b */
    public float f29798b = 0.5f;

    /* JADX INFO: renamed from: c */
    @yfb
    public rud f29799c = rud.f79687e.getZero();

    /* JADX INFO: renamed from: d */
    @yfb
    public final yc8<bkc> f29800d = new yc8<>();

    /* JADX INFO: renamed from: e */
    @yfb
    public final float[] f29801e = new float[20];

    /* JADX INFO: renamed from: f */
    @yfb
    public final float[] f29802f = new float[2];

    /* JADX INFO: renamed from: djc$a */
    public /* synthetic */ class C4823a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29803a;

        static {
            int[] iArr = new int[bkc.EnumC1929a.values().length];
            try {
                iArr[bkc.EnumC1929a.Line.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bkc.EnumC1929a.Quadratic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bkc.EnumC1929a.Cubic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bkc.EnumC1929a.Done.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f29803a = iArr;
        }
    }

    public static /* synthetic */ void updatePath$default(djc djcVar, vic vicVar, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        djcVar.updatePath(vicVar, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m28647containsk4lQ0M(long j) {
        int i;
        int iLineWinding;
        if (!this.f29797a.isEmpty() && this.f29799c.m32199containsk4lQ0M(j)) {
            float fM30429getXimpl = izb.m30429getXimpl(j);
            float fM30430getYimpl = izb.m30430getYimpl(j);
            float[] fArr = this.f29801e;
            float[] fArr2 = this.f29802f;
            yc8<bkc> yc8Var = this.f29800d;
            if (yc8Var.f101101b != yc8Var.f101100a) {
                ArrayList arrayList = yc8Var.f101102c;
                arrayList.add(yc8Var.f101101b);
                i = 0;
                while (arrayList.size() > 0) {
                    yc8.C15614a c15614a = (yc8.C15614a) q82.removeLast(arrayList);
                    if (c15614a.overlaps(fM30430getYimpl, fM30430getYimpl)) {
                        T data = c15614a.getData();
                        md8.checkNotNull(data);
                        bkc bkcVar = (bkc) data;
                        float[] points = bkcVar.getPoints();
                        int i2 = C4823a.f29803a[bkcVar.getType().ordinal()];
                        if (i2 == 1) {
                            iLineWinding = d11.lineWinding(points, fM30429getXimpl, fM30430getYimpl);
                        } else if (i2 == 2) {
                            iLineWinding = d11.quadraticWinding(points, fM30429getXimpl, fM30430getYimpl, fArr, fArr2);
                        } else if (i2 == 3) {
                            iLineWinding = d11.cubicWinding(points, fM30429getXimpl, fM30430getYimpl, fArr, fArr2);
                        }
                        i += iLineWinding;
                    }
                    if (c15614a.getLeft() != yc8Var.f101100a && c15614a.getLeft().getMax() >= fM30430getYimpl) {
                        arrayList.add(c15614a.getLeft());
                    }
                    if (c15614a.getRight() != yc8Var.f101100a && c15614a.getRight().getMin() <= fM30430getYimpl) {
                        arrayList.add(c15614a.getRight());
                    }
                }
                arrayList.clear();
            } else {
                i = 0;
            }
            if (bjc.m28000equalsimpl0(this.f29797a.mo28698getFillTypeRgk1Os(), bjc.f13877b.m28004getEvenOddRgk1Os())) {
                i &= 1;
            }
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public final void updatePath(@yfb vic vicVar, @y46(from = 0.0d) float f) {
        this.f29797a = vicVar;
        this.f29798b = f;
        this.f29799c = vicVar.getBounds();
        this.f29800d.clear();
        ijc it = vicVar.iterator(ijc.EnumC7321a.AsQuadratics, f);
        while (it.hasNext()) {
            bkc next = it.next();
            int i = C4823a.f29803a[next.getType().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                long jComputeVerticalBounds$default = d11.computeVerticalBounds$default(next, this.f29801e, 0, 4, null);
                this.f29800d.addInterval(Float.intBitsToFloat((int) (jComputeVerticalBounds$default >> 32)), Float.intBitsToFloat((int) (jComputeVerticalBounds$default & 4294967295L)), next);
            } else if (i == 4) {
                return;
            }
        }
    }
}
