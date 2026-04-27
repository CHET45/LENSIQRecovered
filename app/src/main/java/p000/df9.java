package p000;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@c5e(24)
@dwf({"SMAP\nLocaleExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,47:1\n1549#2:48\n1620#2,3:49\n1549#2:54\n1620#2,3:55\n37#3,2:52\n37#3,2:58\n*S KotlinDebug\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n*L\n36#1:48\n36#1:49,3\n43#1:54\n43#1:55,3\n36#1:52,2\n43#1:58,2\n*E\n"})
@e0g(parameters = 1)
public final class df9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final df9 f29565a = new df9();

    /* JADX INFO: renamed from: b */
    public static final int f29566b = 0;

    private df9() {
    }

    @c5e(24)
    @yfb
    @ih4
    public final Object localeSpan(@yfb ye9 ye9Var) {
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(ye9Var, 10));
        Iterator<we9> it = ye9Var.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @c5e(24)
    @ih4
    public final void setTextLocales(@yfb C10071nv c10071nv, @yfb ye9 ye9Var) {
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(ye9Var, 10));
        Iterator<we9> it = ye9Var.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        c10071nv.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
