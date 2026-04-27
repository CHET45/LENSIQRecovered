package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.browser.trusted.C0563a;
import androidx.browser.trusted.TrustedWebActivityService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qjh {

    /* JADX INFO: renamed from: c */
    public static final String f74694c = "TWAConnectionPool";

    /* JADX INFO: renamed from: a */
    public final Context f74695a;

    /* JADX INFO: renamed from: b */
    public final Map<Uri, tr2> f74696b = new HashMap();

    /* JADX INFO: renamed from: qjh$a */
    public static class AsyncTaskC11516a extends AsyncTask<Void, Void, Exception> {

        /* JADX INFO: renamed from: a */
        public final Context f74697a;

        /* JADX INFO: renamed from: b */
        public final Intent f74698b;

        /* JADX INFO: renamed from: c */
        public final tr2 f74699c;

        public AsyncTaskC11516a(Context context, Intent intent, tr2 tr2Var) {
            this.f74697a = context.getApplicationContext();
            this.f74698b = intent;
            this.f74699c = tr2Var;
        }

        @Override // android.os.AsyncTask
        @hib
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.f74697a.bindService(this.f74698b, this.f74699c, 4097)) {
                    return null;
                }
                this.f74697a.unbindService(this.f74699c);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e) {
                Log.w(qjh.f74694c, "SecurityException while binding.", e);
                return e;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.f74699c.cancel(exc);
            }
        }
    }

    private qjh(@efb Context context) {
        this.f74695a = context.getApplicationContext();
    }

    @efb
    public static qjh create(@efb Context context) {
        return new qjh(context);
    }

    @hib
    private Intent createServiceIntent(Context context, Uri uri, Set<s3h> set, boolean z) {
        if (set == null || set.size() == 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            Iterator<s3h> it2 = set.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().matches(str2, context.getPackageManager())) {
                    str = str2;
                    break;
                }
            }
        }
        if (str == null) {
            if (z) {
                Log.w(f74694c, "No TWA candidates for " + uri + " have been registered.");
            }
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(str);
        intent2.setAction(TrustedWebActivityService.f3466d);
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveInfoResolveService == null) {
            if (z) {
                Log.w(f74694c, "Could not find TWAService for " + str);
            }
            return null;
        }
        if (z) {
            Log.i(f74694c, "Found " + resolveInfoResolveService.serviceInfo.name + " to handle request for " + uri);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(str, resolveInfoResolveService.serviceInfo.name));
        return intent3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connect$0(Uri uri) {
        this.f74696b.remove(uri);
    }

    /* JADX INFO: renamed from: b */
    public void m20404b() {
        Iterator<tr2> it = this.f74696b.values().iterator();
        while (it.hasNext()) {
            this.f74695a.unbindService(it.next());
        }
        this.f74696b.clear();
    }

    @efb
    @ir9
    public ja9<C0563a> connect(@efb final Uri uri, @efb Set<s3h> set, @efb Executor executor) {
        tr2 tr2Var = this.f74696b.get(uri);
        if (tr2Var != null) {
            return tr2Var.getServiceWrapper();
        }
        Intent intentCreateServiceIntent = createServiceIntent(this.f74695a, uri, set, true);
        if (intentCreateServiceIntent == null) {
            return t17.m22316a(new IllegalArgumentException("No service exists for scope"));
        }
        tr2 tr2Var2 = new tr2(new Runnable() { // from class: pjh
            @Override // java.lang.Runnable
            public final void run() {
                this.f71124a.lambda$connect$0(uri);
            }
        });
        this.f74696b.put(uri, tr2Var2);
        new AsyncTaskC11516a(this.f74695a, intentCreateServiceIntent, tr2Var2).executeOnExecutor(executor, new Void[0]);
        return tr2Var2.getServiceWrapper();
    }

    @ir9
    public boolean serviceExistsForScope(@efb Uri uri, @efb Set<s3h> set) {
        return (this.f74696b.get(uri) == null && createServiceIntent(this.f74695a, uri, set, false) == null) ? false : true;
    }
}
