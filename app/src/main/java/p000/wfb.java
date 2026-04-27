package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wfb extends Error {
    public wfb() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfb(@yfb String str) {
        super(str);
        md8.checkNotNullParameter(str, g55.f38799h);
    }

    public /* synthetic */ wfb(String str, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
