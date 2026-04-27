package com.watchfun.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p000.efb;
import p000.m30;

/* JADX INFO: loaded from: classes6.dex */
public class BaseApplication extends Application {

    /* JADX INFO: renamed from: a */
    public static Application f25067a;

    /* JADX INFO: renamed from: com.watchfun.base.BaseApplication$a */
    public class C4002a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            m30.getAppManager().addActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            m30.getAppManager().removeActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public static Application getInstance() {
        Application application = f25067a;
        if (application != null) {
            return application;
        }
        throw new NullPointerException("please inherit BaseApplication or call setApplication.");
    }

    public static synchronized void setApplication(@efb Application application) {
        f25067a = application;
        application.registerActivityLifecycleCallbacks(new C4002a());
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        setApplication(this);
    }
}
