package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes5.dex */
public class kc8 {

    /* JADX INFO: renamed from: a */
    public View f53583a;

    /* JADX INFO: renamed from: b */
    public b3a f53584b;

    /* JADX INFO: renamed from: c */
    public ScrollView f53585c;

    /* JADX INFO: renamed from: d */
    public final int[] f53586d = new int[2];

    /* JADX INFO: renamed from: e */
    public final int[] f53587e = new int[2];

    /* JADX INFO: renamed from: f */
    public final ViewTreeObserver.OnScrollChangedListener f53588f = new ViewTreeObserverOnScrollChangedListenerC8283a();

    /* JADX INFO: renamed from: kc8$a */
    public class ViewTreeObserverOnScrollChangedListenerC8283a implements ViewTreeObserver.OnScrollChangedListener {
        public ViewTreeObserverOnScrollChangedListenerC8283a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            kc8.this.updateInterpolationForScreenPosition();
        }
    }

    public kc8(View view, b3a b3aVar, ScrollView scrollView) {
        this.f53583a = view;
        this.f53584b = b3aVar;
        this.f53585c = scrollView;
    }

    public void setContainingScrollView(ScrollView scrollView) {
        this.f53585c = scrollView;
    }

    public void setMaterialShapeDrawable(b3a b3aVar) {
        this.f53584b = b3aVar;
    }

    public void startListeningForScrollChanges(@efb ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f53588f);
    }

    public void stopListeningForScrollChanges(@efb ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f53588f);
    }

    public void updateInterpolationForScreenPosition() {
        ScrollView scrollView = this.f53585c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() == 0) {
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
        this.f53585c.getLocationInWindow(this.f53586d);
        this.f53585c.getChildAt(0).getLocationInWindow(this.f53587e);
        int top = (this.f53583a.getTop() - this.f53586d[1]) + this.f53587e[1];
        int height = this.f53583a.getHeight();
        int height2 = this.f53585c.getHeight();
        if (top < 0) {
            this.f53584b.setInterpolation(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
            this.f53583a.invalidate();
            return;
        }
        if (top + height > height2) {
            this.f53584b.setInterpolation(Math.max(0.0f, Math.min(1.0f, 1.0f - ((r0 - height2) / height))));
            this.f53583a.invalidate();
        } else if (this.f53584b.getInterpolation() != 1.0f) {
            this.f53584b.setInterpolation(1.0f);
            this.f53583a.invalidate();
        }
    }
}
