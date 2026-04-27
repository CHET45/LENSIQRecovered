package p000;

import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public final class z86 {
    private z86() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void subscribe(zjd<? extends T> source, ycg<? super T> subscriber) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        m81 m81Var = new m81(linkedBlockingQueue);
        source.subscribe(m81Var);
        while (!m81Var.isCancelled()) {
            try {
                Object objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    if (m81Var.isCancelled()) {
                        return;
                    }
                    s71.verifyNonBlocking();
                    objPoll = linkedBlockingQueue.take();
                }
                if (m81Var.isCancelled() || objPoll == m81.f60177b || fhb.acceptFull(objPoll, subscriber)) {
                    return;
                }
            } catch (InterruptedException e) {
                m81Var.cancel();
                subscriber.onError(e);
                return;
            }
        }
    }

    public static <T> void subscribe(zjd<? extends T> source) {
        u71 u71Var = new u71();
        yt8 yt8Var = new yt8(r07.emptyConsumer(), u71Var, u71Var, r07.f76647k);
        source.subscribe(yt8Var);
        s71.awaitForComplete(u71Var, yt8Var);
        Throwable th = u71Var.f86922a;
        if (th != null) {
            throw k75.wrapOrThrow(th);
        }
    }

    public static <T> void subscribe(zjd<? extends T> o, final uu2<? super T> onNext, final uu2<? super Throwable> onError, final InterfaceC7776j8 onComplete) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        subscribe(o, new yt8(onNext, onError, onComplete, r07.f76647k));
    }

    public static <T> void subscribe(zjd<? extends T> o, final uu2<? super T> onNext, final uu2<? super Throwable> onError, final InterfaceC7776j8 onComplete, int bufferSize) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        yjb.verifyPositive(bufferSize, "number > 0 required");
        subscribe(o, new jc1(onNext, onError, onComplete, r07.boundedConsumer(bufferSize), bufferSize));
    }
}
