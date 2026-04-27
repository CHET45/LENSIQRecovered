package p000;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000.ps1;

/* JADX INFO: loaded from: classes8.dex */
public final class fz7 extends rs1 {

    /* JADX INFO: renamed from: fz7$a */
    public static class C6037a extends ps1.C11084a {
        public C6037a(List<Class<?>> list) {
            this(new HashSet(list));
        }

        @Override // p000.ps1.C11084a, p000.ru5
        public String describe() {
            return "includes " + super.describe();
        }

        public C6037a(Set<Class<?>> set) {
            super(true, set, true, null);
        }
    }

    @Override // p000.rs1
    /* JADX INFO: renamed from: a */
    public ru5 mo3837a(List<Class<?>> list) {
        return new C6037a(list);
    }
}
