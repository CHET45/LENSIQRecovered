package p000;

import androidx.compose.p002ui.C0695b;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class bs8 extends C0695b {

    /* JADX INFO: renamed from: C */
    @gib
    public final Object f14650C;

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f14651e;

    /* JADX INFO: renamed from: f */
    @gib
    public final Object f14652f;

    /* JADX INFO: renamed from: m */
    @gib
    public final Object f14653m;

    public bs8(@yfb String str, @gib Object obj, @gib Object obj2, @gib Object obj3, @yfb qy6<? super f58, bth> qy6Var, @yfb kz6<? super InterfaceC0701e, ? super zl2, ? super Integer, ? extends InterfaceC0701e> kz6Var) {
        super(qy6Var, kz6Var);
        this.f14651e = str;
        this.f14652f = obj;
        this.f14653m = obj2;
        this.f14650C = obj3;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof bs8) {
            bs8 bs8Var = (bs8) obj;
            if (md8.areEqual(this.f14651e, bs8Var.f14651e) && md8.areEqual(this.f14652f, bs8Var.f14652f) && md8.areEqual(this.f14653m, bs8Var.f14653m) && md8.areEqual(this.f14650C, bs8Var.f14650C)) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public final String getFqName() {
        return this.f14651e;
    }

    @gib
    public final Object getKey1() {
        return this.f14652f;
    }

    @gib
    public final Object getKey2() {
        return this.f14653m;
    }

    @gib
    public final Object getKey3() {
        return this.f14650C;
    }

    public int hashCode() {
        int iHashCode = this.f14651e.hashCode() * 31;
        Object obj = this.f14652f;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f14653m;
        int iHashCode3 = (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.f14650C;
        return iHashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }
}
