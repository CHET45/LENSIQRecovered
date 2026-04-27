package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class xa1 implements mdd {
    @Override // p000.mdd
    public Object createFromBundle(Bundle bundle) {
        return Boolean.valueOf(bundle.getBoolean(cf8.f16414c));
    }

    @Override // p000.mdd
    public boolean writeToBundle(Bundle bundle, Object obj) {
        if (!(obj instanceof Boolean)) {
            return false;
        }
        bundle.putBoolean(cf8.f16414c, ((Boolean) obj).booleanValue());
        return true;
    }
}
