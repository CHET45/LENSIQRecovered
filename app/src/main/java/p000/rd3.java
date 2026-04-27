package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.List;
import p000.p7e;
import p000.vd3;

/* JADX INFO: loaded from: classes.dex */
public class rd3 {

    /* JADX INFO: renamed from: d */
    public static final String f77851d = "CustomTabsClient";

    /* JADX INFO: renamed from: a */
    public final ICustomTabsService f77852a;

    /* JADX INFO: renamed from: b */
    public final ComponentName f77853b;

    /* JADX INFO: renamed from: c */
    public final Context f77854c;

    /* JADX INFO: renamed from: rd3$a */
    public class C12023a extends ud3 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f77855b;

        public C12023a(Context context) {
            this.f77855b = context;
        }

        @Override // p000.ud3
        public final void onCustomTabsServiceConnected(@efb ComponentName componentName, @efb rd3 rd3Var) {
            rd3Var.warmup(0L);
            this.f77855b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: rd3$b */
    public class BinderC12024b extends ICustomTabsCallback.Stub {

        /* JADX INFO: renamed from: a */
        public Handler f77856a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qd3 f77857b;

        /* JADX INFO: renamed from: rd3$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f77859a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f77860b;

            public a(int i, Bundle bundle) {
                this.f77859a = i;
                this.f77860b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC12024b.this.f77857b.onNavigationEvent(this.f77859a, this.f77860b);
            }
        }

        /* JADX INFO: renamed from: rd3$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f77862a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f77863b;

            public b(String str, Bundle bundle) {
                this.f77862a = str;
                this.f77863b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC12024b.this.f77857b.extraCallback(this.f77862a, this.f77863b);
            }
        }

        /* JADX INFO: renamed from: rd3$b$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Bundle f77865a;

            public c(Bundle bundle) {
                this.f77865a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC12024b.this.f77857b.onMessageChannelReady(this.f77865a);
            }
        }

        /* JADX INFO: renamed from: rd3$b$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f77867a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f77868b;

            public d(String str, Bundle bundle) {
                this.f77867a = str;
                this.f77868b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC12024b.this.f77857b.onPostMessage(this.f77867a, this.f77868b);
            }
        }

        /* JADX INFO: renamed from: rd3$b$e */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f77870a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Uri f77871b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f77872c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Bundle f77873d;

            public e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f77870a = i;
                this.f77871b = uri;
                this.f77872c = z;
                this.f77873d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC12024b.this.f77857b.onRelationshipValidationResult(this.f77870a, this.f77871b, this.f77872c, this.f77873d);
            }
        }

        public BinderC12024b(qd3 qd3Var) {
            this.f77857b = qd3Var;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) throws RemoteException {
            if (this.f77857b == null) {
                return;
            }
            this.f77856a.post(new b(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(@efb String str, @hib Bundle bundle) throws RemoteException {
            qd3 qd3Var = this.f77857b;
            if (qd3Var == null) {
                return null;
            }
            return qd3Var.extraCallbackWithResult(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) throws RemoteException {
            if (this.f77857b == null) {
                return;
            }
            this.f77856a.post(new c(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            if (this.f77857b == null) {
                return;
            }
            this.f77856a.post(new a(i, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) throws RemoteException {
            if (this.f77857b == null) {
                return;
            }
            this.f77856a.post(new d(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, @hib Bundle bundle) throws RemoteException {
            if (this.f77857b == null) {
                return;
            }
            this.f77856a.post(new e(i, uri, z, bundle));
        }
    }

    public rd3(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f77852a = iCustomTabsService;
        this.f77853b = componentName;
        this.f77854c = context;
    }

    public static boolean bindCustomTabsService(@efb Context context, @hib String str, @efb ud3 ud3Var) {
        ud3Var.m23249b(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.f3455c);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, ud3Var, 33);
    }

    public static boolean bindCustomTabsServicePreservePriority(@efb Context context, @hib String str, @efb ud3 ud3Var) {
        ud3Var.m23249b(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.f3455c);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, ud3Var, 1);
    }

    public static boolean connectAndInitialize(@efb Context context, @efb String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return bindCustomTabsService(applicationContext, str, new C12023a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private ICustomTabsCallback.Stub createCallbackWrapper(@hib qd3 qd3Var) {
        return new BinderC12024b(qd3Var);
    }

    private static PendingIntent createSessionId(Context context, int i) {
        return PendingIntent.getActivity(context, i, new Intent(), 67108864);
    }

    @hib
    public static String getPackageName(@efb Context context, @hib List<String> list) {
        return getPackageName(context, list, false);
    }

    @efb
    @p7e({p7e.EnumC10826a.f69934a})
    public static vd3.C14009b newPendingSession(@efb Context context, @hib qd3 qd3Var, int i) {
        return new vd3.C14009b(qd3Var, createSessionId(context, i));
    }

    @hib
    private vd3 newSessionInternal(@hib qd3 qd3Var, @hib PendingIntent pendingIntent) {
        boolean zNewSession;
        ICustomTabsCallback.Stub stubCreateCallbackWrapper = createCallbackWrapper(qd3Var);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(sd3.f81271e, pendingIntent);
                zNewSession = this.f77852a.newSessionWithExtras(stubCreateCallbackWrapper, bundle);
            } else {
                zNewSession = this.f77852a.newSession(stubCreateCallbackWrapper);
            }
            if (zNewSession) {
                return new vd3(this.f77852a, stubCreateCallbackWrapper, this.f77853b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public vd3 attachSession(@efb vd3.C14009b c14009b) {
        return newSessionInternal(c14009b.m23925a(), c14009b.m23926b());
    }

    @hib
    public Bundle extraCommand(@efb String str, @hib Bundle bundle) {
        try {
            return this.f77852a.extraCommand(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @hib
    public vd3 newSession(@hib qd3 qd3Var) {
        return newSessionInternal(qd3Var, null);
    }

    public boolean warmup(long j) {
        try {
            return this.f77852a.warmup(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @hib
    public static String getPackageName(@efb Context context, @hib List<String> list, boolean z) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(CustomTabsService.f3455c);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w(f77851d, "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    @hib
    public vd3 newSession(@hib qd3 qd3Var, int i) {
        return newSessionInternal(qd3Var, createSessionId(this.f77854c, i));
    }
}
