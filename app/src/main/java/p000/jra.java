package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0443d;
import androidx.appcompat.view.menu.C0444e;
import androidx.appcompat.view.menu.C0447h;
import androidx.appcompat.view.menu.InterfaceC0449j;
import androidx.appcompat.view.menu.InterfaceC0450k;

/* JADX INFO: loaded from: classes.dex */
public abstract class jra implements qbf, InterfaceC0449j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f51606a;

    /* JADX INFO: renamed from: b */
    public static int m14257b(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14258c(C0444e c0444e) {
        int size = c0444e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0444e.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static C0443d m14259d(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0443d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0443d) listAdapter;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo1039a() {
        return true;
    }

    public abstract void addMenu(C0444e c0444e);

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public boolean collapseItemActionView(C0444e c0444e, C0447h c0447h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public boolean expandItemActionView(C0444e c0444e, C0447h c0447h) {
        return false;
    }

    public Rect getEpicenterBounds() {
        return this.f51606a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public InterfaceC0450k getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public void initForMenu(@efb Context context, @hib C0444e c0444e) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m14259d(listAdapter).f2670a.performItemAction((MenuItem) listAdapter.getItem(i), this, mo1039a() ? 0 : 4);
    }

    public abstract void setAnchorView(View view);

    public void setEpicenterBounds(Rect rect) {
        this.f51606a = rect;
    }

    public abstract void setForceShowIcon(boolean z);

    public abstract void setGravity(int i);

    public abstract void setHorizontalOffset(int i);

    public abstract void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener);

    public abstract void setShowTitle(boolean z);

    public abstract void setVerticalOffset(int i);
}
