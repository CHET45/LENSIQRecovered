package p000;

import java.io.Serializable;
import p000.d4b;
import p000.vx7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public class nxd<E> extends vx7<E> {

    /* JADX INFO: renamed from: m */
    public static final nxd<Object> f65969m = new nxd<>(qjb.m20385a());

    /* JADX INFO: renamed from: d */
    public final transient qjb<E> f65970d;

    /* JADX INFO: renamed from: e */
    public final transient int f65971e;

    /* JADX INFO: renamed from: f */
    @wx1
    @ez8
    public transient dy7<E> f65972f;

    /* JADX INFO: renamed from: nxd$b */
    public final class C10110b extends p08<E> {
        private C10110b() {
        }

        @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object object) {
            return nxd.this.contains(object);
        }

        @Override // p000.p08
        public E get(int index) {
            return nxd.this.f65970d.m20390f(index);
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return nxd.this.f65970d.m20401q();
        }
    }

    /* JADX INFO: renamed from: nxd$c */
    @jd7
    public static class C10111c implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Object[] f65974a;

        /* JADX INFO: renamed from: b */
        public final int[] f65975b;

        public C10111c(d4b<? extends Object> multiset) {
            int size = multiset.entrySet().size();
            this.f65974a = new Object[size];
            this.f65975b = new int[size];
            int i = 0;
            for (d4b.InterfaceC4612a<? extends Object> interfaceC4612a : multiset.entrySet()) {
                this.f65974a[i] = interfaceC4612a.getElement();
                this.f65975b[i] = interfaceC4612a.getCount();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            vx7.C14287b c14287b = new vx7.C14287b(this.f65974a.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.f65974a;
                if (i >= objArr.length) {
                    return c14287b.build();
                }
                c14287b.addCopies(objArr[i], this.f65975b[i]);
                i++;
            }
        }
    }

    public nxd(qjb<E> contents) {
        this.f65970d = contents;
        long jM20391g = 0;
        for (int i = 0; i < contents.m20401q(); i++) {
            jM20391g += (long) contents.m20391g(i);
        }
        this.f65971e = rd8.saturatedCast(jM20391g);
    }

    @Override // p000.d4b
    public int count(@wx1 Object element) {
        return this.f65970d.get(element);
    }

    @Override // p000.vx7
    /* JADX INFO: renamed from: f */
    public d4b.InterfaceC4612a<E> mo8961f(int index) {
        return this.f65970d.m20389e(index);
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    public int size() {
        return this.f65971e;
    }

    @Override // p000.vx7, p000.ax7
    @jd7
    public Object writeReplace() {
        return new C10111c(this);
    }

    @Override // p000.vx7, p000.d4b
    public dy7<E> elementSet() {
        dy7<E> dy7Var = this.f65972f;
        if (dy7Var != null) {
            return dy7Var;
        }
        C10110b c10110b = new C10110b();
        this.f65972f = c10110b;
        return c10110b;
    }
}
