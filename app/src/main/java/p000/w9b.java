package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0444e;
import androidx.appcompat.view.menu.C0447h;
import androidx.appcompat.view.menu.InterfaceC0449j;
import androidx.appcompat.view.menu.InterfaceC0450k;
import androidx.appcompat.view.menu.SubMenuC0452m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.C3146R;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
import p000.C6730h7;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class w9b implements InterfaceC0449j {

    /* JADX INFO: renamed from: j2 */
    public static final int f93701j2 = 0;

    /* JADX INFO: renamed from: k2 */
    public static final String f93702k2 = "android:menu:list";

    /* JADX INFO: renamed from: l2 */
    public static final String f93703l2 = "android:menu:adapter";

    /* JADX INFO: renamed from: m2 */
    public static final String f93704m2 = "android:menu:header";

    /* JADX INFO: renamed from: F */
    @hib
    public ColorStateList f93706F;

    /* JADX INFO: renamed from: L */
    public ColorStateList f93708L;

    /* JADX INFO: renamed from: M */
    public ColorStateList f93709M;

    /* JADX INFO: renamed from: M1 */
    public int f93710M1;

    /* JADX INFO: renamed from: N */
    public Drawable f93711N;

    /* JADX INFO: renamed from: Q */
    public RippleDrawable f93712Q;

    /* JADX INFO: renamed from: V1 */
    @fkd
    public int f93713V1;

    /* JADX INFO: renamed from: X */
    public int f93714X;

    /* JADX INFO: renamed from: Y */
    @fkd
    public int f93715Y;

    /* JADX INFO: renamed from: Z */
    public int f93716Z;

    /* JADX INFO: renamed from: Z1 */
    @fkd
    public int f93717Z1;

    /* JADX INFO: renamed from: a */
    public NavigationMenuView f93718a;

    /* JADX INFO: renamed from: a2 */
    @fkd
    public int f93719a2;

    /* JADX INFO: renamed from: b */
    public LinearLayout f93720b;

    /* JADX INFO: renamed from: b2 */
    @fkd
    public int f93721b2;

    /* JADX INFO: renamed from: c */
    public InterfaceC0449j.a f93722c;

    /* JADX INFO: renamed from: c2 */
    public boolean f93723c2;

    /* JADX INFO: renamed from: d */
    public C0444e f93724d;

    /* JADX INFO: renamed from: e */
    public int f93726e;

    /* JADX INFO: renamed from: e2 */
    public int f93727e2;

    /* JADX INFO: renamed from: f */
    public C14508c f93728f;

    /* JADX INFO: renamed from: f2 */
    public int f93729f2;

    /* JADX INFO: renamed from: g2 */
    public int f93730g2;

    /* JADX INFO: renamed from: m */
    public LayoutInflater f93733m;

    /* JADX INFO: renamed from: C */
    public int f93705C = 0;

    /* JADX INFO: renamed from: H */
    public int f93707H = 0;

    /* JADX INFO: renamed from: d2 */
    public boolean f93725d2 = true;

    /* JADX INFO: renamed from: h2 */
    public int f93731h2 = -1;

    /* JADX INFO: renamed from: i2 */
    public final View.OnClickListener f93732i2 = new ViewOnClickListenerC14506a();

    /* JADX INFO: renamed from: w9b$a */
    public class ViewOnClickListenerC14506a implements View.OnClickListener {
        public ViewOnClickListenerC14506a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            w9b.this.setUpdateSuspended(true);
            C0447h itemData = ((NavigationMenuItemView) view).getItemData();
            w9b w9bVar = w9b.this;
            boolean zPerformItemAction = w9bVar.f93724d.performItemAction(itemData, w9bVar, 0);
            if (itemData != null && itemData.isCheckable() && zPerformItemAction) {
                w9b.this.f93728f.setCheckedItem(itemData);
            } else {
                z = false;
            }
            w9b.this.setUpdateSuspended(false);
            if (z) {
                w9b.this.updateMenuView(false);
            }
        }
    }

    /* JADX INFO: renamed from: w9b$b */
    public static class C14507b extends AbstractC14517l {
        public C14507b(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: w9b$c */
    public class C14508c extends RecyclerView.Adapter<AbstractC14517l> {

        /* JADX INFO: renamed from: e */
        public static final String f93735e = "android:menu:checked";

        /* JADX INFO: renamed from: f */
        public static final String f93736f = "android:menu:action_views";

        /* JADX INFO: renamed from: g */
        public static final int f93737g = 0;

        /* JADX INFO: renamed from: h */
        public static final int f93738h = 1;

        /* JADX INFO: renamed from: i */
        public static final int f93739i = 2;

        /* JADX INFO: renamed from: j */
        public static final int f93740j = 3;

        /* JADX INFO: renamed from: a */
        public final ArrayList<InterfaceC14510e> f93741a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public C0447h f93742b;

        /* JADX INFO: renamed from: c */
        public boolean f93743c;

        /* JADX INFO: renamed from: w9b$c$a */
        public class a extends C5603f6 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f93745a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f93746b;

            public a(int i, boolean z) {
                this.f93745a = i;
                this.f93746b = z;
            }

            @Override // p000.C5603f6
            public void onInitializeAccessibilityNodeInfo(@efb View view, @efb C6730h7 c6730h7) {
                super.onInitializeAccessibilityNodeInfo(view, c6730h7);
                c6730h7.setCollectionItemInfo(C6730h7.g.obtain(C14508c.this.adjustItemPositionForA11yDelegate(this.f93745a), 1, 1, 1, this.f93746b, view.isSelected()));
            }
        }

        public C14508c() {
            prepareMenuItems();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int adjustItemPositionForA11yDelegate(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (w9b.this.f93728f.getItemViewType(i3) == 2) {
                    i2--;
                }
            }
            return w9b.this.f93720b.getChildCount() == 0 ? i2 - 1 : i2;
        }

        private void appendTransparentIconIfMissing(int i, int i2) {
            while (i < i2) {
                ((C14512g) this.f93741a.get(i)).f93751b = true;
                i++;
            }
        }

        private void prepareMenuItems() {
            if (this.f93743c) {
                return;
            }
            boolean z = true;
            this.f93743c = true;
            this.f93741a.clear();
            this.f93741a.add(new C14509d());
            int size = w9b.this.f93724d.getVisibleItems().size();
            int i = -1;
            int i2 = 0;
            boolean z2 = false;
            int size2 = 0;
            while (i2 < size) {
                C0447h c0447h = w9b.this.f93724d.getVisibleItems().get(i2);
                if (c0447h.isChecked()) {
                    setCheckedItem(c0447h);
                }
                if (c0447h.isCheckable()) {
                    c0447h.setExclusiveCheckable(false);
                }
                if (c0447h.hasSubMenu()) {
                    SubMenu subMenu = c0447h.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.f93741a.add(new C14511f(w9b.this.f93730g2, 0));
                        }
                        this.f93741a.add(new C14512g(c0447h));
                        int size3 = this.f93741a.size();
                        int size4 = subMenu.size();
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 < size4) {
                            C0447h c0447h2 = (C0447h) subMenu.getItem(i3);
                            if (c0447h2.isVisible()) {
                                if (!z3 && c0447h2.getIcon() != null) {
                                    z3 = z;
                                }
                                if (c0447h2.isCheckable()) {
                                    c0447h2.setExclusiveCheckable(false);
                                }
                                if (c0447h.isChecked()) {
                                    setCheckedItem(c0447h);
                                }
                                this.f93741a.add(new C14512g(c0447h2));
                            }
                            i3++;
                            z = true;
                        }
                        if (z3) {
                            appendTransparentIconIfMissing(size3, this.f93741a.size());
                        }
                    }
                } else {
                    int groupId = c0447h.getGroupId();
                    if (groupId != i) {
                        size2 = this.f93741a.size();
                        z2 = c0447h.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            ArrayList<InterfaceC14510e> arrayList = this.f93741a;
                            int i4 = w9b.this.f93730g2;
                            arrayList.add(new C14511f(i4, i4));
                        }
                    } else if (!z2 && c0447h.getIcon() != null) {
                        appendTransparentIconIfMissing(size2, this.f93741a.size());
                        z2 = true;
                    }
                    C14512g c14512g = new C14512g(c0447h);
                    c14512g.f93751b = z2;
                    this.f93741a.add(c14512g);
                    i = groupId;
                }
                i2++;
                z = true;
            }
            this.f93743c = false;
        }

        private void setAccessibilityDelegate(View view, int i, boolean z) {
            o8i.setAccessibilityDelegate(view, new a(i, z));
        }

        /* JADX INFO: renamed from: b */
        public int m24442b() {
            int i = w9b.this.f93720b.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < w9b.this.f93728f.getItemCount(); i2++) {
                int itemViewType = w9b.this.f93728f.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            return i;
        }

        @efb
        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            C0447h c0447h = this.f93742b;
            if (c0447h != null) {
                bundle.putInt(f93735e, c0447h.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f93741a.size();
            for (int i = 0; i < size; i++) {
                InterfaceC14510e interfaceC14510e = this.f93741a.get(i);
                if (interfaceC14510e instanceof C14512g) {
                    C0447h menuItem = ((C14512g) interfaceC14510e).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(f93736f, sparseArray);
            return bundle;
        }

        public C0447h getCheckedItem() {
            return this.f93742b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f93741a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            InterfaceC14510e interfaceC14510e = this.f93741a.get(i);
            if (interfaceC14510e instanceof C14511f) {
                return 2;
            }
            if (interfaceC14510e instanceof C14509d) {
                return 3;
            }
            if (interfaceC14510e instanceof C14512g) {
                return ((C14512g) interfaceC14510e).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public void restoreInstanceState(@efb Bundle bundle) {
            C0447h menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C0447h menuItem2;
            int i = bundle.getInt(f93735e, 0);
            if (i != 0) {
                this.f93743c = true;
                int size = this.f93741a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    InterfaceC14510e interfaceC14510e = this.f93741a.get(i2);
                    if ((interfaceC14510e instanceof C14512g) && (menuItem2 = ((C14512g) interfaceC14510e).getMenuItem()) != null && menuItem2.getItemId() == i) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                    i2++;
                }
                this.f93743c = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f93736f);
            if (sparseParcelableArray != null) {
                int size2 = this.f93741a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    InterfaceC14510e interfaceC14510e2 = this.f93741a.get(i3);
                    if ((interfaceC14510e2 instanceof C14512g) && (menuItem = ((C14512g) interfaceC14510e2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(@efb C0447h c0447h) {
            if (this.f93742b == c0447h || !c0447h.isCheckable()) {
                return;
            }
            C0447h c0447h2 = this.f93742b;
            if (c0447h2 != null) {
                c0447h2.setChecked(false);
            }
            this.f93742b = c0447h;
            c0447h.setChecked(true);
        }

        public void setUpdateSuspended(boolean z) {
            this.f93743c = z;
        }

        public void update() {
            prepareMenuItems();
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@efb AbstractC14517l abstractC14517l, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType == 2) {
                        C14511f c14511f = (C14511f) this.f93741a.get(i);
                        abstractC14517l.itemView.setPadding(w9b.this.f93713V1, c14511f.getPaddingTop(), w9b.this.f93717Z1, c14511f.getPaddingBottom());
                        return;
                    } else {
                        if (itemViewType != 3) {
                            return;
                        }
                        setAccessibilityDelegate(abstractC14517l.itemView, i, true);
                        return;
                    }
                }
                TextView textView = (TextView) abstractC14517l.itemView;
                textView.setText(((C14512g) this.f93741a.get(i)).getMenuItem().getTitle());
                int i2 = w9b.this.f93705C;
                if (i2 != 0) {
                    pwg.setTextAppearance(textView, i2);
                }
                textView.setPadding(w9b.this.f93719a2, textView.getPaddingTop(), w9b.this.f93721b2, textView.getPaddingBottom());
                ColorStateList colorStateList = w9b.this.f93706F;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                setAccessibilityDelegate(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC14517l.itemView;
            navigationMenuItemView.setIconTintList(w9b.this.f93709M);
            int i3 = w9b.this.f93707H;
            if (i3 != 0) {
                navigationMenuItemView.setTextAppearance(i3);
            }
            ColorStateList colorStateList2 = w9b.this.f93708L;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = w9b.this.f93711N;
            o8i.setBackground(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = w9b.this.f93712Q;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            C14512g c14512g = (C14512g) this.f93741a.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(c14512g.f93751b);
            w9b w9bVar = w9b.this;
            int i4 = w9bVar.f93714X;
            int i5 = w9bVar.f93715Y;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(w9b.this.f93716Z);
            w9b w9bVar2 = w9b.this;
            if (w9bVar2.f93723c2) {
                navigationMenuItemView.setIconSize(w9bVar2.f93710M1);
            }
            navigationMenuItemView.setMaxLines(w9b.this.f93727e2);
            navigationMenuItemView.initialize(c14512g.getMenuItem(), 0);
            setAccessibilityDelegate(navigationMenuItemView, i, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @hib
        public AbstractC14517l onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                w9b w9bVar = w9b.this;
                return new C14514i(w9bVar.f93733m, viewGroup, w9bVar.f93732i2);
            }
            if (i == 1) {
                return new C14516k(w9b.this.f93733m, viewGroup);
            }
            if (i == 2) {
                return new C14515j(w9b.this.f93733m, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new C14507b(w9b.this.f93720b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(AbstractC14517l abstractC14517l) {
            if (abstractC14517l instanceof C14514i) {
                ((NavigationMenuItemView) abstractC14517l.itemView).recycle();
            }
        }
    }

    /* JADX INFO: renamed from: w9b$d */
    public static class C14509d implements InterfaceC14510e {
    }

    /* JADX INFO: renamed from: w9b$e */
    public interface InterfaceC14510e {
    }

    /* JADX INFO: renamed from: w9b$f */
    public static class C14511f implements InterfaceC14510e {

        /* JADX INFO: renamed from: a */
        public final int f93748a;

        /* JADX INFO: renamed from: b */
        public final int f93749b;

        public C14511f(int i, int i2) {
            this.f93748a = i;
            this.f93749b = i2;
        }

        public int getPaddingBottom() {
            return this.f93749b;
        }

        public int getPaddingTop() {
            return this.f93748a;
        }
    }

    /* JADX INFO: renamed from: w9b$g */
    public static class C14512g implements InterfaceC14510e {

        /* JADX INFO: renamed from: a */
        public final C0447h f93750a;

        /* JADX INFO: renamed from: b */
        public boolean f93751b;

        public C14512g(C0447h c0447h) {
            this.f93750a = c0447h;
        }

        public C0447h getMenuItem() {
            return this.f93750a;
        }
    }

    /* JADX INFO: renamed from: w9b$h */
    public class C14513h extends RecyclerViewAccessibilityDelegate {
        public C14513h(@efb RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, p000.C5603f6
        public void onInitializeAccessibilityNodeInfo(View view, @efb C6730h7 c6730h7) {
            super.onInitializeAccessibilityNodeInfo(view, c6730h7);
            c6730h7.setCollectionInfo(C6730h7.f.obtain(w9b.this.f93728f.m24442b(), 1, false));
        }
    }

    /* JADX INFO: renamed from: w9b$i */
    public static class C14514i extends AbstractC14517l {
        public C14514i(@efb LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C3146R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: renamed from: w9b$j */
    public static class C14515j extends AbstractC14517l {
        public C14515j(@efb LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C3146R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: w9b$k */
    public static class C14516k extends AbstractC14517l {
        public C14516k(@efb LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C3146R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: w9b$l */
    public static abstract class AbstractC14517l extends RecyclerView.ViewHolder {
        public AbstractC14517l(View view) {
            super(view);
        }
    }

    private void updateTopPadding() {
        int i = (this.f93720b.getChildCount() == 0 && this.f93725d2) ? this.f93729f2 : 0;
        NavigationMenuView navigationMenuView = this.f93718a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    public void addHeaderView(@efb View view) {
        this.f93720b.addView(view);
        NavigationMenuView navigationMenuView = this.f93718a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public boolean collapseItemActionView(C0444e c0444e, C0447h c0447h) {
        return false;
    }

    public void dispatchApplyWindowInsets(@efb smi smiVar) {
        int systemWindowInsetTop = smiVar.getSystemWindowInsetTop();
        if (this.f93729f2 != systemWindowInsetTop) {
            this.f93729f2 = systemWindowInsetTop;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.f93718a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, smiVar.getSystemWindowInsetBottom());
        o8i.dispatchApplyWindowInsets(this.f93720b, smiVar);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public boolean expandItemActionView(C0444e c0444e, C0447h c0447h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public boolean flagActionItems() {
        return false;
    }

    @hib
    public C0447h getCheckedItem() {
        return this.f93728f.getCheckedItem();
    }

    @fkd
    public int getDividerInsetEnd() {
        return this.f93717Z1;
    }

    @fkd
    public int getDividerInsetStart() {
        return this.f93713V1;
    }

    public int getHeaderCount() {
        return this.f93720b.getChildCount();
    }

    public View getHeaderView(int i) {
        return this.f93720b.getChildAt(i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public int getId() {
        return this.f93726e;
    }

    @hib
    public Drawable getItemBackground() {
        return this.f93711N;
    }

    public int getItemHorizontalPadding() {
        return this.f93714X;
    }

    public int getItemIconPadding() {
        return this.f93716Z;
    }

    public int getItemMaxLines() {
        return this.f93727e2;
    }

    @hib
    public ColorStateList getItemTextColor() {
        return this.f93708L;
    }

    @hib
    public ColorStateList getItemTintList() {
        return this.f93709M;
    }

    @fkd
    public int getItemVerticalPadding() {
        return this.f93715Y;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public InterfaceC0450k getMenuView(ViewGroup viewGroup) {
        if (this.f93718a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f93733m.inflate(C3146R.layout.design_navigation_menu, viewGroup, false);
            this.f93718a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C14513h(this.f93718a));
            if (this.f93728f == null) {
                this.f93728f = new C14508c();
            }
            int i = this.f93731h2;
            if (i != -1) {
                this.f93718a.setOverScrollMode(i);
            }
            this.f93720b = (LinearLayout) this.f93733m.inflate(C3146R.layout.design_navigation_item_header, (ViewGroup) this.f93718a, false);
            this.f93718a.setAdapter(this.f93728f);
        }
        return this.f93718a;
    }

    @fkd
    public int getSubheaderInsetEnd() {
        return this.f93721b2;
    }

    @fkd
    public int getSubheaderInsetStart() {
        return this.f93719a2;
    }

    public View inflateHeaderView(@uw8 int i) {
        View viewInflate = this.f93733m.inflate(i, (ViewGroup) this.f93720b, false);
        addHeaderView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public void initForMenu(@efb Context context, @efb C0444e c0444e) {
        this.f93733m = LayoutInflater.from(context);
        this.f93724d = c0444e;
        this.f93730g2 = context.getResources().getDimensionPixelOffset(C3146R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.f93725d2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public void onCloseMenu(C0444e c0444e, boolean z) {
        InterfaceC0449j.a aVar = this.f93722c;
        if (aVar != null) {
            aVar.onCloseMenu(c0444e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f93718a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(f93703l2);
            if (bundle2 != null) {
                this.f93728f.restoreInstanceState(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(f93704m2);
            if (sparseParcelableArray2 != null) {
                this.f93720b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    @efb
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f93718a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f93718a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C14508c c14508c = this.f93728f;
        if (c14508c != null) {
            bundle.putBundle(f93703l2, c14508c.createInstanceState());
        }
        if (this.f93720b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f93720b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(f93704m2, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public boolean onSubMenuSelected(SubMenuC0452m subMenuC0452m) {
        return false;
    }

    public void removeHeaderView(@efb View view) {
        this.f93720b.removeView(view);
        if (this.f93720b.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f93718a;
            navigationMenuView.setPadding(0, this.f93729f2, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void setBehindStatusBar(boolean z) {
        if (this.f93725d2 != z) {
            this.f93725d2 = z;
            updateTopPadding();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public void setCallback(InterfaceC0449j.a aVar) {
        this.f93722c = aVar;
    }

    public void setCheckedItem(@efb C0447h c0447h) {
        this.f93728f.setCheckedItem(c0447h);
    }

    public void setDividerInsetEnd(@fkd int i) {
        this.f93717Z1 = i;
        updateMenuView(false);
    }

    public void setDividerInsetStart(@fkd int i) {
        this.f93713V1 = i;
        updateMenuView(false);
    }

    public void setId(int i) {
        this.f93726e = i;
    }

    public void setItemBackground(@hib Drawable drawable) {
        this.f93711N = drawable;
        updateMenuView(false);
    }

    public void setItemForeground(@hib RippleDrawable rippleDrawable) {
        this.f93712Q = rippleDrawable;
        updateMenuView(false);
    }

    public void setItemHorizontalPadding(int i) {
        this.f93714X = i;
        updateMenuView(false);
    }

    public void setItemIconPadding(int i) {
        this.f93716Z = i;
        updateMenuView(false);
    }

    public void setItemIconSize(@yc4 int i) {
        if (this.f93710M1 != i) {
            this.f93710M1 = i;
            this.f93723c2 = true;
            updateMenuView(false);
        }
    }

    public void setItemIconTintList(@hib ColorStateList colorStateList) {
        this.f93709M = colorStateList;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i) {
        this.f93727e2 = i;
        updateMenuView(false);
    }

    public void setItemTextAppearance(@dbg int i) {
        this.f93707H = i;
        updateMenuView(false);
    }

    public void setItemTextColor(@hib ColorStateList colorStateList) {
        this.f93708L = colorStateList;
        updateMenuView(false);
    }

    public void setItemVerticalPadding(@fkd int i) {
        this.f93715Y = i;
        updateMenuView(false);
    }

    public void setOverScrollMode(int i) {
        this.f93731h2 = i;
        NavigationMenuView navigationMenuView = this.f93718a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    public void setSubheaderColor(@hib ColorStateList colorStateList) {
        this.f93706F = colorStateList;
        updateMenuView(false);
    }

    public void setSubheaderInsetEnd(@fkd int i) {
        this.f93721b2 = i;
        updateMenuView(false);
    }

    public void setSubheaderInsetStart(@fkd int i) {
        this.f93719a2 = i;
        updateMenuView(false);
    }

    public void setSubheaderTextAppearance(@dbg int i) {
        this.f93705C = i;
        updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z) {
        C14508c c14508c = this.f93728f;
        if (c14508c != null) {
            c14508c.setUpdateSuspended(z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0449j
    public void updateMenuView(boolean z) {
        C14508c c14508c = this.f93728f;
        if (c14508c != null) {
            c14508c.update();
        }
    }
}
