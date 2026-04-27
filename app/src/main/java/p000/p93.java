package p000;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p93 {

    /* JADX INFO: renamed from: a */
    public static final String f70068a = "c";

    public kx7<o93> decode(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return ih1.fromBundleList(o93.f66834B2, (ArrayList) u80.checkNotNull(bundle.getParcelableArrayList("c")));
    }
}
