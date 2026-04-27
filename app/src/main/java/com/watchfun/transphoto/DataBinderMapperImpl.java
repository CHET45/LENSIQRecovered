package com.watchfun.transphoto;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000.jf3;
import p000.y8i;

/* JADX INFO: loaded from: classes7.dex */
public class DataBinderMapperImpl extends jf3 {

    /* JADX INFO: renamed from: a */
    public static final SparseIntArray f26023a = new SparseIntArray(0);

    /* JADX INFO: renamed from: com.watchfun.transphoto.DataBinderMapperImpl$a */
    public static class C4251a {

        /* JADX INFO: renamed from: a */
        public static final SparseArray<String> f26024a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f26024a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private C4251a() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.transphoto.DataBinderMapperImpl$b */
    public static class C4252b {

        /* JADX INFO: renamed from: a */
        public static final HashMap<String, Integer> f26025a = new HashMap<>(0);

        private C4252b() {
        }
    }

    @Override // p000.jf3
    public List<jf3> collectDependencies() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.aichatmodule.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.base.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.log.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.network.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.notification.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.theme.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.transcommon.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.translatemodule.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.utilcommons.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // p000.jf3
    public String convertBrIdToString(int i) {
        return C4251a.f26024a.get(i);
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f26023a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p000.jf3
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C4252b.f26025a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f26023a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
