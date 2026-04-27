package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.C0392R;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class q4h {

    /* JADX INFO: renamed from: h */
    public static final String f73199h = "TooltipPopup";

    /* JADX INFO: renamed from: a */
    public final Context f73200a;

    /* JADX INFO: renamed from: b */
    public final View f73201b;

    /* JADX INFO: renamed from: c */
    public final TextView f73202c;

    /* JADX INFO: renamed from: d */
    public final WindowManager.LayoutParams f73203d;

    /* JADX INFO: renamed from: e */
    public final Rect f73204e;

    /* JADX INFO: renamed from: f */
    public final int[] f73205f;

    /* JADX INFO: renamed from: g */
    public final int[] f73206g;

    public q4h(@efb Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f73203d = layoutParams;
        this.f73204e = new Rect();
        this.f73205f = new int[2];
        this.f73206g = new int[2];
        this.f73200a = context;
        View viewInflate = LayoutInflater.from(context).inflate(C0392R.layout.abc_tooltip, (ViewGroup) null);
        this.f73201b = viewInflate;
        this.f73202c = (TextView) viewInflate.findViewById(C0392R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0392R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void computePosition(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f73200a.getResources().getDimensionPixelOffset(C0392R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f73200a.getResources().getDimensionPixelOffset(C0392R.dimen.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f73200a.getResources().getDimensionPixelOffset(z ? C0392R.dimen.tooltip_y_offset_touch : C0392R.dimen.tooltip_y_offset_non_touch);
        View appRootView = getAppRootView(view);
        if (appRootView == null) {
            Log.e(f73199h, "Cannot find app view");
            return;
        }
        appRootView.getWindowVisibleDisplayFrame(this.f73204e);
        Rect rect = this.f73204e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f73200a.getResources();
            int identifier = resources.getIdentifier(xig.f98117d, "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f73204e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        appRootView.getLocationOnScreen(this.f73206g);
        view.getLocationOnScreen(this.f73205f);
        int[] iArr = this.f73205f;
        int i4 = iArr[0];
        int[] iArr2 = this.f73206g;
        int i5 = i4 - iArr2[0];
        iArr[0] = i5;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i5 + i) - (appRootView.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f73201b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f73201b.getMeasuredHeight();
        int i6 = this.f73205f[1];
        int i7 = ((i3 + i6) - dimensionPixelOffset3) - measuredHeight;
        int i8 = i6 + height + dimensionPixelOffset3;
        if (z) {
            if (i7 >= 0) {
                layoutParams.y = i7;
                return;
            } else {
                layoutParams.y = i8;
                return;
            }
        }
        if (measuredHeight + i8 <= this.f73204e.height()) {
            layoutParams.y = i8;
        } else {
            layoutParams.y = i7;
        }
    }

    private static View getAppRootView(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: renamed from: a */
    public void m20067a() {
        if (m20068b()) {
            ((WindowManager) this.f73200a.getSystemService("window")).removeView(this.f73201b);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m20068b() {
        return this.f73201b.getParent() != null;
    }

    /* JADX INFO: renamed from: c */
    public void m20069c(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m20068b()) {
            m20067a();
        }
        this.f73202c.setText(charSequence);
        computePosition(view, i, i2, z, this.f73203d);
        ((WindowManager) this.f73200a.getSystemService("window")).addView(this.f73201b, this.f73203d);
    }
}
