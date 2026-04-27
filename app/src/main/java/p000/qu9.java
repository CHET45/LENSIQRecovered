package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.nm7;
import p000.nu9;

/* JADX INFO: loaded from: classes7.dex */
public class qu9 extends pu9 {

    /* JADX INFO: renamed from: a */
    public final boolean f75797a;

    /* JADX INFO: renamed from: b */
    public final Map<String, qlg> f75798b;

    /* JADX INFO: renamed from: qu9$a */
    public class C11700a implements nu9.InterfaceC10061a<nm7.InterfaceC9941b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yu9 f75799a;

        public C11700a(yu9 yu9Var) {
            this.f75799a = yu9Var;
        }

        @Override // p000.nu9.InterfaceC10061a
        public void apply(@efb List<nm7.InterfaceC9941b> list) {
            qlg qlgVarTagHandler;
            for (nm7.InterfaceC9941b interfaceC9941b : list) {
                if (interfaceC9941b.isClosed() && (qlgVarTagHandler = qu9.this.tagHandler(interfaceC9941b.name())) != null) {
                    qlgVarTagHandler.handle(this.f75799a, qu9.this, interfaceC9941b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: qu9$b */
    public class C11701b implements nu9.InterfaceC10061a<nm7.InterfaceC9940a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yu9 f75801a;

        public C11701b(yu9 yu9Var) {
            this.f75801a = yu9Var;
        }

        @Override // p000.nu9.InterfaceC10061a
        public void apply(@efb List<nm7.InterfaceC9940a> list) {
            for (nm7.InterfaceC9940a interfaceC9940a : list) {
                if (interfaceC9940a.isClosed()) {
                    qlg qlgVarTagHandler = qu9.this.tagHandler(interfaceC9940a.name());
                    if (qlgVarTagHandler != null) {
                        qlgVarTagHandler.handle(this.f75801a, qu9.this, interfaceC9940a);
                    } else {
                        apply(interfaceC9940a.children());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: qu9$c */
    public static class C11702c {

        /* JADX INFO: renamed from: a */
        public final Map<String, qlg> f75803a = new HashMap(2);

        /* JADX INFO: renamed from: b */
        public boolean f75804b;

        /* JADX INFO: renamed from: c */
        public boolean f75805c;

        /* JADX INFO: renamed from: d */
        public boolean f75806d;

        private void checkState() {
            if (this.f75806d) {
                throw new IllegalStateException("Builder has been already built");
            }
        }

        /* JADX INFO: renamed from: a */
        public void m20664a(@efb qlg qlgVar) {
            for (String str : qlgVar.supportedTags()) {
                if (!this.f75803a.containsKey(str)) {
                    this.f75803a.put(str, qlgVar);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m20665b(@efb qlg qlgVar) {
            checkState();
            Iterator<String> it = qlgVar.supportedTags().iterator();
            while (it.hasNext()) {
                this.f75803a.put(it.next(), qlgVar);
            }
        }

        @efb
        public pu9 build() {
            checkState();
            this.f75806d = true;
            return this.f75803a.size() > 0 ? new qu9(this.f75804b, Collections.unmodifiableMap(this.f75803a)) : new ru9();
        }

        /* JADX INFO: renamed from: c */
        public void m20666c(boolean z) {
            checkState();
            this.f75804b = z;
        }

        /* JADX INFO: renamed from: d */
        public boolean m20667d() {
            return this.f75805c;
        }

        @hib
        /* JADX INFO: renamed from: e */
        public qlg m20668e(@efb String str) {
            checkState();
            return this.f75803a.get(str);
        }

        public void excludeDefaults(boolean z) {
            checkState();
            this.f75805c = z;
        }
    }

    public qu9(boolean z, @efb Map<String, qlg> map) {
        this.f75797a = z;
        this.f75798b = map;
    }

    @Override // p000.pu9
    public void render(@efb yu9 yu9Var, @efb nu9 nu9Var) {
        int length = !this.f75797a ? -1 : yu9Var.length();
        nu9Var.flushInlineTags(length, new C11700a(yu9Var));
        nu9Var.flushBlockTags(length, new C11701b(yu9Var));
        nu9Var.reset();
    }

    @Override // p000.pu9
    @hib
    public qlg tagHandler(@efb String str) {
        return this.f75798b.get(str);
    }
}
