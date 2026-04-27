package p000;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class m38 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9122c f59818a;

    /* JADX INFO: renamed from: m38$b */
    public static final class C9121b implements InterfaceC9122c {

        /* JADX INFO: renamed from: a */
        @efb
        public final Uri f59820a;

        /* JADX INFO: renamed from: b */
        @efb
        public final ClipDescription f59821b;

        /* JADX INFO: renamed from: c */
        @hib
        public final Uri f59822c;

        public C9121b(@efb Uri uri, @efb ClipDescription clipDescription, @hib Uri uri2) {
            this.f59820a = uri;
            this.f59821b = clipDescription;
            this.f59822c = uri2;
        }

        @Override // p000.m38.InterfaceC9122c
        @efb
        public Uri getContentUri() {
            return this.f59820a;
        }

        @Override // p000.m38.InterfaceC9122c
        @efb
        public ClipDescription getDescription() {
            return this.f59821b;
        }

        @Override // p000.m38.InterfaceC9122c
        @hib
        public Object getInputContentInfo() {
            return null;
        }

        @Override // p000.m38.InterfaceC9122c
        @hib
        public Uri getLinkUri() {
            return this.f59822c;
        }

        @Override // p000.m38.InterfaceC9122c
        public void releasePermission() {
        }

        @Override // p000.m38.InterfaceC9122c
        public void requestPermission() {
        }
    }

    /* JADX INFO: renamed from: m38$c */
    public interface InterfaceC9122c {
        @efb
        Uri getContentUri();

        @efb
        ClipDescription getDescription();

        @hib
        Object getInputContentInfo();

        @hib
        Uri getLinkUri();

        void releasePermission();

        void requestPermission();
    }

    public m38(@efb Uri uri, @efb ClipDescription clipDescription, @hib Uri uri2) {
        this.f59818a = new C9120a(uri, clipDescription, uri2);
    }

    @hib
    public static m38 wrap(@hib Object obj) {
        if (obj == null) {
            return null;
        }
        return new m38(new C9120a(obj));
    }

    @efb
    public Uri getContentUri() {
        return this.f59818a.getContentUri();
    }

    @efb
    public ClipDescription getDescription() {
        return this.f59818a.getDescription();
    }

    @hib
    public Uri getLinkUri() {
        return this.f59818a.getLinkUri();
    }

    public void releasePermission() {
        this.f59818a.releasePermission();
    }

    public void requestPermission() {
        this.f59818a.requestPermission();
    }

    @hib
    public Object unwrap() {
        return this.f59818a.getInputContentInfo();
    }

    /* JADX INFO: renamed from: m38$a */
    @c5e(25)
    public static final class C9120a implements InterfaceC9122c {

        /* JADX INFO: renamed from: a */
        @efb
        public final InputContentInfo f59819a;

        public C9120a(@efb Object obj) {
            this.f59819a = (InputContentInfo) obj;
        }

        @Override // p000.m38.InterfaceC9122c
        @efb
        public Uri getContentUri() {
            return this.f59819a.getContentUri();
        }

        @Override // p000.m38.InterfaceC9122c
        @efb
        public ClipDescription getDescription() {
            return this.f59819a.getDescription();
        }

        @Override // p000.m38.InterfaceC9122c
        @efb
        public Object getInputContentInfo() {
            return this.f59819a;
        }

        @Override // p000.m38.InterfaceC9122c
        @hib
        public Uri getLinkUri() {
            return this.f59819a.getLinkUri();
        }

        @Override // p000.m38.InterfaceC9122c
        public void releasePermission() {
            this.f59819a.releasePermission();
        }

        @Override // p000.m38.InterfaceC9122c
        public void requestPermission() {
            this.f59819a.requestPermission();
        }

        public C9120a(@efb Uri uri, @efb ClipDescription clipDescription, @hib Uri uri2) {
            this.f59819a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private m38(@efb InterfaceC9122c interfaceC9122c) {
        this.f59818a = interfaceC9122c;
    }
}
