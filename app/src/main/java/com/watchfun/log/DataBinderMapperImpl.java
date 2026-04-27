package com.watchfun.log;

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
    public static final SparseIntArray f25180a = new SparseIntArray(0);

    /* JADX INFO: renamed from: com.watchfun.log.DataBinderMapperImpl$a */
    public static class C4019a {

        /* JADX INFO: renamed from: a */
        public static final SparseArray<String> f25181a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f25181a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private C4019a() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.log.DataBinderMapperImpl$b */
    public static class C4020b {

        /* JADX INFO: renamed from: a */
        public static final HashMap<String, Integer> f25182a = new HashMap<>(0);

        private C4020b() {
        }
    }

    @Override // p000.jf3
    public List<jf3> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // p000.jf3
    public String convertBrIdToString(int i) {
        return C4019a.f25181a.get(i);
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f25180a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p000.jf3
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C4020b.f25182a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f25180a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
