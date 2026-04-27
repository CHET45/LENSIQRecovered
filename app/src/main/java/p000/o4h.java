package p000;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class o4h implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: L */
    public static final String f66456L = "TooltipCompatHandler";

    /* JADX INFO: renamed from: M */
    public static final long f66457M = 2500;

    /* JADX INFO: renamed from: N */
    public static final long f66458N = 15000;

    /* JADX INFO: renamed from: Q */
    public static final long f66459Q = 3000;

    /* JADX INFO: renamed from: X */
    public static o4h f66460X;

    /* JADX INFO: renamed from: Y */
    public static o4h f66461Y;

    /* JADX INFO: renamed from: C */
    public q4h f66462C;

    /* JADX INFO: renamed from: F */
    public boolean f66463F;

    /* JADX INFO: renamed from: H */
    public boolean f66464H;

    /* JADX INFO: renamed from: a */
    public final View f66465a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f66466b;

    /* JADX INFO: renamed from: c */
    public final int f66467c;

    /* JADX INFO: renamed from: d */
    public final Runnable f66468d = new Runnable() { // from class: m4h
        @Override // java.lang.Runnable
        public final void run() {
            this.f59893a.lambda$new$0();
        }
    };

    /* JADX INFO: renamed from: e */
    public final Runnable f66469e = new Runnable() { // from class: n4h
        @Override // java.lang.Runnable
        public final void run() {
            this.f63302a.m18347b();
        }
    };

    /* JADX INFO: renamed from: f */
    public int f66470f;

    /* JADX INFO: renamed from: m */
    public int f66471m;

    private o4h(View view, CharSequence charSequence) {
        this.f66465a = view;
        this.f66466b = charSequence;
        this.f66467c = x8i.getScaledHoverSlop(ViewConfiguration.get(view.getContext()));
        forceNextChangeSignificant();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void cancelPendingShow() {
        this.f66465a.removeCallbacks(this.f66468d);
    }

    private void forceNextChangeSignificant() {
        this.f66464H = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        m18348c(false);
    }

    private void scheduleShow() {
        this.f66465a.postDelayed(this.f66468d, ViewConfiguration.getLongPressTimeout());
    }

    private static void setPendingHandler(o4h o4hVar) {
        o4h o4hVar2 = f66460X;
        if (o4hVar2 != null) {
            o4hVar2.cancelPendingShow();
        }
        f66460X = o4hVar;
        if (o4hVar != null) {
            o4hVar.scheduleShow();
        }
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        o4h o4hVar = f66460X;
        if (o4hVar != null && o4hVar.f66465a == view) {
            setPendingHandler(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new o4h(view, charSequence);
            return;
        }
        o4h o4hVar2 = f66461Y;
        if (o4hVar2 != null && o4hVar2.f66465a == view) {
            o4hVar2.m18347b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean updateAnchorPos(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f66464H && Math.abs(x - this.f66470f) <= this.f66467c && Math.abs(y - this.f66471m) <= this.f66467c) {
            return false;
        }
        this.f66470f = x;
        this.f66471m = y;
        this.f66464H = false;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m18347b() {
        if (f66461Y == this) {
            f66461Y = null;
            q4h q4hVar = this.f66462C;
            if (q4hVar != null) {
                q4hVar.m20067a();
                this.f66462C = null;
                forceNextChangeSignificant();
                this.f66465a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(f66456L, "sActiveHandler.mPopup == null");
            }
        }
        if (f66460X == this) {
            setPendingHandler(null);
        }
        this.f66465a.removeCallbacks(this.f66469e);
    }

    /* JADX INFO: renamed from: c */
    public void m18348c(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (o8i.isAttachedToWindow(this.f66465a)) {
            setPendingHandler(null);
            o4h o4hVar = f66461Y;
            if (o4hVar != null) {
                o4hVar.m18347b();
            }
            f66461Y = this;
            this.f66463F = z;
            q4h q4hVar = new q4h(this.f66465a.getContext());
            this.f66462C = q4hVar;
            q4hVar.m20069c(this.f66465a, this.f66470f, this.f66471m, this.f66463F, this.f66466b);
            this.f66465a.addOnAttachStateChangeListener(this);
            if (this.f66463F) {
                j2 = f66457M;
            } else {
                if ((o8i.getWindowSystemUiVisibility(this.f66465a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.f66465a.removeCallbacks(this.f66469e);
            this.f66465a.postDelayed(this.f66469e, j2);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f66462C != null && this.f66463F) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f66465a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                forceNextChangeSignificant();
                m18347b();
            }
        } else if (this.f66465a.isEnabled() && this.f66462C == null && updateAnchorPos(motionEvent)) {
            setPendingHandler(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f66470f = view.getWidth() / 2;
        this.f66471m = view.getHeight() / 2;
        m18348c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m18347b();
    }
}
