package p000;

import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
@dwf({"SMAP\nPhotoDataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoDataRepository.kt\ncom/eyevue/glassapp/view/photo/viewmodel/PhotoDataRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1863#2,2:53\n*S KotlinDebug\n*F\n+ 1 PhotoDataRepository.kt\ncom/eyevue/glassapp/view/photo/viewmodel/PhotoDataRepository\n*L\n40#1:53,2\n*E\n"})
@e0g(parameters = 0)
public final class mtc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final mtc f62107a = new mtc();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final o5b<CopyOnWriteArrayList<Uri>> f62108b = new o5b<>();

    /* JADX INFO: renamed from: c */
    public static final int f62109c = 8;

    private mtc() {
    }

    public final void addFilterPhotoListLiveData(@yfb ArrayList<Uri> arrayList) {
        md8.checkNotNullParameter(arrayList, "filterPhotoList");
        CopyOnWriteArrayList<Uri> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        o5b<CopyOnWriteArrayList<Uri>> o5bVar = f62108b;
        CopyOnWriteArrayList<Uri> value = o5bVar.getValue();
        if (value != null) {
            copyOnWriteArrayList.addAll(value);
        }
        copyOnWriteArrayList.addAll(arrayList);
        List listDistinct = v82.distinct(copyOnWriteArrayList);
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(listDistinct);
        o5bVar.setValue(copyOnWriteArrayList);
        Log.e("xtest", "PhotoViewModel函数中setFilterPhotoListLiveData设置成功，内容：" + copyOnWriteArrayList);
    }

    @gib
    public final CopyOnWriteArrayList<Uri> getFilterPhotoListLiveData() {
        return f62108b.getValue();
    }

    public final void removeFilterPhotoListLiveData(@yfb Uri uri) {
        md8.checkNotNullParameter(uri, "path");
        CopyOnWriteArrayList<Uri> value = f62108b.getValue();
        ArrayList arrayList = new ArrayList();
        if (value != null) {
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String string = value.get(i).toString();
                md8.checkNotNullExpressionValue(string, "toString(...)");
                String strReplace$default = h9g.replace$default(string, iei.f46708b, "", false, 4, (Object) null);
                String string2 = uri.toString();
                md8.checkNotNullExpressionValue(string2, "toString(...)");
                if (md8.areEqual(strReplace$default, h9g.replace$default(string2, iei.f46708b, "", false, 4, (Object) null))) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Log.e("xtest", "PhotoViewModel函数中removeFilterPhotoListLiveData移出成功，本次下标：" + iIntValue + ",移出的内容：" + uri);
            if (value != null) {
                value.remove(iIntValue);
            }
        }
        if (value != null) {
            f62108b.setValue(value);
        }
    }
}
