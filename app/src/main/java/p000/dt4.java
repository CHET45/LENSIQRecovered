package p000;

import java.time.Duration;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,35:1\n549#2:36\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n35#1:36\n*E\n"})
@xn8(name = "DurationConversionsJDK8Kt")
public final class dt4 {
    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.6")
    @t28
    /* JADX INFO: renamed from: toJavaDuration-LRDsOJo, reason: not valid java name */
    private static final Duration m28694toJavaDurationLRDsOJo(long j) {
        Duration durationOfSeconds = Duration.ofSeconds(bt4.m28073getInWholeSecondsimpl(j), bt4.m28075getNanosecondsComponentimpl(j));
        md8.checkNotNullExpressionValue(durationOfSeconds, "toComponents-impl(...)");
        return durationOfSeconds;
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.6")
    @t28
    private static final long toKotlinDuration(Duration duration) {
        md8.checkNotNullParameter(duration, "<this>");
        return bt4.m28088plusLRDsOJo(ft4.toDuration(duration.getSeconds(), lt4.f58684e), ft4.toDuration(duration.getNano(), lt4.f58681b));
    }
}
