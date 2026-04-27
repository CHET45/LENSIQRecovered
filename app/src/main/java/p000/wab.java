package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class wab {

    /* JADX INFO: renamed from: a */
    public int f93818a;

    /* JADX INFO: renamed from: b */
    public int f93819b;

    public wab(@efb ViewGroup viewGroup) {
    }

    public int getNestedScrollAxes() {
        return this.f93818a | this.f93819b;
    }

    public void onNestedScrollAccepted(@efb View view, @efb View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    public void onStopNestedScroll(@efb View view) {
        onStopNestedScroll(view, 0);
    }

    public void onNestedScrollAccepted(@efb View view, @efb View view2, int i, int i2) {
        if (i2 == 1) {
            this.f93819b = i;
        } else {
            this.f93818a = i;
        }
    }

    public void onStopNestedScroll(@efb View view, int i) {
        if (i == 1) {
            this.f93819b = 0;
        } else {
            this.f93818a = 0;
        }
    }
}
