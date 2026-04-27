package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public enum ldg implements fdg {
    CANCELLED;

    public static void deferredRequest(AtomicReference<fdg> field, AtomicLong requested, long n) {
        fdg fdgVar = field.get();
        if (fdgVar != null) {
            fdgVar.request(n);
            return;
        }
        if (validate(n)) {
            ro0.add(requested, n);
            fdg fdgVar2 = field.get();
            if (fdgVar2 != null) {
                long andSet = requested.getAndSet(0L);
                if (andSet != 0) {
                    fdgVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<fdg> field, AtomicLong requested, fdg s) {
        if (!setOnce(field, s)) {
            return false;
        }
        long andSet = requested.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        s.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<fdg> field, fdg s) {
        fdg fdgVar;
        do {
            fdgVar = field.get();
            if (fdgVar == CANCELLED) {
                if (s == null) {
                    return false;
                }
                s.cancel();
                return false;
            }
        } while (!v7b.m23844a(field, fdgVar, s));
        return true;
    }

    public static void reportMoreProduced(long n) {
        ofe.onError(new xhd("More produced than requested: " + n));
    }

    public static void reportSubscriptionSet() {
        ofe.onError(new xhd("Subscription already set!"));
    }

    public static boolean set(AtomicReference<fdg> field, fdg s) {
        fdg fdgVar;
        do {
            fdgVar = field.get();
            if (fdgVar == CANCELLED) {
                if (s == null) {
                    return false;
                }
                s.cancel();
                return false;
            }
        } while (!v7b.m23844a(field, fdgVar, s));
        if (fdgVar == null) {
            return true;
        }
        fdgVar.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<fdg> field, fdg s) {
        Objects.requireNonNull(s, "s is null");
        if (v7b.m23844a(field, null, s)) {
            return true;
        }
        s.cancel();
        if (field.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(fdg current, fdg next) {
        if (next == null) {
            ofe.onError(new NullPointerException("next is null"));
            return false;
        }
        if (current == null) {
            return true;
        }
        next.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // p000.fdg
    public void cancel() {
    }

    @Override // p000.fdg
    public void request(long n) {
    }

    public static boolean cancel(AtomicReference<fdg> field) {
        fdg andSet;
        fdg fdgVar = field.get();
        ldg ldgVar = CANCELLED;
        if (fdgVar == ldgVar || (andSet = field.getAndSet(ldgVar)) == ldgVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long n) {
        if (n > 0) {
            return true;
        }
        ofe.onError(new IllegalArgumentException("n > 0 required but it was " + n));
        return false;
    }

    public static boolean setOnce(AtomicReference<fdg> field, fdg s, long request) {
        if (!setOnce(field, s)) {
            return false;
        }
        s.request(request);
        return true;
    }
}
