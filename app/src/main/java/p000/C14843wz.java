package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: wz */
/* JADX INFO: loaded from: classes8.dex */
public final class C14843wz implements tog {

    /* JADX INFO: renamed from: a */
    public static final List<b<?>> f95813a;

    /* JADX INFO: renamed from: wz$b */
    public static abstract class b<T extends InterfaceC7667iz> {

        /* JADX INFO: renamed from: a */
        public static final C13801uz f95814a = new C13801uz();

        private b() {
        }

        private List<Exception> validateAnnotatable(T t) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : t.getAnnotations()) {
                w1i w1iVar = (w1i) annotation.annotationType().getAnnotation(w1i.class);
                if (w1iVar != null) {
                    arrayList.addAll(mo24874b(f95814a.createAnnotationValidator(w1iVar), t));
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: a */
        public abstract Iterable<T> mo24873a(rog rogVar);

        /* JADX INFO: renamed from: b */
        public abstract List<Exception> mo24874b(AbstractC13291tz abstractC13291tz, T t);

        public List<Exception> validateTestClass(rog rogVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = mo24873a(rogVar).iterator();
            while (it.hasNext()) {
                arrayList.addAll(validateAnnotatable(it.next()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: wz$c */
    public static class c extends b<rog> {
        private c() {
            super();
        }

        @Override // p000.C14843wz.b
        /* JADX INFO: renamed from: a */
        public Iterable<rog> mo24873a(rog rogVar) {
            return Collections.singletonList(rogVar);
        }

        @Override // p000.C14843wz.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<Exception> mo24874b(AbstractC13291tz abstractC13291tz, rog rogVar) {
            return abstractC13291tz.validateAnnotatedClass(rogVar);
        }
    }

    /* JADX INFO: renamed from: wz$d */
    public static class d extends b<tv6> {
        private d() {
            super();
        }

        @Override // p000.C14843wz.b
        /* JADX INFO: renamed from: a */
        public Iterable<tv6> mo24873a(rog rogVar) {
            return rogVar.getAnnotatedFields();
        }

        @Override // p000.C14843wz.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<Exception> mo24874b(AbstractC13291tz abstractC13291tz, tv6 tv6Var) {
            return abstractC13291tz.validateAnnotatedField(tv6Var);
        }
    }

    /* JADX INFO: renamed from: wz$e */
    public static class e extends b<ow6> {
        private e() {
            super();
        }

        @Override // p000.C14843wz.b
        /* JADX INFO: renamed from: a */
        public Iterable<ow6> mo24873a(rog rogVar) {
            return rogVar.getAnnotatedMethods();
        }

        @Override // p000.C14843wz.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<Exception> mo24874b(AbstractC13291tz abstractC13291tz, ow6 ow6Var) {
            return abstractC13291tz.validateAnnotatedMethod(ow6Var);
        }
    }

    static {
        f95813a = Arrays.asList(new c(), new e(), new d());
    }

    @Override // p000.tog
    public List<Exception> validateTestClass(rog rogVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<b<?>> it = f95813a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().validateTestClass(rogVar));
        }
        return arrayList;
    }
}
