package p000;

import androidx.lifecycle.C1171x;
import java.util.Map;
import p000.ap8;

/* JADX INFO: loaded from: classes.dex */
public final class z5b<K, V> implements Map.Entry<K, V>, ap8.InterfaceC1546a {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Object[] f104241a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Object[] f104242b;

    /* JADX INFO: renamed from: c */
    public final int f104243c;

    public z5b(@yfb Object[] objArr, @yfb Object[] objArr2, int i) {
        md8.checkNotNullParameter(objArr, "keys");
        md8.checkNotNullParameter(objArr2, C1171x.f7958g);
        this.f104241a = objArr;
        this.f104242b = objArr2;
        this.f104243c = i;
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public final int getIndex() {
        return this.f104243c;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.f104241a[this.f104243c];
    }

    @yfb
    public final Object[] getKeys() {
        return this.f104241a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.f104242b[this.f104243c];
    }

    @yfb
    public final Object[] getValues() {
        return this.f104242b;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        Object[] objArr = this.f104242b;
        int i = this.f104243c;
        V v2 = (V) objArr[i];
        objArr[i] = v;
        return v2;
    }
}
