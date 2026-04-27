package p000;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public final class a96 {
    private a96() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void subscribe(zjd<? extends T> zjdVar, ycg<? super T> ycgVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        n81 n81Var = new n81(linkedBlockingQueue);
        zjdVar.subscribe(n81Var);
        while (!n81Var.isCancelled()) {
            try {
                Object objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    if (n81Var.isCancelled()) {
                        return;
                    }
                    t71.verifyNonBlocking();
                    objPoll = linkedBlockingQueue.take();
                }
                if (n81Var.isCancelled() || objPoll == n81.f63480b || ehb.acceptFull(objPoll, ycgVar)) {
                    return;
                }
            } catch (InterruptedException e) {
                n81Var.cancel();
                ycgVar.onError(e);
                return;
            }
        }
    }

    public static <T> void subscribe(zjd<? extends T> zjdVar) {
        v71 v71Var = new v71();
        zt8 zt8Var = new zt8(q07.emptyConsumer(), v71Var, v71Var, q07.f72650l);
        zjdVar.subscribe(zt8Var);
        t71.awaitForComplete(v71Var, zt8Var);
        Throwable th = v71Var.f90131a;
        if (th != null) {
            throw j75.wrapOrThrow(th);
        }
    }

    public static <T> void subscribe(zjd<? extends T> zjdVar, tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(tu2Var, "onNext is null");
        xjb.requireNonNull(tu2Var2, "onError is null");
        xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        subscribe(zjdVar, new zt8(tu2Var, tu2Var2, interfaceC7178i8, q07.f72650l));
    }

    public static <T> void subscribe(zjd<? extends T> zjdVar, tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, int i) {
        xjb.requireNonNull(tu2Var, "onNext is null");
        xjb.requireNonNull(tu2Var2, "onError is null");
        xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        xjb.verifyPositive(i, "number > 0 required");
        subscribe(zjdVar, new kc1(tu2Var, tu2Var2, interfaceC7178i8, q07.boundedConsumer(i), i));
    }
}
