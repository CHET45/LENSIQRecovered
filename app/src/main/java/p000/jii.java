package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class jii implements nii {
    private uvc pingFrame;

    @Override // p000.nii
    public uvc onPreparePing(iii iiiVar) {
        if (this.pingFrame == null) {
            this.pingFrame = new uvc();
        }
        return this.pingFrame;
    }

    @Override // p000.nii
    public void onWebsocketHandshakeReceivedAsClient(iii iiiVar, z32 z32Var, f3f f3fVar) throws ud8 {
    }

    @Override // p000.nii
    public g3f onWebsocketHandshakeReceivedAsServer(iii iiiVar, qn4 qn4Var, z32 z32Var) throws ud8 {
        return new se7();
    }

    @Override // p000.nii
    public void onWebsocketHandshakeSentAsClient(iii iiiVar, z32 z32Var) throws ud8 {
    }

    @Override // p000.nii
    public void onWebsocketPing(iii iiiVar, nv6 nv6Var) {
        iiiVar.sendFrame(new j4d((uvc) nv6Var));
    }

    @Override // p000.nii
    public void onWebsocketPong(iii iiiVar, nv6 nv6Var) {
    }
}
