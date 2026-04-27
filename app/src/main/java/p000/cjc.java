package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.bkc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPathGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathGeometry.kt\nandroidx/compose/ui/graphics/PathGeometryKt\n+ 2 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n1#1,362:1\n562#2:363\n*S KotlinDebug\n*F\n+ 1 PathGeometry.kt\nandroidx/compose/ui/graphics/PathGeometryKt\n*L\n148#1:363\n*E\n"})
public final class cjc {

    /* JADX INFO: renamed from: cjc$a */
    public /* synthetic */ class C2333a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16713a;

        static {
            int[] iArr = new int[bkc.EnumC1929a.values().length];
            try {
                iArr[bkc.EnumC1929a.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bkc.EnumC1929a.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bkc.EnumC1929a.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bkc.EnumC1929a.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[bkc.EnumC1929a.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[bkc.EnumC1929a.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[bkc.EnumC1929a.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f16713a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.vic.EnumC14096c computeDirection(@p000.yfb p000.vic r28) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cjc.computeDirection(vic):vic$c");
    }

    @yfb
    public static final List<vic> divide(@yfb vic vicVar, @yfb List<vic> list) {
        vic vicVarPath = C8522ku.Path();
        ijc it = vicVar.iterator();
        float[] fArr = new float[8];
        bkc.EnumC1929a enumC1929aNext$default = ijc.next$default(it, fArr, 0, 2, null);
        boolean z = true;
        boolean z2 = true;
        while (enumC1929aNext$default != bkc.EnumC1929a.Done) {
            switch (C2333a.f16713a[enumC1929aNext$default.ordinal()]) {
                case 1:
                    if (!z2 && !z) {
                        list.add(vicVarPath);
                        vicVarPath = C8522ku.Path();
                    }
                    vicVarPath.moveTo(fArr[0], fArr[1]);
                    z2 = false;
                    z = true;
                    enumC1929aNext$default = ijc.next$default(it, fArr, 0, 2, null);
                    break;
                case 2:
                    vicVarPath.lineTo(fArr[2], fArr[3]);
                    z = false;
                    enumC1929aNext$default = ijc.next$default(it, fArr, 0, 2, null);
                    break;
                case 3:
                    vicVarPath.quadraticTo(fArr[2], fArr[3], fArr[4], fArr[5]);
                    z = false;
                    enumC1929aNext$default = ijc.next$default(it, fArr, 0, 2, null);
                    break;
                case 4:
                case 7:
                    break;
                case 5:
                    vicVarPath.cubicTo(fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7]);
                    z = false;
                    enumC1929aNext$default = ijc.next$default(it, fArr, 0, 2, null);
                    break;
                case 6:
                    vicVarPath.close();
                    enumC1929aNext$default = ijc.next$default(it, fArr, 0, 2, null);
                    break;
                default:
                    enumC1929aNext$default = ijc.next$default(it, fArr, 0, 2, null);
                    break;
            }
        }
        if (!z2 && !z) {
            list.add(vicVarPath);
        }
        return list;
    }

    public static /* synthetic */ List divide$default(vic vicVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return divide(vicVar, list);
    }

    private static final int floatCountForType(bkc.EnumC1929a enumC1929a) {
        switch (C2333a.f16713a[enumC1929a.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 6;
            case 4:
            case 5:
                return 8;
            case 6:
            case 7:
                return 0;
            default:
                throw new ceb();
        }
    }

    @yfb
    public static final vic reverse(@yfb vic vicVar, @yfb vic vicVar2) {
        int i;
        boolean z;
        float[] fArr;
        ijc it = vicVar.iterator();
        int iCalculateSize = it.calculateSize(false);
        ArrayList arrayList = new ArrayList(iCalculateSize);
        ArrayList arrayList2 = new ArrayList(iCalculateSize);
        float[] fArr2 = new float[8];
        for (bkc.EnumC1929a enumC1929aNext$default = ijc.next$default(it, fArr2, 0, 2, null); enumC1929aNext$default != bkc.EnumC1929a.Done; enumC1929aNext$default = ijc.next$default(it, fArr2, 0, 2, null)) {
            arrayList.add(enumC1929aNext$default);
            if (enumC1929aNext$default != bkc.EnumC1929a.Close) {
                float[] fArrCopyOf = Arrays.copyOf(fArr2, floatCountForType(enumC1929aNext$default));
                md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, newSize)");
                arrayList2.add(fArrCopyOf);
            }
        }
        int size = arrayList2.size();
        boolean z2 = false;
        boolean z3 = true;
        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
            if (z3) {
                int i2 = size - 1;
                fArr = (float[]) arrayList2.get(i2);
                int lastIndex = e80.getLastIndex(fArr);
                vicVar2.moveTo(fArr[lastIndex - 1], fArr[lastIndex]);
                i = i2;
                z = false;
            } else {
                i = size;
                z = z3;
                fArr = (float[]) arrayList2.get(size);
            }
            int i3 = C2333a.f16713a[((bkc.EnumC1929a) arrayList.get(size2)).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    vicVar2.lineTo(fArr[0], fArr[1]);
                } else if (i3 == 3) {
                    vicVar2.quadraticTo(fArr[2], fArr[3], fArr[0], fArr[1]);
                } else if (i3 != 5) {
                    if (i3 == 6) {
                        z2 = true;
                    }
                    size = i;
                    z3 = z;
                } else {
                    vicVar2.cubicTo(fArr[4], fArr[5], fArr[2], fArr[3], fArr[0], fArr[1]);
                }
                i--;
                size = i;
                z3 = z;
            } else {
                if (z2) {
                    vicVar2.close();
                    z2 = false;
                }
                z3 = true;
                size = i;
            }
        }
        if (z2) {
            vicVar2.close();
        }
        return vicVar2;
    }

    public static /* synthetic */ vic reverse$default(vic vicVar, vic vicVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            vicVar2 = C8522ku.Path();
        }
        return reverse(vicVar, vicVar2);
    }
}
