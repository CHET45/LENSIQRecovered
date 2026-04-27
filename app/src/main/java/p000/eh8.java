package p000;

import com.iflytek.aikit.core.AbstractC3820c;
import com.iflytek.aikit.core.AiHelper;
import com.iflytek.aikit.core.Auth;

/* JADX INFO: loaded from: classes6.dex */
public class eh8 extends AbstractC3820c {

    /* JADX INFO: renamed from: eh8$b */
    public static class C5310b {

        /* JADX INFO: renamed from: a */
        public static final eh8 f33030a = new eh8();

        private C5310b() {
        }
    }

    private eh8() {
    }

    public static eh8 getInst() {
        return C5310b.f33030a;
    }

    @Override // com.iflytek.aikit.core.AbstractC3820c
    public void registerListener(InterfaceC16162zk interfaceC16162zk) {
        AiHelper.getInst().registerListener(interfaceC16162zk);
    }

    public void registerListener(k03 k03Var) {
        Auth.m7094d().m7099c(k03Var);
    }

    public void registerListener(k03 k03Var, InterfaceC16162zk interfaceC16162zk) {
        registerListener(k03Var);
        registerListener(interfaceC16162zk);
    }

    public void registerListener(String str, InterfaceC13077tk interfaceC13077tk) {
        AiHelper.getInst().registerListener(str, interfaceC13077tk);
    }
}
