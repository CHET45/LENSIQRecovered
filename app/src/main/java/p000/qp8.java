package p000;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qp8 implements mp8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final mp8 f75069a;

    public qp8(@yfb mp8 mp8Var) {
        md8.checkNotNullParameter(mp8Var, "origin");
        this.f75069a = mp8Var;
    }

    public boolean equals(@gib Object obj) {
        if (obj == null) {
            return false;
        }
        mp8 mp8Var = this.f75069a;
        qp8 qp8Var = obj instanceof qp8 ? (qp8) obj : null;
        if (!md8.areEqual(mp8Var, qp8Var != null ? qp8Var.f75069a : null)) {
            return false;
        }
        ro8 classifier = getClassifier();
        if (classifier instanceof oo8) {
            mp8 mp8Var2 = obj instanceof mp8 ? (mp8) obj : null;
            ro8 classifier2 = mp8Var2 != null ? mp8Var2.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof oo8)) {
                return md8.areEqual(hn8.getJavaClass((oo8) classifier), hn8.getJavaClass((oo8) classifier2));
            }
        }
        return false;
    }

    @Override // p000.mo8
    @yfb
    public List<Annotation> getAnnotations() {
        return this.f75069a.getAnnotations();
    }

    @Override // p000.mp8
    @yfb
    public List<pp8> getArguments() {
        return this.f75069a.getArguments();
    }

    @Override // p000.mp8
    @gib
    public ro8 getClassifier() {
        return this.f75069a.getClassifier();
    }

    public int hashCode() {
        return this.f75069a.hashCode();
    }

    @Override // p000.mp8
    public boolean isMarkedNullable() {
        return this.f75069a.isMarkedNullable();
    }

    @yfb
    public String toString() {
        return "KTypeWrapper: " + this.f75069a;
    }
}
