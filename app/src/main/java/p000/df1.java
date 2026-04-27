package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public abstract class df1 {

    /* JADX INFO: renamed from: a */
    public static final df1 f29549a = new C4775a();

    /* JADX INFO: renamed from: df1$a */
    public class C4775a extends df1 {
        @Override // p000.df1
        public AbstractC2392cn allocateDirectBuffer(int capacity) {
            return AbstractC2392cn.wrap(ByteBuffer.allocateDirect(capacity));
        }

        @Override // p000.df1
        public AbstractC2392cn allocateHeapBuffer(int capacity) {
            return AbstractC2392cn.wrap(new byte[capacity]);
        }
    }

    public static df1 unpooled() {
        return f29549a;
    }

    public abstract AbstractC2392cn allocateDirectBuffer(int capacity);

    public abstract AbstractC2392cn allocateHeapBuffer(int capacity);
}
