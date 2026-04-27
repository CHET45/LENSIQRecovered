package p000;

import android.view.View;
import androidx.transition.AbstractC1442a0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ddi extends lfh {

    /* JADX INFO: renamed from: a */
    public static final String f29451a = "android:visibilityPropagation:visibility";

    /* JADX INFO: renamed from: b */
    public static final String f29452b = "android:visibilityPropagation:center";

    /* JADX INFO: renamed from: c */
    public static final String[] f29453c = {f29451a, f29452b};

    private static int getViewCoordinate(sfh sfhVar, int i) {
        int[] iArr;
        if (sfhVar == null || (iArr = (int[]) sfhVar.f81692a.get(f29452b)) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // p000.lfh
    public void captureValues(sfh sfhVar) {
        View view = sfhVar.f81693b;
        Integer numValueOf = (Integer) sfhVar.f81692a.get(AbstractC1442a0.f10795D2);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        sfhVar.f81692a.put(f29451a, numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        sfhVar.f81692a.put(f29452b, iArr);
    }

    @Override // p000.lfh
    public String[] getPropagationProperties() {
        return f29453c;
    }

    public int getViewVisibility(sfh sfhVar) {
        Integer num;
        if (sfhVar == null || (num = (Integer) sfhVar.f81692a.get(f29451a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int getViewX(sfh sfhVar) {
        return getViewCoordinate(sfhVar, 0);
    }

    public int getViewY(sfh sfhVar) {
        return getViewCoordinate(sfhVar, 1);
    }
}
