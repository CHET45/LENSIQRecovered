package p000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: ti */
/* JADX INFO: loaded from: classes6.dex */
public class C13055ti {

    /* JADX INFO: renamed from: a */
    public final nne f84902a = new nne();

    public List<UUID> extractUUIDs(byte[] bArr) {
        return this.f84902a.extractUUIDs(bArr);
    }

    @efb
    public Set<UUID> toDistinctSet(@hib UUID[] uuidArr) {
        if (uuidArr == null) {
            uuidArr = new UUID[0];
        }
        return new HashSet(Arrays.asList(uuidArr));
    }
}
