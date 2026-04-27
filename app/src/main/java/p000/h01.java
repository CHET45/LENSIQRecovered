package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nBeginGetCustomCredentialOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginGetCustomCredentialOption.kt\nandroidx/credentials/provider/BeginGetCustomCredentialOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
public class h01 extends py0 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C6668a f41917e = new C6668a(null);

    /* JADX INFO: renamed from: h01$a */
    public static final class C6668a {
        public /* synthetic */ C6668a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final h01 createFrom$credentials_release(@yfb Bundle bundle, @yfb String str, @yfb String str2) {
            md8.checkNotNullParameter(bundle, "data");
            md8.checkNotNullParameter(str, "id");
            md8.checkNotNullParameter(str2, "type");
            return new h01(str, str2, bundle);
        }

        @do8
        @yfb
        public final h01 createFromEntrySlice$credentials_release(@yfb Bundle bundle, @yfb String str, @yfb String str2) {
            md8.checkNotNullParameter(bundle, "data");
            md8.checkNotNullParameter(str, "id");
            md8.checkNotNullParameter(str2, "type");
            return new h01(str, str2, bundle);
        }

        private C6668a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h01(@yfb String str, @yfb String str2, @yfb Bundle bundle) {
        super(str, str2, bundle);
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "type");
        md8.checkNotNullParameter(bundle, "candidateQueryData");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
