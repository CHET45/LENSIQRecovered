package p000;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class hsf {

    /* JADX INFO: renamed from: k */
    public static final int f44752k = -2;

    /* JADX INFO: renamed from: l */
    public static final int f44753l = -1;

    /* JADX INFO: renamed from: m */
    public static final int f44754m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f44755n = -16777217;

    /* JADX INFO: renamed from: o */
    public static final int f44756o = -13912576;

    /* JADX INFO: renamed from: p */
    public static final int f44757p = -16128;

    /* JADX INFO: renamed from: q */
    public static final int f44758q = -65536;

    /* JADX INFO: renamed from: r */
    public static final int f44759r = -1;

    /* JADX INFO: renamed from: s */
    public static WeakReference<Snackbar> f44760s;

    /* JADX INFO: renamed from: a */
    public View f44761a;

    /* JADX INFO: renamed from: b */
    public CharSequence f44762b;

    /* JADX INFO: renamed from: c */
    public int f44763c;

    /* JADX INFO: renamed from: d */
    public int f44764d;

    /* JADX INFO: renamed from: e */
    public int f44765e;

    /* JADX INFO: renamed from: f */
    public int f44766f;

    /* JADX INFO: renamed from: g */
    public CharSequence f44767g;

    /* JADX INFO: renamed from: h */
    public int f44768h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f44769i;

    /* JADX INFO: renamed from: j */
    public int f44770j;

    /* JADX INFO: renamed from: hsf$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6999a {
    }

    private hsf(View view) {
        setDefault();
        this.f44761a = view;
    }

    public static void addView(@uw8 int i, @efb ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            throw new NullPointerException("Argument 'params' of type ViewGroup.LayoutParams (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        View view = getView();
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
            ((Snackbar.SnackbarLayout) view).addView(LayoutInflater.from(view.getContext()).inflate(i, (ViewGroup) null), -1, layoutParams);
        }
    }

    public static void dismiss() {
        WeakReference<Snackbar> weakReference = f44760s;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f44760s.get().dismiss();
        f44760s = null;
    }

    private static ViewGroup findSuitableParentCopyFromSnackbar(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public static View getView() {
        Snackbar snackbar = f44760s.get();
        if (snackbar == null) {
            return null;
        }
        return snackbar.getView();
    }

    private void setDefault() {
        this.f44762b = "";
        this.f44763c = -16777217;
        this.f44764d = -16777217;
        this.f44765e = -1;
        this.f44766f = -1;
        this.f44767g = "";
        this.f44768h = -16777217;
        this.f44770j = 0;
    }

    public static hsf with(@efb View view) {
        if (view != null) {
            return new hsf(view);
        }
        throw new NullPointerException("Argument 'view' of type View (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public hsf setAction(@efb CharSequence charSequence, @efb View.OnClickListener onClickListener) {
        if (charSequence == null) {
            throw new NullPointerException("Argument 'text' of type CharSequence (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (onClickListener != null) {
            return setAction(charSequence, -16777217, onClickListener);
        }
        throw new NullPointerException("Argument 'listener' of type View.OnClickListener (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public hsf setBgColor(@g92 int i) {
        this.f44764d = i;
        return this;
    }

    public hsf setBgResource(@gq4 int i) {
        this.f44765e = i;
        return this;
    }

    public hsf setBottomMargin(@h78(from = 1) int i) {
        this.f44770j = i;
        return this;
    }

    public hsf setDuration(int i) {
        this.f44766f = i;
        return this;
    }

    public hsf setMessage(@efb CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Argument 'msg' of type CharSequence (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        this.f44762b = charSequence;
        return this;
    }

    public hsf setMessageColor(@g92 int i) {
        this.f44763c = i;
        return this;
    }

    public Snackbar show() {
        return show(false);
    }

    public void showError() {
        showError(false);
    }

    public void showSuccess() {
        showSuccess(false);
    }

    public void showWarning() {
        showWarning(false);
    }

    public Snackbar show(boolean z) {
        View view = this.f44761a;
        if (view == null) {
            return null;
        }
        if (z) {
            ViewGroup viewGroupFindSuitableParentCopyFromSnackbar = findSuitableParentCopyFromSnackbar(view);
            View viewFindViewWithTag = viewGroupFindSuitableParentCopyFromSnackbar.findViewWithTag("topSnackBarCoordinatorLayout");
            if (viewFindViewWithTag == null) {
                viewFindViewWithTag = new CoordinatorLayout(view.getContext());
                viewFindViewWithTag.setTag("topSnackBarCoordinatorLayout");
                viewFindViewWithTag.setRotation(180.0f);
                viewFindViewWithTag.setElevation(100.0f);
                viewGroupFindSuitableParentCopyFromSnackbar.addView(viewFindViewWithTag, -1, -1);
            }
            view = viewFindViewWithTag;
        }
        if (this.f44763c != -16777217) {
            SpannableString spannableString = new SpannableString(this.f44762b);
            spannableString.setSpan(new ForegroundColorSpan(this.f44763c), 0, spannableString.length(), 33);
            f44760s = new WeakReference<>(Snackbar.make(view, spannableString, this.f44766f));
        } else {
            f44760s = new WeakReference<>(Snackbar.make(view, this.f44762b, this.f44766f));
        }
        Snackbar snackbar = f44760s.get();
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
        if (z) {
            for (int i = 0; i < snackbarLayout.getChildCount(); i++) {
                snackbarLayout.getChildAt(i).setRotation(180.0f);
            }
        }
        int i2 = this.f44765e;
        if (i2 != -1) {
            snackbarLayout.setBackgroundResource(i2);
        } else {
            int i3 = this.f44764d;
            if (i3 != -16777217) {
                snackbarLayout.setBackgroundColor(i3);
            }
        }
        if (this.f44770j != 0) {
            ((ViewGroup.MarginLayoutParams) snackbarLayout.getLayoutParams()).bottomMargin = this.f44770j;
        }
        if (this.f44767g.length() > 0 && this.f44769i != null) {
            int i4 = this.f44768h;
            if (i4 != -16777217) {
                snackbar.setActionTextColor(i4);
            }
            snackbar.setAction(this.f44767g, this.f44769i);
        }
        snackbar.show();
        return snackbar;
    }

    public void showError(boolean z) {
        this.f44764d = -65536;
        this.f44763c = -1;
        this.f44768h = -1;
        show(z);
    }

    public void showSuccess(boolean z) {
        this.f44764d = f44756o;
        this.f44763c = -1;
        this.f44768h = -1;
        show(z);
    }

    public void showWarning(boolean z) {
        this.f44764d = f44757p;
        this.f44763c = -1;
        this.f44768h = -1;
        show(z);
    }

    public hsf setAction(@efb CharSequence charSequence, @g92 int i, @efb View.OnClickListener onClickListener) {
        if (charSequence == null) {
            throw new NullPointerException("Argument 'text' of type CharSequence (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (onClickListener != null) {
            this.f44767g = charSequence;
            this.f44768h = i;
            this.f44769i = onClickListener;
            return this;
        }
        throw new NullPointerException("Argument 'listener' of type View.OnClickListener (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void addView(@efb View view, @efb ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            throw new NullPointerException("Argument 'child' of type View (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (layoutParams != null) {
            View view2 = getView();
            if (view2 != null) {
                view2.setPadding(0, 0, 0, 0);
                ((Snackbar.SnackbarLayout) view2).addView(view, layoutParams);
                return;
            }
            return;
        }
        throw new NullPointerException("Argument 'params' of type ViewGroup.LayoutParams (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
