package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.C0392R;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9062m extends ViewGroup {

    /* JADX INFO: renamed from: F */
    public static final int f59477F = 200;

    /* JADX INFO: renamed from: C */
    public boolean f59478C;

    /* JADX INFO: renamed from: a */
    public final b f59479a;

    /* JADX INFO: renamed from: b */
    public final Context f59480b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f59481c;

    /* JADX INFO: renamed from: d */
    public ActionMenuPresenter f59482d;

    /* JADX INFO: renamed from: e */
    public int f59483e;

    /* JADX INFO: renamed from: f */
    public ebi f59484f;

    /* JADX INFO: renamed from: m */
    public boolean f59485m;

    /* JADX INFO: renamed from: m$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9062m.this.showOverflowMenu();
        }
    }

    /* JADX INFO: renamed from: m$b */
    public class b implements gbi {

        /* JADX INFO: renamed from: a */
        public boolean f59487a = false;

        /* JADX INFO: renamed from: b */
        public int f59488b;

        public b() {
        }

        @Override // p000.gbi
        public void onAnimationCancel(View view) {
            this.f59487a = true;
        }

        @Override // p000.gbi
        public void onAnimationEnd(View view) {
            if (this.f59487a) {
                return;
            }
            AbstractC9062m abstractC9062m = AbstractC9062m.this;
            abstractC9062m.f59484f = null;
            AbstractC9062m.super.setVisibility(this.f59488b);
        }

        @Override // p000.gbi
        public void onAnimationStart(View view) {
            AbstractC9062m.super.setVisibility(0);
            this.f59487a = false;
        }

        public b withFinalVisibility(ebi ebiVar, int i) {
            AbstractC9062m.this.f59484f = ebiVar;
            this.f59488b = i;
            return this;
        }
    }

    public AbstractC9062m(@efb Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    public static int m16523d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public void animateToVisibility(int i) {
        setupAnimatorToVisibility(i, 200L).start();
    }

    /* JADX INFO: renamed from: c */
    public int m16524c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.f59482d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    /* JADX INFO: renamed from: e */
    public int m16525e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return this.f59484f != null ? this.f59479a.f59488b : getVisibility();
    }

    public int getContentHeight() {
        return this.f59483e;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.f59482d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.hideOverflowMenu();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.f59482d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.isOverflowMenuShowPending();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.f59482d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.isOverflowMenuShowing();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        ActionMenuPresenter actionMenuPresenter = this.f59482d;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowReserved();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C0392R.styleable.ActionBar, C0392R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(C0392R.styleable.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f59482d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.onConfigurationChanged(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f59478C = false;
        }
        if (!this.f59478C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f59478C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f59478C = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f59485m = false;
        }
        if (!this.f59485m) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f59485m = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f59485m = false;
        }
        return true;
    }

    public void postShowOverflowMenu() {
        post(new a());
    }

    public void setContentHeight(int i) {
        this.f59483e = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ebi ebiVar = this.f59484f;
            if (ebiVar != null) {
                ebiVar.cancel();
            }
            super.setVisibility(i);
        }
    }

    public ebi setupAnimatorToVisibility(int i, long j) {
        ebi ebiVar = this.f59484f;
        if (ebiVar != null) {
            ebiVar.cancel();
        }
        if (i != 0) {
            ebi ebiVarAlpha = o8i.animate(this).alpha(0.0f);
            ebiVarAlpha.setDuration(j);
            ebiVarAlpha.setListener(this.f59479a.withFinalVisibility(ebiVarAlpha, i));
            return ebiVarAlpha;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ebi ebiVarAlpha2 = o8i.animate(this).alpha(1.0f);
        ebiVarAlpha2.setDuration(j);
        ebiVarAlpha2.setListener(this.f59479a.withFinalVisibility(ebiVarAlpha2, i));
        return ebiVarAlpha2;
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.f59482d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.showOverflowMenu();
        }
        return false;
    }

    public AbstractC9062m(@efb Context context, @hib AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC9062m(@efb Context context, @hib AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f59479a = new b();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C0392R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f59480b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f59480b = context;
        }
    }
}
