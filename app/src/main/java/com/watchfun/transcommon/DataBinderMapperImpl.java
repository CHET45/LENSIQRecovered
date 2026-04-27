package com.watchfun.transcommon;

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
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(0);

    public static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
        }

        private InnerBrLookup() {
        }
    }

    public static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys = new HashMap<>(0);

        private InnerLayoutIdLookup() {
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
        arrayList.add(new com.watchfun.translatemodule.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.translatewebsocket.DataBinderMapperImpl());
        arrayList.add(new com.watchfun.utilcommons.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // p000.jf3
    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p000.jf3
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // p000.jf3
    public y8i getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
