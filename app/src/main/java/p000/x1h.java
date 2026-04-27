package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public final class x1h extends CancellationException implements h03<x1h> {

    /* JADX INFO: renamed from: a */
    @gib
    @un8
    public final transient jj8 f96041a;

    public x1h(@yfb String str, @gib jj8 jj8Var) {
        super(str);
        this.f96041a = jj8Var;
    }

    @Override // p000.h03
    @yfb
    public x1h createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        x1h x1hVar = new x1h(message, this.f96041a);
        x1hVar.initCause(this);
        return x1hVar;
    }

    public x1h(@yfb String str) {
        this(str, null);
    }
}
