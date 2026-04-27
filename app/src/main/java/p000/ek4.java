package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class ek4 implements mdd {
    @Override // p000.mdd
    public Object createFromBundle(Bundle bundle) {
        return Double.valueOf(bundle.getDouble(cf8.f16414c));
    }

    @Override // p000.mdd
    public boolean writeToBundle(Bundle bundle, Object obj) {
        if (!(obj instanceof Double)) {
            return false;
        }
        bundle.putDouble(cf8.f16414c, ((Double) obj).doubleValue());
        return true;
    }
}
