package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public enum mdg implements fdg {
    CANCELLED;

    public static void deferredRequest(AtomicReference<fdg> atomicReference, AtomicLong atomicLong, long j) {
        fdg fdgVar = atomicReference.get();
        if (fdgVar != null) {
            fdgVar.request(j);
            return;
        }
        if (validate(j)) {
            so0.add(atomicLong, j);
            fdg fdgVar2 = atomicReference.get();
            if (fdgVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    fdgVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<fdg> atomicReference, AtomicLong atomicLong, fdg fdgVar) {
        if (!setOnce(atomicReference, fdgVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        fdgVar.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<fdg> atomicReference, fdg fdgVar) {
        fdg fdgVar2;
        do {
            fdgVar2 = atomicReference.get();
            if (fdgVar2 == CANCELLED) {
                if (fdgVar == null) {
                    return false;
                }
                fdgVar.cancel();
                return false;
            }
        } while (!v7b.m23844a(atomicReference, fdgVar2, fdgVar));
        return true;
    }

    public static void reportMoreProduced(long j) {
        pfe.onError(new yhd("More produced than requested: " + j));
    }

    public static void reportSubscriptionSet() {
        pfe.onError(new yhd("Subscription already set!"));
    }

    public static boolean set(AtomicReference<fdg> atomicReference, fdg fdgVar) {
        fdg fdgVar2;
        do {
            fdgVar2 = atomicReference.get();
            if (fdgVar2 == CANCELLED) {
                if (fdgVar == null) {
                    return false;
                }
                fdgVar.cancel();
                return false;
            }
        } while (!v7b.m23844a(atomicReference, fdgVar2, fdgVar));
        if (fdgVar2 == null) {
            return true;
        }
        fdgVar2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<fdg> atomicReference, fdg fdgVar) {
        xjb.requireNonNull(fdgVar, "s is null");
        if (v7b.m23844a(atomicReference, null, fdgVar)) {
            return true;
        }
        fdgVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(fdg fdgVar, fdg fdgVar2) {
        if (fdgVar2 == null) {
            pfe.onError(new NullPointerException("next is null"));
            return false;
        }
        if (fdgVar == null) {
            return true;
        }
        fdgVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // p000.fdg
    public void cancel() {
    }

    @Override // p000.fdg
    public void request(long j) {
    }

    public static boolean cancel(AtomicReference<fdg> atomicReference) {
        fdg andSet;
        fdg fdgVar = atomicReference.get();
        mdg mdgVar = CANCELLED;
        if (fdgVar == mdgVar || (andSet = atomicReference.getAndSet(mdgVar)) == mdgVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        pfe.onError(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static boolean setOnce(AtomicReference<fdg> atomicReference, fdg fdgVar, long j) {
        if (!setOnce(atomicReference, fdgVar)) {
            return false;
        }
        fdgVar.request(j);
        return true;
    }
}
