package p000;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class d08 implements Comparable<d08> {
    public static d08 create(int i, ci4 ci4Var, byte[] bArr, byte[] bArr2) {
        return new bl0(i, ci4Var, bArr, bArr2);
    }

    public abstract byte[] getArrayValue();

    public abstract byte[] getDirectionalValue();

    public abstract ci4 getDocumentKey();

    public abstract int getIndexId();

    @Override // java.lang.Comparable
    public int compareTo(d08 d08Var) {
        int iCompare = Integer.compare(getIndexId(), d08Var.getIndexId());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = getDocumentKey().compareTo(d08Var.getDocumentKey());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareByteArrays = r0i.compareByteArrays(getArrayValue(), d08Var.getArrayValue());
        return iCompareByteArrays != 0 ? iCompareByteArrays : r0i.compareByteArrays(getDirectionalValue(), d08Var.getDirectionalValue());
    }
}
