package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class vm8 extends rm8 {

    /* JADX INFO: renamed from: h */
    public String f91735h;

    /* JADX INFO: renamed from: i */
    public boolean f91736i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm8(@yfb bk8 bk8Var, @yfb qy6<? super sk8, bth> qy6Var) {
        super(bk8Var, qy6Var);
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(qy6Var, "nodeConsumer");
        this.f91736i = true;
    }

    @Override // p000.rm8, p000.AbstractC6092g2
    @yfb
    public sk8 getCurrent() {
        return new am8(m21427z());
    }

    @Override // p000.rm8, p000.AbstractC6092g2
    public void putElement(@yfb String str, @yfb sk8 sk8Var) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(sk8Var, "element");
        if (!this.f91736i) {
            Map<String, sk8> mapM21427z = m21427z();
            String str2 = this.f91735h;
            if (str2 == null) {
                md8.throwUninitializedPropertyAccessException("tag");
                str2 = null;
            }
            mapM21427z.put(str2, sk8Var);
            this.f91736i = true;
            return;
        }
        if (sk8Var instanceof fm8) {
            this.f91735h = ((fm8) sk8Var).getContent();
            this.f91736i = false;
        } else {
            if (sk8Var instanceof am8) {
                throw il8.InvalidKeyKindException(cm8.f16946a.getDescriptor());
            }
            if (!(sk8Var instanceof ck8)) {
                throw new ceb();
            }
            throw il8.InvalidKeyKindException(ek8.f33245a.getDescriptor());
        }
    }
}
