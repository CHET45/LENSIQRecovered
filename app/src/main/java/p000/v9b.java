package p000;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0444e;
import androidx.appcompat.view.menu.C0447h;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class v9b extends C0444e {
    public v9b(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0444e, android.view.Menu
    @efb
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0447h c0447h = (C0447h) mo1043a(i, i2, i3, charSequence);
        z9b z9bVar = new z9b(getContext(), this, c0447h);
        c0447h.setSubMenu(z9bVar);
        return z9bVar;
    }
}
