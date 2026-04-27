package p000;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.AbstractC1458q;

/* JADX INFO: loaded from: classes3.dex */
public class m02 extends ddi {

    /* JADX INFO: renamed from: d */
    public float f59518d = 3.0f;

    private static float distance(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    @Override // p000.lfh
    public long getStartDelay(ViewGroup viewGroup, AbstractC1458q abstractC1458q, sfh sfhVar, sfh sfhVar2) {
        int i;
        int iRound;
        int iCenterX;
        if (sfhVar == null && sfhVar2 == null) {
            return 0L;
        }
        if (sfhVar2 == null || getViewVisibility(sfhVar) == 0) {
            i = -1;
        } else {
            sfhVar = sfhVar2;
            i = 1;
        }
        int viewX = getViewX(sfhVar);
        int viewY = getViewY(sfhVar);
        Rect epicenter = abstractC1458q.getEpicenter();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iRound = epicenter.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int iRound2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fDistance = distance(viewX, viewY, iCenterX, iRound) / distance(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long duration = abstractC1458q.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i)) / this.f59518d) * fDistance);
    }

    public void setPropagationSpeed(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f59518d = f;
    }
}
