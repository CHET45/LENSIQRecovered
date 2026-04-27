package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@igg({"UnknownNullness"})
public interface o8d<T> {
    @igg({"MissingNullability"})
    static <T> o8d<T> isEqual(@igg({"MissingNullability"}) final Object obj) {
        return obj == null ? new o8d() { // from class: h8d
            @Override // p000.o8d
            public final boolean test(Object obj2) {
                return Objects.isNull(obj2);
            }
        } : new o8d() { // from class: i8d
            @Override // p000.o8d
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$0(o8d o8dVar, Object obj) {
        return test(obj) && o8dVar.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$1(Object obj) {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$2(o8d o8dVar, Object obj) {
        return test(obj) || o8dVar.test(obj);
    }

    @igg({"MissingNullability"})
    static <T> o8d<T> not(@igg({"MissingNullability"}) o8d<? super T> o8dVar) {
        Objects.requireNonNull(o8dVar);
        return o8dVar.negate();
    }

    @igg({"MissingNullability"})
    default o8d<T> and(@igg({"MissingNullability"}) final o8d<? super T> o8dVar) {
        Objects.requireNonNull(o8dVar);
        return new o8d() { // from class: j8d
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return this.f49818a.lambda$and$0(o8dVar, obj);
            }
        };
    }

    @igg({"MissingNullability"})
    default o8d<T> negate() {
        return new o8d() { // from class: k8d
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return this.f52777a.lambda$negate$1(obj);
            }
        };
    }

    @igg({"MissingNullability"})
    /* JADX INFO: renamed from: or */
    default o8d<T> m18418or(@igg({"MissingNullability"}) final o8d<? super T> o8dVar) {
        Objects.requireNonNull(o8dVar);
        return new o8d() { // from class: g8d
            @Override // p000.o8d
            public final boolean test(Object obj) {
                return this.f38999a.lambda$or$2(o8dVar, obj);
            }
        };
    }

    boolean test(T t);
}
