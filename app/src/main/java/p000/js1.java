package p000;

import android.content.Context;
import android.content.res.ColorStateList;

/* JADX INFO: loaded from: classes.dex */
public interface js1 {
    ColorStateList getBackgroundColor(is1 is1Var);

    float getElevation(is1 is1Var);

    float getMaxElevation(is1 is1Var);

    float getMinHeight(is1 is1Var);

    float getMinWidth(is1 is1Var);

    float getRadius(is1 is1Var);

    void initStatic();

    void initialize(is1 is1Var, Context context, ColorStateList colorStateList, float f, float f2, float f3);

    void onCompatPaddingChanged(is1 is1Var);

    void onPreventCornerOverlapChanged(is1 is1Var);

    void setBackgroundColor(is1 is1Var, @hib ColorStateList colorStateList);

    void setElevation(is1 is1Var, float f);

    void setMaxElevation(is1 is1Var, float f);

    void setRadius(is1 is1Var, float f);

    void updatePadding(is1 is1Var);
}
