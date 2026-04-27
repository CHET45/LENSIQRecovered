package p000;

import androidx.compose.p002ui.C0695b;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class as8 extends C0695b {

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f11744e;

    /* JADX INFO: renamed from: f */
    @gib
    public final Object f11745f;

    /* JADX INFO: renamed from: m */
    @gib
    public final Object f11746m;

    public as8(@yfb String str, @gib Object obj, @gib Object obj2, @yfb qy6<? super f58, bth> qy6Var, @yfb kz6<? super InterfaceC0701e, ? super zl2, ? super Integer, ? extends InterfaceC0701e> kz6Var) {
        super(qy6Var, kz6Var);
        this.f11744e = str;
        this.f11745f = obj;
        this.f11746m = obj2;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof as8) {
            as8 as8Var = (as8) obj;
            if (md8.areEqual(this.f11744e, as8Var.f11744e) && md8.areEqual(this.f11745f, as8Var.f11745f) && md8.areEqual(this.f11746m, as8Var.f11746m)) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public final String getFqName() {
        return this.f11744e;
    }

    @gib
    public final Object getKey1() {
        return this.f11745f;
    }

    @gib
    public final Object getKey2() {
        return this.f11746m;
    }

    public int hashCode() {
        int iHashCode = this.f11744e.hashCode() * 31;
        Object obj = this.f11745f;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f11746m;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }
}
