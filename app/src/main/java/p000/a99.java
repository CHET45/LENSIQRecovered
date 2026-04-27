package p000;

import java.util.List;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class a99 implements z89 {
    /* JADX INFO: renamed from: a */
    public static <E> v98.InterfaceC13956l<E> m224a(Object message, long offset) {
        return (v98.InterfaceC13956l) evh.m10252F(message, offset);
    }

    @Override // p000.z89
    public void makeImmutableListAt(Object message, long offset) {
        m224a(message, offset).makeImmutable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection, java.util.List, v98$l] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // p000.z89
    public <E> void mergeListsAt(Object obj, Object obj2, long j) {
        v98.InterfaceC13956l interfaceC13956lM224a = m224a(obj, j);
        ?? M224a = m224a(obj2, j);
        int size = interfaceC13956lM224a.size();
        int size2 = M224a.size();
        ?? r0 = interfaceC13956lM224a;
        r0 = interfaceC13956lM224a;
        if (size > 0 && size2 > 0) {
            boolean zIsModifiable = interfaceC13956lM224a.isModifiable();
            ?? MutableCopyWithCapacity2 = interfaceC13956lM224a;
            if (!zIsModifiable) {
                MutableCopyWithCapacity2 = interfaceC13956lM224a.mutableCopyWithCapacity2(size2 + size);
            }
            MutableCopyWithCapacity2.addAll(M224a);
            r0 = MutableCopyWithCapacity2;
        }
        if (size > 0) {
            M224a = r0;
        }
        evh.m10280d0(obj, j, M224a);
    }

    @Override // p000.z89
    public <L> List<L> mutableListAt(Object message, long offset) {
        v98.InterfaceC13956l interfaceC13956lM224a = m224a(message, offset);
        if (interfaceC13956lM224a.isModifiable()) {
            return interfaceC13956lM224a;
        }
        int size = interfaceC13956lM224a.size();
        v98.InterfaceC13956l interfaceC13956lMutableCopyWithCapacity2 = interfaceC13956lM224a.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        evh.m10280d0(message, offset, interfaceC13956lMutableCopyWithCapacity2);
        return interfaceC13956lMutableCopyWithCapacity2;
    }
}
