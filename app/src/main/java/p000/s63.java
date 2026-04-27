package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import p000.kad;

/* JADX INFO: loaded from: classes3.dex */
@c5e(16)
@igg({"ObsoleteSdkInt"})
public final class s63 implements q63 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C12458a f80751c = new C12458a(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f80752d = "android.settings.CREDENTIAL_PROVIDER";

    /* JADX INFO: renamed from: b */
    @yfb
    public final Context f80753b;

    /* JADX INFO: renamed from: s63$a */
    public static final class C12458a {
        public /* synthetic */ C12458a(jt3 jt3Var) {
            this();
        }

        private C12458a() {
        }
    }

    public s63(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        this.f80753b = context;
    }

    @Override // p000.q63
    public void clearCredentialStateAsync(@yfb b22 b22Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<Void, y12> r63Var) {
        md8.checkNotNullParameter(b22Var, "request");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
        u63 bestAvailableProvider = v63.f90049a.getBestAvailableProvider(this.f80753b);
        if (bestAvailableProvider == null) {
            r63Var.onError(new a22("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider.onClearCredential(b22Var, cancellationSignal, executor, r63Var);
        }
    }

    @Override // p000.q63
    public void createCredentialAsync(@yfb Context context, @yfb p53 p53Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<q53, l53> r63Var) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(p53Var, "request");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
        u63 bestAvailableProvider = v63.f90049a.getBestAvailableProvider(this.f80753b);
        if (bestAvailableProvider == null) {
            r63Var.onError(new o53("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider.onCreateCredential(context, p53Var, cancellationSignal, executor, r63Var);
        }
    }

    @Override // p000.q63
    @c5e(34)
    @yfb
    public PendingIntent createSettingsPendingIntent() {
        Intent intent = new Intent(f80752d);
        intent.setData(Uri.parse("package:" + this.f80753b.getPackageName()));
        PendingIntent activity = PendingIntent.getActivity(this.f80753b, 0, intent, 67108864);
        md8.checkNotNullExpressionValue(activity, "getActivity(context, 0, …ingIntent.FLAG_IMMUTABLE)");
        return activity;
    }

    @Override // p000.q63
    public void getCredentialAsync(@yfb Context context, @yfb z37 z37Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<a47, w37> r63Var) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(z37Var, "request");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
        u63 bestAvailableProvider = v63.f90049a.getBestAvailableProvider(this.f80753b);
        if (bestAvailableProvider == null) {
            r63Var.onError(new y37("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider.onGetCredential(context, z37Var, cancellationSignal, executor, r63Var);
        }
    }

    @Override // p000.q63
    @c5e(34)
    public void prepareGetCredentialAsync(@yfb z37 z37Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<kad, w37> r63Var) {
        md8.checkNotNullParameter(z37Var, "request");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
        v63.f90049a.getUAndAboveProvider(this.f80753b).onPrepareCredential(z37Var, cancellationSignal, executor, r63Var);
    }

    @Override // p000.q63
    @c5e(34)
    public void getCredentialAsync(@yfb Context context, @yfb kad.C8269b c8269b, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<a47, w37> r63Var) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(c8269b, "pendingGetCredentialHandle");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
        v63.f90049a.getUAndAboveProvider(context).onGetCredential(context, c8269b, cancellationSignal, executor, r63Var);
    }
}
