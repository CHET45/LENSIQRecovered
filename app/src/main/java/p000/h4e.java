package p000;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class h4e extends Fragment {

    /* JADX INFO: renamed from: m */
    public static final String f42354m = "RMFragment";

    /* JADX INFO: renamed from: a */
    public final C0136ab f42355a;

    /* JADX INFO: renamed from: b */
    public final j4e f42356b;

    /* JADX INFO: renamed from: c */
    public final Set<h4e> f42357c;

    /* JADX INFO: renamed from: d */
    @hib
    public g4e f42358d;

    /* JADX INFO: renamed from: e */
    @hib
    public h4e f42359e;

    /* JADX INFO: renamed from: f */
    @hib
    public Fragment f42360f;

    /* JADX INFO: renamed from: h4e$a */
    public class C6709a implements j4e {
        public C6709a() {
        }

        @Override // p000.j4e
        @efb
        public Set<g4e> getDescendants() {
            Set<h4e> setM12154a = h4e.this.m12154a();
            HashSet hashSet = new HashSet(setM12154a.size());
            for (h4e h4eVar : setM12154a) {
                if (h4eVar.getRequestManager() != null) {
                    hashSet.add(h4eVar.getRequestManager());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + h4e.this + "}";
        }
    }

    public h4e() {
        this(new C0136ab());
    }

    private void addChildRequestManagerFragment(h4e h4eVar) {
        this.f42357c.add(h4eVar);
    }

    @hib
    @omg(17)
    private Fragment getParentFragmentUsingHint() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f42360f;
    }

    @omg(17)
    private boolean isDescendant(@efb Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void registerFragmentWithRoot(@efb Activity activity) {
        unregisterFragmentWithRoot();
        h4e h4eVarM12770a = ComponentCallbacks2C2485a.get(activity).getRequestManagerRetriever().m12770a(activity);
        this.f42359e = h4eVarM12770a;
        if (equals(h4eVarM12770a)) {
            return;
        }
        this.f42359e.addChildRequestManagerFragment(this);
    }

    private void removeChildRequestManagerFragment(h4e h4eVar) {
        this.f42357c.remove(h4eVar);
    }

    private void unregisterFragmentWithRoot() {
        h4e h4eVar = this.f42359e;
        if (h4eVar != null) {
            h4eVar.removeChildRequestManagerFragment(this);
            this.f42359e = null;
        }
    }

    @efb
    @omg(17)
    /* JADX INFO: renamed from: a */
    public Set<h4e> m12154a() {
        if (equals(this.f42359e)) {
            return Collections.unmodifiableSet(this.f42357c);
        }
        if (this.f42359e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (h4e h4eVar : this.f42359e.m12154a()) {
            if (isDescendant(h4eVar.getParentFragment())) {
                hashSet.add(h4eVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @efb
    /* JADX INFO: renamed from: b */
    public C0136ab m12155b() {
        return this.f42355a;
    }

    /* JADX INFO: renamed from: c */
    public void m12156c(@hib Fragment fragment) {
        this.f42360f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        registerFragmentWithRoot(fragment.getActivity());
    }

    @hib
    public g4e getRequestManager() {
        return this.f42358d;
    }

    @efb
    public j4e getRequestManagerTreeNode() {
        return this.f42356b;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            registerFragmentWithRoot(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable(f42354m, 5)) {
                Log.w(f42354m, "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f42355a.m275a();
        unregisterFragmentWithRoot();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        unregisterFragmentWithRoot();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f42355a.m276b();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f42355a.m277c();
    }

    public void setRequestManager(@hib g4e g4eVar) {
        this.f42358d = g4eVar;
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + getParentFragmentUsingHint() + "}";
    }

    @fdi
    @igg({"ValidFragment"})
    public h4e(@efb C0136ab c0136ab) {
        this.f42356b = new C6709a();
        this.f42357c = new HashSet();
        this.f42355a = c0136ab;
    }
}
