package com.watchfun.trans;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000.jf3;
import p000.y8i;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends jf3 {

    /* JADX INFO: renamed from: a */
    public static final SparseIntArray f25283a = new SparseIntArray(0);

    /* JADX INFO: renamed from: com.watchfun.trans.DataBinderMapperImpl$a */
    public static class C4033a {

        /* JADX INFO: renamed from: a */
        public static final SparseArray<String> f25284a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f25284a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private C4033a() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.DataBinderMapperImpl$b */
    public static class C4034b {

        /* JADX INFO: renamed from: a */
        public static final HashMap<String, Integer> f25285a = new HashMap<>(0);

        private C4034b() {
        }
    }

    @Override // p000.jf3
    public List<jf3> collectDependencies() {
        ArrayList arrayList = new ArrayList(11);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.platon.offlinesdk.DataBinderMapperImpl());
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
    public String convertBrIdToString(int localId) {
        return C4033a.f25284a.get(localId);
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent component, View view, int layoutId) {
        if (f25283a.get(layoutId) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p000.jf3
    public int getLayoutId(String tag) {
        Integer num;
        if (tag == null || (num = C4034b.f25285a.get(tag)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
        if (views == null || views.length == 0 || f25283a.get(layoutId) <= 0 || views[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
