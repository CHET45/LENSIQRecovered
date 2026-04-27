package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public abstract class gs0 {

    /* JADX INFO: renamed from: l */
    public final Context f40877l;

    /* JADX INFO: renamed from: m */
    public scf<ufg, MenuItem> f40878m;

    /* JADX INFO: renamed from: n */
    public scf<cgg, SubMenu> f40879n;

    public gs0(Context context) {
        this.f40877l = context;
    }

    /* JADX INFO: renamed from: a */
    public final MenuItem m11825a(MenuItem menuItem) {
        if (!(menuItem instanceof ufg)) {
            return menuItem;
        }
        ufg ufgVar = (ufg) menuItem;
        if (this.f40878m == null) {
            this.f40878m = new scf<>();
        }
        MenuItem menuItem2 = this.f40878m.get(ufgVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        hra hraVar = new hra(this.f40877l, ufgVar);
        this.f40878m.put(ufgVar, hraVar);
        return hraVar;
    }

    /* JADX INFO: renamed from: b */
    public final SubMenu m11826b(SubMenu subMenu) {
        if (!(subMenu instanceof cgg)) {
            return subMenu;
        }
        cgg cggVar = (cgg) subMenu;
        if (this.f40879n == null) {
            this.f40879n = new scf<>();
        }
        SubMenu subMenu2 = this.f40879n.get(cggVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        ecg ecgVar = new ecg(this.f40877l, cggVar);
        this.f40879n.put(cggVar, ecgVar);
        return ecgVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m11827c() {
        scf<ufg, MenuItem> scfVar = this.f40878m;
        if (scfVar != null) {
            scfVar.clear();
        }
        scf<cgg, SubMenu> scfVar2 = this.f40879n;
        if (scfVar2 != null) {
            scfVar2.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11828d(int i) {
        if (this.f40878m == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f40878m.size()) {
            if (this.f40878m.keyAt(i2).getGroupId() == i) {
                this.f40878m.removeAt(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11829e(int i) {
        if (this.f40878m == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f40878m.size(); i2++) {
            if (this.f40878m.keyAt(i2).getItemId() == i) {
                this.f40878m.removeAt(i2);
                return;
            }
        }
    }
}
