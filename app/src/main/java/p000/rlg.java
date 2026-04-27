package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public class rlg extends qlg {

    /* JADX INFO: renamed from: a */
    public final Collection<String> f78654a;

    public rlg(Collection<String> collection) {
        this.f78654a = collection;
    }

    @efb
    public static rlg create(@efb String str) {
        return new rlg(Collections.singleton(str));
    }

    @Override // p000.qlg
    public void handle(@efb yu9 yu9Var, @efb pu9 pu9Var, @efb nm7 nm7Var) {
    }

    @Override // p000.qlg
    @efb
    public Collection<String> supportedTags() {
        return this.f78654a;
    }

    @efb
    public static rlg create(@efb String... strArr) {
        return new rlg(Arrays.asList(strArr));
    }
}
