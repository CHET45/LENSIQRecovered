package com.watchfun.callvideo;

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
    public static final SparseIntArray f25093a = new SparseIntArray(0);

    /* JADX INFO: renamed from: com.watchfun.callvideo.DataBinderMapperImpl$a */
    public static class C4006a {

        /* JADX INFO: renamed from: a */
        public static final SparseArray<String> f25094a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f25094a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private C4006a() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.callvideo.DataBinderMapperImpl$b */
    public static class C4007b {

        /* JADX INFO: renamed from: a */
        public static final HashMap<String, Integer> f25095a = new HashMap<>(0);

        private C4007b() {
        }
    }

    @Override // p000.jf3
    public List<jf3> collectDependencies() {
        ArrayList arrayList = new ArrayList(11);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.aichatmodule.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.base.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.log.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.network.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.notification.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.theme.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.transcommon.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.translatemodule.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.translatewebsocket.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.utilcommons.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // p000.jf3
    public String convertBrIdToString(int i) {
        return C4006a.f25094a.get(i);
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f25093a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p000.jf3
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C4007b.f25095a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f25093a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
