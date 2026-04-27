package p000;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class g3b<T> implements ceh<T> {

    /* JADX INFO: renamed from: c */
    public final Collection<? extends ceh<T>> f38332c;

    @SafeVarargs
    public g3b(@efb ceh<T>... cehVarArr) {
        if (cehVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f38332c = Arrays.asList(cehVarArr);
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (obj instanceof g3b) {
            return this.f38332c.equals(((g3b) obj).f38332c);
        }
        return false;
    }

    @Override // p000.eq8
    public int hashCode() {
        return this.f38332c.hashCode();
    }

    @Override // p000.ceh
    @efb
    public t5e<T> transform(@efb Context context, @efb t5e<T> t5eVar, int i, int i2) {
        Iterator<? extends ceh<T>> it = this.f38332c.iterator();
        t5e<T> t5eVar2 = t5eVar;
        while (it.hasNext()) {
            t5e<T> t5eVarTransform = it.next().transform(context, t5eVar2, i, i2);
            if (t5eVar2 != null && !t5eVar2.equals(t5eVar) && !t5eVar2.equals(t5eVarTransform)) {
                t5eVar2.recycle();
            }
            t5eVar2 = t5eVarTransform;
        }
        return t5eVar2;
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        Iterator<? extends ceh<T>> it = this.f38332c.iterator();
        while (it.hasNext()) {
            it.next().updateDiskCacheKey(messageDigest);
        }
    }

    public g3b(@efb Collection<? extends ceh<T>> collection) {
        if (!collection.isEmpty()) {
            this.f38332c = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
