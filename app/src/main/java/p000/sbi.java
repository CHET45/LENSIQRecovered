package p000;

import android.view.View;
import android.view.ViewStub;

/* JADX INFO: loaded from: classes3.dex */
public class sbi {

    /* JADX INFO: renamed from: a */
    public ViewStub f81172a;

    /* JADX INFO: renamed from: b */
    public y8i f81173b;

    /* JADX INFO: renamed from: c */
    public View f81174c;

    /* JADX INFO: renamed from: d */
    public ViewStub.OnInflateListener f81175d;

    /* JADX INFO: renamed from: e */
    public y8i f81176e;

    /* JADX INFO: renamed from: f */
    public ViewStub.OnInflateListener f81177f;

    /* JADX INFO: renamed from: sbi$a */
    public class ViewStubOnInflateListenerC12512a implements ViewStub.OnInflateListener {
        public ViewStubOnInflateListenerC12512a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public void onInflate(ViewStub viewStub, View view) {
            sbi.this.f81174c = view;
            sbi sbiVar = sbi.this;
            sbiVar.f81173b = kf3.m14706a(sbiVar.f81176e.f100783M, view, viewStub.getLayoutResource());
            sbi.this.f81172a = null;
            if (sbi.this.f81175d != null) {
                sbi.this.f81175d.onInflate(viewStub, view);
                sbi.this.f81175d = null;
            }
            sbi.this.f81176e.invalidateAll();
            sbi.this.f81176e.m25788l();
        }
    }

    public sbi(@efb ViewStub viewStub) {
        ViewStubOnInflateListenerC12512a viewStubOnInflateListenerC12512a = new ViewStubOnInflateListenerC12512a();
        this.f81177f = viewStubOnInflateListenerC12512a;
        this.f81172a = viewStub;
        viewStub.setOnInflateListener(viewStubOnInflateListenerC12512a);
    }

    @hib
    public y8i getBinding() {
        return this.f81173b;
    }

    public View getRoot() {
        return this.f81174c;
    }

    @hib
    public ViewStub getViewStub() {
        return this.f81172a;
    }

    public boolean isInflated() {
        return this.f81174c != null;
    }

    public void setContainingBinding(@efb y8i y8iVar) {
        this.f81176e = y8iVar;
    }

    public void setOnInflateListener(@hib ViewStub.OnInflateListener onInflateListener) {
        if (this.f81172a != null) {
            this.f81175d = onInflateListener;
        }
    }
}
