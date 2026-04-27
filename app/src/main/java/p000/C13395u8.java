package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000.p7e;

/* JADX INFO: renamed from: u8 */
/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class C13395u8 implements ufg {

    /* JADX INFO: renamed from: F */
    public static final int f87004F = 1;

    /* JADX INFO: renamed from: G */
    public static final int f87005G = 2;

    /* JADX INFO: renamed from: H */
    public static final int f87006H = 4;

    /* JADX INFO: renamed from: I */
    public static final int f87007I = 8;

    /* JADX INFO: renamed from: J */
    public static final int f87008J = 16;

    /* JADX INFO: renamed from: l */
    public final int f87014l;

    /* JADX INFO: renamed from: m */
    public final int f87015m;

    /* JADX INFO: renamed from: n */
    public final int f87016n;

    /* JADX INFO: renamed from: o */
    public CharSequence f87017o;

    /* JADX INFO: renamed from: p */
    public CharSequence f87018p;

    /* JADX INFO: renamed from: q */
    public Intent f87019q;

    /* JADX INFO: renamed from: r */
    public char f87020r;

    /* JADX INFO: renamed from: t */
    public char f87022t;

    /* JADX INFO: renamed from: v */
    public Drawable f87024v;

    /* JADX INFO: renamed from: w */
    public Context f87025w;

    /* JADX INFO: renamed from: x */
    public MenuItem.OnMenuItemClickListener f87026x;

    /* JADX INFO: renamed from: y */
    public CharSequence f87027y;

    /* JADX INFO: renamed from: z */
    public CharSequence f87028z;

    /* JADX INFO: renamed from: s */
    public int f87021s = 4096;

    /* JADX INFO: renamed from: u */
    public int f87023u = 4096;

    /* JADX INFO: renamed from: A */
    public ColorStateList f87009A = null;

    /* JADX INFO: renamed from: B */
    public PorterDuff.Mode f87010B = null;

    /* JADX INFO: renamed from: C */
    public boolean f87011C = false;

    /* JADX INFO: renamed from: D */
    public boolean f87012D = false;

    /* JADX INFO: renamed from: E */
    public int f87013E = 16;

    public C13395u8(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f87025w = context;
        this.f87014l = i2;
        this.f87015m = i;
        this.f87016n = i4;
        this.f87017o = charSequence;
    }

    private void applyIconTint() {
        Drawable drawable = this.f87024v;
        if (drawable != null) {
            if (this.f87011C || this.f87012D) {
                Drawable drawableWrap = yp4.wrap(drawable);
                this.f87024v = drawableWrap;
                Drawable drawableMutate = drawableWrap.mutate();
                this.f87024v = drawableMutate;
                if (this.f87011C) {
                    yp4.setTintList(drawableMutate, this.f87009A);
                }
                if (this.f87012D) {
                    yp4.setTintMode(this.f87024v, this.f87010B);
                }
            }
        }
    }

    @Override // p000.ufg, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p000.ufg, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ufg, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p000.ufg, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f87023u;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f87022t;
    }

    @Override // p000.ufg, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f87027y;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f87015m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f87024v;
    }

    @Override // p000.ufg, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f87009A;
    }

    @Override // p000.ufg, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f87010B;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f87019q;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f87014l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.ufg, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f87021s;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f87020r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f87016n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // p000.ufg
    public AbstractC14977x8 getSupportActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f87017o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f87018p;
        return charSequence != null ? charSequence : this.f87017o;
    }

    @Override // p000.ufg, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f87028z;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public boolean invoke() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f87026x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f87019q;
        if (intent == null) {
            return false;
        }
        this.f87025w.startActivity(intent);
        return true;
    }

    @Override // p000.ufg, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f87013E & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f87013E & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f87013E & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f87013E & 8) == 0;
    }

    @Override // p000.ufg
    public boolean requiresActionButton() {
        return true;
    }

    @Override // p000.ufg
    public boolean requiresOverflow() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f87022t = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f87013E = (z ? 1 : 0) | (this.f87013E & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f87013E = (z ? 2 : 0) | (this.f87013E & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f87013E = (z ? 16 : 0) | (this.f87013E & (-17));
        return this;
    }

    public C13395u8 setExclusiveCheckable(boolean z) {
        this.f87013E = (z ? 4 : 0) | (this.f87013E & (-5));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f87024v = drawable;
        applyIconTint();
        return this;
    }

    @Override // p000.ufg, android.view.MenuItem
    @efb
    public MenuItem setIconTintList(@hib ColorStateList colorStateList) {
        this.f87009A = colorStateList;
        this.f87011C = true;
        applyIconTint();
        return this;
    }

    @Override // p000.ufg, android.view.MenuItem
    @efb
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f87010B = mode;
        this.f87012D = true;
        applyIconTint();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f87019q = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f87020r = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f87026x = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f87020r = c;
        this.f87022t = Character.toLowerCase(c2);
        return this;
    }

    @Override // p000.ufg, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // p000.ufg
    @efb
    public ufg setSupportActionProvider(AbstractC14977x8 abstractC14977x8) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f87017o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f87018p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f87013E = (this.f87013E & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p000.ufg, android.view.MenuItem
    @efb
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f87022t = Character.toLowerCase(c);
        this.f87023u = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // p000.ufg, android.view.MenuItem
    @efb
    public ufg setContentDescription(CharSequence charSequence) {
        this.f87027y = charSequence;
        return this;
    }

    @Override // p000.ufg, android.view.MenuItem
    @efb
    public MenuItem setNumericShortcut(char c, int i) {
        this.f87020r = c;
        this.f87021s = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // p000.ufg, android.view.MenuItem
    @efb
    public ufg setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f87017o = this.f87025w.getResources().getString(i);
        return this;
    }

    @Override // p000.ufg, android.view.MenuItem
    @efb
    public ufg setTooltipText(CharSequence charSequence) {
        this.f87028z = charSequence;
        return this;
    }

    @Override // p000.ufg, android.view.MenuItem
    @efb
    public ufg setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f87024v = lx2.getDrawable(this.f87025w, i);
        applyIconTint();
        return this;
    }

    @Override // p000.ufg, android.view.MenuItem
    @efb
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f87020r = c;
        this.f87021s = KeyEvent.normalizeMetaState(i);
        this.f87022t = Character.toLowerCase(c2);
        this.f87023u = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p000.ufg, android.view.MenuItem
    @efb
    public ufg setActionView(int i) {
        throw new UnsupportedOperationException();
    }
}
