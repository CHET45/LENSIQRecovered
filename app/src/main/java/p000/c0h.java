package p000;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class c0h {
    private static final long coerceToMillis(Duration duration) {
        if (duration.compareTo(Duration.ZERO) <= 0) {
            return 0L;
        }
        if (duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1L;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }

    @d86
    @yfb
    public static final <T> y56<T> debounce(@yfb y56<? extends T> y56Var, @yfb Duration duration) {
        return c76.debounce(y56Var, coerceToMillis(duration));
    }

    @gib
    public static final Object delay(@yfb Duration duration, @yfb zy2<? super bth> zy2Var) {
        Object objDelay = p34.delay(coerceToMillis(duration), zy2Var);
        return objDelay == pd8.getCOROUTINE_SUSPENDED() ? objDelay : bth.f14751a;
    }

    public static final <R> void onTimeout(@yfb fve<? super R> fveVar, @yfb Duration duration, @yfb qy6<? super zy2<? super R>, ? extends Object> qy6Var) {
        x4c.onTimeout(fveVar, coerceToMillis(duration), qy6Var);
    }

    @d86
    @yfb
    public static final <T> y56<T> sample(@yfb y56<? extends T> y56Var, @yfb Duration duration) {
        return c76.sample(y56Var, coerceToMillis(duration));
    }

    @gib
    public static final <T> Object withTimeout(@yfb Duration duration, @yfb gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        return c2h.withTimeout(coerceToMillis(duration), gz6Var, zy2Var);
    }

    @gib
    public static final <T> Object withTimeoutOrNull(@yfb Duration duration, @yfb gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        return c2h.withTimeoutOrNull(coerceToMillis(duration), gz6Var, zy2Var);
    }
}
