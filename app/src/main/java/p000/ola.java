package p000;

import android.media.MediaRoute2Info;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ola implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return Objects.nonNull((MediaRoute2Info) obj);
    }
}
