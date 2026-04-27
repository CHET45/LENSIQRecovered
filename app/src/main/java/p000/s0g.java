package p000;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0444e;
import androidx.appcompat.view.menu.C0448i;
import androidx.appcompat.view.menu.SubMenuC0452m;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p000.AbstractC14467w8;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class s0g extends AbstractC14467w8 implements C0444e.a {

    /* JADX INFO: renamed from: C */
    public boolean f80345C;

    /* JADX INFO: renamed from: F */
    public C0444e f80346F;

    /* JADX INFO: renamed from: c */
    public Context f80347c;

    /* JADX INFO: renamed from: d */
    public ActionBarContextView f80348d;

    /* JADX INFO: renamed from: e */
    public AbstractC14467w8.a f80349e;

    /* JADX INFO: renamed from: f */
    public WeakReference<View> f80350f;

    /* JADX INFO: renamed from: m */
    public boolean f80351m;

    public s0g(Context context, ActionBarContextView actionBarContextView, AbstractC14467w8.a aVar, boolean z) {
        this.f80347c = context;
        this.f80348d = actionBarContextView;
        this.f80349e = aVar;
        C0444e defaultShowAsAction = new C0444e(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f80346F = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f80345C = z;
    }

    @Override // p000.AbstractC14467w8
    public void finish() {
        if (this.f80351m) {
            return;
        }
        this.f80351m = true;
        this.f80349e.onDestroyActionMode(this);
    }

    @Override // p000.AbstractC14467w8
    public View getCustomView() {
        WeakReference<View> weakReference = this.f80350f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC14467w8
    public Menu getMenu() {
        return this.f80346F;
    }

    @Override // p000.AbstractC14467w8
    public MenuInflater getMenuInflater() {
        return new tfg(this.f80348d.getContext());
    }

    @Override // p000.AbstractC14467w8
    public CharSequence getSubtitle() {
        return this.f80348d.getSubtitle();
    }

    @Override // p000.AbstractC14467w8
    public CharSequence getTitle() {
        return this.f80348d.getTitle();
    }

    @Override // p000.AbstractC14467w8
    public void invalidate() {
        this.f80349e.onPrepareActionMode(this, this.f80346F);
    }

    @Override // p000.AbstractC14467w8
    public boolean isTitleOptional() {
        return this.f80348d.isTitleOptional();
    }

    @Override // p000.AbstractC14467w8
    public boolean isUiFocusable() {
        return this.f80345C;
    }

    public void onCloseMenu(C0444e c0444e, boolean z) {
    }

    public void onCloseSubMenu(SubMenuC0452m subMenuC0452m) {
    }

    @Override // androidx.appcompat.view.menu.C0444e.a
    public boolean onMenuItemSelected(@efb C0444e c0444e, @efb MenuItem menuItem) {
        return this.f80349e.onActionItemClicked(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0444e.a
    public void onMenuModeChange(@efb C0444e c0444e) {
        invalidate();
        this.f80348d.showOverflowMenu();
    }

    public boolean onSubMenuSelected(SubMenuC0452m subMenuC0452m) {
        if (!subMenuC0452m.hasVisibleItems()) {
            return true;
        }
        new C0448i(this.f80348d.getContext(), subMenuC0452m).show();
        return true;
    }

    @Override // p000.AbstractC14467w8
    public void setCustomView(View view) {
        this.f80348d.setCustomView(view);
        this.f80350f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p000.AbstractC14467w8
    public void setSubtitle(CharSequence charSequence) {
        this.f80348d.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC14467w8
    public void setTitle(CharSequence charSequence) {
        this.f80348d.setTitle(charSequence);
    }

    @Override // p000.AbstractC14467w8
    public void setTitleOptionalHint(boolean z) {
        super.setTitleOptionalHint(z);
        this.f80348d.setTitleOptional(z);
    }

    @Override // p000.AbstractC14467w8
    public void setSubtitle(int i) {
        setSubtitle(this.f80347c.getString(i));
    }

    @Override // p000.AbstractC14467w8
    public void setTitle(int i) {
        setTitle(this.f80347c.getString(i));
    }
}
