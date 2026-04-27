package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class y15 {
    private y15() {
        throw new IllegalStateException("No instances!");
    }

    public static String composeMessage(String consumer) {
        return "It is not allowed to subscribe with a(n) " + consumer + " multiple times. Please create a fresh instance of " + consumer + " and subscribe that to the target source instead.";
    }

    public static void reportDoubleSubscription(Class<?> consumer) {
        ofe.onError(new xhd(composeMessage(consumer.getName())));
    }

    public static boolean setOnce(AtomicReference<lf4> upstream, lf4 next, Class<?> observer) {
        Objects.requireNonNull(next, "next is null");
        if (v7b.m23844a(upstream, null, next)) {
            return true;
        }
        next.dispose();
        if (upstream.get() == zf4.DISPOSED) {
            return false;
        }
        reportDoubleSubscription(observer);
        return false;
    }

    public static boolean validate(lf4 upstream, lf4 next, Class<?> observer) {
        Objects.requireNonNull(next, "next is null");
        if (upstream == null) {
            return true;
        }
        next.dispose();
        if (upstream == zf4.DISPOSED) {
            return false;
        }
        reportDoubleSubscription(observer);
        return false;
    }

    public static boolean validate(fdg upstream, fdg next, Class<?> subscriber) {
        Objects.requireNonNull(next, "next is null");
        if (upstream == null) {
            return true;
        }
        next.cancel();
        if (upstream == ldg.CANCELLED) {
            return false;
        }
        reportDoubleSubscription(subscriber);
        return false;
    }

    public static boolean setOnce(AtomicReference<fdg> upstream, fdg next, Class<?> subscriber) {
        Objects.requireNonNull(next, "next is null");
        if (v7b.m23844a(upstream, null, next)) {
            return true;
        }
        next.cancel();
        if (upstream.get() == ldg.CANCELLED) {
            return false;
        }
        reportDoubleSubscription(subscriber);
        return false;
    }
}
