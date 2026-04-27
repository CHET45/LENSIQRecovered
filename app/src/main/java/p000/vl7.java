package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nHotReloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n*S KotlinDebug\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n*L\n95#1:104\n95#1:105,3\n*E\n"})
public final class vl7 {
    @dpg
    public static final void clearCompositionErrors() {
        ul7.f88359a.clearErrors$runtime_release();
    }

    @yfb
    @dpg
    public static final List<scc<Exception, Boolean>> currentCompositionErrors() {
        List<xsd> currentErrors$runtime_release = ul7.f88359a.getCurrentErrors$runtime_release();
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(currentErrors$runtime_release, 10));
        for (xsd xsdVar : currentErrors$runtime_release) {
            arrayList.add(vkh.m24050to(xsdVar.getCause(), Boolean.valueOf(xsdVar.getRecoverable())));
        }
        return arrayList;
    }

    @dpg
    public static final void invalidateGroupsWithKey(int i) {
        ul7.f88359a.invalidateGroupsWithKey$runtime_release(i);
    }

    @dpg
    public static final void simulateHotReload(@yfb Object obj) {
        ul7.f88359a.simulateHotReload$runtime_release(obj);
    }
}
