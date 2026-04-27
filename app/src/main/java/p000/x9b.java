package p000;

import android.content.Context;
import android.view.View;
import com.google.android.material.C3146R;
import com.google.android.material.navigation.NavigationBarItemView;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class x9b extends NavigationBarItemView {
    public x9b(@efb Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @xc4
    public int getItemDefaultMarginResId() {
        return C3146R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @uw8
    public int getItemLayoutResId() {
        return C3146R.layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }
}
