package p000;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class s93 {
    public byte[] encode(List<o93> list) {
        ArrayList<Bundle> bundleArrayList = ih1.toBundleArrayList(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", bundleArrayList);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
