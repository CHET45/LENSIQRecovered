package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.g84;

/* JADX INFO: loaded from: classes6.dex */
@l42
public class e84 implements Map<String, d84> {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, g84> f32107a;

    /* JADX INFO: renamed from: b */
    public final g84.InterfaceC6163a f32108b;

    /* JADX INFO: renamed from: e84$a */
    public class C5189a implements g84.InterfaceC6163a {
        @Override // p000.g84.InterfaceC6163a
        public g84 provide(d84 d84Var) {
            return new g84(d84Var);
        }
    }

    @b28
    public e84() {
        this(new C5189a());
    }

    private void evictEmptyReferences() {
        Iterator<Map.Entry<String, g84>> it = this.f32107a.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().isEmpty()) {
                it.remove();
            }
        }
    }

    @Override // java.util.Map
    public void clear() {
        this.f32107a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f32107a.containsKey(obj) && get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Iterator<g84> it = this.f32107a.values().iterator();
        while (it.hasNext()) {
            if (it.next().m11432a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    @efb
    public Set<Map.Entry<String, d84>> entrySet() {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, g84> entry : this.f32107a.entrySet()) {
            g84 value = entry.getValue();
            if (!value.isEmpty()) {
                hashSet.add(new wl1(entry.getKey(), this.f32108b.provide(value.get())));
            }
        }
        return hashSet;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        evictEmptyReferences();
        return this.f32107a.isEmpty();
    }

    @Override // java.util.Map
    @efb
    public Set<String> keySet() {
        return this.f32107a.keySet();
    }

    @Override // java.util.Map
    public void putAll(@efb Map<? extends String, ? extends d84> map) {
        for (Map.Entry<? extends String, ? extends d84> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public int size() {
        evictEmptyReferences();
        return this.f32107a.size();
    }

    @Override // java.util.Map
    @efb
    public Collection<d84> values() {
        ArrayList arrayList = new ArrayList();
        for (g84 g84Var : this.f32107a.values()) {
            if (!g84Var.isEmpty()) {
                arrayList.add(g84Var.get());
            }
        }
        return arrayList;
    }

    public e84(g84.InterfaceC6163a interfaceC6163a) {
        this.f32107a = new HashMap<>();
        this.f32108b = interfaceC6163a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    @hib
    public d84 get(Object obj) {
        g84 g84Var = this.f32107a.get(obj);
        if (g84Var != null) {
            return g84Var.get();
        }
        return null;
    }

    @Override // java.util.Map
    public d84 put(String str, d84 d84Var) {
        this.f32107a.put(str, this.f32108b.provide(d84Var));
        evictEmptyReferences();
        return d84Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public d84 remove(Object obj) {
        g84 g84VarRemove = this.f32107a.remove(obj);
        evictEmptyReferences();
        if (g84VarRemove != null) {
            return g84VarRemove.get();
        }
        return null;
    }
}
