package p000;

import android.util.Log;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: nt */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class C10050nt implements fxc {

    /* JADX INFO: renamed from: a */
    public static final int f65552a = 0;

    @Override // p000.fxc
    @yfb
    public ye9 getCurrent() {
        return new ye9((List<we9>) k82.listOf(new we9(Locale.getDefault())));
    }

    @Override // p000.fxc
    @yfb
    public Locale parseLanguageTag(@yfb String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (md8.areEqual(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(C11114pt.f71968a, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
