package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public interface ufg extends MenuItem {

    /* JADX INFO: renamed from: g */
    public static final int f87909g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f87910h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f87911i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f87912j = 4;

    /* JADX INFO: renamed from: k */
    public static final int f87913k = 8;

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @hib
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @hib
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @hib
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @hib
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @hib
    AbstractC14977x8 getSupportActionProvider();

    @Override // android.view.MenuItem
    @hib
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    boolean requiresActionButton();

    boolean requiresOverflow();

    @Override // android.view.MenuItem
    @efb
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    @efb
    MenuItem setActionView(@hib View view);

    @Override // android.view.MenuItem
    @efb
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    @efb
    ufg setContentDescription(@hib CharSequence charSequence);

    @Override // android.view.MenuItem
    @efb
    MenuItem setIconTintList(@hib ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @efb
    MenuItem setIconTintMode(@hib PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @efb
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    @efb
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    @efb
    MenuItem setShowAsActionFlags(int i);

    @efb
    ufg setSupportActionProvider(@hib AbstractC14977x8 abstractC14977x8);

    @Override // android.view.MenuItem
    @efb
    ufg setTooltipText(@hib CharSequence charSequence);
}
