package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@c5e(21)
public class fs1 implements js1 {
    private nbe getCardBackground(is1 is1Var) {
        return (nbe) is1Var.getCardBackground();
    }

    @Override // p000.js1
    public ColorStateList getBackgroundColor(is1 is1Var) {
        return getCardBackground(is1Var).getColor();
    }

    @Override // p000.js1
    public float getElevation(is1 is1Var) {
        return is1Var.getCardView().getElevation();
    }

    @Override // p000.js1
    public float getMaxElevation(is1 is1Var) {
        return getCardBackground(is1Var).m17835a();
    }

    @Override // p000.js1
    public float getMinHeight(is1 is1Var) {
        return getRadius(is1Var) * 2.0f;
    }

    @Override // p000.js1
    public float getMinWidth(is1 is1Var) {
        return getRadius(is1Var) * 2.0f;
    }

    @Override // p000.js1
    public float getRadius(is1 is1Var) {
        return getCardBackground(is1Var).getRadius();
    }

    @Override // p000.js1
    public void initStatic() {
    }

    @Override // p000.js1
    public void initialize(is1 is1Var, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        is1Var.setCardBackground(new nbe(colorStateList, f));
        View cardView = is1Var.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        setMaxElevation(is1Var, f3);
    }

    @Override // p000.js1
    public void onCompatPaddingChanged(is1 is1Var) {
        setMaxElevation(is1Var, getMaxElevation(is1Var));
    }

    @Override // p000.js1
    public void onPreventCornerOverlapChanged(is1 is1Var) {
        setMaxElevation(is1Var, getMaxElevation(is1Var));
    }

    @Override // p000.js1
    public void setBackgroundColor(is1 is1Var, @hib ColorStateList colorStateList) {
        getCardBackground(is1Var).setColor(colorStateList);
    }

    @Override // p000.js1
    public void setElevation(is1 is1Var, float f) {
        is1Var.getCardView().setElevation(f);
    }

    @Override // p000.js1
    public void setMaxElevation(is1 is1Var, float f) {
        getCardBackground(is1Var).m17836b(f, is1Var.getUseCompatPadding(), is1Var.getPreventCornerOverlap());
        updatePadding(is1Var);
    }

    @Override // p000.js1
    public void setRadius(is1 is1Var, float f) {
        getCardBackground(is1Var).m17837c(f);
    }

    @Override // p000.js1
    public void updatePadding(is1 is1Var) {
        if (!is1Var.getUseCompatPadding()) {
            is1Var.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float maxElevation = getMaxElevation(is1Var);
        float radius = getRadius(is1Var);
        int iCeil = (int) Math.ceil(obe.m18553a(maxElevation, radius, is1Var.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(obe.m18554b(maxElevation, radius, is1Var.getPreventCornerOverlap()));
        is1Var.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }
}
