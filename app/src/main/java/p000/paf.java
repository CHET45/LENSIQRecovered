package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C3146R;
import p000.maf;

/* JADX INFO: loaded from: classes5.dex */
public abstract class paf<C extends maf> extends l20 {

    /* JADX INFO: renamed from: N */
    public static final int f70168N = C3146R.id.coordinator;

    /* JADX INFO: renamed from: Q */
    public static final int f70169Q = C3146R.id.touch_outside;

    /* JADX INFO: renamed from: C */
    @hib
    public FrameLayout f70170C;

    /* JADX INFO: renamed from: F */
    public boolean f70171F;

    /* JADX INFO: renamed from: H */
    public boolean f70172H;

    /* JADX INFO: renamed from: L */
    public boolean f70173L;

    /* JADX INFO: renamed from: M */
    public boolean f70174M;

    /* JADX INFO: renamed from: f */
    @hib
    public laf<C> f70175f;

    /* JADX INFO: renamed from: m */
    @hib
    public FrameLayout f70176m;

    /* JADX INFO: renamed from: paf$a */
    public class C10873a extends C5603f6 {
        public C10873a() {
        }

        @Override // p000.C5603f6
        public void onInitializeAccessibilityNodeInfo(View view, @efb C6730h7 c6730h7) {
            super.onInitializeAccessibilityNodeInfo(view, c6730h7);
            if (!paf.this.f70172H) {
                c6730h7.setDismissable(false);
            } else {
                c6730h7.addAction(1048576);
                c6730h7.setDismissable(true);
            }
        }

        @Override // p000.C5603f6
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                paf pafVar = paf.this;
                if (pafVar.f70172H) {
                    pafVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public paf(@efb Context context, @dbg int i, @gc0 int i2, @dbg int i3) {
        super(context, getThemeResId(context, i, i2, i3));
        this.f70172H = true;
        this.f70173L = true;
        supportRequestWindowFeature(1);
    }

    private void ensureContainerAndBehavior() {
        if (this.f70176m == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), mo3041g(), null);
            this.f70176m = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(mo3040f());
            this.f70170C = frameLayout2;
            laf<C> lafVarMo3039e = mo3039e(frameLayout2);
            this.f70175f = lafVarMo3039e;
            mo3038d(lafVarMo3039e);
        }
    }

    @efb
    private FrameLayout getContainer() {
        if (this.f70176m == null) {
            ensureContainerAndBehavior();
        }
        return this.f70176m;
    }

    @efb
    private FrameLayout getSheet() {
        if (this.f70170C == null) {
            ensureContainerAndBehavior();
        }
        return this.f70170C;
    }

    private static int getThemeResId(@efb Context context, @dbg int i, @gc0 int i2, @dbg int i3) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i2, typedValue, true) ? typedValue.resourceId : i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wrapInSheet$0(View view) {
        if (this.f70172H && isShowing() && shouldWindowCloseOnTouchOutside()) {
            cancel();
        }
    }

    private boolean shouldWindowCloseOnTouchOutside() {
        if (!this.f70174M) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f70173L = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f70174M = true;
        }
        return this.f70173L;
    }

    private View wrapInSheet(int i, @hib View view, @hib ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getContainer().findViewById(f70168N);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout sheet = getSheet();
        sheet.removeAllViews();
        if (layoutParams == null) {
            sheet.addView(view);
        } else {
            sheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(f70169Q).setOnClickListener(new View.OnClickListener() { // from class: oaf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f67007a.lambda$wrapInSheet$0(view2);
            }
        });
        o8i.setAccessibilityDelegate(getSheet(), new C10873a());
        return this.f70176m;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        laf<C> behavior = getBehavior();
        if (!this.f70171F || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo3038d(laf<C> lafVar);

    @efb
    /* JADX INFO: renamed from: e */
    public abstract laf<C> mo3039e(@efb FrameLayout frameLayout);

    @kr7
    /* JADX INFO: renamed from: f */
    public abstract int mo3040f();

    @uw8
    /* JADX INFO: renamed from: g */
    public abstract int mo3041g();

    @efb
    public laf<C> getBehavior() {
        if (this.f70175f == null) {
            ensureContainerAndBehavior();
        }
        return this.f70175f;
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo3042h();

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.f70171F;
    }

    @Override // p000.l20, p000.qj2, android.app.Dialog
    public void onCreate(@hib Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // p000.qj2, android.app.Dialog
    public void onStart() {
        super.onStart();
        laf<C> lafVar = this.f70175f;
        if (lafVar == null || lafVar.getState() != 5) {
            return;
        }
        this.f70175f.setState(mo3042h());
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f70172H != z) {
            this.f70172H = z;
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f70172H) {
            this.f70172H = true;
        }
        this.f70173L = z;
        this.f70174M = true;
    }

    @Override // p000.l20, p000.qj2, android.app.Dialog
    public void setContentView(@uw8 int i) {
        super.setContentView(wrapInSheet(i, null, null));
    }

    public void setDismissWithSheetAnimationEnabled(boolean z) {
        this.f70171F = z;
    }

    @Override // p000.l20, p000.qj2, android.app.Dialog
    public void setContentView(@hib View view) {
        super.setContentView(wrapInSheet(0, view, null));
    }

    @Override // p000.l20, p000.qj2, android.app.Dialog
    public void setContentView(@hib View view, @hib ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInSheet(0, view, layoutParams));
    }
}
