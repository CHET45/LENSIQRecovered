package com.watchfun.notification;

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
    public static final SparseIntArray f25227a = new SparseIntArray(0);

    /* JADX INFO: renamed from: com.watchfun.notification.DataBinderMapperImpl$a */
    public static class C4026a {

        /* JADX INFO: renamed from: a */
        public static final SparseArray<String> f25228a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f25228a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private C4026a() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.notification.DataBinderMapperImpl$b */
    public static class C4027b {

        /* JADX INFO: renamed from: a */
        public static final HashMap<String, Integer> f25229a = new HashMap<>(0);

        private C4027b() {
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
        return C4026a.f25228a.get(i);
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f25227a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p000.jf3
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C4027b.f25229a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f25227a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
