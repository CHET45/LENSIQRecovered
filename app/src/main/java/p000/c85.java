package p000;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000.ps1;

/* JADX INFO: loaded from: classes8.dex */
public final class c85 extends rs1 {

    /* JADX INFO: renamed from: c85$a */
    public static class C2232a extends ps1.C11084a {
        public C2232a(List<Class<?>> list) {
            this(new HashSet(list));
        }

        @Override // p000.ps1.C11084a, p000.ru5
        public String describe() {
            return "excludes " + super.describe();
        }

        public C2232a(Set<Class<?>> set) {
            super(true, null, true, set);
        }
    }

    @Override // p000.rs1
    /* JADX INFO: renamed from: a */
    public ru5 mo3837a(List<Class<?>> list) {
        return new C2232a(list);
    }
}
