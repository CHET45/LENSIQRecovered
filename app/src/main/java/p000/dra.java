package p000;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class dra {

    /* JADX INFO: renamed from: a */
    public final Runnable f30487a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<kra> f30488b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public final Map<kra, C4924a> f30489c = new HashMap();

    /* JADX INFO: renamed from: dra$a */
    public static class C4924a {

        /* JADX INFO: renamed from: a */
        public final AbstractC1143j f30490a;

        /* JADX INFO: renamed from: b */
        public InterfaceC1154n f30491b;

        public C4924a(@efb AbstractC1143j abstractC1143j, @efb InterfaceC1154n interfaceC1154n) {
            this.f30490a = abstractC1143j;
            this.f30491b = interfaceC1154n;
            abstractC1143j.addObserver(interfaceC1154n);
        }

        /* JADX INFO: renamed from: a */
        public void m9335a() {
            this.f30490a.removeObserver(this.f30491b);
            this.f30491b = null;
        }
    }

    public dra(@efb Runnable runnable) {
        this.f30487a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMenuProvider$0(kra kraVar, g59 g59Var, AbstractC1143j.a aVar) {
        if (aVar == AbstractC1143j.a.ON_DESTROY) {
            removeMenuProvider(kraVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMenuProvider$1(AbstractC1143j.b bVar, kra kraVar, g59 g59Var, AbstractC1143j.a aVar) {
        if (aVar == AbstractC1143j.a.upTo(bVar)) {
            addMenuProvider(kraVar);
            return;
        }
        if (aVar == AbstractC1143j.a.ON_DESTROY) {
            removeMenuProvider(kraVar);
        } else if (aVar == AbstractC1143j.a.downFrom(bVar)) {
            this.f30488b.remove(kraVar);
            this.f30487a.run();
        }
    }

    public void addMenuProvider(@efb kra kraVar) {
        this.f30488b.add(kraVar);
        this.f30487a.run();
    }

    public void onCreateMenu(@efb Menu menu, @efb MenuInflater menuInflater) {
        Iterator<kra> it = this.f30488b.iterator();
        while (it.hasNext()) {
            it.next().onCreateMenu(menu, menuInflater);
        }
    }

    public void onMenuClosed(@efb Menu menu) {
        Iterator<kra> it = this.f30488b.iterator();
        while (it.hasNext()) {
            it.next().onMenuClosed(menu);
        }
    }

    public boolean onMenuItemSelected(@efb MenuItem menuItem) {
        Iterator<kra> it = this.f30488b.iterator();
        while (it.hasNext()) {
            if (it.next().onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onPrepareMenu(@efb Menu menu) {
        Iterator<kra> it = this.f30488b.iterator();
        while (it.hasNext()) {
            it.next().onPrepareMenu(menu);
        }
    }

    public void removeMenuProvider(@efb kra kraVar) {
        this.f30488b.remove(kraVar);
        C4924a c4924aRemove = this.f30489c.remove(kraVar);
        if (c4924aRemove != null) {
            c4924aRemove.m9335a();
        }
        this.f30487a.run();
    }

    public void addMenuProvider(@efb final kra kraVar, @efb g59 g59Var) {
        addMenuProvider(kraVar);
        AbstractC1143j lifecycle = g59Var.getLifecycle();
        C4924a c4924aRemove = this.f30489c.remove(kraVar);
        if (c4924aRemove != null) {
            c4924aRemove.m9335a();
        }
        this.f30489c.put(kraVar, new C4924a(lifecycle, new InterfaceC1154n() { // from class: cra
            @Override // androidx.lifecycle.InterfaceC1154n
            public final void onStateChanged(g59 g59Var2, AbstractC1143j.a aVar) {
                this.f27132a.lambda$addMenuProvider$0(kraVar, g59Var2, aVar);
            }
        }));
    }

    @igg({"LambdaLast"})
    public void addMenuProvider(@efb final kra kraVar, @efb g59 g59Var, @efb final AbstractC1143j.b bVar) {
        AbstractC1143j lifecycle = g59Var.getLifecycle();
        C4924a c4924aRemove = this.f30489c.remove(kraVar);
        if (c4924aRemove != null) {
            c4924aRemove.m9335a();
        }
        this.f30489c.put(kraVar, new C4924a(lifecycle, new InterfaceC1154n() { // from class: bra
            @Override // androidx.lifecycle.InterfaceC1154n
            public final void onStateChanged(g59 g59Var2, AbstractC1143j.a aVar) {
                this.f14598a.lambda$addMenuProvider$1(bVar, kraVar, g59Var2, aVar);
            }
        }));
    }
}
