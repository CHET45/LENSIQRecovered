package p000;

import java.util.Arrays;
import p000.d9d;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nPreferencesFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferencesFactory.kt\nandroidx/datastore/preferences/core/PreferencesFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
@xn8(name = "PreferencesFactory")
public final class f9d {
    @yfb
    @xn8(name = "create")
    public static final d9d create(@yfb d9d.C4676b<?>... c4676bArr) {
        md8.checkNotNullParameter(c4676bArr, "pairs");
        return createMutable((d9d.C4676b[]) Arrays.copyOf(c4676bArr, c4676bArr.length));
    }

    @yfb
    @xn8(name = "createEmpty")
    public static final d9d createEmpty() {
        return new i6b(null, true, 1, null);
    }

    @yfb
    @xn8(name = "createMutable")
    public static final i6b createMutable(@yfb d9d.C4676b<?>... c4676bArr) {
        md8.checkNotNullParameter(c4676bArr, "pairs");
        i6b i6bVar = new i6b(null, false, 1, null);
        i6bVar.putAll((d9d.C4676b[]) Arrays.copyOf(c4676bArr, c4676bArr.length));
        return i6bVar;
    }
}
