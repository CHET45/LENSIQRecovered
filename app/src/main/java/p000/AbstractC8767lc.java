package p000;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: lc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8767lc<I, O> {

    /* JADX INFO: renamed from: lc$a */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public final T f57137a;

        public a(T t) {
            this.f57137a = t;
        }

        public final T getValue() {
            return this.f57137a;
        }
    }

    @yfb
    public abstract Intent createIntent(@yfb Context context, I i);

    @gib
    public a<O> getSynchronousResult(@yfb Context context, I i) {
        md8.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract O parseResult(int i, @gib Intent intent);
}
