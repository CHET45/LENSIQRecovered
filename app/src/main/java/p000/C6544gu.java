package p000;

import android.graphics.Path;
import androidx.graphics.path.C1114a;
import p000.bkc;
import p000.ijc;

/* JADX INFO: renamed from: gu */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidPathIterator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathIterator.android.kt\nandroidx/compose/ui/graphics/AndroidPathIterator\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n38#2,5:87\n*S KotlinDebug\n*F\n+ 1 AndroidPathIterator.android.kt\nandroidx/compose/ui/graphics/AndroidPathIterator\n*L\n37#1:87,5\n*E\n"})
public final class C6544gu implements ijc {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vic f41120a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ijc.EnumC7321a f41121b;

    /* JADX INFO: renamed from: c */
    public final float f41122c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final float[] f41123d = new float[8];

    /* JADX INFO: renamed from: e */
    @yfb
    public final C1114a f41124e;

    /* JADX INFO: renamed from: gu$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41125a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f41126b;

        static {
            int[] iArr = new int[ijc.EnumC7321a.values().length];
            try {
                iArr[ijc.EnumC7321a.AsConic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ijc.EnumC7321a.AsQuadratics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41125a = iArr;
            int[] iArr2 = new int[bkc.EnumC1929a.values().length];
            try {
                iArr2[bkc.EnumC1929a.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[bkc.EnumC1929a.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[bkc.EnumC1929a.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[bkc.EnumC1929a.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[bkc.EnumC1929a.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f41126b = iArr2;
        }
    }

    public C6544gu(@yfb vic vicVar, @yfb ijc.EnumC7321a enumC7321a, float f) {
        C1114a.a aVar;
        this.f41120a = vicVar;
        this.f41121b = enumC7321a;
        this.f41122c = f;
        vic path = getPath();
        if (!(path instanceof C4947du)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path internalPath = ((C4947du) path).getInternalPath();
        int i = a.f41125a[getConicEvaluation().ordinal()];
        if (i == 1) {
            aVar = C1114a.a.AsConic;
        } else {
            if (i != 2) {
                throw new ceb();
            }
            aVar = C1114a.a.AsQuadratics;
        }
        this.f41124e = new C1114a(internalPath, aVar, getTolerance());
    }

    @Override // p000.ijc
    public int calculateSize(boolean z) {
        return this.f41124e.calculateSize(z);
    }

    @Override // p000.ijc
    @yfb
    public ijc.EnumC7321a getConicEvaluation() {
        return this.f41121b;
    }

    @Override // p000.ijc
    @yfb
    public vic getPath() {
        return this.f41120a;
    }

    @Override // p000.ijc
    public float getTolerance() {
        return this.f41122c;
    }

    @Override // p000.ijc, java.util.Iterator
    public boolean hasNext() {
        return this.f41124e.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p000.ijc
    @yfb
    public bkc.EnumC1929a next(@yfb float[] fArr, int i) {
        return C7020hu.toPathSegmentType(this.f41124e.next(fArr, i));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    @Override // java.util.Iterator
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.bkc next() {
        /*
            r11 = this;
            float[] r0 = r11.f41123d
            androidx.graphics.path.a r1 = r11.f41124e
            r2 = 0
            androidx.graphics.path.e$a r1 = r1.next(r0, r2)
            bkc$a r1 = p000.C7020hu.access$toPathSegmentType(r1)
            bkc$a r3 = p000.bkc.EnumC1929a.Done
            if (r1 != r3) goto L16
            bkc r0 = p000.dkc.getDoneSegment()
            return r0
        L16:
            bkc$a r3 = p000.bkc.EnumC1929a.Close
            if (r1 != r3) goto L1f
            bkc r0 = p000.dkc.getCloseSegment()
            return r0
        L1f:
            int[] r3 = p000.C6544gu.a.f41126b
            int r4 = r1.ordinal()
            r3 = r3[r4]
            r4 = 6
            r5 = 2
            r6 = 1
            if (r3 == r6) goto Lab
            r7 = 4
            r8 = 3
            if (r3 == r5) goto L98
            r9 = 5
            if (r3 == r8) goto L7d
            if (r3 == r7) goto L62
            if (r3 == r9) goto L3b
            float[] r2 = new float[r2]
            goto Lb6
        L3b:
            r3 = 8
            float[] r3 = new float[r3]
            r10 = r0[r2]
            r3[r2] = r10
            r2 = r0[r6]
            r3[r6] = r2
            r2 = r0[r5]
            r3[r5] = r2
            r2 = r0[r8]
            r3[r8] = r2
            r2 = r0[r7]
            r3[r7] = r2
            r2 = r0[r9]
            r3[r9] = r2
            r2 = r0[r4]
            r3[r4] = r2
            r2 = 7
            r5 = r0[r2]
            r3[r2] = r5
        L60:
            r2 = r3
            goto Lb6
        L62:
            float[] r3 = new float[r4]
            r10 = r0[r2]
            r3[r2] = r10
            r2 = r0[r6]
            r3[r6] = r2
            r2 = r0[r5]
            r3[r5] = r2
            r2 = r0[r8]
            r3[r8] = r2
            r2 = r0[r7]
            r3[r7] = r2
            r2 = r0[r9]
            r3[r9] = r2
            goto L60
        L7d:
            float[] r3 = new float[r4]
            r10 = r0[r2]
            r3[r2] = r10
            r2 = r0[r6]
            r3[r6] = r2
            r2 = r0[r5]
            r3[r5] = r2
            r2 = r0[r8]
            r3[r8] = r2
            r2 = r0[r7]
            r3[r7] = r2
            r2 = r0[r9]
            r3[r9] = r2
            goto L60
        L98:
            float[] r3 = new float[r7]
            r7 = r0[r2]
            r3[r2] = r7
            r2 = r0[r6]
            r3[r6] = r2
            r2 = r0[r5]
            r3[r5] = r2
            r2 = r0[r8]
            r3[r8] = r2
            goto L60
        Lab:
            float[] r3 = new float[r5]
            r5 = r0[r2]
            r3[r2] = r5
            r2 = r0[r6]
            r3[r6] = r2
            goto L60
        Lb6:
            bkc r3 = new bkc
            bkc$a r5 = p000.bkc.EnumC1929a.Conic
            if (r1 != r5) goto Lbf
            r0 = r0[r4]
            goto Lc0
        Lbf:
            r0 = 0
        Lc0:
            r3.<init>(r1, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6544gu.next():bkc");
    }
}
