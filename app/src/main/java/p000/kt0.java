package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public abstract class kt0 {

    /* JADX INFO: renamed from: a */
    @fkd
    public int f55270a;

    /* JADX INFO: renamed from: b */
    @fkd
    public int f55271b;

    /* JADX INFO: renamed from: c */
    @efb
    public int[] f55272c = new int[0];

    /* JADX INFO: renamed from: d */
    @g92
    public int f55273d;

    /* JADX INFO: renamed from: e */
    public int f55274e;

    /* JADX INFO: renamed from: f */
    public int f55275f;

    public kt0(@efb Context context, @hib AttributeSet attributeSet, @gc0 int i, @dbg int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C3146R.dimen.mtrl_progress_track_thickness);
        TypedArray typedArrayObtainStyledAttributes = zwg.obtainStyledAttributes(context, attributeSet, C3146R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.f55270a = a3a.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C3146R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f55271b = Math.min(a3a.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C3146R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.f55270a / 2);
        this.f55274e = typedArrayObtainStyledAttributes.getInt(C3146R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f55275f = typedArrayObtainStyledAttributes.getInt(C3146R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        loadIndicatorColors(context, typedArrayObtainStyledAttributes);
        loadTrackColor(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void loadIndicatorColors(@efb Context context, @efb TypedArray typedArray) {
        if (!typedArray.hasValue(C3146R.styleable.BaseProgressIndicator_indicatorColor)) {
            this.f55272c = new int[]{ow9.getColor(context, C3146R.attr.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(C3146R.styleable.BaseProgressIndicator_indicatorColor).type != 1) {
            this.f55272c = new int[]{typedArray.getColor(C3146R.styleable.BaseProgressIndicator_indicatorColor, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(C3146R.styleable.BaseProgressIndicator_indicatorColor, -1));
        this.f55272c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void loadTrackColor(@efb Context context, @efb TypedArray typedArray) {
        if (typedArray.hasValue(C3146R.styleable.BaseProgressIndicator_trackColor)) {
            this.f55273d = typedArray.getColor(C3146R.styleable.BaseProgressIndicator_trackColor, -1);
            return;
        }
        this.f55273d = this.f55272c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f55273d = ow9.compositeARGBWithAlpha(this.f55273d, (int) (f * 255.0f));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6309a();

    public boolean isHideAnimationEnabled() {
        return this.f55275f != 0;
    }

    public boolean isShowAnimationEnabled() {
        return this.f55274e != 0;
    }
}
