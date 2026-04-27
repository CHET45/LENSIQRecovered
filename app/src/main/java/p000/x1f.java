package p000;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes7.dex */
public final class x1f extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1f(@yfb String str) {
        super(str);
        md8.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x1f(@yfb oo8<?> oo8Var, @yfb oo8<?> oo8Var2) {
        this("Serializer for " + oo8Var2 + " already registered in the scope of " + oo8Var);
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(oo8Var2, "concreteClass");
    }
}
