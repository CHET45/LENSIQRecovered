package p000;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class t93 {
    public byte[] encode(List<n93> list, long j) {
        ArrayList<Bundle> bundleArrayList = og1.toBundleArrayList(list, new lz6() { // from class: r93
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return ((n93) obj).toSerializableBundle();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", bundleArrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
