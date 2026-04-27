package p000;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class xmd {

    /* JADX INFO: renamed from: a */
    public static final long f98541a = Long.MIN_VALUE;

    /* JADX INFO: renamed from: b */
    public static final long f98542b = Long.MAX_VALUE;

    private xmd() {
        throw new IllegalStateException("No instances!");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m25317a(cb1 cancelled) {
        try {
            return cancelled.getAsBoolean();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> boolean m25318b(long j, ycg<? super T> ycgVar, Queue<T> queue, AtomicLong atomicLong, cb1 cb1Var) {
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                if (m25317a(cb1Var)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    ycgVar.onComplete();
                    return true;
                }
                ycgVar.onNext(tPoll);
                j2++;
            } else {
                if (m25317a(cb1Var)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    ycgVar.onComplete();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long jAddAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j = jAddAndGet;
                    j2 = jAddAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T, U> boolean checkTerminated(boolean d, boolean empty, ycg<?> s, boolean delayError, zif<?> q, vmd<T, U> qd) {
        if (qd.cancelled()) {
            q.clear();
            return true;
        }
        if (!d) {
            return false;
        }
        if (delayError) {
            if (!empty) {
                return false;
            }
            Throwable thError = qd.error();
            if (thError != null) {
                s.onError(thError);
            } else {
                s.onComplete();
            }
            return true;
        }
        Throwable thError2 = qd.error();
        if (thError2 != null) {
            q.clear();
            s.onError(thError2);
            return true;
        }
        if (!empty) {
            return false;
        }
        s.onComplete();
        return true;
    }

    public static <T> zif<T> createQueue(int capacityHint) {
        return capacityHint < 0 ? new qzf(-capacityHint) : new ozf(capacityHint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        r1 = r15.leave(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T, U> void drainLoop(p000.tif<T> r11, p000.pxb<? super U> r12, boolean r13, p000.lf4 r14, p000.nsb<T, U> r15) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r15.done()
            boolean r3 = r11.isEmpty()
            r4 = r12
            r5 = r13
            r6 = r11
            r7 = r14
            r8 = r15
            boolean r2 = checkTerminated(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L16
            return
        L16:
            boolean r3 = r15.done()
            java.lang.Object r2 = r11.poll()
            if (r2 != 0) goto L22
            r10 = r0
            goto L24
        L22:
            r4 = 0
            r10 = r4
        L24:
            r4 = r10
            r5 = r12
            r6 = r13
            r7 = r11
            r8 = r14
            r9 = r15
            boolean r3 = checkTerminated(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L31
            return
        L31:
            if (r10 == 0) goto L3b
            int r1 = -r1
            int r1 = r15.leave(r1)
            if (r1 != 0) goto L2
            return
        L3b:
            r15.accept(r12, r2)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xmd.drainLoop(tif, pxb, boolean, lf4, nsb):void");
    }

    public static <T, U> void drainMaxLoop(tif<T> q, ycg<? super U> a, boolean delayError, lf4 dispose, vmd<T, U> qd) {
        int iLeave = 1;
        while (true) {
            boolean zDone = qd.done();
            T tPoll = q.poll();
            boolean z = tPoll == null;
            if (checkTerminated(zDone, z, a, delayError, q, qd)) {
                if (dispose != null) {
                    dispose.dispose();
                    return;
                }
                return;
            } else if (z) {
                iLeave = qd.leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else {
                long jRequested = qd.requested();
                if (jRequested == 0) {
                    q.clear();
                    if (dispose != null) {
                        dispose.dispose();
                    }
                    a.onError(new bwa("Could not emit value due to lack of requests."));
                    return;
                }
                if (qd.accept(a, tPoll) && jRequested != Long.MAX_VALUE) {
                    qd.produced(1L);
                }
            }
        }
    }

    public static <T> void postComplete(ycg<? super T> actual, Queue<T> queue, AtomicLong state, cb1 isCancelled) {
        long j;
        long j2;
        if (queue.isEmpty()) {
            actual.onComplete();
            return;
        }
        if (m25318b(state.get(), actual, queue, state, isCancelled)) {
            return;
        }
        do {
            j = state.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j2 = j | Long.MIN_VALUE;
            }
        } while (!state.compareAndSet(j, j2));
        if (j != 0) {
            m25318b(j2, actual, queue, state, isCancelled);
        }
    }

    public static <T> boolean postCompleteRequest(long n, ycg<? super T> actual, Queue<T> queue, AtomicLong state, cb1 isCancelled) {
        long j;
        do {
            j = state.get();
        } while (!state.compareAndSet(j, ro0.addCap(Long.MAX_VALUE & j, n) | (j & Long.MIN_VALUE)));
        if (j != Long.MIN_VALUE) {
            return false;
        }
        m25318b(n | Long.MIN_VALUE, actual, queue, state, isCancelled);
        return true;
    }

    public static void request(fdg s, int prefetch) {
        s.request(prefetch < 0 ? Long.MAX_VALUE : prefetch);
    }

    public static <T, U> boolean checkTerminated(boolean d, boolean empty, pxb<?> observer, boolean delayError, zif<?> q, lf4 disposable, nsb<T, U> qd) {
        if (qd.cancelled()) {
            q.clear();
            disposable.dispose();
            return true;
        }
        if (!d) {
            return false;
        }
        if (delayError) {
            if (!empty) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable thError = qd.error();
            if (thError != null) {
                observer.onError(thError);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable thError2 = qd.error();
        if (thError2 != null) {
            q.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(thError2);
            return true;
        }
        if (!empty) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }
}
