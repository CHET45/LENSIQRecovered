package p000;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nClearCredentialCustomException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClearCredentialCustomException.kt\nandroidx/credentials/exceptions/ClearCredentialCustomException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class x12 extends y12 {

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f95999c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public x12(@yfb String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        md8.checkNotNullParameter(str, "type");
    }

    @Override // p000.y12
    @yfb
    public String getType() {
        return this.f95999c;
    }

    public /* synthetic */ x12(String str, CharSequence charSequence, int i, jt3 jt3Var) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public x12(@yfb String str, @gib CharSequence charSequence) {
        super(str, charSequence);
        md8.checkNotNullParameter(str, "type");
        this.f95999c = str;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
