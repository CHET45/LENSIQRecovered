package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nGetPublicKeyCredentialException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetPublicKeyCredentialException.kt\nandroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public class v47 extends w37 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C13859a f89901d = new C13859a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f89902c;

    /* JADX INFO: renamed from: v47$a */
    public static final class C13859a {
        public /* synthetic */ C13859a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public final w37 createFrom(@yfb String str, @gib String str2) {
            md8.checkNotNullParameter(str, "type");
            try {
                if (h9g.startsWith$default(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
                    return u47.f86804f.createFrom(str, str2);
                }
                throw new qv6();
            } catch (qv6 unused) {
                return new v37(str, str2);
            }
        }

        private C13859a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public v47(@yfb String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        md8.checkNotNullParameter(str, "type");
    }

    @do8
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final w37 createFrom(@yfb String str, @gib String str2) {
        return f89901d.createFrom(str, str2);
    }

    @Override // p000.w37
    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public String getType() {
        return this.f89902c;
    }

    public /* synthetic */ v47(String str, CharSequence charSequence, int i, jt3 jt3Var) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public v47(@yfb String str, @gib CharSequence charSequence) {
        super(str, charSequence);
        md8.checkNotNullParameter(str, "type");
        this.f89902c = str;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
