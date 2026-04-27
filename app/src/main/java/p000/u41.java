package p000;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class u41 extends c51 {

    /* JADX INFO: renamed from: a */
    public final UUID f86752a;

    public u41(UUID uuid) {
        super("Characteristic not found with UUID " + uuid);
        this.f86752a = uuid;
    }

    public UUID getCharacteristicUUID() {
        return this.f86752a;
    }

    @Deprecated
    public UUID getCharactersisticUUID() {
        return this.f86752a;
    }
}
