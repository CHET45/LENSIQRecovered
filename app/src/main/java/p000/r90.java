package p000;

import java.util.concurrent.Executor;
import p000.r55;

/* JADX INFO: loaded from: classes5.dex */
@vx4
public class r90 extends r55 {
    public r90(String identifier, Executor executor) {
        super(identifier, executor, af4.m470c(), r55.C11893a.f77075a);
    }

    public r90(Executor executor, bdg subscriberExceptionHandler) {
        super("default", executor, af4.m470c(), subscriberExceptionHandler);
    }

    public r90(Executor executor) {
        super("default", executor, af4.m470c(), r55.C11893a.f77075a);
    }
}
