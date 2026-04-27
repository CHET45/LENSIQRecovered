package p000;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class o51 extends c51 {

    /* JADX INFO: renamed from: a */
    public final UUID f66489a;

    public o51(UUID uuid) {
        super("BLE Service not found with UUID " + uuid);
        this.f66489a = uuid;
    }

    public UUID getServiceUUID() {
        return this.f66489a;
    }
}
