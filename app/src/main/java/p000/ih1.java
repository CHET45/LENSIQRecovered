package p000;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.gh1;
import p000.kx7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ih1 {
    private ih1() {
    }

    public static HashMap<String, String> bundleToStringHashMap(Bundle bundle) {
        HashMap<String, String> map = new HashMap<>();
        if (bundle == Bundle.EMPTY) {
            return map;
        }
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            if (string != null) {
                map.put(str, string);
            }
        }
        return map;
    }

    public static ox7<String, String> bundleToStringImmutableMap(Bundle bundle) {
        return bundle == Bundle.EMPTY ? ox7.m19076of() : ox7.copyOf((Map) bundleToStringHashMap(bundle));
    }

    public static void ensureClassLoader(@hib Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) x0i.castNonNull(ih1.class.getClassLoader()));
        }
    }

    public static <T extends gh1> kx7<T> fromBundleList(gh1.InterfaceC6311a<T> interfaceC6311a, List<Bundle> list) {
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (int i = 0; i < list.size(); i++) {
            c8541aBuilder.add(interfaceC6311a.fromBundle((Bundle) u80.checkNotNull(list.get(i))));
        }
        return c8541aBuilder.build();
    }

    public static <T extends gh1> SparseArray<T> fromBundleSparseArray(gh1.InterfaceC6311a<T> interfaceC6311a, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            parcelableSparseArray.put(sparseArray.keyAt(i), interfaceC6311a.fromBundle(sparseArray.valueAt(i)));
        }
        return parcelableSparseArray;
    }

    public static Bundle getBundleWithDefault(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList<Integer> getIntegerArrayListWithDefault(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle stringMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T extends gh1> ArrayList<Bundle> toBundleArrayList(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    public static <T extends gh1> kx7<Bundle> toBundleList(List<T> list) {
        return toBundleList(list, new lz6() { // from class: hh1
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return ((gh1) obj).toBundle();
            }
        });
    }

    public static <T extends gh1> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i).toBundle());
        }
        return sparseArray2;
    }

    public static <T extends gh1> kx7<Bundle> toBundleList(List<T> list, lz6<T, Bundle> lz6Var) {
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (int i = 0; i < list.size(); i++) {
            c8541aBuilder.add(lz6Var.apply(list.get(i)));
        }
        return c8541aBuilder.build();
    }
}
