package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p000.kx7;

/* JADX INFO: loaded from: classes3.dex */
public final class z93 {

    /* JADX INFO: renamed from: c */
    public static final s7c<n93> f104437c = s7c.natural().onResultOf(new lz6() { // from class: v93
        @Override // p000.lz6
        public final Object apply(Object obj) {
            return z93.lambda$static$0((n93) obj);
        }
    });

    /* JADX INFO: renamed from: d */
    @ovh
    public static final z93 f104438d = new z93(kx7.m15110of(), 0);

    /* JADX INFO: renamed from: e */
    public static final String f104439e = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: f */
    public static final String f104440f = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: a */
    public final kx7<n93> f104441a;

    /* JADX INFO: renamed from: b */
    @ovh
    public final long f104442b;

    @ovh
    public z93(List<n93> list, long j) {
        this.f104441a = kx7.sortedCopyOf(f104437c, list);
        this.f104442b = j;
    }

    private static kx7<n93> filterOutBitmapCues(List<n93> list) {
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f63706d == null) {
                c8541aBuilder.add(list.get(i));
            }
        }
        return c8541aBuilder.build();
    }

    @ovh
    public static z93 fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f104439e);
        return new z93(parcelableArrayList == null ? kx7.m15110of() : og1.fromBundleList(new w93(), parcelableArrayList), bundle.getLong(f104440f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$static$0(n93 n93Var) {
        return Integer.valueOf(n93Var.f63720r);
    }

    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f104439e, og1.toBundleArrayList(filterOutBitmapCues(this.f104441a), new lz6() { // from class: x93
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return ((n93) obj).toBinderBasedBundle();
            }
        }));
        bundle.putLong(f104440f, this.f104442b);
        return bundle;
    }
}
