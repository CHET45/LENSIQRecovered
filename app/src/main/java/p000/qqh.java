package p000;

import android.os.ParcelUuid;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class qqh {

    /* JADX INFO: renamed from: b */
    public static final ParcelUuid f75147b = new ParcelUuid(nne.f65119r);

    /* JADX INFO: renamed from: c */
    public static final int f75148c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f75149d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f75150e = 16;

    /* JADX INFO: renamed from: a */
    public final nne f75151a = new nne();

    public List<UUID> extractUUIDs(byte[] bArr) {
        return this.f75151a.extractUUIDs(bArr);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public jne parseFromBytes(byte[] bArr) {
        return this.f75151a.parseFromBytes(bArr);
    }

    @efb
    public Set<UUID> toDistinctSet(@hib UUID[] uuidArr) {
        if (uuidArr == null) {
            uuidArr = new UUID[0];
        }
        return new HashSet(Arrays.asList(uuidArr));
    }
}
