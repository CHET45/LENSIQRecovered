package p000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: tc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12973tc {

    /* JADX INFO: renamed from: h */
    public static final String f84197h = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* JADX INFO: renamed from: i */
    public static final String f84198i = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* JADX INFO: renamed from: j */
    public static final String f84199j = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* JADX INFO: renamed from: k */
    public static final String f84200k = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* JADX INFO: renamed from: l */
    public static final String f84201l = "ActivityResultRegistry";

    /* JADX INFO: renamed from: m */
    public static final int f84202m = 65536;

    /* JADX INFO: renamed from: a */
    public final Map<Integer, String> f84203a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<String, Integer> f84204b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<String, e> f84205c = new HashMap();

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f84206d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final transient Map<String, d<?>> f84207e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Map<String, Object> f84208f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f84209g = new Bundle();

    /* JADX INFO: renamed from: tc$a */
    public class a implements InterfaceC1154n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f84210a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC5717fc f84211b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC8767lc f84212c;

        public a(String str, InterfaceC5717fc interfaceC5717fc, AbstractC8767lc abstractC8767lc) {
            this.f84210a = str;
            this.f84211b = interfaceC5717fc;
            this.f84212c = abstractC8767lc;
        }

        @Override // androidx.lifecycle.InterfaceC1154n
        public void onStateChanged(@efb g59 g59Var, @efb AbstractC1143j.a aVar) {
            if (!AbstractC1143j.a.ON_START.equals(aVar)) {
                if (AbstractC1143j.a.ON_STOP.equals(aVar)) {
                    AbstractC12973tc.this.f84207e.remove(this.f84210a);
                    return;
                } else {
                    if (AbstractC1143j.a.ON_DESTROY.equals(aVar)) {
                        AbstractC12973tc.this.m22456a(this.f84210a);
                        return;
                    }
                    return;
                }
            }
            AbstractC12973tc.this.f84207e.put(this.f84210a, new d<>(this.f84211b, this.f84212c));
            if (AbstractC12973tc.this.f84208f.containsKey(this.f84210a)) {
                Object obj = AbstractC12973tc.this.f84208f.get(this.f84210a);
                AbstractC12973tc.this.f84208f.remove(this.f84210a);
                this.f84211b.onActivityResult(obj);
            }
            ActivityResult activityResult = (ActivityResult) AbstractC12973tc.this.f84209g.getParcelable(this.f84210a);
            if (activityResult != null) {
                AbstractC12973tc.this.f84209g.remove(this.f84210a);
                this.f84211b.onActivityResult(this.f84212c.parseResult(activityResult.getResultCode(), activityResult.getData()));
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: tc$b */
    public class b<I> extends AbstractC11416qc<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f84214a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC8767lc f84215b;

        public b(String str, AbstractC8767lc abstractC8767lc) {
            this.f84214a = str;
            this.f84215b = abstractC8767lc;
        }

        @Override // p000.AbstractC11416qc
        @efb
        public AbstractC8767lc<I, ?> getContract() {
            return this.f84215b;
        }

        @Override // p000.AbstractC11416qc
        public void launch(I i, @hib ActivityOptionsCompat activityOptionsCompat) throws Exception {
            Integer num = AbstractC12973tc.this.f84204b.get(this.f84214a);
            if (num != null) {
                AbstractC12973tc.this.f84206d.add(this.f84214a);
                try {
                    AbstractC12973tc.this.onLaunch(num.intValue(), this.f84215b, i, activityOptionsCompat);
                    return;
                } catch (Exception e) {
                    AbstractC12973tc.this.f84206d.remove(this.f84214a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f84215b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // p000.AbstractC11416qc
        public void unregister() {
            AbstractC12973tc.this.m22456a(this.f84214a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: tc$c */
    public class c<I> extends AbstractC11416qc<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f84217a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC8767lc f84218b;

        public c(String str, AbstractC8767lc abstractC8767lc) {
            this.f84217a = str;
            this.f84218b = abstractC8767lc;
        }

        @Override // p000.AbstractC11416qc
        @efb
        public AbstractC8767lc<I, ?> getContract() {
            return this.f84218b;
        }

        @Override // p000.AbstractC11416qc
        public void launch(I i, @hib ActivityOptionsCompat activityOptionsCompat) throws Exception {
            Integer num = AbstractC12973tc.this.f84204b.get(this.f84217a);
            if (num != null) {
                AbstractC12973tc.this.f84206d.add(this.f84217a);
                try {
                    AbstractC12973tc.this.onLaunch(num.intValue(), this.f84218b, i, activityOptionsCompat);
                    return;
                } catch (Exception e) {
                    AbstractC12973tc.this.f84206d.remove(this.f84217a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f84218b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // p000.AbstractC11416qc
        public void unregister() {
            AbstractC12973tc.this.m22456a(this.f84217a);
        }
    }

    /* JADX INFO: renamed from: tc$d */
    public static class d<O> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5717fc<O> f84220a;

        /* JADX INFO: renamed from: b */
        public final AbstractC8767lc<?, O> f84221b;

        public d(InterfaceC5717fc<O> interfaceC5717fc, AbstractC8767lc<?, O> abstractC8767lc) {
            this.f84220a = interfaceC5717fc;
            this.f84221b = abstractC8767lc;
        }
    }

    /* JADX INFO: renamed from: tc$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final AbstractC1143j f84222a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<InterfaceC1154n> f84223b = new ArrayList<>();

        public e(@efb AbstractC1143j abstractC1143j) {
            this.f84222a = abstractC1143j;
        }

        /* JADX INFO: renamed from: a */
        public void m22457a(@efb InterfaceC1154n interfaceC1154n) {
            this.f84222a.addObserver(interfaceC1154n);
            this.f84223b.add(interfaceC1154n);
        }

        /* JADX INFO: renamed from: b */
        public void m22458b() {
            Iterator<InterfaceC1154n> it = this.f84223b.iterator();
            while (it.hasNext()) {
                this.f84222a.removeObserver(it.next());
            }
            this.f84223b.clear();
        }
    }

    private void bindRcKey(int i, String str) {
        this.f84203a.put(Integer.valueOf(i), str);
        this.f84204b.put(str, Integer.valueOf(i));
    }

    private <O> void doDispatch(String str, int i, @hib Intent intent, @hib d<O> dVar) {
        if (dVar == null || dVar.f84220a == null || !this.f84206d.contains(str)) {
            this.f84208f.remove(str);
            this.f84209g.putParcelable(str, new ActivityResult(i, intent));
        } else {
            dVar.f84220a.onActivityResult(dVar.f84221b.parseResult(i, intent));
            this.f84206d.remove(str);
        }
    }

    private int generateRandomNumber() {
        int iNextInt = tod.f85517a.nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            if (!this.f84203a.containsKey(Integer.valueOf(i))) {
                return i;
            }
            iNextInt = tod.f85517a.nextInt(2147418112);
        }
    }

    private void registerKey(String str) {
        if (this.f84204b.get(str) != null) {
            return;
        }
        bindRcKey(generateRandomNumber(), str);
    }

    @ir9
    /* JADX INFO: renamed from: a */
    public final void m22456a(@efb String str) {
        Integer numRemove;
        if (!this.f84206d.contains(str) && (numRemove = this.f84204b.remove(str)) != null) {
            this.f84203a.remove(numRemove);
        }
        this.f84207e.remove(str);
        if (this.f84208f.containsKey(str)) {
            Log.w(f84201l, "Dropping pending result for request " + str + ": " + this.f84208f.get(str));
            this.f84208f.remove(str);
        }
        if (this.f84209g.containsKey(str)) {
            Log.w(f84201l, "Dropping pending result for request " + str + ": " + this.f84209g.getParcelable(str));
            this.f84209g.remove(str);
        }
        e eVar = this.f84205c.get(str);
        if (eVar != null) {
            eVar.m22458b();
            this.f84205c.remove(str);
        }
    }

    @ir9
    public final boolean dispatchResult(int i, int i2, @hib Intent intent) {
        String str = this.f84203a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        doDispatch(str, i2, intent, this.f84207e.get(str));
        return true;
    }

    @ir9
    public abstract <I, O> void onLaunch(int i, @efb AbstractC8767lc<I, O> abstractC8767lc, @igg({"UnknownNullness"}) I i2, @hib ActivityOptionsCompat activityOptionsCompat);

    public final void onRestoreInstanceState(@hib Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f84197h);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f84198i);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f84206d = bundle.getStringArrayList(f84199j);
        this.f84209g.putAll(bundle.getBundle(f84200k));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.f84204b.containsKey(str)) {
                Integer numRemove = this.f84204b.remove(str);
                if (!this.f84209g.containsKey(str)) {
                    this.f84203a.remove(numRemove);
                }
            }
            bindRcKey(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    public final void onSaveInstanceState(@efb Bundle bundle) {
        bundle.putIntegerArrayList(f84197h, new ArrayList<>(this.f84204b.values()));
        bundle.putStringArrayList(f84198i, new ArrayList<>(this.f84204b.keySet()));
        bundle.putStringArrayList(f84199j, new ArrayList<>(this.f84206d));
        bundle.putBundle(f84200k, (Bundle) this.f84209g.clone());
    }

    @efb
    public final <I, O> AbstractC11416qc<I> register(@efb String str, @efb g59 g59Var, @efb AbstractC8767lc<I, O> abstractC8767lc, @efb InterfaceC5717fc<O> interfaceC5717fc) {
        AbstractC1143j lifecycle = g59Var.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(AbstractC1143j.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + g59Var + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
        }
        registerKey(str);
        e eVar = this.f84205c.get(str);
        if (eVar == null) {
            eVar = new e(lifecycle);
        }
        eVar.m22457a(new a(str, interfaceC5717fc, abstractC8767lc));
        this.f84205c.put(str, eVar);
        return new b(str, abstractC8767lc);
    }

    @ir9
    public final <O> boolean dispatchResult(int i, @igg({"UnknownNullness"}) O o) {
        InterfaceC5717fc<?> interfaceC5717fc;
        String str = this.f84203a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        d<?> dVar = this.f84207e.get(str);
        if (dVar != null && (interfaceC5717fc = dVar.f84220a) != null) {
            if (!this.f84206d.remove(str)) {
                return true;
            }
            interfaceC5717fc.onActivityResult(o);
            return true;
        }
        this.f84209g.remove(str);
        this.f84208f.put(str, o);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @efb
    public final <I, O> AbstractC11416qc<I> register(@efb String str, @efb AbstractC8767lc<I, O> abstractC8767lc, @efb InterfaceC5717fc<O> interfaceC5717fc) {
        registerKey(str);
        this.f84207e.put(str, new d<>(interfaceC5717fc, abstractC8767lc));
        if (this.f84208f.containsKey(str)) {
            Object obj = this.f84208f.get(str);
            this.f84208f.remove(str);
            interfaceC5717fc.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f84209g.getParcelable(str);
        if (activityResult != null) {
            this.f84209g.remove(str);
            interfaceC5717fc.onActivityResult(abstractC8767lc.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new c(str, abstractC8767lc);
    }
}
