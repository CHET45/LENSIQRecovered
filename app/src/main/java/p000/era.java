package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class era {

    /* JADX INFO: renamed from: a */
    public static final String f33885a = "MenuItemCompat";

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final int f33886b = 0;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final int f33887c = 1;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final int f33888d = 2;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final int f33889e = 4;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public static final int f33890f = 8;

    /* JADX INFO: renamed from: era$a */
    public class MenuItemOnActionExpandListenerC5448a implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5450c f33891a;

        public MenuItemOnActionExpandListenerC5448a(InterfaceC5450c interfaceC5450c) {
            this.f33891a = interfaceC5450c;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f33891a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f33891a.onMenuItemActionExpand(menuItem);
        }
    }

    /* JADX INFO: renamed from: era$b */
    @c5e(26)
    public static class C5449b {
        private C5449b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m10199a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static CharSequence m10200b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static ColorStateList m10201c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static PorterDuff.Mode m10202d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static int m10203e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static CharSequence m10204f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static MenuItem m10205g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        @ih4
        /* JADX INFO: renamed from: h */
        public static MenuItem m10206h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @ih4
        /* JADX INFO: renamed from: i */
        public static MenuItem m10207i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @ih4
        /* JADX INFO: renamed from: j */
        public static MenuItem m10208j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @ih4
        /* JADX INFO: renamed from: k */
        public static MenuItem m10209k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        @ih4
        /* JADX INFO: renamed from: l */
        public static MenuItem m10210l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        @ih4
        /* JADX INFO: renamed from: m */
        public static MenuItem m10211m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: era$c */
    @Deprecated
    public interface InterfaceC5450c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private era() {
    }

    @Deprecated
    public static boolean collapseActionView(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean expandActionView(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @hib
    public static AbstractC14977x8 getActionProvider(@efb MenuItem menuItem) {
        if (menuItem instanceof ufg) {
            return ((ufg) menuItem).getSupportActionProvider();
        }
        Log.w(f33885a, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    public static View getActionView(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int getAlphabeticModifiers(@efb MenuItem menuItem) {
        return menuItem instanceof ufg ? ((ufg) menuItem).getAlphabeticModifiers() : C5449b.m10199a(menuItem);
    }

    @hib
    public static CharSequence getContentDescription(@efb MenuItem menuItem) {
        return menuItem instanceof ufg ? ((ufg) menuItem).getContentDescription() : C5449b.m10200b(menuItem);
    }

    @hib
    public static ColorStateList getIconTintList(@efb MenuItem menuItem) {
        return menuItem instanceof ufg ? ((ufg) menuItem).getIconTintList() : C5449b.m10201c(menuItem);
    }

    @hib
    public static PorterDuff.Mode getIconTintMode(@efb MenuItem menuItem) {
        return menuItem instanceof ufg ? ((ufg) menuItem).getIconTintMode() : C5449b.m10202d(menuItem);
    }

    public static int getNumericModifiers(@efb MenuItem menuItem) {
        return menuItem instanceof ufg ? ((ufg) menuItem).getNumericModifiers() : C5449b.m10203e(menuItem);
    }

    @hib
    public static CharSequence getTooltipText(@efb MenuItem menuItem) {
        return menuItem instanceof ufg ? ((ufg) menuItem).getTooltipText() : C5449b.m10204f(menuItem);
    }

    @Deprecated
    public static boolean isActionViewExpanded(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @hib
    public static MenuItem setActionProvider(@efb MenuItem menuItem, @hib AbstractC14977x8 abstractC14977x8) {
        if (menuItem instanceof ufg) {
            return ((ufg) menuItem).setSupportActionProvider(abstractC14977x8);
        }
        Log.w(f33885a, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void setAlphabeticShortcut(@efb MenuItem menuItem, char c, int i) {
        if (menuItem instanceof ufg) {
            ((ufg) menuItem).setAlphabeticShortcut(c, i);
        } else {
            C5449b.m10205g(menuItem, c, i);
        }
    }

    public static void setContentDescription(@efb MenuItem menuItem, @hib CharSequence charSequence) {
        if (menuItem instanceof ufg) {
            ((ufg) menuItem).setContentDescription(charSequence);
        } else {
            C5449b.m10206h(menuItem, charSequence);
        }
    }

    public static void setIconTintList(@efb MenuItem menuItem, @hib ColorStateList colorStateList) {
        if (menuItem instanceof ufg) {
            ((ufg) menuItem).setIconTintList(colorStateList);
        } else {
            C5449b.m10207i(menuItem, colorStateList);
        }
    }

    public static void setIconTintMode(@efb MenuItem menuItem, @hib PorterDuff.Mode mode) {
        if (menuItem instanceof ufg) {
            ((ufg) menuItem).setIconTintMode(mode);
        } else {
            C5449b.m10208j(menuItem, mode);
        }
    }

    public static void setNumericShortcut(@efb MenuItem menuItem, char c, int i) {
        if (menuItem instanceof ufg) {
            ((ufg) menuItem).setNumericShortcut(c, i);
        } else {
            C5449b.m10209k(menuItem, c, i);
        }
    }

    @Deprecated
    public static MenuItem setOnActionExpandListener(MenuItem menuItem, InterfaceC5450c interfaceC5450c) {
        return menuItem.setOnActionExpandListener(new MenuItemOnActionExpandListenerC5448a(interfaceC5450c));
    }

    public static void setShortcut(@efb MenuItem menuItem, char c, char c2, int i, int i2) {
        if (menuItem instanceof ufg) {
            ((ufg) menuItem).setShortcut(c, c2, i, i2);
        } else {
            C5449b.m10210l(menuItem, c, c2, i, i2);
        }
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    public static void setTooltipText(@efb MenuItem menuItem, @hib CharSequence charSequence) {
        if (menuItem instanceof ufg) {
            ((ufg) menuItem).setTooltipText(charSequence);
        } else {
            C5449b.m10211m(menuItem, charSequence);
        }
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }
}
