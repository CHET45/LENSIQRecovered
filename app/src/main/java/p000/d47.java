package p000;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nGetCustomCredentialOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCustomCredentialOption.kt\nandroidx/credentials/GetCustomCredentialOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public class d47 extends t63 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public d47(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z) {
        this(str, bundle, bundle2, z, false, null, 48, null);
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "requestData");
        md8.checkNotNullParameter(bundle2, "candidateQueryData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public d47(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, boolean z2) {
        this(str, bundle, bundle2, z, z2, null, 32, null);
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "requestData");
        md8.checkNotNullParameter(bundle2, "candidateQueryData");
    }

    public /* synthetic */ d47(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i, jt3 jt3Var) {
        this(str, bundle, bundle2, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? w6f.emptySet() : set);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public d47(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, boolean z2, @yfb Set<ComponentName> set) {
        super(str, bundle, bundle2, z, z2, set);
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "requestData");
        md8.checkNotNullParameter(bundle2, "candidateQueryData");
        md8.checkNotNullParameter(set, "allowedProviders");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
