package p000;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class rgc {

    /* JADX INFO: renamed from: a */
    public static final String f78243a = "a";

    private rgc() {
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static <T extends c5i> T fromInputStream(InputStream inputStream) {
        return (T) new b5i(inputStream, null).m26575l();
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static <T extends c5i> T fromParcelable(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).getVersionedParcel();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @hib
    public static <T extends c5i> T getVersionedParcelable(@efb Bundle bundle, @efb String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(rgc.class.getClassLoader());
            return (T) fromParcelable(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @hib
    public static <T extends c5i> List<T> getVersionedParcelableList(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(rgc.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(fromParcelable((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void putVersionedParcelable(@efb Bundle bundle, @efb String str, @hib c5i c5iVar) {
        if (c5iVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", toParcelable(c5iVar));
        bundle.putParcelable(str, bundle2);
    }

    public static void putVersionedParcelableList(@efb Bundle bundle, @efb String str, @efb List<? extends c5i> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<? extends c5i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toParcelable(it.next()));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static void toOutputStream(c5i c5iVar, OutputStream outputStream) {
        b5i b5iVar = new b5i(null, outputStream);
        b5iVar.m26584v(c5iVar);
        b5iVar.closeField();
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static Parcelable toParcelable(c5i c5iVar) {
        return new ParcelImpl(c5iVar);
    }
}
