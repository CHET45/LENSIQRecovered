package p000;

import androidx.compose.p002ui.C0695b;
import androidx.compose.p002ui.InterfaceC0701e;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class cs8 extends C0695b {

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f27269e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final Object[] f27270f;

    public cs8(@yfb String str, @yfb Object[] objArr, @yfb qy6<? super f58, bth> qy6Var, @yfb kz6<? super InterfaceC0701e, ? super zl2, ? super Integer, ? extends InterfaceC0701e> kz6Var) {
        super(qy6Var, kz6Var);
        this.f27269e = str;
        this.f27270f = objArr;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof cs8) {
            cs8 cs8Var = (cs8) obj;
            if (md8.areEqual(this.f27269e, cs8Var.f27269e) && Arrays.equals(this.f27270f, cs8Var.f27270f)) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public final String getFqName() {
        return this.f27269e;
    }

    @yfb
    public final Object[] getKeys() {
        return this.f27270f;
    }

    public int hashCode() {
        return (this.f27269e.hashCode() * 31) + Arrays.hashCode(this.f27270f);
    }
}
