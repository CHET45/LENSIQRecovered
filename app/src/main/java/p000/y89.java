package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public abstract class y89 {

    /* JADX INFO: renamed from: a */
    public static final y89 f100754a;

    /* JADX INFO: renamed from: b */
    public static final y89 f100755b;

    /* JADX INFO: renamed from: y89$b */
    public static final class C15549b extends y89 {

        /* JADX INFO: renamed from: c */
        public static final Class<?> f100756c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private C15549b() {
            super();
        }

        /* JADX INFO: renamed from: f */
        public static <E> List<E> m25703f(Object message, long offset) {
            return (List) dvh.m9443F(message, offset);
        }

        private static <L> List<L> mutableListAt(Object obj, long j, int i) {
            Object obj2;
            List<L> listM25703f = m25703f(obj, j);
            if (listM25703f.isEmpty()) {
                List<L> d39Var = listM25703f instanceof e39 ? new d39(i) : ((listM25703f instanceof kbd) && (listM25703f instanceof w98.InterfaceC14504k)) ? ((w98.InterfaceC14504k) listM25703f).mutableCopyWithCapacity2(i) : new ArrayList<>(i);
                dvh.m9471d0(obj, j, d39Var);
                return d39Var;
            }
            if (f100756c.isAssignableFrom(listM25703f.getClass())) {
                ArrayList arrayList = new ArrayList(listM25703f.size() + i);
                arrayList.addAll(listM25703f);
                dvh.m9471d0(obj, j, arrayList);
                obj2 = arrayList;
            } else {
                if (!(listM25703f instanceof ruh)) {
                    if (!(listM25703f instanceof kbd) || !(listM25703f instanceof w98.InterfaceC14504k)) {
                        return listM25703f;
                    }
                    w98.InterfaceC14504k interfaceC14504k = (w98.InterfaceC14504k) listM25703f;
                    if (interfaceC14504k.isModifiable()) {
                        return listM25703f;
                    }
                    w98.InterfaceC14504k interfaceC14504kMutableCopyWithCapacity2 = interfaceC14504k.mutableCopyWithCapacity2(listM25703f.size() + i);
                    dvh.m9471d0(obj, j, interfaceC14504kMutableCopyWithCapacity2);
                    return interfaceC14504kMutableCopyWithCapacity2;
                }
                d39 d39Var2 = new d39(listM25703f.size() + i);
                d39Var2.addAll((ruh) listM25703f);
                dvh.m9471d0(obj, j, d39Var2);
                obj2 = d39Var2;
            }
            return (List<L>) obj2;
        }

        @Override // p000.y89
        /* JADX INFO: renamed from: c */
        public void mo25700c(Object message, long offset) {
            Object objUnmodifiableList;
            List list = (List) dvh.m9443F(message, offset);
            if (list instanceof e39) {
                objUnmodifiableList = ((e39) list).getUnmodifiableView();
            } else {
                if (f100756c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof kbd) && (list instanceof w98.InterfaceC14504k)) {
                    w98.InterfaceC14504k interfaceC14504k = (w98.InterfaceC14504k) list;
                    if (interfaceC14504k.isModifiable()) {
                        interfaceC14504k.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            dvh.m9471d0(message, offset, objUnmodifiableList);
        }

        @Override // p000.y89
        /* JADX INFO: renamed from: d */
        public <E> void mo25701d(Object msg, Object otherMsg, long offset) {
            List listM25703f = m25703f(otherMsg, offset);
            List listMutableListAt = mutableListAt(msg, offset, listM25703f.size());
            int size = listMutableListAt.size();
            int size2 = listM25703f.size();
            if (size > 0 && size2 > 0) {
                listMutableListAt.addAll(listM25703f);
            }
            if (size > 0) {
                listM25703f = listMutableListAt;
            }
            dvh.m9471d0(msg, offset, listM25703f);
        }

        @Override // p000.y89
        /* JADX INFO: renamed from: e */
        public <L> List<L> mo25702e(Object message, long offset) {
            return mutableListAt(message, offset, 10);
        }
    }

    /* JADX INFO: renamed from: y89$c */
    public static final class C15550c extends y89 {
        private C15550c() {
            super();
        }

        /* JADX INFO: renamed from: f */
        public static <E> w98.InterfaceC14504k<E> m25704f(Object message, long offset) {
            return (w98.InterfaceC14504k) dvh.m9443F(message, offset);
        }

        @Override // p000.y89
        /* JADX INFO: renamed from: c */
        public void mo25700c(Object message, long offset) {
            m25704f(message, offset).makeImmutable();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection, java.util.List, w98$k] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v3 */
        @Override // p000.y89
        /* JADX INFO: renamed from: d */
        public <E> void mo25701d(Object obj, Object obj2, long j) {
            w98.InterfaceC14504k interfaceC14504kM25704f = m25704f(obj, j);
            ?? M25704f = m25704f(obj2, j);
            int size = interfaceC14504kM25704f.size();
            int size2 = M25704f.size();
            ?? r0 = interfaceC14504kM25704f;
            r0 = interfaceC14504kM25704f;
            if (size > 0 && size2 > 0) {
                boolean zIsModifiable = interfaceC14504kM25704f.isModifiable();
                ?? MutableCopyWithCapacity2 = interfaceC14504kM25704f;
                if (!zIsModifiable) {
                    MutableCopyWithCapacity2 = interfaceC14504kM25704f.mutableCopyWithCapacity2(size2 + size);
                }
                MutableCopyWithCapacity2.addAll(M25704f);
                r0 = MutableCopyWithCapacity2;
            }
            if (size > 0) {
                M25704f = r0;
            }
            dvh.m9471d0(obj, j, M25704f);
        }

        @Override // p000.y89
        /* JADX INFO: renamed from: e */
        public <L> List<L> mo25702e(Object message, long offset) {
            w98.InterfaceC14504k interfaceC14504kM25704f = m25704f(message, offset);
            if (interfaceC14504kM25704f.isModifiable()) {
                return interfaceC14504kM25704f;
            }
            int size = interfaceC14504kM25704f.size();
            w98.InterfaceC14504k interfaceC14504kMutableCopyWithCapacity2 = interfaceC14504kM25704f.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            dvh.m9471d0(message, offset, interfaceC14504kMutableCopyWithCapacity2);
            return interfaceC14504kMutableCopyWithCapacity2;
        }
    }

    static {
        f100754a = new C15549b();
        f100755b = new C15550c();
    }

    /* JADX INFO: renamed from: a */
    public static y89 m25698a() {
        return f100754a;
    }

    /* JADX INFO: renamed from: b */
    public static y89 m25699b() {
        return f100755b;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo25700c(Object msg, long offset);

    /* JADX INFO: renamed from: d */
    public abstract <L> void mo25701d(Object msg, Object otherMsg, long offset);

    /* JADX INFO: renamed from: e */
    public abstract <L> List<L> mo25702e(Object msg, long offset);

    private y89() {
    }
}
