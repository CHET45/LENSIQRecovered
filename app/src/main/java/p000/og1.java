package p000;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.kx7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class og1 {
    private og1() {
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
            bundle.setClassLoader((ClassLoader) t0i.castNonNull(og1.class.getClassLoader()));
        }
    }

    public static <T> kx7<T> fromBundleList(lz6<Bundle, T> lz6Var, List<Bundle> list) {
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (int i = 0; i < list.size(); i++) {
            c8541aBuilder.add(lz6Var.apply((Bundle) v80.checkNotNull(list.get(i))));
        }
        return c8541aBuilder.build();
    }

    public static <T> SparseArray<T> fromBundleSparseArray(lz6<Bundle, T> lz6Var, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), lz6Var.apply(sparseArray.valueAt(i)));
        }
        return sparseArray2;
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

    public static <T> ArrayList<Bundle> toBundleArrayList(Collection<T> collection, lz6<T, Bundle> lz6Var) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(lz6Var.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> kx7<Bundle> toBundleList(List<T> list, lz6<T, Bundle> lz6Var) {
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (int i = 0; i < list.size(); i++) {
            c8541aBuilder.add(lz6Var.apply(list.get(i)));
        }
        return c8541aBuilder.build();
    }

    public static <T> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray, lz6<T, Bundle> lz6Var) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), lz6Var.apply(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }
}
