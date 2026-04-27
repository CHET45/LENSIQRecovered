package p000;

import androidx.compose.p002ui.C0695b;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class zr8 extends C0695b {

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f105825e;

    /* JADX INFO: renamed from: f */
    @gib
    public final Object f105826f;

    public zr8(@yfb String str, @gib Object obj, @yfb qy6<? super f58, bth> qy6Var, @yfb kz6<? super InterfaceC0701e, ? super zl2, ? super Integer, ? extends InterfaceC0701e> kz6Var) {
        super(qy6Var, kz6Var);
        this.f105825e = str;
        this.f105826f = obj;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof zr8) {
            zr8 zr8Var = (zr8) obj;
            if (md8.areEqual(this.f105825e, zr8Var.f105825e) && md8.areEqual(this.f105826f, zr8Var.f105826f)) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public final String getFqName() {
        return this.f105825e;
    }

    @gib
    public final Object getKey1() {
        return this.f105826f;
    }

    public int hashCode() {
        int iHashCode = this.f105825e.hashCode() * 31;
        Object obj = this.f105826f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
