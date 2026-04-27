package p000;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class n9c {
    public static n9c create(int i, m7b m7bVar) {
        return new kl0(i, m7bVar);
    }

    public ci4 getKey() {
        return getMutation().getKey();
    }

    public abstract int getLargestBatchId();

    public abstract m7b getMutation();
}
