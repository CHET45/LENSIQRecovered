package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public abstract class ef1 {

    /* JADX INFO: renamed from: a */
    public static final ef1 f32789a = new C5279a();

    /* JADX INFO: renamed from: ef1$a */
    public class C5279a extends ef1 {
        @Override // p000.ef1
        public AbstractC1952bn allocateDirectBuffer(int capacity) {
            return AbstractC1952bn.wrap(ByteBuffer.allocateDirect(capacity));
        }

        @Override // p000.ef1
        public AbstractC1952bn allocateHeapBuffer(int capacity) {
            return AbstractC1952bn.wrap(new byte[capacity]);
        }
    }

    public static ef1 unpooled() {
        return f32789a;
    }

    public abstract AbstractC1952bn allocateDirectBuffer(int capacity);

    public abstract AbstractC1952bn allocateHeapBuffer(int capacity);
}
