package p000;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C2486b;
import com.bumptech.glide.C2488d;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class i4e implements Handler.Callback {

    /* JADX INFO: renamed from: H */
    @fdi
    public static final String f45725H = "com.bumptech.glide.manager";

    /* JADX INFO: renamed from: L */
    public static final String f45726L = "RMRetriever";

    /* JADX INFO: renamed from: M */
    public static final int f45727M = 1;

    /* JADX INFO: renamed from: N */
    public static final int f45728N = 1;

    /* JADX INFO: renamed from: Q */
    public static final int f45729Q = 2;

    /* JADX INFO: renamed from: X */
    public static final String f45730X = "key";

    /* JADX INFO: renamed from: Y */
    public static final InterfaceC7144b f45731Y = new C7143a();

    /* JADX INFO: renamed from: F */
    public final jv6 f45733F;

    /* JADX INFO: renamed from: a */
    public volatile g4e f45734a;

    /* JADX INFO: renamed from: d */
    public final Handler f45737d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7144b f45738e;

    /* JADX INFO: renamed from: b */
    @fdi
    public final Map<FragmentManager, h4e> f45735b = new HashMap();

    /* JADX INFO: renamed from: c */
    @fdi
    public final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> f45736c = new HashMap();

    /* JADX INFO: renamed from: f */
    public final x60<View, Fragment> f45739f = new x60<>();

    /* JADX INFO: renamed from: m */
    public final x60<View, android.app.Fragment> f45740m = new x60<>();

    /* JADX INFO: renamed from: C */
    public final Bundle f45732C = new Bundle();

    /* JADX INFO: renamed from: i4e$a */
    public class C7143a implements InterfaceC7144b {
        @Override // p000.i4e.InterfaceC7144b
        @efb
        public g4e build(@efb ComponentCallbacks2C2485a componentCallbacks2C2485a, @efb u49 u49Var, @efb j4e j4eVar, @efb Context context) {
            return new g4e(componentCallbacks2C2485a, u49Var, j4eVar, context);
        }
    }

    /* JADX INFO: renamed from: i4e$b */
    public interface InterfaceC7144b {
        @efb
        g4e build(@efb ComponentCallbacks2C2485a componentCallbacks2C2485a, @efb u49 u49Var, @efb j4e j4eVar, @efb Context context);
    }

    public i4e(@hib InterfaceC7144b interfaceC7144b, C2488d c2488d) {
        this.f45738e = interfaceC7144b == null ? f45731Y : interfaceC7144b;
        this.f45737d = new Handler(Looper.getMainLooper(), this);
        this.f45733F = buildFrameWaiter(c2488d);
    }

    @omg(17)
    private static void assertNotDestroyed(@efb Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static jv6 buildFrameWaiter(C2488d c2488d) {
        return (pg7.f70689i && pg7.f70688h) ? c2488d.isEnabled(C2486b.g.class) ? new l16() : new m16() : new kh4();
    }

    @hib
    private static Activity findActivity(@efb Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @omg(26)
    @Deprecated
    private void findAllFragmentsWithViews(@efb FragmentManager fragmentManager, @efb x60<View, android.app.Fragment> x60Var) {
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                x60Var.put(fragment.getView(), fragment);
                findAllFragmentsWithViews(fragment.getChildFragmentManager(), x60Var);
            }
        }
    }

    @Deprecated
    private void findAllFragmentsWithViewsPreO(@efb FragmentManager fragmentManager, @efb x60<View, android.app.Fragment> x60Var) {
        android.app.Fragment fragment;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f45732C.putInt("key", i);
            try {
                fragment = fragmentManager.getFragment(this.f45732C, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                x60Var.put(fragment.getView(), fragment);
                findAllFragmentsWithViews(fragment.getChildFragmentManager(), x60Var);
            }
            i = i2;
        }
    }

    private static void findAllSupportFragmentsWithViews(@hib Collection<Fragment> collection, @efb Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                findAllSupportFragmentsWithViews(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    @hib
    @Deprecated
    private android.app.Fragment findFragment(@efb View view, @efb Activity activity) {
        this.f45740m.clear();
        findAllFragmentsWithViews(activity.getFragmentManager(), this.f45740m);
        View viewFindViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f45740m.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f45740m.clear();
        return fragment;
    }

    @hib
    private Fragment findSupportFragment(@efb View view, @efb FragmentActivity fragmentActivity) {
        this.f45739f.clear();
        findAllSupportFragmentsWithViews(fragmentActivity.getSupportFragmentManager().getFragments(), this.f45739f);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f45739f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f45739f.clear();
        return fragment;
    }

    @efb
    @Deprecated
    private g4e fragmentGet(@efb Context context, @efb FragmentManager fragmentManager, @hib android.app.Fragment fragment, boolean z) {
        h4e requestManagerFragment = getRequestManagerFragment(fragmentManager, fragment);
        g4e requestManager = requestManagerFragment.getRequestManager();
        if (requestManager == null) {
            requestManager = this.f45738e.build(ComponentCallbacks2C2485a.get(context), requestManagerFragment.m12155b(), requestManagerFragment.getRequestManagerTreeNode(), context);
            if (z) {
                requestManager.onStart();
            }
            requestManagerFragment.setRequestManager(requestManager);
        }
        return requestManager;
    }

    @efb
    private g4e getApplicationManager(@efb Context context) {
        if (this.f45734a == null) {
            synchronized (this) {
                try {
                    if (this.f45734a == null) {
                        this.f45734a = this.f45738e.build(ComponentCallbacks2C2485a.get(context.getApplicationContext()), new l40(), new p05(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f45734a;
    }

    @efb
    private h4e getRequestManagerFragment(@efb FragmentManager fragmentManager, @hib android.app.Fragment fragment) {
        h4e h4eVar = this.f45735b.get(fragmentManager);
        if (h4eVar != null) {
            return h4eVar;
        }
        h4e h4eVar2 = (h4e) fragmentManager.findFragmentByTag(f45725H);
        if (h4eVar2 == null) {
            h4eVar2 = new h4e();
            h4eVar2.m12156c(fragment);
            this.f45735b.put(fragmentManager, h4eVar2);
            fragmentManager.beginTransaction().add(h4eVar2, f45725H).commitAllowingStateLoss();
            this.f45737d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return h4eVar2;
    }

    @efb
    private SupportRequestManagerFragment getSupportRequestManagerFragment(@efb androidx.fragment.app.FragmentManager fragmentManager, @hib Fragment fragment) {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f45736c.get(fragmentManager);
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) fragmentManager.findFragmentByTag(f45725H);
        if (supportRequestManagerFragment2 == null) {
            supportRequestManagerFragment2 = new SupportRequestManagerFragment();
            supportRequestManagerFragment2.m4382c(fragment);
            this.f45736c.put(fragmentManager, supportRequestManagerFragment2);
            fragmentManager.beginTransaction().add(supportRequestManagerFragment2, f45725H).commitAllowingStateLoss();
            this.f45737d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment2;
    }

    private static boolean isActivityVisible(Context context) {
        Activity activityFindActivity = findActivity(context);
        return activityFindActivity == null || !activityFindActivity.isFinishing();
    }

    @efb
    private g4e supportFragmentGet(@efb Context context, @efb androidx.fragment.app.FragmentManager fragmentManager, @hib Fragment fragment, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragment = getSupportRequestManagerFragment(fragmentManager, fragment);
        g4e requestManager = supportRequestManagerFragment.getRequestManager();
        if (requestManager == null) {
            requestManager = this.f45738e.build(ComponentCallbacks2C2485a.get(context), supportRequestManagerFragment.m4381b(), supportRequestManagerFragment.getRequestManagerTreeNode(), context);
            if (z) {
                requestManager.onStart();
            }
            supportRequestManagerFragment.setRequestManager(requestManager);
        }
        return requestManager;
    }

    private boolean verifyOurFragmentWasAddedOrCantBeAdded(FragmentManager fragmentManager, boolean z) {
        h4e h4eVar = this.f45735b.get(fragmentManager);
        h4e h4eVar2 = (h4e) fragmentManager.findFragmentByTag(f45725H);
        if (h4eVar2 == h4eVar) {
            return true;
        }
        if (h4eVar2 != null && h4eVar2.getRequestManager() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + h4eVar2 + " New: " + h4eVar);
        }
        if (z || fragmentManager.isDestroyed()) {
            if (Log.isLoggable(f45726L, 5)) {
                if (fragmentManager.isDestroyed()) {
                    Log.w(f45726L, "Parent was destroyed before our Fragment could be added");
                } else {
                    Log.w(f45726L, "Tried adding Fragment twice and failed twice, giving up!");
                }
            }
            h4eVar.m12155b().m275a();
            return true;
        }
        FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(h4eVar, f45725H);
        if (h4eVar2 != null) {
            fragmentTransactionAdd.remove(h4eVar2);
        }
        fragmentTransactionAdd.commitAllowingStateLoss();
        this.f45737d.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
        Log.isLoggable(f45726L, 3);
        return false;
    }

    private boolean verifyOurSupportFragmentWasAddedOrCantBeAdded(androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f45736c.get(fragmentManager);
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) fragmentManager.findFragmentByTag(f45725H);
        if (supportRequestManagerFragment2 == supportRequestManagerFragment) {
            return true;
        }
        if (supportRequestManagerFragment2 != null && supportRequestManagerFragment2.getRequestManager() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + supportRequestManagerFragment2 + " New: " + supportRequestManagerFragment);
        }
        if (z || fragmentManager.isDestroyed()) {
            if (fragmentManager.isDestroyed()) {
                if (Log.isLoggable(f45726L, 5)) {
                    Log.w(f45726L, "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                }
            } else if (Log.isLoggable(f45726L, 6)) {
                Log.e(f45726L, "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
            }
            supportRequestManagerFragment.m4381b().m275a();
            return true;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(supportRequestManagerFragment, f45725H);
        if (supportRequestManagerFragment2 != null) {
            fragmentTransactionAdd.remove(supportRequestManagerFragment2);
        }
        fragmentTransactionAdd.commitNowAllowingStateLoss();
        this.f45737d.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
        Log.isLoggable(f45726L, 3);
        return false;
    }

    @efb
    @Deprecated
    /* JADX INFO: renamed from: a */
    public h4e m12770a(Activity activity) {
        return getRequestManagerFragment(activity.getFragmentManager(), null);
    }

    @efb
    /* JADX INFO: renamed from: b */
    public SupportRequestManagerFragment m12771b(androidx.fragment.app.FragmentManager fragmentManager) {
        return getSupportRequestManagerFragment(fragmentManager, null);
    }

    @efb
    public g4e get(@efb Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (v0i.isOnMainThread() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return get((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return get((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return get(contextWrapper.getBaseContext());
                }
            }
        }
        return getApplicationManager(context);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        androidx.fragment.app.FragmentManager fragmentManager;
        androidx.fragment.app.FragmentManager fragmentManager2;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = message.arg1 == 1;
        int i = message.what;
        Object objRemove = null;
        if (i == 1) {
            FragmentManager fragmentManager3 = (FragmentManager) message.obj;
            if (verifyOurFragmentWasAddedOrCantBeAdded(fragmentManager3, z3)) {
                objRemove = this.f45735b.remove(fragmentManager3);
                fragmentManager2 = fragmentManager3;
                z2 = true;
                fragmentManager = fragmentManager2;
            }
            fragmentManager = null;
            z2 = true;
            z = false;
        } else if (i != 2) {
            z = false;
            fragmentManager = null;
        } else {
            androidx.fragment.app.FragmentManager fragmentManager4 = (androidx.fragment.app.FragmentManager) message.obj;
            if (verifyOurSupportFragmentWasAddedOrCantBeAdded(fragmentManager4, z3)) {
                objRemove = this.f45736c.remove(fragmentManager4);
                fragmentManager2 = fragmentManager4;
                z2 = true;
                fragmentManager = fragmentManager2;
            }
            fragmentManager = null;
            z2 = true;
            z = false;
        }
        if (Log.isLoggable(f45726L, 5) && z && objRemove == null) {
            Log.w(f45726L, "Failed to remove expected request manager fragment, manager: " + fragmentManager);
        }
        return z2;
    }

    @efb
    public g4e get(@efb FragmentActivity fragmentActivity) {
        if (v0i.isOnBackgroundThread()) {
            return get(fragmentActivity.getApplicationContext());
        }
        assertNotDestroyed(fragmentActivity);
        this.f45733F.registerSelf(fragmentActivity);
        return supportFragmentGet(fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, isActivityVisible(fragmentActivity));
    }

    @efb
    public g4e get(@efb Fragment fragment) {
        t7d.checkNotNull(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (v0i.isOnBackgroundThread()) {
            return get(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f45733F.registerSelf(fragment.getActivity());
        }
        return supportFragmentGet(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @efb
    public g4e get(@efb Activity activity) {
        if (v0i.isOnBackgroundThread()) {
            return get(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return get((FragmentActivity) activity);
        }
        assertNotDestroyed(activity);
        this.f45733F.registerSelf(activity);
        return fragmentGet(activity, activity.getFragmentManager(), null, isActivityVisible(activity));
    }

    @efb
    public g4e get(@efb View view) {
        if (v0i.isOnBackgroundThread()) {
            return get(view.getContext().getApplicationContext());
        }
        t7d.checkNotNull(view);
        t7d.checkNotNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityFindActivity = findActivity(view.getContext());
        if (activityFindActivity == null) {
            return get(view.getContext().getApplicationContext());
        }
        if (activityFindActivity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityFindActivity;
            Fragment fragmentFindSupportFragment = findSupportFragment(view, fragmentActivity);
            return fragmentFindSupportFragment != null ? get(fragmentFindSupportFragment) : get(fragmentActivity);
        }
        android.app.Fragment fragmentFindFragment = findFragment(view, activityFindActivity);
        if (fragmentFindFragment == null) {
            return get(activityFindActivity);
        }
        return get(fragmentFindFragment);
    }

    @efb
    @omg(17)
    @Deprecated
    public g4e get(@efb android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            if (!v0i.isOnBackgroundThread()) {
                if (fragment.getActivity() != null) {
                    this.f45733F.registerSelf(fragment.getActivity());
                }
                return fragmentGet(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
            }
            return get(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }
}
