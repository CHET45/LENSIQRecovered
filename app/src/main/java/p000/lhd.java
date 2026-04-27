package p000;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class lhd {

    /* JADX INFO: renamed from: c */
    public static final lhd f57632c = new lhd();

    /* JADX INFO: renamed from: d */
    public static boolean f57633d = false;

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap<Class<?>, upe<?>> f57635b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final xpe f57634a = new yr9();

    private lhd() {
    }

    public static lhd getInstance() {
        return f57632c;
    }

    /* JADX INFO: renamed from: a */
    public int m16143a() {
        int iM24180b = 0;
        for (upe<?> upeVar : this.f57635b.values()) {
            if (upeVar instanceof vsa) {
                iM24180b += ((vsa) upeVar).m24180b();
            }
        }
        return iM24180b;
    }

    /* JADX INFO: renamed from: b */
    public <T> boolean m16144b(T message) {
        return schemaFor(message).isInitialized(message);
    }

    public <T> void makeImmutable(T message) {
        schemaFor(message).makeImmutable(message);
    }

    public <T> void mergeFrom(T message, ird reader) throws IOException {
        mergeFrom(message, reader, yi5.getEmptyRegistry());
    }

    public upe<?> registerSchema(Class<?> messageType, upe<?> schema) {
        v98.m23882b(messageType, "messageType");
        v98.m23882b(schema, "schema");
        return this.f57635b.putIfAbsent(messageType, schema);
    }

    @qp1
    public upe<?> registerSchemaOverride(Class<?> messageType, upe<?> schema) {
        v98.m23882b(messageType, "messageType");
        v98.m23882b(schema, "schema");
        return this.f57635b.put(messageType, schema);
    }

    public <T> upe<T> schemaFor(Class<T> cls) {
        v98.m23882b(cls, "messageType");
        upe<T> upeVar = (upe) this.f57635b.get(cls);
        if (upeVar != null) {
            return upeVar;
        }
        upe<T> upeVarCreateSchema = this.f57634a.createSchema(cls);
        upe<T> upeVar2 = (upe<T>) registerSchema(cls, upeVarCreateSchema);
        return upeVar2 != null ? upeVar2 : upeVarCreateSchema;
    }

    public <T> void writeTo(T message, qsi writer) throws IOException {
        schemaFor(message).writeTo(message, writer);
    }

    public <T> void mergeFrom(T message, ird reader, yi5 extensionRegistry) throws IOException {
        schemaFor(message).mergeFrom(message, reader, extensionRegistry);
    }

    public <T> upe<T> schemaFor(T message) {
        return schemaFor((Class) message.getClass());
    }
}
