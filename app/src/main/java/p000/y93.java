package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.gh1;
import p000.kx7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y93 implements gh1 {

    /* JADX INFO: renamed from: c */
    public static final y93 f100822c = new y93(kx7.m15110of(), 0);

    /* JADX INFO: renamed from: d */
    public static final String f100823d = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: e */
    public static final String f100824e = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: f */
    public static final gh1.InterfaceC6311a<y93> f100825f = new gh1.InterfaceC6311a() { // from class: u93
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return y93.fromBundle(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final kx7<o93> f100826a;

    /* JADX INFO: renamed from: b */
    public final long f100827b;

    public y93(List<o93> list, long j) {
        this.f100826a = kx7.copyOf((Collection) list);
        this.f100827b = j;
    }

    private static kx7<o93> filterOutBitmapCues(List<o93> list) {
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f66877d == null) {
                c8541aBuilder.add(list.get(i));
            }
        }
        return c8541aBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y93 fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f100823d);
        return new y93(parcelableArrayList == null ? kx7.m15110of() : ih1.fromBundleList(o93.f66834B2, parcelableArrayList), bundle.getLong(f100824e));
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f100823d, ih1.toBundleArrayList(filterOutBitmapCues(this.f100826a)));
        bundle.putLong(f100824e, this.f100827b);
        return bundle;
    }
}
