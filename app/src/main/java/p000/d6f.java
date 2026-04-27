package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
@qpf
public final class d6f implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    @yfb
    public final daf f28571a;

    /* JADX INFO: renamed from: b */
    public boolean f28572b;

    @a28
    public d6f(@yfb daf dafVar) {
        md8.checkNotNullParameter(dafVar, "sharedSessionRepository");
        this.f28571a = dafVar;
        this.f28572b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@yfb Activity activity, @gib Bundle bundle) {
        md8.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@yfb Activity activity) {
        md8.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@yfb Activity activity) {
        md8.checkNotNullParameter(activity, "activity");
        if (this.f28572b) {
            this.f28571a.appBackground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@yfb Activity activity) {
        md8.checkNotNullParameter(activity, "activity");
        if (this.f28572b) {
            this.f28571a.appForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@yfb Activity activity, @yfb Bundle bundle) {
        md8.checkNotNullParameter(activity, "activity");
        md8.checkNotNullParameter(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@yfb Activity activity) {
        md8.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@yfb Activity activity) {
        md8.checkNotNullParameter(activity, "activity");
    }

    public final void onAppDelete() {
        this.f28572b = false;
    }
}
