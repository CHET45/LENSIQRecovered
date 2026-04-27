package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@by4
public final class p8d {

    /* JADX INFO: renamed from: p8d$b */
    public static class C10841b<T> implements l8d<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final List<? extends l8d<? super T>> f70014a;

        @Override // p000.l8d
        public boolean apply(@lgc T t) {
            for (int i = 0; i < this.f70014a.size(); i++) {
                if (!this.f70014a.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p000.l8d
        public boolean equals(@wx1 Object obj) {
            if (obj instanceof C10841b) {
                return this.f70014a.equals(((C10841b) obj).f70014a);
            }
            return false;
        }

        public int hashCode() {
            return this.f70014a.hashCode() + 306654252;
        }

        public String toString() {
            return p8d.toStringHelper("and", this.f70014a);
        }

        private C10841b(List<? extends l8d<? super T>> components) {
            this.f70014a = components;
        }
    }

    /* JADX INFO: renamed from: p8d$c */
    public static class C10842c<A, B> implements l8d<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final l8d<B> f70015a;

        /* JADX INFO: renamed from: b */
        public final lz6<A, ? extends B> f70016b;

        @Override // p000.l8d
        public boolean apply(@lgc A a) {
            return this.f70015a.apply(this.f70016b.apply(a));
        }

        @Override // p000.l8d
        public boolean equals(@wx1 Object obj) {
            if (!(obj instanceof C10842c)) {
                return false;
            }
            C10842c c10842c = (C10842c) obj;
            return this.f70016b.equals(c10842c.f70016b) && this.f70015a.equals(c10842c.f70015a);
        }

        public int hashCode() {
            return this.f70016b.hashCode() ^ this.f70015a.hashCode();
        }

        public String toString() {
            return this.f70015a + c0b.f15433c + this.f70016b + c0b.f15434d;
        }

        private C10842c(l8d<B> p, lz6<A, ? extends B> f) {
            this.f70015a = (l8d) v7d.checkNotNull(p);
            this.f70016b = (lz6) v7d.checkNotNull(f);
        }
    }

    /* JADX INFO: renamed from: p8d$d */
    @jd7
    @yg8
    public static class C10843d extends C10844e {
        private static final long serialVersionUID = 0;

        public C10843d(String string) {
            super(rwc.m21588a(string));
        }

        @Override // p000.p8d.C10844e
        public String toString() {
            return "Predicates.containsPattern(" + this.f70017a.pattern() + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: p8d$e */
    @jd7
    @yg8
    public static class C10844e implements l8d<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final hc2 f70017a;

        public C10844e(hc2 pattern) {
            this.f70017a = (hc2) v7d.checkNotNull(pattern);
        }

        @Override // p000.l8d
        public boolean equals(@wx1 Object obj) {
            if (!(obj instanceof C10844e)) {
                return false;
            }
            C10844e c10844e = (C10844e) obj;
            return okb.equal(this.f70017a.pattern(), c10844e.f70017a.pattern()) && this.f70017a.flags() == c10844e.f70017a.flags();
        }

        public int hashCode() {
            return okb.hashCode(this.f70017a.pattern(), Integer.valueOf(this.f70017a.flags()));
        }

        public String toString() {
            return "Predicates.contains(" + yya.toStringHelper(this.f70017a).add("pattern", this.f70017a.pattern()).add("pattern.flags", this.f70017a.flags()).toString() + c0b.f15434d;
        }

        @Override // p000.l8d
        public boolean apply(CharSequence t) {
            return this.f70017a.matcher(t).find();
        }
    }

    /* JADX INFO: renamed from: p8d$f */
    public static class C10845f<T> implements l8d<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Collection<?> f70018a;

        @Override // p000.l8d
        public boolean apply(@lgc T t) {
            try {
                return this.f70018a.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // p000.l8d
        public boolean equals(@wx1 Object obj) {
            if (obj instanceof C10845f) {
                return this.f70018a.equals(((C10845f) obj).f70018a);
            }
            return false;
        }

        public int hashCode() {
            return this.f70018a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f70018a + c0b.f15434d;
        }

        private C10845f(Collection<?> target) {
            this.f70018a = (Collection) v7d.checkNotNull(target);
        }
    }

    /* JADX INFO: renamed from: p8d$g */
    @jd7
    public static class C10846g<T> implements l8d<T>, Serializable {

        @yg8
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Class<?> f70019a;

        @Override // p000.l8d
        public boolean apply(@lgc T o) {
            return this.f70019a.isInstance(o);
        }

        @Override // p000.l8d
        public boolean equals(@wx1 Object obj) {
            return (obj instanceof C10846g) && this.f70019a == ((C10846g) obj).f70019a;
        }

        public int hashCode() {
            return this.f70019a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f70019a.getName() + c0b.f15434d;
        }

        private C10846g(Class<?> clazz) {
            this.f70019a = (Class) v7d.checkNotNull(clazz);
        }
    }

    /* JADX INFO: renamed from: p8d$h */
    public static class C10847h implements l8d<Object>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Object f70020a;

        /* JADX INFO: renamed from: a */
        public <T> l8d<T> m19343a() {
            return this;
        }

        @Override // p000.l8d
        public boolean apply(@wx1 Object o) {
            return this.f70020a.equals(o);
        }

        @Override // p000.l8d
        public boolean equals(@wx1 Object obj) {
            if (obj instanceof C10847h) {
                return this.f70020a.equals(((C10847h) obj).f70020a);
            }
            return false;
        }

        public int hashCode() {
            return this.f70020a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f70020a + c0b.f15434d;
        }

        private C10847h(Object target) {
            this.f70020a = target;
        }
    }

    /* JADX INFO: renamed from: p8d$i */
    public static class C10848i<T> implements l8d<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final l8d<T> f70021a;

        public C10848i(l8d<T> predicate) {
            this.f70021a = (l8d) v7d.checkNotNull(predicate);
        }

        @Override // p000.l8d
        public boolean apply(@lgc T t) {
            return !this.f70021a.apply(t);
        }

        @Override // p000.l8d
        public boolean equals(@wx1 Object obj) {
            if (obj instanceof C10848i) {
                return this.f70021a.equals(((C10848i) obj).f70021a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f70021a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f70021a + c0b.f15434d;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: p8d$j */
    public static abstract class EnumC10849j implements l8d<Object> {

        /* JADX INFO: renamed from: a */
        public static final EnumC10849j f70022a = new a("ALWAYS_TRUE", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC10849j f70023b = new b("ALWAYS_FALSE", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC10849j f70024c = new c("IS_NULL", 2);

        /* JADX INFO: renamed from: d */
        public static final EnumC10849j f70025d = new d("NOT_NULL", 3);

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ EnumC10849j[] f70026e = $values();

        /* JADX INFO: renamed from: p8d$j$a */
        public enum a extends EnumC10849j {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.l8d
            public boolean apply(@wx1 Object o) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        /* JADX INFO: renamed from: p8d$j$b */
        public enum b extends EnumC10849j {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.l8d
            public boolean apply(@wx1 Object o) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        /* JADX INFO: renamed from: p8d$j$c */
        public enum c extends EnumC10849j {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.l8d
            public boolean apply(@wx1 Object o) {
                return o == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        /* JADX INFO: renamed from: p8d$j$d */
        public enum d extends EnumC10849j {
            public d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.l8d
            public boolean apply(@wx1 Object o) {
                return o != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        private static /* synthetic */ EnumC10849j[] $values() {
            return new EnumC10849j[]{f70022a, f70023b, f70024c, f70025d};
        }

        private EnumC10849j(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC10849j valueOf(String name) {
            return (EnumC10849j) Enum.valueOf(EnumC10849j.class, name);
        }

        public static EnumC10849j[] values() {
            return (EnumC10849j[]) f70026e.clone();
        }

        /* JADX INFO: renamed from: a */
        public <T> l8d<T> m19344a() {
            return this;
        }
    }

    /* JADX INFO: renamed from: p8d$k */
    public static class C10850k<T> implements l8d<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final List<? extends l8d<? super T>> f70027a;

        @Override // p000.l8d
        public boolean apply(@lgc T t) {
            for (int i = 0; i < this.f70027a.size(); i++) {
                if (this.f70027a.get(i).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.l8d
        public boolean equals(@wx1 Object obj) {
            if (obj instanceof C10850k) {
                return this.f70027a.equals(((C10850k) obj).f70027a);
            }
            return false;
        }

        public int hashCode() {
            return this.f70027a.hashCode() + 87855567;
        }

        public String toString() {
            return p8d.toStringHelper("or", this.f70027a);
        }

        private C10850k(List<? extends l8d<? super T>> components) {
            this.f70027a = components;
        }
    }

    /* JADX INFO: renamed from: p8d$l */
    @jd7
    @yg8
    public static class C10851l implements l8d<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Class<?> f70028a;

        @Override // p000.l8d
        public boolean equals(@wx1 Object obj) {
            return (obj instanceof C10851l) && this.f70028a == ((C10851l) obj).f70028a;
        }

        public int hashCode() {
            return this.f70028a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f70028a.getName() + c0b.f15434d;
        }

        private C10851l(Class<?> clazz) {
            this.f70028a = (Class) v7d.checkNotNull(clazz);
        }

        @Override // p000.l8d
        public boolean apply(Class<?> input) {
            return this.f70028a.isAssignableFrom(input);
        }
    }

    private p8d() {
    }

    @gd7(serializable = true)
    public static <T> l8d<T> alwaysFalse() {
        return EnumC10849j.f70023b.m19344a();
    }

    @gd7(serializable = true)
    public static <T> l8d<T> alwaysTrue() {
        return EnumC10849j.f70022a.m19344a();
    }

    public static <T> l8d<T> and(Iterable<? extends l8d<? super T>> components) {
        return new C10841b(m19338b(components));
    }

    private static <T> List<l8d<? super T>> asList(l8d<? super T> first, l8d<? super T> second) {
        return Arrays.asList(first, second);
    }

    /* JADX INFO: renamed from: b */
    public static <T> List<T> m19338b(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(v7d.checkNotNull(it.next()));
        }
        return arrayList;
    }

    public static <A, B> l8d<A> compose(l8d<B> predicate, lz6<A, ? extends B> function) {
        return new C10842c(predicate, function);
    }

    @jd7("java.util.regex.Pattern")
    @yg8
    public static l8d<CharSequence> contains(Pattern pattern) {
        return new C10844e(new gj8(pattern));
    }

    @jd7
    @yg8
    public static l8d<CharSequence> containsPattern(String pattern) {
        return new C10843d(pattern);
    }

    private static <T> List<T> defensiveCopy(T... array) {
        return m19338b(Arrays.asList(array));
    }

    public static <T> l8d<T> equalTo(@lgc T target) {
        return target == null ? isNull() : new C10847h(target).m19343a();
    }

    /* JADX INFO: renamed from: in */
    public static <T> l8d<T> m19339in(Collection<? extends T> target) {
        return new C10845f(target);
    }

    @jd7
    public static <T> l8d<T> instanceOf(Class<?> clazz) {
        return new C10846g(clazz);
    }

    @gd7(serializable = true)
    public static <T> l8d<T> isNull() {
        return EnumC10849j.f70024c.m19344a();
    }

    public static <T> l8d<T> not(l8d<T> predicate) {
        return new C10848i(predicate);
    }

    @gd7(serializable = true)
    public static <T> l8d<T> notNull() {
        return EnumC10849j.f70025d.m19344a();
    }

    /* JADX INFO: renamed from: or */
    public static <T> l8d<T> m19340or(Iterable<? extends l8d<? super T>> components) {
        return new C10850k(m19338b(components));
    }

    @jd7
    @yg8
    public static l8d<Class<?>> subtypeOf(Class<?> clazz) {
        return new C10851l(clazz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toStringHelper(String methodName, Iterable<?> components) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(methodName);
        sb.append('(');
        boolean z = true;
        for (Object obj : components) {
            if (!z) {
                sb.append(C4584d2.f28238g);
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @SafeVarargs
    public static <T> l8d<T> and(l8d<? super T>... components) {
        return new C10841b(defensiveCopy(components));
    }

    @SafeVarargs
    /* JADX INFO: renamed from: or */
    public static <T> l8d<T> m19342or(l8d<? super T>... components) {
        return new C10850k(defensiveCopy(components));
    }

    public static <T> l8d<T> and(l8d<? super T> first, l8d<? super T> second) {
        return new C10841b(asList((l8d) v7d.checkNotNull(first), (l8d) v7d.checkNotNull(second)));
    }

    /* JADX INFO: renamed from: or */
    public static <T> l8d<T> m19341or(l8d<? super T> first, l8d<? super T> second) {
        return new C10850k(asList((l8d) v7d.checkNotNull(first), (l8d) v7d.checkNotNull(second)));
    }
}
