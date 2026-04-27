package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nCreatePublicKeyCredentialException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePublicKeyCredentialException.kt\nandroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public class c63 extends l53 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C2210a f15826d = new C2210a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f15827c;

    /* JADX INFO: renamed from: c63$a */
    public static final class C2210a {
        public /* synthetic */ C2210a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public final l53 createFrom(@yfb String str, @gib String str2) {
            md8.checkNotNullParameter(str, "type");
            try {
                if (m9g.contains$default((CharSequence) str, (CharSequence) "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, (Object) null)) {
                    return b63.f12763f.createFrom(str, str2);
                }
                throw new qv6();
            } catch (qv6 unused) {
                return new k53(str, str2);
            }
        }

        private C2210a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public c63(@yfb String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        md8.checkNotNullParameter(str, "type");
    }

    @do8
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final l53 createFrom(@yfb String str, @gib String str2) {
        return f15826d.createFrom(str, str2);
    }

    @Override // p000.l53
    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public String getType() {
        return this.f15827c;
    }

    public /* synthetic */ c63(String str, CharSequence charSequence, int i, jt3 jt3Var) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public c63(@yfb String str, @gib CharSequence charSequence) {
        super(str, charSequence);
        md8.checkNotNullParameter(str, "type");
        this.f15827c = str;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
