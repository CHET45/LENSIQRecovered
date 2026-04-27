package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class d5c implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f28473a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f28474b;

    /* JADX INFO: renamed from: c */
    public final Runnable f28475c;

    private d5c(View view, Runnable runnable) {
        this.f28473a = view;
        this.f28474b = view.getViewTreeObserver();
        this.f28475c = runnable;
    }

    @efb
    public static d5c add(@efb View view, @efb Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        d5c d5cVar = new d5c(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(d5cVar);
        view.addOnAttachStateChangeListener(d5cVar);
        return d5cVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        removeListener();
        this.f28475c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@efb View view) {
        this.f28474b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@efb View view) {
        removeListener();
    }

    public void removeListener() {
        if (this.f28474b.isAlive()) {
            this.f28474b.removeOnPreDrawListener(this);
        } else {
            this.f28473a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f28473a.removeOnAttachStateChangeListener(this);
    }
}
