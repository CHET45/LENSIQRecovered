package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0444e;
import androidx.appcompat.view.menu.C0447h;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class u9b extends C0444e {

    /* JADX INFO: renamed from: Q */
    @efb
    public final Class<?> f87199Q;

    /* JADX INFO: renamed from: R */
    public final int f87200R;

    public u9b(@efb Context context, @efb Class<?> cls, int i) {
        super(context);
        this.f87199Q = cls;
        this.f87200R = i;
    }

    @Override // androidx.appcompat.view.menu.C0444e
    @efb
    /* JADX INFO: renamed from: a */
    public MenuItem mo1043a(int i, int i2, int i3, @efb CharSequence charSequence) {
        if (size() + 1 <= this.f87200R) {
            stopDispatchingItemsChanged();
            MenuItem menuItemMo1043a = super.mo1043a(i, i2, i3, charSequence);
            if (menuItemMo1043a instanceof C0447h) {
                ((C0447h) menuItemMo1043a).setExclusiveCheckable(true);
            }
            startDispatchingItemsChanged();
            return menuItemMo1043a;
        }
        String simpleName = this.f87199Q.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f87200R + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.C0444e, android.view.Menu
    @efb
    public SubMenu addSubMenu(int i, int i2, int i3, @efb CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f87199Q.getSimpleName() + " does not support submenus");
    }

    public int getMaxItemCount() {
        return this.f87200R;
    }
}
