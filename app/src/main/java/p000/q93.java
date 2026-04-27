package p000;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class q93 {

    /* JADX INFO: renamed from: a */
    public static final String f73678a = "c";

    /* JADX INFO: renamed from: b */
    public static final String f73679b = "d";

    public ba3 decode(long j, byte[] bArr, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i, i2);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new ba3(og1.fromBundleList(new w93(), (ArrayList) v80.checkNotNull(bundle.getParcelableArrayList("c"))), j, bundle.getLong("d"));
    }
}
