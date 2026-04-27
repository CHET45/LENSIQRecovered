package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class h7c {
    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.8")
    @yfb
    public static final <T> vye<T> asSequence(@yfb Optional<? extends T> optional) {
        md8.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? ize.sequenceOf(optional.get()) : ize.emptySequence();
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.8")
    public static final <T> T getOrDefault(@yfb Optional<? extends T> optional, T t) {
        md8.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? optional.get() : t;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.8")
    public static final <T> T getOrElse(@yfb Optional<? extends T> optional, @yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(optional, "<this>");
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        return optional.isPresent() ? optional.get() : ny6Var.invoke();
    }

    @gib
    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.8")
    public static final <T> T getOrNull(@yfb Optional<T> optional) {
        md8.checkNotNullParameter(optional, "<this>");
        return optional.orElse(null);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.8")
    @yfb
    public static final <T, C extends Collection<? super T>> C toCollection(@yfb Optional<T> optional, @yfb C c) {
        md8.checkNotNullParameter(optional, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        if (optional.isPresent()) {
            T t = optional.get();
            md8.checkNotNullExpressionValue(t, "get(...)");
            c.add(t);
        }
        return c;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.8")
    @yfb
    public static final <T> List<T> toList(@yfb Optional<? extends T> optional) {
        md8.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? k82.listOf(optional.get()) : l82.emptyList();
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.8")
    @yfb
    public static final <T> Set<T> toSet(@yfb Optional<? extends T> optional) {
        md8.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? v6f.setOf(optional.get()) : w6f.emptySet();
    }
}
