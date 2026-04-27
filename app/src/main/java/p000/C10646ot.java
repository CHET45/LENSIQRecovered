package p000;

import android.os.LocaleList;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: ot */
/* JADX INFO: loaded from: classes.dex */
@c5e(api = 24)
@e0g(parameters = 0)
public final class C10646ot implements fxc {

    /* JADX INFO: renamed from: d */
    public static final int f68628d = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public LocaleList f68629a;

    /* JADX INFO: renamed from: b */
    @gib
    public ye9 f68630b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final cig f68631c = whg.createSynchronizedObject();

    @Override // p000.fxc
    @yfb
    public ye9 getCurrent() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f68631c) {
            ye9 ye9Var = this.f68630b;
            if (ye9Var != null && localeList == this.f68629a) {
                return ye9Var;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new we9(localeList.get(i)));
            }
            ye9 ye9Var2 = new ye9(arrayList);
            this.f68629a = localeList;
            this.f68630b = ye9Var2;
            return ye9Var2;
        }
    }

    @Override // p000.fxc
    @yfb
    public Locale parseLanguageTag(@yfb String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (md8.areEqual(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(C11114pt.f71968a, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
