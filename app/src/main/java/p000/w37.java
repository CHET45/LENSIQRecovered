package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w37 extends Exception {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f93170a;

    /* JADX INFO: renamed from: b */
    @gib
    public final CharSequence f93171b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public w37(@yfb String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        md8.checkNotNullParameter(str, "type");
    }

    @gib
    @p7e({p7e.EnumC10826a.f69935b})
    public CharSequence getErrorMessage() {
        return this.f93171b;
    }

    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public String getType() {
        return this.f93170a;
    }

    public /* synthetic */ w37(String str, CharSequence charSequence, int i, jt3 jt3Var) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public w37(@yfb String str, @gib CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        md8.checkNotNullParameter(str, "type");
        this.f93170a = str;
        this.f93171b = charSequence;
    }
}
