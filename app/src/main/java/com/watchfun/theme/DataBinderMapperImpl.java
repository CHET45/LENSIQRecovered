package com.watchfun.theme;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000.jf3;
import p000.y8i;

/* JADX INFO: loaded from: classes6.dex */
public class DataBinderMapperImpl extends jf3 {

    /* JADX INFO: renamed from: a */
    public static final SparseIntArray f25250a = new SparseIntArray(0);

    /* JADX INFO: renamed from: com.watchfun.theme.DataBinderMapperImpl$a */
    public static class C4029a {

        /* JADX INFO: renamed from: a */
        public static final SparseArray<String> f25251a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f25251a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private C4029a() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.theme.DataBinderMapperImpl$b */
    public static class C4030b {

        /* JADX INFO: renamed from: a */
        public static final HashMap<String, Integer> f25252a = new HashMap<>(0);

        private C4030b() {
        }
    }

    @Override // p000.jf3
    public List<jf3> collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.notification.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // p000.jf3
    public String convertBrIdToString(int i) {
        return C4029a.f25251a.get(i);
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f25250a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p000.jf3
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C4030b.f25252a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f25250a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
