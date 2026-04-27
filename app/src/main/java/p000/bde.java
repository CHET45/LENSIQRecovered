package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.ade;

/* JADX INFO: loaded from: classes8.dex */
public class bde {

    /* JADX INFO: renamed from: a */
    public final List<ade> f13444a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    public volatile boolean f13445b = false;

    /* JADX INFO: renamed from: bde$a */
    public class C1843a extends AbstractC1850h {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ j74 f13446c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1843a(j74 j74Var) throws Exception {
            super(bde.this);
            this.f13446c = j74Var;
        }

        @Override // p000.bde.AbstractC1850h
        /* JADX INFO: renamed from: a */
        public void mo3058a(ade adeVar) throws Exception {
            adeVar.testRunStarted(this.f13446c);
        }
    }

    /* JADX INFO: renamed from: bde$b */
    public class C1844b extends AbstractC1850h {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ w7e f13448c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1844b(w7e w7eVar) throws Exception {
            super(bde.this);
            this.f13448c = w7eVar;
        }

        @Override // p000.bde.AbstractC1850h
        /* JADX INFO: renamed from: a */
        public void mo3058a(ade adeVar) throws Exception {
            adeVar.testRunFinished(this.f13448c);
        }
    }

    /* JADX INFO: renamed from: bde$c */
    public class C1845c extends AbstractC1850h {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ j74 f13450c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1845c(j74 j74Var) throws Exception {
            super(bde.this);
            this.f13450c = j74Var;
        }

        @Override // p000.bde.AbstractC1850h
        /* JADX INFO: renamed from: a */
        public void mo3058a(ade adeVar) throws Exception {
            adeVar.testStarted(this.f13450c);
        }
    }

    /* JADX INFO: renamed from: bde$d */
    public class C1846d extends AbstractC1850h {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f13452c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1846d(List list, List list2) throws Exception {
            super(list);
            this.f13452c = list2;
        }

        @Override // p000.bde.AbstractC1850h
        /* JADX INFO: renamed from: a */
        public void mo3058a(ade adeVar) throws Exception {
            Iterator it = this.f13452c.iterator();
            while (it.hasNext()) {
                adeVar.testFailure((fp5) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: bde$e */
    public class C1847e extends AbstractC1850h {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fp5 f13454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1847e(fp5 fp5Var) {
            super(bde.this);
            this.f13454c = fp5Var;
        }

        @Override // p000.bde.AbstractC1850h
        /* JADX INFO: renamed from: a */
        public void mo3058a(ade adeVar) throws Exception {
            adeVar.testAssumptionFailure(this.f13454c);
        }
    }

    /* JADX INFO: renamed from: bde$f */
    public class C1848f extends AbstractC1850h {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ j74 f13456c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1848f(j74 j74Var) throws Exception {
            super(bde.this);
            this.f13456c = j74Var;
        }

        @Override // p000.bde.AbstractC1850h
        /* JADX INFO: renamed from: a */
        public void mo3058a(ade adeVar) throws Exception {
            adeVar.testIgnored(this.f13456c);
        }
    }

    /* JADX INFO: renamed from: bde$g */
    public class C1849g extends AbstractC1850h {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ j74 f13458c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1849g(j74 j74Var) throws Exception {
            super(bde.this);
            this.f13458c = j74Var;
        }

        @Override // p000.bde.AbstractC1850h
        /* JADX INFO: renamed from: a */
        public void mo3058a(ade adeVar) throws Exception {
            adeVar.testFinished(this.f13458c);
        }
    }

    /* JADX INFO: renamed from: bde$h */
    public abstract class AbstractC1850h {

        /* JADX INFO: renamed from: a */
        public final List<ade> f13460a;

        public AbstractC1850h(bde bdeVar) {
            this(bdeVar.f13444a);
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo3058a(ade adeVar) throws Exception;

        /* JADX INFO: renamed from: b */
        public void m3059b() {
            int size = this.f13460a.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (ade adeVar : this.f13460a) {
                try {
                    mo3058a(adeVar);
                    arrayList.add(adeVar);
                } catch (Exception e) {
                    arrayList2.add(new fp5(j74.f49690C, e));
                }
            }
            bde.this.fireTestFailures(arrayList, arrayList2);
        }

        public AbstractC1850h(List<ade> list) {
            this.f13460a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireTestFailures(List<ade> list, List<fp5> list2) {
        if (list2.isEmpty()) {
            return;
        }
        new C1846d(list, list2).m3059b();
    }

    public void addFirstListener(ade adeVar) {
        if (adeVar == null) {
            throw new NullPointerException("Cannot add a null listener");
        }
        this.f13444a.add(0, m3057c(adeVar));
    }

    public void addListener(ade adeVar) {
        if (adeVar == null) {
            throw new NullPointerException("Cannot add a null listener");
        }
        this.f13444a.add(m3057c(adeVar));
    }

    /* JADX INFO: renamed from: c */
    public ade m3057c(ade adeVar) {
        return adeVar.getClass().isAnnotationPresent(ade.InterfaceC0186a.class) ? adeVar : new fig(adeVar, this);
    }

    public void fireTestAssumptionFailed(fp5 fp5Var) {
        new C1847e(fp5Var).m3059b();
    }

    public void fireTestFailure(fp5 fp5Var) {
        fireTestFailures(this.f13444a, Arrays.asList(fp5Var));
    }

    public void fireTestFinished(j74 j74Var) {
        new C1849g(j74Var).m3059b();
    }

    public void fireTestIgnored(j74 j74Var) {
        new C1848f(j74Var).m3059b();
    }

    public void fireTestRunFinished(w7e w7eVar) {
        new C1844b(w7eVar).m3059b();
    }

    public void fireTestRunStarted(j74 j74Var) {
        new C1843a(j74Var).m3059b();
    }

    public void fireTestStarted(j74 j74Var) throws c5g {
        if (this.f13445b) {
            throw new c5g();
        }
        new C1845c(j74Var).m3059b();
    }

    public void pleaseStop() {
        this.f13445b = true;
    }

    public void removeListener(ade adeVar) {
        if (adeVar == null) {
            throw new NullPointerException("Cannot remove a null listener");
        }
        this.f13444a.remove(m3057c(adeVar));
    }
}
