package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nCreateCustomCredentialResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateCustomCredentialResponse.kt\nandroidx/credentials/CreateCustomCredentialResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
public class u53 extends q53 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u53(@yfb String str, @yfb Bundle bundle) {
        super(str, bundle);
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "data");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
