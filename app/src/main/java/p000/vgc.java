package p000;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class vgc implements mdd {
    @Override // p000.mdd
    public Object createFromBundle(Bundle bundle) {
        return bundle.getParcelable(cf8.f16414c);
    }

    @Override // p000.mdd
    public boolean writeToBundle(Bundle bundle, Object obj) {
        if (!(obj instanceof Parcelable)) {
            return false;
        }
        bundle.putParcelable(cf8.f16414c, (Parcelable) obj);
        return true;
    }
}
