package p000;

import androidx.recyclerview.widget.ItemTouchHelper;

/* JADX INFO: loaded from: classes7.dex */
public class gw3 extends ItemTouchHelper {

    /* JADX INFO: renamed from: a */
    public ng8 f41713a;

    public gw3() {
        this(new ng8());
    }

    public l3c getOnItemMoveListener() {
        return this.f41713a.getOnItemMoveListener();
    }

    public m3c getOnItemMovementListener() {
        return this.f41713a.getOnItemMovementListener();
    }

    public n3c getOnItemStateChangedListener() {
        return this.f41713a.getOnItemStateChangedListener();
    }

    public boolean isItemViewSwipeEnabled() {
        return this.f41713a.isItemViewSwipeEnabled();
    }

    public boolean isLongPressDragEnabled() {
        return this.f41713a.isLongPressDragEnabled();
    }

    public void setItemViewSwipeEnabled(boolean z) {
        this.f41713a.setItemViewSwipeEnabled(z);
    }

    public void setLongPressDragEnabled(boolean z) {
        this.f41713a.setLongPressDragEnabled(z);
    }

    public void setOnItemMoveListener(l3c l3cVar) {
        this.f41713a.setOnItemMoveListener(l3cVar);
    }

    public void setOnItemMovementListener(m3c m3cVar) {
        this.f41713a.setOnItemMovementListener(m3cVar);
    }

    public void setOnItemStateChangedListener(n3c n3cVar) {
        this.f41713a.setOnItemStateChangedListener(n3cVar);
    }

    private gw3(ng8 ng8Var) {
        super(ng8Var);
        this.f41713a = ng8Var;
    }
}
