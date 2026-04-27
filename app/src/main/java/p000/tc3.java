package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nCustomCredential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCredential.kt\nandroidx/credentials/CustomCredential\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
public class tc3 extends l63 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc3(@yfb String str, @yfb Bundle bundle) {
        super(str, bundle);
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "data");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
