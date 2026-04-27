package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000.tu9;

/* JADX INFO: loaded from: classes7.dex */
public class hxd implements tu9.InterfaceC13246b {

    /* JADX INFO: renamed from: a */
    public final List<tu9> f45198a;

    /* JADX INFO: renamed from: b */
    public final List<tu9> f45199b;

    /* JADX INFO: renamed from: c */
    public final Set<tu9> f45200c = new HashSet(3);

    public hxd(@efb List<tu9> list) {
        this.f45198a = list;
        this.f45199b = new ArrayList(list.size());
    }

    private void configure(@efb tu9 tu9Var) {
        if (this.f45199b.contains(tu9Var)) {
            return;
        }
        if (this.f45200c.contains(tu9Var)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + this.f45200c);
        }
        this.f45200c.add(tu9Var);
        tu9Var.configure(this);
        this.f45200c.remove(tu9Var);
        if (this.f45199b.contains(tu9Var)) {
            return;
        }
        if (n03.class.isAssignableFrom(tu9Var.getClass())) {
            this.f45199b.add(0, tu9Var);
        } else {
            this.f45199b.add(tu9Var);
        }
    }

    @hib
    private static <P extends tu9> P find(@efb List<tu9> list, @efb Class<P> cls) {
        Iterator<tu9> it = list.iterator();
        while (it.hasNext()) {
            P p = (P) it.next();
            if (cls.isAssignableFrom(p.getClass())) {
                return p;
            }
        }
        return null;
    }

    @efb
    private <P extends tu9> P get(@efb Class<P> cls) {
        P p = (P) find(this.f45199b, cls);
        if (p == null) {
            p = (P) find(this.f45198a, cls);
            if (p == null) {
                throw new IllegalStateException("Requested plugin is not added: " + cls.getName() + ", plugins: " + this.f45198a);
            }
            configure(p);
        }
        return p;
    }

    @efb
    /* JADX INFO: renamed from: a */
    public List<tu9> m12656a() {
        Iterator<tu9> it = this.f45198a.iterator();
        while (it.hasNext()) {
            configure(it.next());
        }
        return this.f45199b;
    }

    @Override // p000.tu9.InterfaceC13246b
    @efb
    public <P extends tu9> P require(@efb Class<P> cls) {
        return (P) get(cls);
    }

    @Override // p000.tu9.InterfaceC13246b
    public <P extends tu9> void require(@efb Class<P> cls, @efb tu9.InterfaceC13245a<? super P> interfaceC13245a) {
        interfaceC13245a.apply(get(cls));
    }
}
