package p000;

import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public final class klb {
    private klb() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void subscribe(wub<? extends T> o, pxb<? super T> observer) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        k81 k81Var = new k81(linkedBlockingQueue);
        observer.onSubscribe(k81Var);
        o.subscribe(k81Var);
        while (!k81Var.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e) {
                    k81Var.dispose();
                    observer.onError(e);
                    return;
                }
            }
            if (k81Var.isDisposed() || objPoll == k81.f52753b || fhb.acceptFull(objPoll, observer)) {
                return;
            }
        }
    }

    public static <T> void subscribe(wub<? extends T> o) {
        u71 u71Var = new u71();
        wt8 wt8Var = new wt8(r07.emptyConsumer(), u71Var, u71Var, r07.emptyConsumer());
        o.subscribe(wt8Var);
        s71.awaitForComplete(u71Var, wt8Var);
        Throwable th = u71Var.f86922a;
        if (th != null) {
            throw k75.wrapOrThrow(th);
        }
    }

    public static <T> void subscribe(wub<? extends T> o, final uu2<? super T> onNext, final uu2<? super Throwable> onError, final InterfaceC7776j8 onComplete) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        subscribe(o, new wt8(onNext, onError, onComplete, r07.emptyConsumer()));
    }
}
