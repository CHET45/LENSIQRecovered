package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class xf5 {

    /* JADX INFO: renamed from: a */
    @efb
    public final View f97617a;

    /* JADX INFO: renamed from: b */
    public boolean f97618b = false;

    /* JADX INFO: renamed from: c */
    @kr7
    public int f97619c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public xf5(wf5 wf5Var) {
        this.f97617a = (View) wf5Var;
    }

    private void dispatchExpandedStateChanged() {
        ViewParent parent = this.f97617a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.f97617a);
        }
    }

    @kr7
    public int getExpandedComponentIdHint() {
        return this.f97619c;
    }

    public boolean isExpanded() {
        return this.f97618b;
    }

    public void onRestoreInstanceState(@efb Bundle bundle) {
        this.f97618b = bundle.getBoolean("expanded", false);
        this.f97619c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f97618b) {
            dispatchExpandedStateChanged();
        }
    }

    @efb
    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f97618b);
        bundle.putInt("expandedComponentIdHint", this.f97619c);
        return bundle;
    }

    public boolean setExpanded(boolean z) {
        if (this.f97618b == z) {
            return false;
        }
        this.f97618b = z;
        dispatchExpandedStateChanged();
        return true;
    }

    public void setExpandedComponentIdHint(@kr7 int i) {
        this.f97619c = i;
    }
}
