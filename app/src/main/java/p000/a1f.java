package p000;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class a1f implements mdd {
    @Override // p000.mdd
    public Object createFromBundle(Bundle bundle) {
        return bundle.getSerializable(cf8.f16414c);
    }

    @Override // p000.mdd
    public boolean writeToBundle(Bundle bundle, Object obj) {
        if (!(obj instanceof Serializable)) {
            return false;
        }
        bundle.putSerializable(cf8.f16414c, (Serializable) obj);
        return true;
    }
}
