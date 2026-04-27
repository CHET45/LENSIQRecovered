package p000;

import android.util.Pair;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class nw1 extends Pair<UUID, Integer> {
    public nw1(UUID uuid, Integer num) {
        super(uuid, num);
    }

    @Override // android.util.Pair
    public String toString() {
        return "CharacteristicNotificationId{UUID=" + ((UUID) ((Pair) this).first).toString() + ", instanceId=" + ((Integer) ((Pair) this).second).toString() + '}';
    }
}
