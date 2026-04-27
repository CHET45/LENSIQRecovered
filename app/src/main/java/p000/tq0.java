package p000;

import java.io.Serializable;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
public abstract class tq0 implements zy2<Object>, a23, Serializable {

    @gib
    private final zy2<Object> completion;

    public tq0(@gib zy2<Object> zy2Var) {
        this.completion = zy2Var;
    }

    @yfb
    public zy2<bth> create(@yfb zy2<?> zy2Var) {
        md8.checkNotNullParameter(zy2Var, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @gib
    public a23 getCallerFrame() {
        zy2<Object> zy2Var = this.completion;
        if (zy2Var instanceof a23) {
            return (a23) zy2Var;
        }
        return null;
    }

    @gib
    public final zy2<Object> getCompletion() {
        return this.completion;
    }

    @gib
    public StackTraceElement getStackTraceElement() {
        return dk3.getStackTraceElement(this);
    }

    @gib
    public abstract Object invokeSuspend(@yfb Object obj);

    public void releaseIntercepted() {
    }

    @Override // p000.zy2
    public final void resumeWith(@yfb Object obj) {
        Object objInvokeSuspend;
        zy2<Object> zy2Var = this;
        while (true) {
            jk3.probeCoroutineResumed(zy2Var);
            tq0 tq0Var = (tq0) zy2Var;
            zy2<Object> zy2Var2 = tq0Var.completion;
            md8.checkNotNull(zy2Var2);
            try {
                objInvokeSuspend = tq0Var.invokeSuspend(obj);
            } catch (Throwable th) {
                v7e.C13927a c13927a = v7e.f90266b;
                obj = v7e.m32723constructorimpl(y7e.createFailure(th));
            }
            if (objInvokeSuspend == pd8.getCOROUTINE_SUSPENDED()) {
                return;
            }
            v7e.C13927a c13927a2 = v7e.f90266b;
            obj = v7e.m32723constructorimpl(objInvokeSuspend);
            tq0Var.releaseIntercepted();
            if (!(zy2Var2 instanceof tq0)) {
                zy2Var2.resumeWith(obj);
                return;
            }
            zy2Var = zy2Var2;
        }
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @yfb
    public zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
        md8.checkNotNullParameter(zy2Var, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
