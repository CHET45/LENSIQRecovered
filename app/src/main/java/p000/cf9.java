package p000;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@c5e(24)
@dwf({"SMAP\nEditorInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/LocaleListHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,221:1\n1549#2:222\n1620#2,3:223\n37#3,2:226\n*S KotlinDebug\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/LocaleListHelper\n*L\n193#1:222\n193#1:223,3\n193#1:226,2\n*E\n"})
@e0g(parameters = 1)
public final class cf9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final cf9 f16418a = new cf9();

    /* JADX INFO: renamed from: b */
    public static final int f16419b = 0;

    private cf9() {
    }

    @c5e(24)
    @ih4
    public final void setHintLocales(@yfb EditorInfo editorInfo, @yfb ye9 ye9Var) {
        if (md8.areEqual(ye9Var, ye9.f101294c.getEmpty())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(ye9Var, 10));
        Iterator<we9> it = ye9Var.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
