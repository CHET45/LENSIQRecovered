package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class r7e implements mj2 {

    /* JADX INFO: renamed from: a */
    public final Set<pkd<?>> f77338a;

    /* JADX INFO: renamed from: b */
    public final Set<pkd<?>> f77339b;

    /* JADX INFO: renamed from: c */
    public final Set<pkd<?>> f77340c;

    /* JADX INFO: renamed from: d */
    public final Set<pkd<?>> f77341d;

    /* JADX INFO: renamed from: e */
    public final Set<pkd<?>> f77342e;

    /* JADX INFO: renamed from: f */
    public final Set<Class<?>> f77343f;

    /* JADX INFO: renamed from: g */
    public final mj2 f77344g;

    /* JADX INFO: renamed from: r7e$a */
    public static class C11937a implements akd {

        /* JADX INFO: renamed from: a */
        public final Set<Class<?>> f77345a;

        /* JADX INFO: renamed from: b */
        public final akd f77346b;

        public C11937a(Set<Class<?>> set, akd akdVar) {
            this.f77345a = set;
            this.f77346b = akdVar;
        }

        @Override // p000.akd
        public void publish(o55<?> o55Var) {
            if (!this.f77345a.contains(o55Var.getType())) {
                throw new n64(String.format("Attempting to publish an undeclared event %s.", o55Var));
            }
            this.f77346b.publish(o55Var);
        }
    }

    public r7e(ej2<?> ej2Var, mj2 mj2Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (i64 i64Var : ej2Var.getDependencies()) {
            if (i64Var.isDirectInjection()) {
                if (i64Var.isSet()) {
                    hashSet4.add(i64Var.getInterface());
                } else {
                    hashSet.add(i64Var.getInterface());
                }
            } else if (i64Var.isDeferred()) {
                hashSet3.add(i64Var.getInterface());
            } else if (i64Var.isSet()) {
                hashSet5.add(i64Var.getInterface());
            } else {
                hashSet2.add(i64Var.getInterface());
            }
        }
        if (!ej2Var.getPublishedEvents().isEmpty()) {
            hashSet.add(pkd.unqualified(akd.class));
        }
        this.f77338a = Collections.unmodifiableSet(hashSet);
        this.f77339b = Collections.unmodifiableSet(hashSet2);
        this.f77340c = Collections.unmodifiableSet(hashSet3);
        this.f77341d = Collections.unmodifiableSet(hashSet4);
        this.f77342e = Collections.unmodifiableSet(hashSet5);
        this.f77343f = ej2Var.getPublishedEvents();
        this.f77344g = mj2Var;
    }

    @Override // p000.mj2
    public <T> T get(Class<T> cls) {
        if (!this.f77338a.contains(pkd.unqualified(cls))) {
            throw new n64(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f77344g.get(cls);
        return !cls.equals(akd.class) ? t : (T) new C11937a(this.f77343f, (akd) t);
    }

    @Override // p000.mj2
    public <T> z24<T> getDeferred(Class<T> cls) {
        return getDeferred(pkd.unqualified(cls));
    }

    @Override // p000.mj2
    public <T> eid<T> getProvider(Class<T> cls) {
        return getProvider(pkd.unqualified(cls));
    }

    @Override // p000.mj2
    public <T> Set<T> setOf(pkd<T> pkdVar) {
        if (this.f77341d.contains(pkdVar)) {
            return this.f77344g.setOf(pkdVar);
        }
        throw new n64(String.format("Attempting to request an undeclared dependency Set<%s>.", pkdVar));
    }

    @Override // p000.mj2
    public <T> eid<Set<T>> setOfProvider(Class<T> cls) {
        return setOfProvider(pkd.unqualified(cls));
    }

    @Override // p000.mj2
    public <T> z24<T> getDeferred(pkd<T> pkdVar) {
        if (this.f77340c.contains(pkdVar)) {
            return this.f77344g.getDeferred(pkdVar);
        }
        throw new n64(String.format("Attempting to request an undeclared dependency Deferred<%s>.", pkdVar));
    }

    @Override // p000.mj2
    public <T> eid<T> getProvider(pkd<T> pkdVar) {
        if (this.f77339b.contains(pkdVar)) {
            return this.f77344g.getProvider(pkdVar);
        }
        throw new n64(String.format("Attempting to request an undeclared dependency Provider<%s>.", pkdVar));
    }

    @Override // p000.mj2
    public <T> eid<Set<T>> setOfProvider(pkd<T> pkdVar) {
        if (this.f77342e.contains(pkdVar)) {
            return this.f77344g.setOfProvider(pkdVar);
        }
        throw new n64(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", pkdVar));
    }

    @Override // p000.mj2
    public <T> T get(pkd<T> pkdVar) {
        if (this.f77338a.contains(pkdVar)) {
            return (T) this.f77344g.get(pkdVar);
        }
        throw new n64(String.format("Attempting to request an undeclared dependency %s.", pkdVar));
    }
}
