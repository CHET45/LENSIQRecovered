package p000;

import com.google.firebase.crashlytics.FirebaseCrashlytics;

/* JADX INFO: loaded from: classes5.dex */
public final class ox5 {
    @yfb
    public static final FirebaseCrashlytics getCrashlytics(@yfb hw5 hw5Var) {
        md8.checkNotNullParameter(hw5Var, "<this>");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        md8.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
        return firebaseCrashlytics;
    }

    public static final void recordException(@yfb FirebaseCrashlytics firebaseCrashlytics, @yfb Throwable th, @yfb qy6<? super nr8, bth> qy6Var) {
        md8.checkNotNullParameter(firebaseCrashlytics, "<this>");
        md8.checkNotNullParameter(th, "throwable");
        md8.checkNotNullParameter(qy6Var, "init");
        nr8 nr8Var = new nr8();
        qy6Var.invoke(nr8Var);
        firebaseCrashlytics.recordException(th, nr8Var.build$com_google_firebase_firebase_crashlytics());
    }

    public static final void setCustomKeys(@yfb FirebaseCrashlytics firebaseCrashlytics, @yfb qy6<? super nr8, bth> qy6Var) {
        md8.checkNotNullParameter(firebaseCrashlytics, "<this>");
        md8.checkNotNullParameter(qy6Var, "init");
        nr8 nr8Var = new nr8();
        qy6Var.invoke(nr8Var);
        firebaseCrashlytics.setCustomKeys(nr8Var.build$com_google_firebase_firebase_crashlytics());
    }
}
