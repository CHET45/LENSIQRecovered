package p000;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public final class llb {
    private llb() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void subscribe(xub<? extends T> xubVar, oxb<? super T> oxbVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        l81 l81Var = new l81(linkedBlockingQueue);
        oxbVar.onSubscribe(l81Var);
        xubVar.subscribe(l81Var);
        while (!l81Var.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e) {
                    l81Var.dispose();
                    oxbVar.onError(e);
                    return;
                }
            }
            if (l81Var.isDisposed() || objPoll == l81.f56743b || ehb.acceptFull(objPoll, oxbVar)) {
                return;
            }
        }
    }

    public static <T> void subscribe(xub<? extends T> xubVar) {
        v71 v71Var = new v71();
        xt8 xt8Var = new xt8(q07.emptyConsumer(), v71Var, v71Var, q07.emptyConsumer());
        xubVar.subscribe(xt8Var);
        t71.awaitForComplete(v71Var, xt8Var);
        Throwable th = v71Var.f90131a;
        if (th != null) {
            throw j75.wrapOrThrow(th);
        }
    }

    public static <T> void subscribe(xub<? extends T> xubVar, tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(tu2Var, "onNext is null");
        xjb.requireNonNull(tu2Var2, "onError is null");
        xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        subscribe(xubVar, new xt8(tu2Var, tu2Var2, interfaceC7178i8, q07.emptyConsumer()));
    }
}
