package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.C0392R;

/* JADX INFO: loaded from: classes.dex */
public class r20 extends PopupWindow {

    /* JADX INFO: renamed from: b */
    public static final boolean f76825b = false;

    /* JADX INFO: renamed from: a */
    public boolean f76826a;

    public r20(@efb Context context, @hib AttributeSet attributeSet, @gc0 int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        t2h t2hVarObtainStyledAttributes = t2h.obtainStyledAttributes(context, attributeSet, C0392R.styleable.PopupWindow, i, i2);
        if (t2hVarObtainStyledAttributes.hasValue(C0392R.styleable.PopupWindow_overlapAnchor)) {
            setSupportOverlapAnchor(t2hVarObtainStyledAttributes.getBoolean(C0392R.styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(t2hVarObtainStyledAttributes.getDrawable(C0392R.styleable.PopupWindow_android_popupBackground));
        t2hVarObtainStyledAttributes.recycle();
    }

    private void setSupportOverlapAnchor(boolean z) {
        if (f76825b) {
            this.f76826a = z;
        } else {
            z4d.setOverlapAnchor(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f76825b && this.f76826a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f76825b && this.f76826a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public r20(@efb Context context, @hib AttributeSet attributeSet, @gc0 int i, @dbg int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f76825b && this.f76826a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
