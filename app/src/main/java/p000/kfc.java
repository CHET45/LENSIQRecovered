package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@px4
public final class kfc implements AnnotatedElement {

    /* JADX INFO: renamed from: a */
    public final ue8<?, ?> f53974a;

    /* JADX INFO: renamed from: b */
    public final int f53975b;

    /* JADX INFO: renamed from: c */
    public final nmh<?> f53976c;

    /* JADX INFO: renamed from: d */
    public final kx7<Annotation> f53977d;

    /* JADX INFO: renamed from: e */
    public final Object f53978e;

    public kfc(ue8<?, ?> declaration, int position, nmh<?> type, Annotation[] annotations, Object annotatedType) {
        this.f53974a = declaration;
        this.f53975b = position;
        this.f53976c = type;
        this.f53977d = kx7.copyOf(annotations);
        this.f53978e = annotatedType;
    }

    public boolean equals(@wx1 Object obj) {
        if (!(obj instanceof kfc)) {
            return false;
        }
        kfc kfcVar = (kfc) obj;
        return this.f53975b == kfcVar.f53975b && this.f53974a.equals(kfcVar.f53974a);
    }

    @w01
    @Deprecated
    @hh4("fails under Android VMs; do not use from guava-android")
    @xr7
    public AnnotatedType getAnnotatedType() {
        AnnotatedType annotatedType = (AnnotatedType) this.f53978e;
        Objects.requireNonNull(annotatedType);
        return annotatedType;
    }

    @Override // java.lang.reflect.AnnotatedElement
    @wx1
    public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
        v7d.checkNotNull(annotationType);
        quh<Annotation> it = this.f53977d.iterator();
        while (it.hasNext()) {
            Annotation next = it.next();
            if (annotationType.isInstance(next)) {
                return annotationType.cast(next);
            }
        }
        return null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @wx1
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationType) {
        v7d.checkNotNull(annotationType);
        return (A) em6.from(this.f53977d).filter(annotationType).first().orNull();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[]) this.f53977d.toArray(new Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        return (A[]) ((Annotation[]) em6.from(this.f53977d).filter(cls).toArray(cls));
    }

    public ue8<?, ?> getDeclaringInvokable() {
        return this.f53974a;
    }

    public nmh<?> getType() {
        return this.f53976c;
    }

    public int hashCode() {
        return this.f53975b;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> annotationType) {
        return getAnnotation(annotationType) != null;
    }

    public String toString() {
        return this.f53976c + " arg" + this.f53975b;
    }
}
