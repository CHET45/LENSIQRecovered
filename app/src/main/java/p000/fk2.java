package p000;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p000.fk2;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public class fk2 implements mj2, uj2 {

    /* JADX INFO: renamed from: i */
    public static final eid<Set<Object>> f36894i = new eid() { // from class: bk2
        @Override // p000.eid
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* JADX INFO: renamed from: a */
    public final Map<ej2<?>, eid<?>> f36895a;

    /* JADX INFO: renamed from: b */
    public final Map<pkd<?>, eid<?>> f36896b;

    /* JADX INFO: renamed from: c */
    public final Map<pkd<?>, t19<?>> f36897c;

    /* JADX INFO: renamed from: d */
    public final List<eid<ComponentRegistrar>> f36898d;

    /* JADX INFO: renamed from: e */
    public Set<String> f36899e;

    /* JADX INFO: renamed from: f */
    public final s55 f36900f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference<Boolean> f36901g;

    /* JADX INFO: renamed from: h */
    public final zj2 f36902h;

    /* JADX INFO: renamed from: fk2$b */
    public static final class C5864b {

        /* JADX INFO: renamed from: a */
        public final Executor f36903a;

        /* JADX INFO: renamed from: b */
        public final List<eid<ComponentRegistrar>> f36904b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final List<ej2<?>> f36905c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public zj2 f36906d = zj2.f105224a;

        public C5864b(Executor executor) {
            this.f36903a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar lambda$addComponentRegistrar$0(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @op1
        public C5864b addComponent(ej2<?> ej2Var) {
            this.f36905c.add(ej2Var);
            return this;
        }

        @op1
        public C5864b addComponentRegistrar(final ComponentRegistrar componentRegistrar) {
            this.f36904b.add(new eid() { // from class: gk2
                @Override // p000.eid
                public final Object get() {
                    return fk2.C5864b.lambda$addComponentRegistrar$0(componentRegistrar);
                }
            });
            return this;
        }

        @op1
        public C5864b addLazyComponentRegistrars(Collection<eid<ComponentRegistrar>> collection) {
            this.f36904b.addAll(collection);
            return this;
        }

        public fk2 build() {
            return new fk2(this.f36903a, this.f36904b, this.f36905c, this.f36906d);
        }

        @op1
        public C5864b setProcessor(zj2 zj2Var) {
            this.f36906d = zj2Var;
            return this;
        }
    }

    public static C5864b builder(Executor executor) {
        return new C5864b(executor);
    }

    private void discoverComponents(List<ej2<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<eid<ComponentRegistrar>> it = this.f36898d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f36902h.processRegistrar(componentRegistrar));
                        it.remove();
                    }
                } catch (de8 e) {
                    it.remove();
                    Log.w(sj2.f81948c, "Invalid component registrar.", e);
                }
            }
            Iterator<ej2<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().getProvidedInterfaces().toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f36899e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f36899e.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.f36895a.isEmpty()) {
                oe3.m18596a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f36895a.keySet());
                arrayList2.addAll(list);
                oe3.m18596a(arrayList2);
            }
            for (final ej2<?> ej2Var : list) {
                this.f36895a.put(ej2Var, new dx8(new eid() { // from class: ck2
                    @Override // p000.eid
                    public final Object get() {
                        return this.f16798a.lambda$discoverComponents$0(ej2Var);
                    }
                }));
            }
            arrayList.addAll(processInstanceComponents(list));
            arrayList.addAll(processSetComponents());
            processDependencies();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        maybeInitializeEagerComponents();
    }

    private void doInitializeEagerComponents(Map<ej2<?>, eid<?>> map, boolean z) {
        for (Map.Entry<ej2<?>, eid<?>> entry : map.entrySet()) {
            ej2<?> key = entry.getKey();
            eid<?> value = entry.getValue();
            if (key.isAlwaysEager() || (key.isEagerInDefaultApp() && z)) {
                value.get();
            }
        }
        this.f36900f.m21738b();
    }

    private static <T> List<T> iterableToList(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$discoverComponents$0(ej2 ej2Var) {
        return ej2Var.getFactory().create(new r7e(ej2Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ComponentRegistrar lambda$toProviders$1(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    private void maybeInitializeEagerComponents() {
        Boolean bool = this.f36901g.get();
        if (bool != null) {
            doInitializeEagerComponents(this.f36895a, bool.booleanValue());
        }
    }

    private void processDependencies() {
        for (ej2<?> ej2Var : this.f36895a.keySet()) {
            for (i64 i64Var : ej2Var.getDependencies()) {
                if (i64Var.isSet() && !this.f36897c.containsKey(i64Var.getInterface())) {
                    this.f36897c.put(i64Var.getInterface(), t19.m22317b(Collections.emptySet()));
                } else if (this.f36896b.containsKey(i64Var.getInterface())) {
                    continue;
                } else {
                    if (i64Var.isRequired()) {
                        throw new dwa(String.format("Unsatisfied dependency for component %s: %s", ej2Var, i64Var.getInterface()));
                    }
                    if (!i64Var.isSet()) {
                        this.f36896b.put(i64Var.getInterface(), g7c.m11426d());
                    }
                }
            }
        }
    }

    private List<Runnable> processInstanceComponents(List<ej2<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (ej2<?> ej2Var : list) {
            if (ej2Var.isValue()) {
                final eid<?> eidVar = this.f36895a.get(ej2Var);
                for (pkd<? super Object> pkdVar : ej2Var.getProvidedInterfaces()) {
                    if (this.f36896b.containsKey(pkdVar)) {
                        final g7c g7cVar = (g7c) this.f36896b.get(pkdVar);
                        arrayList.add(new Runnable() { // from class: dk2
                            @Override // java.lang.Runnable
                            public final void run() {
                                g7cVar.m11428f(eidVar);
                            }
                        });
                    } else {
                        this.f36896b.put(pkdVar, eidVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> processSetComponents() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<ej2<?>, eid<?>> entry : this.f36895a.entrySet()) {
            ej2<?> key = entry.getKey();
            if (!key.isValue()) {
                eid<?> value = entry.getValue();
                for (pkd<? super Object> pkdVar : key.getProvidedInterfaces()) {
                    if (!map.containsKey(pkdVar)) {
                        map.put(pkdVar, new HashSet());
                    }
                    ((Set) map.get(pkdVar)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f36897c.containsKey(entry2.getKey())) {
                final t19<?> t19Var = this.f36897c.get(entry2.getKey());
                for (final eid eidVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: ek2
                        @Override // java.lang.Runnable
                        public final void run() {
                            t19Var.m22318a(eidVar);
                        }
                    });
                }
            } else {
                this.f36897c.put((pkd) entry2.getKey(), t19.m22317b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    private static Iterable<eid<ComponentRegistrar>> toProviders(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new eid() { // from class: ak2
                @Override // p000.eid
                public final Object get() {
                    return fk2.lambda$toProviders$1(componentRegistrar);
                }
            });
        }
        return arrayList;
    }

    @fdi
    /* JADX INFO: renamed from: e */
    public Collection<ej2<?>> m10965e() {
        return this.f36895a.keySet();
    }

    @Override // p000.mj2
    public <T> z24<T> getDeferred(pkd<T> pkdVar) {
        eid<T> provider = getProvider(pkdVar);
        return provider == null ? g7c.m11426d() : provider instanceof g7c ? (g7c) provider : g7c.m11427e(provider);
    }

    @Override // p000.mj2
    public synchronized <T> eid<T> getProvider(pkd<T> pkdVar) {
        w7d.checkNotNull(pkdVar, "Null interface requested.");
        return (eid) this.f36896b.get(pkdVar);
    }

    @fdi
    @p7e({p7e.EnumC10826a.f69938e})
    public void initializeAllComponentsForTests() {
        Iterator<eid<?>> it = this.f36895a.values().iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    public void initializeEagerComponents(boolean z) {
        HashMap map;
        if (v7b.m23844a(this.f36901g, null, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.f36895a);
            }
            doInitializeEagerComponents(map, z);
        }
    }

    @Override // p000.mj2
    public synchronized <T> eid<Set<T>> setOfProvider(pkd<T> pkdVar) {
        t19<?> t19Var = this.f36897c.get(pkdVar);
        if (t19Var != null) {
            return t19Var;
        }
        return (eid<Set<T>>) f36894i;
    }

    @Deprecated
    public fk2(Executor executor, Iterable<ComponentRegistrar> iterable, ej2<?>... ej2VarArr) {
        this(executor, toProviders(iterable), Arrays.asList(ej2VarArr), zj2.f105224a);
    }

    private fk2(Executor executor, Iterable<eid<ComponentRegistrar>> iterable, Collection<ej2<?>> collection, zj2 zj2Var) {
        this.f36895a = new HashMap();
        this.f36896b = new HashMap();
        this.f36897c = new HashMap();
        this.f36899e = new HashSet();
        this.f36901g = new AtomicReference<>();
        s55 s55Var = new s55(executor);
        this.f36900f = s55Var;
        this.f36902h = zj2Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ej2.m10036of(s55Var, (Class<s55>) s55.class, (Class<? super s55>[]) new Class[]{wcg.class, akd.class}));
        arrayList.add(ej2.m10036of(this, (Class<fk2>) uj2.class, (Class<? super fk2>[]) new Class[0]));
        for (ej2<?> ej2Var : collection) {
            if (ej2Var != null) {
                arrayList.add(ej2Var);
            }
        }
        this.f36898d = iterableToList(iterable);
        discoverComponents(arrayList);
    }

    @Override // p000.uj2
    public void discoverComponents() {
        synchronized (this) {
            try {
                if (this.f36898d.isEmpty()) {
                    return;
                }
                discoverComponents(new ArrayList());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
