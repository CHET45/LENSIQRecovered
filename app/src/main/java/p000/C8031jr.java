package p000;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: jr */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,2769:1\n42#2,2:2770\n42#2,2:2772\n42#2,2:2774\n42#2,2:2776\n42#2,2:2778\n42#2,2:2780\n42#2,2:2782\n42#2,2:2784\n42#2,2:2786\n42#2,2:2788\n42#2,2:2790\n42#2,2:2792\n42#2,2:2794\n42#2,2:2796\n42#2,2:2798\n42#2,2:2800\n39#2:2802\n39#2:2803\n39#2:2804\n39#2:2805\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n2527#1:2770,2\n2528#1:2772,2\n2529#1:2774,2\n2530#1:2776,2\n2531#1:2778,2\n2532#1:2780,2\n2533#1:2782,2\n2534#1:2784,2\n2535#1:2786,2\n2536#1:2788,2\n2537#1:2790,2\n2538#1:2792,2\n2539#1:2794,2\n2540#1:2796,2\n2541#1:2798,2\n2542#1:2800,2\n2556#1:2802\n2557#1:2803\n2558#1:2804\n2559#1:2805\n*E\n"})
public final class C8031jr {

    /* JADX INFO: renamed from: a */
    @yfb
    public static qy6<? super wxc, ? extends wxc> f51535a = a.f51537a;

    /* JADX INFO: renamed from: b */
    public static final long f51536b = 8;

    /* JADX INFO: renamed from: jr$a */
    public static final class a extends tt8 implements qy6<wxc, wxc> {

        /* JADX INFO: renamed from: a */
        public static final a f51537a = new a();

        public a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final wxc invoke(@yfb wxc wxcVar) {
            return wxcVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        if (md8.areEqual(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m30564dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jv2 getContentCaptureSessionCompat(View view) {
        q8i.setImportantForContentCapture(view, 1);
        return q8i.getContentCaptureSession(view);
    }

    @yfb
    public static final qy6<wxc, wxc> getPlatformTextInputServiceInterceptor() {
        return f51535a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m30565preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM30564dotp89u6pk = m30564dotp89u6pk(fArr2, 0, fArr, 0);
        float fM30564dotp89u6pk2 = m30564dotp89u6pk(fArr2, 0, fArr, 1);
        float fM30564dotp89u6pk3 = m30564dotp89u6pk(fArr2, 0, fArr, 2);
        float fM30564dotp89u6pk4 = m30564dotp89u6pk(fArr2, 0, fArr, 3);
        float fM30564dotp89u6pk5 = m30564dotp89u6pk(fArr2, 1, fArr, 0);
        float fM30564dotp89u6pk6 = m30564dotp89u6pk(fArr2, 1, fArr, 1);
        float fM30564dotp89u6pk7 = m30564dotp89u6pk(fArr2, 1, fArr, 2);
        float fM30564dotp89u6pk8 = m30564dotp89u6pk(fArr2, 1, fArr, 3);
        float fM30564dotp89u6pk9 = m30564dotp89u6pk(fArr2, 2, fArr, 0);
        float fM30564dotp89u6pk10 = m30564dotp89u6pk(fArr2, 2, fArr, 1);
        float fM30564dotp89u6pk11 = m30564dotp89u6pk(fArr2, 2, fArr, 2);
        float fM30564dotp89u6pk12 = m30564dotp89u6pk(fArr2, 2, fArr, 3);
        float fM30564dotp89u6pk13 = m30564dotp89u6pk(fArr2, 3, fArr, 0);
        float fM30564dotp89u6pk14 = m30564dotp89u6pk(fArr2, 3, fArr, 1);
        float fM30564dotp89u6pk15 = m30564dotp89u6pk(fArr2, 3, fArr, 2);
        float fM30564dotp89u6pk16 = m30564dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM30564dotp89u6pk;
        fArr[1] = fM30564dotp89u6pk2;
        fArr[2] = fM30564dotp89u6pk3;
        fArr[3] = fM30564dotp89u6pk4;
        fArr[4] = fM30564dotp89u6pk5;
        fArr[5] = fM30564dotp89u6pk6;
        fArr[6] = fM30564dotp89u6pk7;
        fArr[7] = fM30564dotp89u6pk8;
        fArr[8] = fM30564dotp89u6pk9;
        fArr[9] = fM30564dotp89u6pk10;
        fArr[10] = fM30564dotp89u6pk11;
        fArr[11] = fM30564dotp89u6pk12;
        fArr[12] = fM30564dotp89u6pk13;
        fArr[13] = fM30564dotp89u6pk14;
        fArr[14] = fM30564dotp89u6pk15;
        fArr[15] = fM30564dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m30566preTranslatecG2Xzmc(float[] fArr, float f, float f2, float[] fArr2) {
        x3a.m33192resetimpl(fArr2);
        x3a.m33203translateimpl$default(fArr2, f, f2, 0.0f, 4, null);
        m30565preTransformJiSxe2E(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(@yfb qy6<? super wxc, ? extends wxc> qy6Var) {
        f51535a = qy6Var;
    }
}
