package p000;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class ymd {

    /* JADX INFO: renamed from: a */
    public static final long f102068a = Long.MIN_VALUE;

    /* JADX INFO: renamed from: b */
    public static final long f102069b = Long.MAX_VALUE;

    private ymd() {
        throw new IllegalStateException("No instances!");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m26192a(eb1 eb1Var) {
        try {
            return eb1Var.getAsBoolean();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> boolean m26193b(long j, ycg<? super T> ycgVar, Queue<T> queue, AtomicLong atomicLong, eb1 eb1Var) {
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                if (m26192a(eb1Var)) {
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
                if (m26192a(eb1Var)) {
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

    public static <T, U> boolean checkTerminated(boolean z, boolean z2, ycg<?> ycgVar, boolean z3, ajf<?> ajfVar, wmd<T, U> wmdVar) {
        if (wmdVar.cancelled()) {
            ajfVar.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            Throwable thError = wmdVar.error();
            if (thError != null) {
                ycgVar.onError(thError);
            } else {
                ycgVar.onComplete();
            }
            return true;
        }
        Throwable thError2 = wmdVar.error();
        if (thError2 != null) {
            ajfVar.clear();
            ycgVar.onError(thError2);
            return true;
        }
        if (!z2) {
            return false;
        }
        ycgVar.onComplete();
        return true;
    }

    public static <T> ajf<T> createQueue(int i) {
        return i < 0 ? new rzf(-i) : new pzf(i);
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
    public static <T, U> void drainLoop(p000.uif<T> r11, p000.oxb<? super U> r12, boolean r13, p000.mf4 r14, p000.osb<T, U> r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: p000.ymd.drainLoop(uif, oxb, boolean, mf4, osb):void");
    }

    public static <T, U> void drainMaxLoop(uif<T> uifVar, ycg<? super U> ycgVar, boolean z, mf4 mf4Var, wmd<T, U> wmdVar) {
        int iLeave = 1;
        while (true) {
            boolean zDone = wmdVar.done();
            T tPoll = uifVar.poll();
            boolean z2 = tPoll == null;
            if (checkTerminated(zDone, z2, ycgVar, z, uifVar, wmdVar)) {
                if (mf4Var != null) {
                    mf4Var.dispose();
                    return;
                }
                return;
            } else if (z2) {
                iLeave = wmdVar.leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else {
                long jRequested = wmdVar.requested();
                if (jRequested == 0) {
                    uifVar.clear();
                    if (mf4Var != null) {
                        mf4Var.dispose();
                    }
                    ycgVar.onError(new cwa("Could not emit value due to lack of requests."));
                    return;
                }
                if (wmdVar.accept(ycgVar, tPoll) && jRequested != Long.MAX_VALUE) {
                    wmdVar.produced(1L);
                }
            }
        }
    }

    public static <T> void postComplete(ycg<? super T> ycgVar, Queue<T> queue, AtomicLong atomicLong, eb1 eb1Var) {
        long j;
        long j2;
        if (queue.isEmpty()) {
            ycgVar.onComplete();
            return;
        }
        if (m26193b(atomicLong.get(), ycgVar, queue, atomicLong, eb1Var)) {
            return;
        }
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j2 = j | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j, j2));
        if (j != 0) {
            m26193b(j2, ycgVar, queue, atomicLong, eb1Var);
        }
    }

    public static <T> boolean postCompleteRequest(long j, ycg<? super T> ycgVar, Queue<T> queue, AtomicLong atomicLong, eb1 eb1Var) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, so0.addCap(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
        if (j2 != Long.MIN_VALUE) {
            return false;
        }
        m26193b(j | Long.MIN_VALUE, ycgVar, queue, atomicLong, eb1Var);
        return true;
    }

    public static void request(fdg fdgVar, int i) {
        fdgVar.request(i < 0 ? Long.MAX_VALUE : i);
    }

    public static <T, U> boolean checkTerminated(boolean z, boolean z2, oxb<?> oxbVar, boolean z3, ajf<?> ajfVar, mf4 mf4Var, osb<T, U> osbVar) {
        if (osbVar.cancelled()) {
            ajfVar.clear();
            mf4Var.dispose();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            Throwable thError = osbVar.error();
            if (thError != null) {
                oxbVar.onError(thError);
            } else {
                oxbVar.onComplete();
            }
            return true;
        }
        Throwable thError2 = osbVar.error();
        if (thError2 != null) {
            ajfVar.clear();
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            oxbVar.onError(thError2);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (mf4Var != null) {
            mf4Var.dispose();
        }
        oxbVar.onComplete();
        return true;
    }
}
