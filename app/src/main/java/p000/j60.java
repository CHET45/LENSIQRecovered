package p000;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class j60 implements Iterator<Object> {

    /* JADX INFO: renamed from: a */
    public final Object f49594a;

    /* JADX INFO: renamed from: b */
    public int f49595b = 0;

    public j60(Object obj) {
        if (!obj.getClass().isArray()) {
            throw new IllegalArgumentException("not an array");
        }
        this.f49594a = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f49595b < Array.getLength(this.f49594a);
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f49594a;
        int i = this.f49595b;
        this.f49595b = i + 1;
        return Array.get(obj, i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
