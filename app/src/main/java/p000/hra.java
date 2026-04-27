package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000.AbstractC14977x8;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class hra extends gs0 implements MenuItem {

    /* JADX INFO: renamed from: q */
    public static final String f44628q = "MenuItemWrapper";

    /* JADX INFO: renamed from: o */
    public final ufg f44629o;

    /* JADX INFO: renamed from: p */
    public Method f44630p;

    /* JADX INFO: renamed from: hra$a */
    public class C6978a extends AbstractC14977x8 {

        /* JADX INFO: renamed from: e */
        public final ActionProvider f44631e;

        public C6978a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f44631e = actionProvider;
        }

        @Override // p000.AbstractC14977x8
        public boolean hasSubMenu() {
            return this.f44631e.hasSubMenu();
        }

        @Override // p000.AbstractC14977x8
        public View onCreateActionView() {
            return this.f44631e.onCreateActionView();
        }

        @Override // p000.AbstractC14977x8
        public boolean onPerformDefaultAction() {
            return this.f44631e.onPerformDefaultAction();
        }

        @Override // p000.AbstractC14977x8
        public void onPrepareSubMenu(SubMenu subMenu) {
            this.f44631e.onPrepareSubMenu(hra.this.m11826b(subMenu));
        }
    }

    /* JADX INFO: renamed from: hra$b */
    @c5e(16)
    public class ActionProviderVisibilityListenerC6979b extends C6978a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: g */
        public AbstractC14977x8.b f44633g;

        public ActionProviderVisibilityListenerC6979b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p000.AbstractC14977x8
        public boolean isVisible() {
            return this.f44631e.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC14977x8.b bVar = this.f44633g;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }

        @Override // p000.AbstractC14977x8
        public View onCreateActionView(MenuItem menuItem) {
            return this.f44631e.onCreateActionView(menuItem);
        }

        @Override // p000.AbstractC14977x8
        public boolean overridesItemVisibility() {
            return this.f44631e.overridesItemVisibility();
        }

        @Override // p000.AbstractC14977x8
        public void refreshVisibility() {
            this.f44631e.refreshVisibility();
        }

        @Override // p000.AbstractC14977x8
        public void setVisibilityListener(AbstractC14977x8.b bVar) {
            this.f44633g = bVar;
            this.f44631e.setVisibilityListener(bVar != null ? this : null);
        }
    }

    /* JADX INFO: renamed from: hra$c */
    public static class C6980c extends FrameLayout implements q72 {

        /* JADX INFO: renamed from: a */
        public final CollapsibleActionView f44635a;

        /* JADX WARN: Multi-variable type inference failed */
        public C6980c(View view) {
            super(view.getContext());
            this.f44635a = (CollapsibleActionView) view;
            addView(view);
        }

        /* JADX INFO: renamed from: a */
        public View m12580a() {
            return (View) this.f44635a;
        }

        @Override // p000.q72
        public void onActionViewCollapsed() {
            this.f44635a.onActionViewCollapsed();
        }

        @Override // p000.q72
        public void onActionViewExpanded() {
            this.f44635a.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: hra$d */
    public class MenuItemOnActionExpandListenerC6981d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnActionExpandListener f44636a;

        public MenuItemOnActionExpandListenerC6981d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f44636a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f44636a.onMenuItemActionCollapse(hra.this.m11825a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f44636a.onMenuItemActionExpand(hra.this.m11825a(menuItem));
        }
    }

    /* JADX INFO: renamed from: hra$e */
    public class MenuItemOnMenuItemClickListenerC6982e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnMenuItemClickListener f44638a;

        public MenuItemOnMenuItemClickListenerC6982e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f44638a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f44638a.onMenuItemClick(hra.this.m11825a(menuItem));
        }
    }

    public hra(Context context, ufg ufgVar) {
        super(context);
        if (ufgVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f44629o = ufgVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f44629o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f44629o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC14977x8 supportActionProvider = this.f44629o.getSupportActionProvider();
        if (supportActionProvider instanceof C6978a) {
            return ((C6978a) supportActionProvider).f44631e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f44629o.getActionView();
        return actionView instanceof C6980c ? ((C6980c) actionView).m12580a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f44629o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f44629o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f44629o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f44629o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f44629o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f44629o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f44629o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f44629o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f44629o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f44629o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f44629o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f44629o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f44629o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m11826b(this.f44629o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f44629o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f44629o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f44629o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f44629o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f44629o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f44629o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f44629o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f44629o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f44629o.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC6979b actionProviderVisibilityListenerC6979b = new ActionProviderVisibilityListenerC6979b(this.f40877l, actionProvider);
        ufg ufgVar = this.f44629o;
        if (actionProvider == null) {
            actionProviderVisibilityListenerC6979b = null;
        }
        ufgVar.setSupportActionProvider(actionProviderVisibilityListenerC6979b);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C6980c(view);
        }
        this.f44629o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f44629o.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f44629o.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f44629o.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f44629o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f44629o.setEnabled(z);
        return this;
    }

    public void setExclusiveCheckable(boolean z) {
        try {
            if (this.f44630p == null) {
                this.f44630p = this.f44629o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f44630p.invoke(this.f44629o, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w(f44628q, "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f44629o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f44629o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f44629o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f44629o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f44629o.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f44629o.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC6981d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f44629o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC6982e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f44629o.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f44629o.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f44629o.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f44629o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f44629o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f44629o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f44629o.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f44629o.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f44629o.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f44629o.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f44629o.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f44629o.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f44629o.setActionView(i);
        View actionView = this.f44629o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f44629o.setActionView(new C6980c(actionView));
        }
        return this;
    }
}
