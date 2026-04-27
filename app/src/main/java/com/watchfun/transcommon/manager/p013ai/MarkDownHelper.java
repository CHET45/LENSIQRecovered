package com.watchfun.transcommon.manager.p013ai;

import android.content.Context;
import android.widget.TextView;
import io.noties.markwon.ext.tables.C7530a;
import p000.d77;
import p000.iy2;
import p000.ku9;
import p000.lm7;
import p000.n03;

/* JADX INFO: loaded from: classes6.dex */
public class MarkDownHelper {
    ku9 markwon;

    public static class SingletonHolder {
        private static final MarkDownHelper INSTANCE = new MarkDownHelper();

        private SingletonHolder() {
        }
    }

    public static MarkDownHelper getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void init(Context context) {
        if (context == null) {
            return;
        }
        this.markwon = ku9.builder(context).usePlugin(n03.create()).usePlugin(C7530a.create(context)).usePlugin(lm7.create()).usePlugin(d77.create(context)).build();
    }

    public void setText(String str, TextView textView) {
        ku9 ku9Var = this.markwon;
        if (ku9Var == null || textView == null) {
            return;
        }
        ku9Var.setMarkdown(textView, str);
    }

    private MarkDownHelper() {
        init(iy2.getAppContext());
    }
}
