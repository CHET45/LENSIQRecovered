package p000;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class khd {

    /* JADX INFO: renamed from: c */
    public static final khd f54150c = new khd();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap<Class<?>, tpe<?>> f54152b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final wpe f54151a = new zr9();

    private khd() {
    }

    public static khd getInstance() {
        return f54150c;
    }

    /* JADX INFO: renamed from: a */
    public int m14747a() {
        int iM24806b = 0;
        for (tpe<?> tpeVar : this.f54152b.values()) {
            if (tpeVar instanceof wsa) {
                iM24806b += ((wsa) tpeVar).m24806b();
            }
        }
        return iM24806b;
    }

    /* JADX INFO: renamed from: b */
    public <T> boolean m14748b(T message) {
        return schemaFor(message).isInitialized(message);
    }

    public <T> void makeImmutable(T message) {
        schemaFor(message).makeImmutable(message);
    }

    public <T> void mergeFrom(T message, hrd reader) throws IOException {
        mergeFrom(message, reader, zi5.getEmptyRegistry());
    }

    public tpe<?> registerSchema(Class<?> messageType, tpe<?> schema) {
        w98.m24433b(messageType, "messageType");
        w98.m24433b(schema, "schema");
        return this.f54152b.putIfAbsent(messageType, schema);
    }

    @pp1
    public tpe<?> registerSchemaOverride(Class<?> messageType, tpe<?> schema) {
        w98.m24433b(messageType, "messageType");
        w98.m24433b(schema, "schema");
        return this.f54152b.put(messageType, schema);
    }

    public <T> tpe<T> schemaFor(Class<T> cls) {
        w98.m24433b(cls, "messageType");
        tpe<T> tpeVar = (tpe) this.f54152b.get(cls);
        if (tpeVar != null) {
            return tpeVar;
        }
        tpe<T> tpeVarCreateSchema = this.f54151a.createSchema(cls);
        tpe<T> tpeVar2 = (tpe<T>) registerSchema(cls, tpeVarCreateSchema);
        return tpeVar2 != null ? tpeVar2 : tpeVarCreateSchema;
    }

    public <T> void writeTo(T message, rsi writer) throws IOException {
        schemaFor(message).writeTo(message, writer);
    }

    public <T> void mergeFrom(T message, hrd reader, zi5 extensionRegistry) throws IOException {
        schemaFor(message).mergeFrom(message, reader, extensionRegistry);
    }

    public <T> tpe<T> schemaFor(T message) {
        return schemaFor((Class) message.getClass());
    }
}
