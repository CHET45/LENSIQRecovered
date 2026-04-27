package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class d23 extends IOException {
    public /* synthetic */ d23(String str, Throwable th, int i, jt3 jt3Var) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d23(@yfb String str, @gib Throwable th) {
        super(str, th);
        md8.checkNotNullParameter(str, g55.f38799h);
    }
}
