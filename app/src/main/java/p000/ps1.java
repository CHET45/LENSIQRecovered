package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class ps1 extends dfg {

    /* JADX INFO: renamed from: ps1$b */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC11085b {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    /* JADX INFO: renamed from: ps1$c */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC11086c {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    public ps1(Class<?> cls, ude udeVar) throws o18 {
        super(cls, udeVar);
        try {
            filter(C11084a.categoryFilter(isAnyIncluded(cls), getIncludedCategory(cls), isAnyExcluded(cls), getExcludedCategory(cls)));
            assertNoCategorizedDescendentsOfUncategorizeableParents(getDescription());
        } catch (aeb e) {
            throw new o18(e);
        }
    }

    private static void assertNoCategorizedDescendentsOfUncategorizeableParents(j74 j74Var) throws o18 {
        if (!canHaveCategorizedChildren(j74Var)) {
            assertNoDescendantsHaveCategoryAnnotations(j74Var);
        }
        Iterator<j74> it = j74Var.getChildren().iterator();
        while (it.hasNext()) {
            assertNoCategorizedDescendentsOfUncategorizeableParents(it.next());
        }
    }

    private static void assertNoDescendantsHaveCategoryAnnotations(j74 j74Var) throws o18 {
        for (j74 j74Var2 : j74Var.getChildren()) {
            if (j74Var2.getAnnotation(qs1.class) != null) {
                throw new o18("Category annotations on Parameterized classes are not supported on individual methods.");
            }
            assertNoDescendantsHaveCategoryAnnotations(j74Var2);
        }
    }

    private static boolean canHaveCategorizedChildren(j74 j74Var) {
        Iterator<j74> it = j74Var.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next().getTestClass() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<Class<?>> createSet(Class<?>... clsArr) {
        HashSet hashSet = new HashSet();
        if (clsArr != null) {
            Collections.addAll(hashSet, clsArr);
        }
        return hashSet;
    }

    private static Set<Class<?>> getExcludedCategory(Class<?> cls) {
        InterfaceC11085b interfaceC11085b = (InterfaceC11085b) cls.getAnnotation(InterfaceC11085b.class);
        return createSet(interfaceC11085b == null ? null : interfaceC11085b.value());
    }

    private static Set<Class<?>> getIncludedCategory(Class<?> cls) {
        InterfaceC11086c interfaceC11086c = (InterfaceC11086c) cls.getAnnotation(InterfaceC11086c.class);
        return createSet(interfaceC11086c == null ? null : interfaceC11086c.value());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasAssignableTo(Set<Class<?>> set, Class<?> cls) {
        Iterator<Class<?>> it = set.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAnyExcluded(Class<?> cls) {
        InterfaceC11085b interfaceC11085b = (InterfaceC11085b) cls.getAnnotation(InterfaceC11085b.class);
        return interfaceC11085b == null || interfaceC11085b.matchAny();
    }

    private static boolean isAnyIncluded(Class<?> cls) {
        InterfaceC11086c interfaceC11086c = (InterfaceC11086c) cls.getAnnotation(InterfaceC11086c.class);
        return interfaceC11086c == null || interfaceC11086c.matchAny();
    }

    /* JADX INFO: renamed from: ps1$a */
    public static class C11084a extends ru5 {

        /* JADX INFO: renamed from: b */
        public final Set<Class<?>> f71783b;

        /* JADX INFO: renamed from: c */
        public final Set<Class<?>> f71784c;

        /* JADX INFO: renamed from: d */
        public final boolean f71785d;

        /* JADX INFO: renamed from: e */
        public final boolean f71786e;

        public C11084a(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            this.f71785d = z;
            this.f71786e = z2;
            this.f71783b = copyAndRefine(set);
            this.f71784c = copyAndRefine(set2);
        }

        private static Set<Class<?>> categories(j74 j74Var) {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, directCategories(j74Var));
            Collections.addAll(hashSet, directCategories(parentDescription(j74Var)));
            return hashSet;
        }

        public static C11084a categoryFilter(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            return new C11084a(z, set, z2, set2);
        }

        private static Set<Class<?>> copyAndRefine(Set<Class<?>> set) {
            HashSet hashSet = new HashSet();
            if (set != null) {
                hashSet.addAll(set);
            }
            hashSet.remove(null);
            return hashSet;
        }

        private static Class<?>[] directCategories(j74 j74Var) {
            if (j74Var == null) {
                return new Class[0];
            }
            qs1 qs1Var = (qs1) j74Var.getAnnotation(qs1.class);
            return qs1Var == null ? new Class[0] : qs1Var.value();
        }

        public static C11084a exclude(boolean z, Class<?>... clsArr) {
            if (hasNull(clsArr)) {
                throw new NullPointerException("has null category");
            }
            return categoryFilter(true, null, z, ps1.createSet(clsArr));
        }

        private boolean hasCorrectCategoryAnnotation(j74 j74Var) {
            Set<Class<?>> setCategories = categories(j74Var);
            if (setCategories.isEmpty()) {
                return this.f71783b.isEmpty();
            }
            if (!this.f71784c.isEmpty()) {
                if (this.f71786e) {
                    if (matchesAnyParentCategories(setCategories, this.f71784c)) {
                        return false;
                    }
                } else if (matchesAllParentCategories(setCategories, this.f71784c)) {
                    return false;
                }
            }
            if (this.f71783b.isEmpty()) {
                return true;
            }
            return this.f71785d ? matchesAnyParentCategories(setCategories, this.f71783b) : matchesAllParentCategories(setCategories, this.f71783b);
        }

        private static boolean hasNull(Class<?>... clsArr) {
            if (clsArr == null) {
                return false;
            }
            for (Class<?> cls : clsArr) {
                if (cls == null) {
                    return true;
                }
            }
            return false;
        }

        public static C11084a include(boolean z, Class<?>... clsArr) {
            if (hasNull(clsArr)) {
                throw new NullPointerException("has null category");
            }
            return categoryFilter(z, ps1.createSet(clsArr), true, null);
        }

        private boolean matchesAllParentCategories(Set<Class<?>> set, Set<Class<?>> set2) {
            Iterator<Class<?>> it = set2.iterator();
            while (it.hasNext()) {
                if (!ps1.hasAssignableTo(set, it.next())) {
                    return false;
                }
            }
            return true;
        }

        private boolean matchesAnyParentCategories(Set<Class<?>> set, Set<Class<?>> set2) {
            Iterator<Class<?>> it = set2.iterator();
            while (it.hasNext()) {
                if (ps1.hasAssignableTo(set, it.next())) {
                    return true;
                }
            }
            return false;
        }

        private static j74 parentDescription(j74 j74Var) {
            Class<?> testClass = j74Var.getTestClass();
            if (testClass == null) {
                return null;
            }
            return j74.createSuiteDescription(testClass);
        }

        @Override // p000.ru5
        public String describe() {
            return toString();
        }

        @Override // p000.ru5
        public boolean shouldRun(j74 j74Var) {
            if (hasCorrectCategoryAnnotation(j74Var)) {
                return true;
            }
            Iterator<j74> it = j74Var.getChildren().iterator();
            while (it.hasNext()) {
                if (shouldRun(it.next())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("categories ");
            sb.append(this.f71783b.isEmpty() ? "[all]" : this.f71783b);
            if (!this.f71784c.isEmpty()) {
                sb.append(" - ");
                sb.append(this.f71784c);
            }
            return sb.toString();
        }

        public static C11084a exclude(Class<?> cls) {
            return exclude(true, cls);
        }

        public static C11084a include(Class<?> cls) {
            return include(true, cls);
        }

        public static C11084a exclude(Class<?>... clsArr) {
            return exclude(true, clsArr);
        }

        public static C11084a include(Class<?>... clsArr) {
            return include(true, clsArr);
        }
    }
}
