package com.watchfun.aichatmodule;

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
    public static final SparseIntArray f25036a = new SparseIntArray(0);

    /* JADX INFO: renamed from: com.watchfun.aichatmodule.DataBinderMapperImpl$a */
    public static class C3996a {

        /* JADX INFO: renamed from: a */
        public static final SparseArray<String> f25037a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f25037a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private C3996a() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichatmodule.DataBinderMapperImpl$b */
    public static class C3997b {

        /* JADX INFO: renamed from: a */
        public static final HashMap<String, Integer> f25038a = new HashMap<>(0);

        private C3997b() {
        }
    }

    @Override // p000.jf3
    public List<jf3> collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.log.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // p000.jf3
    public String convertBrIdToString(int i) {
        return C3996a.f25037a.get(i);
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f25036a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p000.jf3
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C3997b.f25038a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f25036a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
