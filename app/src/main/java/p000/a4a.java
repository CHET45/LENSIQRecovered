package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,441:1\n39#2:442\n39#2:443\n39#2:444\n39#2:445\n39#2:446\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n423#1:442\n424#1:443\n425#1:444\n426#1:445\n434#1:446\n*E\n"})
public final class a4a {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    public static final float m27188dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    /* JADX INFO: renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m27189isIdentity58bKbWc(@yfb float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                if (fArr[(i * 4) + i2] != (i == i2 ? 1.0f : 0.0f)) {
                    return false;
                }
                i2++;
            }
            i++;
        }
        return true;
    }
}
