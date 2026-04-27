package p000;

import android.content.Context;
import androidx.appcompat.view.menu.C0444e;
import androidx.appcompat.view.menu.C0447h;
import androidx.appcompat.view.menu.SubMenuC0452m;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class z9b extends SubMenuC0452m {
    public z9b(Context context, v9b v9bVar, C0447h c0447h) {
        super(context, v9bVar, c0447h);
    }

    @Override // androidx.appcompat.view.menu.C0444e
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((C0444e) getParentMenu()).onItemsChanged(z);
    }
}
