package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class g37 extends CancellationException {

    /* JADX INFO: renamed from: a */
    public static final int f38317a = 0;

    public g37() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public g37(@gib String str) {
        super(str);
    }

    public /* synthetic */ g37(String str, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : str);
    }
}
