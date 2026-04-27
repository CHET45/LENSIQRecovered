package p000;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public class my7<K, V> implements Iterator<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<ht8<K, V>> f62783a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b */
    public final boolean f62784b;

    public my7(ft8<K, V> ft8Var, K k, Comparator<K> comparator, boolean z) {
        this.f62784b = z;
        while (!ft8Var.isEmpty()) {
            int iCompare = k != null ? z ? comparator.compare(k, ft8Var.getKey()) : comparator.compare(ft8Var.getKey(), k) : 1;
            if (iCompare < 0) {
                ft8Var = z ? ft8Var.getLeft() : ft8Var.getRight();
            } else if (iCompare == 0) {
                this.f62783a.push((ht8) ft8Var);
                return;
            } else {
                this.f62783a.push((ht8) ft8Var);
                ft8Var = z ? ft8Var.getRight() : ft8Var.getLeft();
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f62783a.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        try {
            ht8<K, V> ht8VarPop = this.f62783a.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(ht8VarPop.getKey(), ht8VarPop.getValue());
            if (this.f62784b) {
                for (ft8<K, V> left = ht8VarPop.getLeft(); !left.isEmpty(); left = left.getRight()) {
                    this.f62783a.push((ht8) left);
                }
            } else {
                for (ft8<K, V> right = ht8VarPop.getRight(); !right.isEmpty(); right = right.getLeft()) {
                    this.f62783a.push((ht8) right);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }
}
